#Parte 1: Preguntas Teóricas 
/* 1. Definición y Uso de Triggers
- Explica qué es un trigger en MySQL y cuál es su utilidad en bases de datos relacionales.
- Menciona dos casos prácticos donde sería recomendable el uso de un trigger.*/
-- es un disparador 
-- auditorias, etc

/* 2. Tipos de Triggers y Diferencias 
- Explica las diferencias entre un trigger BEFORE y un trigger AFTER.
- ¿Cuándo es recomendable usar cada uno de ellos? */
-- BEFORE se ejecuta antes de que cualquier operacion pueda ocurrir y AFTER actualiza una vez esta creado.
-- BEFORE INSERT, DELETE, UPDATE

/* 3. Errores Frecuentes en Triggers
- Explica por qué ocurre el error 1442 en MySQL y cómo se puede solucionar.
- ¿Qué restricciones tiene MySQL respecto a la modificación de la misma tabla dentro de un
trigger? */
-- el error ocurre cuando un trigger intenta modificar una misma tabla causando bucles, su solucion seria 
-- 

#Parte 2: Ejercicios Prácticos
/* 4. Registro de Cambios en Precios de Productos
- Crea un trigger AFTER UPDATE que registre en una tabla historial_precios los cambios en la
columna precio de la tabla productos.
- El trigger debe almacenar:
 - id_producto
 - precio_anterior
 - precio_nuevo
 - fecha_cambio */
 
 CREATE TABLE historial_precios (
 id_historial INT PRIMARY KEY AUTO_INCREMENT,
 id_producto INT,
 precio_anterior DECIMAL(10,2),
 precio_nuevo DECIMAL(10,2),
 fecha_cambio DATETIME,
 FOREIGN KEY (id_producto)
 REFERENCES productos(id_producto)
 );
 
 DELIMITER //
 CREATE TRIGGER cambio_precio
 AFTER UPDATE ON historial_precios
 FOR EACH ROW
 BEGIN
	IF OLD.precio != NEW.precio THEN 
    INSERT historial_precios (id_producto, precio_anterior, precio_nuevo, fecha_cambio)
    VALUES(NEW.id_producto, OLD.precio_anterior, NEW.precio_nuevo, NOW());
	END IF;
END //    
DELIMITER ;
 
/* 5. Restricción de Stock Negativo
- Crea un trigger BEFORE INSERT y BEFORE UPDATE que impida valores negativos en la
columna stock de la tabla productos.
- Si el valor es negativo, lanza un error con SIGNAL SQLSTATE '45000'.*/

DELIMITER //
CREATE TRIGGER stock_neg
BEFORE INSERT ON productos
FOR EACH ROW
BEGIN
	IF existencias < 0 THEN
	SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = "Error, valores negativos";
	END IF;
END //    
DELIMITER ;

/* 6. Eliminación Lógica de Clientes
- Crea un trigger BEFORE DELETE en la tabla clientes que evite eliminaciones reales y, en su
lugar, actualice el campo activo a 0.
- Debe lanzar un mensaje con SIGNAL SQLSTATE para notificar que la eliminación fue lógica.*/
ALTER TABLE clientes ADD activo INT DEFAULT 1;

DELIMITER //
CREATE TRIGGER eliminarcion_logica
BEFORE INSERT ON clientes
FOR EACH ROW
BEGIN
	SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = "Error, eliminacion logica";
END //    

UPDATE clientes
SET activo = 0 WHERE num_clie = 1;
DELIMITER ;

/* 7. Asignación Automática de Código de Factura
- Crea un trigger BEFORE INSERT en la tabla facturas que genere automáticamente un código de
factura basado en el número de facturas existentes.
- El código debe seguir el formato 'FAC-0001', 'FAC-0002', etc.*/
CREATE TABLE facturas (
id_factura INT PRIMARY KEY AUTO_INCREMENT,
codigo_factura VARCHAR (10));
)

DELIMITER //
CREATE TRIGGER codigo_factura
BEFORE INSERT ON facturas
FOR EACH ROW
BEGIN
	DECLARE num_factura INT;
    SELECT COUNT(codigo_factura) + 1 INTO numero_facturas FROM faturas;
	SET NEW.codigo_factura =  CONCAT('FAC', LPAD(num_factura, 4, '0'));
END //    
DELIMITER ;
