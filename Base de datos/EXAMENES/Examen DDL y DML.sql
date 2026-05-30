-- DDL. Data Definition Language
# 1. Crea una base de datos llamada red_veterinarias y crea las tablas propuestas.
CREATE DATABASE red_veterinarias;
USE red_veterinarias;

CREATE TABLE Clinicas (
    id_clinica INT PRIMARY KEY,
    nombre VARCHAR(50),
    ciudad VARCHAR(50),
    direccion VARCHAR(100),
    fecha_apertura DATE
);

CREATE TABLE Clientes (
    id_cliente INT PRIMARY KEY,
    dni CHAR(9) UNIQUE,
    nombre VARCHAR(50),
    apellidos VARCHAR(50),
    fecha_registro DATE ,
    id_clinica INT,
		CONSTRAINT fk_clientes_clinicas
        foreign key (id_cliente)
        REFERENCES Clinicas (id_clinica)
);

CREATE TABLE Veterinarios (
    id_veterinario INT PRIMARY KEY,
    nombre VARCHAR(50),
    especialidad VARCHAR(100),
    fecha_contratacion DATE 
);

CREATE TABLE Mascotas (
    id_mascota INT PRIMARY KEY,
    nombre VARCHAR(50),
    especie VARCHAR(50),
    anio_nacimiento INT ,
    id_cliente INT ,
    id_clinica INT ,
    CONSTRAINT fk_mascotas_clientes FOREIGN KEY (id_cliente)
        REFERENCES Clientes (id_cliente),
    CONSTRAINT fk_mascotas_clinicas FOREIGN KEY (id_clinica)
        REFERENCES Clinicas (id_clinica)
);

CREATE TABLE Consultas (
    id_consulta INT PRIMARY KEY,
    id_mascota INT ,
    id_veterinario INT ,
    fecha_consulta DATE ,
    fecha_alta_medica DATE ,
    estado VARCHAR(50),
    CONSTRAINT fk_consultas_mascotas FOREIGN KEY (id_mascota)
        REFERENCES Mascotas (id_mascota),
    CONSTRAINT fk_consultas_veterinario FOREIGN KEY (id_veterinario)
        REFERENCES Veterinarios (id_veterinario)
);
# 2. Modifica la tabla CONSULTAS para que incluya un coste de tratamiento.
ALTER TABLE Consultas
ADD coste DECIMAL(7,2);

# 3. Modifica la tabla CLIENTES.
ALTER TABLE Clientes
ADD email VARCHAR(100) UNIQUE NOT NULL;

ALTER TABLE Clientes
ADD ciudad VARCHAR(50) DEFAULT 'Lisboa';

# 4. Por normativa de protección de datos ya no se puede almacenar el DNI.
ALTER TABLE clientes
DROP COLUMN dni;

# 5. Cambio de clave primaria en CLIENTES.
ALTER TABLE Clientes
DROP PRIMARY KEY,
ADD PRIMARY KEY (email); 

# 6. Una aseguradora solicita el listado de mascotas registradas en clínicas de Barcelona.


# 7. Una nueva normativa obliga a registrar los apellidos del veterinario.
ALTER TABLE Veterinarios
ADD apellido_1 VARCHAR(80) NOT NULL AFTER nombre, 
ADD apellido_2 VARCHAR(80) NOT NULL AFTER apellido_1;

# 8. No queremos usar el campo id_consulta de la tabla CONSULTAS.
ALTER TABLE Consultas
DROP COLUMN id_consulta,
ADD PRIMARY KEY (id_mascota, id_veterinario, fecha_consulta, fecha_alta_medica, estado);

# 9. Crea el usuario vetassistant y proporciónale privilegios de lectura e inserción a la tabla MASCOTAS.


# 10. Crea una vista para visualizar cuántas mascotas distintas están actualmente en consulta (sin alta médica) por ciudad.


# 11. Elimina todas las tablas del esquema.
DROP TABLE IF EXISTS Clientes;
DROP TABLE IF EXISTS Clinicas;
DROP TABLE IF EXISTS Consultas;
DROP TABLE IF EXISTS Mascotas;
DROP TABLE IF EXISTS Veterinarios;

