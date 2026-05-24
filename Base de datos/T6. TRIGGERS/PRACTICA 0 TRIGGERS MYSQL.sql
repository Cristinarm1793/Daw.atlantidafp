#1. Crear un Trigger al que cuando ingreses un numero cualquiera en una columna, este ingrese el doble del numero inicial.
DELIMITER //
CREATE TRIGGER duplicar_valor 
BEFORE INSERT ON oficinas 
FOR EACH ROW 
BEGIN
	SET NEW.objetivo = NEW.objetivo * 2;
END //
DELIMITER ;

#2. Crear un Trigger al cual al número ingresado se le sume justo el anterior, siendo el anterior ordenados por su ID.
DELIMITER //
CREATE TRIGGER suma_numeros
BEFORE INSERT ON tabla_trigger
FOR EACH ROW 
BEGIN
	SET NEW.cantidad = (SELECT cantidad FROM tabla_trigger WHERE id = NEW.id -1) + NEW.cantidad;
END //
DELIMITER ;

#3. Crear un trigger el cual si una cantidad es menor que 1000 directamente se ingrese el número 1000.
DELIMITER //
CREATE TRIGGER cantidad_ingresada
BEFORE INSERT ON tabla_trigger
FOR EACH ROW 
BEGIN
	IF NEW.cantidad < 1000 THEN 
		SET NEW.cantidad = 1000;
    END IF;
END //
DELIMITER ;

#4. Ahora al anterior, si ingresáramos un numero negativo que aparezca un error.
	#SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = ‘mensaje que queremos indicar’;
DELIMITER //
CREATE TRIGGER mensaje_error
BEFORE INSERT ON tabla_trigger
FOR EACH ROW 
BEGIN
	IF NEW.stock < 0 THEN
		SIGNAL SQLSTATE '45000' 
        SET MESSAGE_TEXT = 'Error, no se permiten numeros negativos';
    END IF;
END //
DELIMITER ;
    
#5. Ahora al anterior, vamos a añadir que si es cualquier otro número, que se duplique la cantidad introducida.
DELIMITER //
CREATE TRIGGER cantidad_duplicada
BEFORE INSERT ON tabla_trigger
FOR EACH ROW 
BEGIN
	IF NEW.cantidad < 0 THEN
		SIGNAL SQLSTATE '45000'
		SET MESSAGE_TEXT = 'Error, no se permiten numeros negativos';
	ELSE
		SET NEW.cantidad = NEW.cantidad * 2;
    END IF;
END //
DELIMITER ;

#6. Un trigger que evita que se inserten registros en la tabla “usuarios" si el correo electrónico proporcionado no tiene un formato válido:
DELIMITER //
CREATE TRIGGER verificar_email
BEFORE INSERT ON tabla_trigger
FOR EACH ROW 
BEGIN
	IF (NEW.usuario NOT LIKE '%@%.%') THEN
		SIGNAL SQLSTATE '45000'
		SET MESSAGE_TEXT = 'Error, formato incorrecto';
    END IF;
END //
DELIMITER ;