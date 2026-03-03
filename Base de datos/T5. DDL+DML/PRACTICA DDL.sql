# 1
CREATE TABLE proveedores (
    id INT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    direccion VARCHAR(50) NOT NULL,
    telefono VARCHAR(9) NOT NULL
);
DROP TABLE IF EXISTS proveedores;

# 2
INSERT INTO libros (id, titulo, autor_id, seccion_id, fecha_edicion, precio)
VALUES
  (1, 'Rebelión en la granja', 1, 1, '1945-08-17', 10.40),
  (2, 'La metamorfosis', 2, 1, '1915-10-01', 12.06),
  (3, 'La peste', 3, 1, '1947-06-10', 15.19);
  
# 3
ALTER TABLE facturas CHANGE COLUMN fecha fecha_factura DATE;

# 4
DROP INDEX apellidos ON clientes;
CREATE INDEX apellidos ON clientes (apellidos);

# 5
CREATE VIEW Campos_Libros (titulo, nombre_autor, nombre_seccion, precio_libro) AS 
SELECT libros.titulo, autores.nombre, secciones.nombre, libros.precio
FROM libros
JOIN autores ON libros.autor_id = autores.id
JOIN secciones ON libros.seccion_id = secciones.id;

# 6
DROP VIEW IF EXISTS Ejercicio_6;
CREATE VIEW Ejercicio_6 AS
SELECT libros.titulo AS titulo, COUNT(*) AS veces_vendido, SUM(libros_facturas.cantidad * libros_facturas.precio) AS suma_ventas, MAX(libros_facturas.cantidad) AS max_unidades
FROM libros
JOIN libros_facturas ON libros.id = libros_facturas.libro_id
GROUP BY libros.titulo; 

# 7
SELECT título, veces_vendido, suma_ventas, max_unidades FROM Ejercicio_6 WHERE veces_vendido >= 3;