-- DML. Data Manipulation Language
# 1- Vuelve a crear las tablas con tu solución del ejercicio 1 de la prueba de DDL y puebla las tablas con los siguientes valores. Usa una unica sentencia INSER INTO por tabla.
INSERT INTO Clinicas VALUES 
(1, 'VetCare Central', 'Barcelona', 'Calle Mayor 12', '2011-04-10'),
(2, 'VetCare Sur', 'Málaga', 'Avenida del Puerto 30', '2013-07-21'),
(3, 'VetCare Levante', 'Valencia', 'Plaza Jardín 9', '2016-10-05'),
(4, 'VetCare Norte', 'Santander', 'Calle Marina 17', '2019-02-14'),
(5, 'VetCare Centro', 'Barcelona', 'Calle Aragón 88', '2021-12-01');

INSERT INTO Clientes VALUES 
(1, '12345678A', 'Carlos', 'Martín López', '2024-01-05', 1),
(2, '23456789B', 'Lucía', 'Soto Ruiz', '2024-02-11', 2),
(3, '34567890C', 'Daniel', 'Mora Pérez', '2024-03-20', 1),
(4, '45678901D', 'Elena', 'García Castro', '2024-04-15', 3),
(5, '56789012E', 'Javier', 'Ramos Díaz', '2024-05-02', 5);

INSERT INTO Veterinarios VALUES 
(1, 'Pedro', 'Cirugía', '2018-03-01'),
(2, 'Laura', 'Dermatología', '2019-06-12'),
(3, 'Sergio', 'Traumatología', '2017-11-20'),
(4, 'Paula', 'Cardiología', '2020-01-18'),
(5, 'Michael', 'General', '2016-08-30');

INSERT INTO Mascotas VALUES 
(1, 'Luna', 'Perro', 2018, 1, 1),
(2, 'Milo', 'Gato', 2020, 3, 1),
(3, 'Rocky', 'Perro', 2017, 2, 2),
(4, 'Nala', 'Gato', 2019, 4, 3),
(5, 'Toby', 'Conejo', 2021, 5, 4),
(6, 'Simba', 'Perro', 2022, 1, 5);

INSERT INTO Consultas VALUES 
(1, 1, 1, '2025-06-01', NULL, 'en_tratamiento'),
(2, 2, 2, '2025-06-02', '2025-06-09', 'alta'),
(3, 3, 3, '2025-06-03', NULL, 'revisión'),
(4, 4, 4, '2025-06-05', NULL, 'en_tratamiento'),
(5, 5, 5, '2025-06-06', '2025-06-12', 'alta'),
(6, 6, 1, '2025-06-07', NULL, 'revisión');

# 2- Todas las consultas con estado ‘en_tratamiento’ y fecha anterior al 5 de junio de 2025 deben pasar a estado revisión.
UPDATE Consultas
SET estado = 'revision'
WHERE estado = 'en_tratamiento' AND fecha_ ;

# 3- Se detectó un error en mascotas nacidas antes del 2018 del cliente con id_cliente = 3 . Se debe sumar 1 año al valor de anio_nacimiento. Realiza la modificación correspondiente en la tabla MASCOTAS.
UPDATE Mascotas 
SET 
    anio_nacimiento = anio_nacimiento + 1
WHERE
    anio_nacimiento < 2018
        AND id_cliente = 3;

# 4- La clínica con id_clinica = 1 quiere actualizar la fecha de registro de todos sus clientes a 2024-01-01.
UPDATE Clientes
SET fecha_registro = '2024-01-01'
WHERE id_clinica = 1;

# 5- Todas las mascotas con consultas en estado revisión deben trasladarse temporalmente a la clínica con id_clinica = 5.

# 6- Elimina de CONSULTAS todas aquellas con estado alta.


# 7- Elimina de MASCOTAS todas las mascotas cuyos veterinarios sean de especialidad General.


# 8- Elimina de CONSULTAS todas las consultas asociadas a mascotas que pertenezcan a la clínica id_clinica = 5.


# 9- Para la consulta con identificador 4 realiza:
/*a. Inicia una transacción.
b. Cambiar estado a alta
c. Actualizar fecha_alta_medica a 2025-06-15
d. Confirma los cambios.*/



# 10- Para el préstamo con identificador 3, realiza las siguientes operaciones dentro de una transacción:
/*a. Inicia una transacción.
b. Cambiar estado a alta
c. Actualizar fecha_alta_medica a 2025-06-16
d. Cambiar la clínica de la mascota asociada a id_clinica = 2
e. Confirma los cambios. */

