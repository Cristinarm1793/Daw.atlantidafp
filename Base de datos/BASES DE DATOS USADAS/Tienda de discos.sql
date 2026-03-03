CREATE DATABASE `tienda_de_discos` /*!40100 DEFAULT CHARACTER SET utf8 */;
use `tienda_de_discos`;
CREATE TABLE `clientes` (
  `DNI` varchar(45) NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `apellidos` varchar(45) DEFAULT NULL,
  `dirección` varchar(45) DEFAULT NULL,
  `edad` int(11) DEFAULT NULL,
  PRIMARY KEY (`DNI`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
CREATE TABLE `discográficas` (
  `código` int(11) NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `domicilio_fiscal` varchar(45) DEFAULT NULL,
  `localidad` varchar(45) DEFAULT NULL,
  `teléfono` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`código`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
CREATE TABLE `discos` (
  `cod_disco` int(11) NOT NULL,
  `título` varchar(45) DEFAULT NULL,
  `intérprete` varchar(45) DEFAULT NULL,
  `estilo` varchar(45) DEFAULT NULL,
  `discográfica` int(11) DEFAULT NULL,
  `fecha_publicación` date DEFAULT NULL,
  `pvp` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`cod_disco`),
  KEY `fk3_idx` (`discográfica`),
  CONSTRAINT `fk3` FOREIGN KEY (`discográfica`) REFERENCES `discográficas` (`código`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
CREATE TABLE `ventas` (
  `cod_disco` int(11) NOT NULL,
  `DNI_cliente` varchar(45) NOT NULL,
  `cantidad` int(11) DEFAULT NULL,
  `precio_venta_unidad` decimal(10,2) DEFAULT NULL,
  `fecha_venta` date NOT NULL,
  PRIMARY KEY (`cod_disco`,`DNI_cliente`,`fecha_venta`),
  KEY `fk1_idx` (`DNI_cliente`),
  CONSTRAINT `fk1` FOREIGN KEY (`DNI_cliente`) REFERENCES `clientes` (`DNI`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `fk2` FOREIGN KEY (`cod_disco`) REFERENCES `discos` (`cod_disco`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
INSERT INTO `tienda_de_discos`.`clientes`
(`DNI`,
`nombre`,
`apellidos`,
`dirección`,
`edad`)
VALUES
('10873092H', 'Iván', 'Gómez Agulló', 'C/Cañaveral, 9 Granada', '19'),
('11223344B', 'Ghilian', 'Baratoux Fernández-Luna', 'Cno. de Ronda, 148 Granada', '19'),
('12345678A', 'Adrián', 'Ávila Barea', 'C/Alhamar, 25 Granada', '19'),
('12946817A', 'David', 'Moreno Gámez', 'Avda. Madrid, 12 Granada', '23'),
('17693748M', 'Alberto', 'Cábaco Mateo', 'C/Sol, 15 Armilla', '24'),
('19872937B', 'Juan', 'Cortés Fernández', 'Plaza Constitución, 7 Armilla', '18'),
('20837458P', 'Ángel', 'Martínez Gómez', 'C/Carril del Picón, 3 Granada', '17'),
('22372337H', 'José Eduardo', 'Domene Modesto', 'Avda. Maracena, 13 Albolote', '18'),
('23456781C', 'César', 'Berruezo Llorente', 'C/Cañaveral, 1 Granada', '26'),
('23897401M', 'Juan Manuel', 'Rodríguez Alcalá', 'C/Natalio Rivas, 3 Granada', '21'),
('28391987D', 'Sebastián', 'Vroom', 'Avda. Constitución, 20 Granada', '20'),
('42344546Y', 'Diego', 'Ortega Yeste', 'Avda. América, 33 Granada', '21'),
('44546323Z', 'Manuel', 'Moreno Boj', 'C/Ballesteros, 31 Atarfe', '23'),
('47872628J', 'Salvador', 'Martín González', 'Avda. Constitución, 15 Granada', '23'),
('48703882A', 'Alejandro', 'Montiel Goñi', 'C/Alhamar, 1 Granada', NULL),
('49892872S', 'Achraf', 'Bouchakour', 'Cno. de Ronda, 95 Granada', '19'),
('52837498P', 'Luis Miguel', 'Valverde Martínez', 'Cno. de Ronda, 150 Granada', '21'),
('54729374K', 'Antonio', ' Hernández Contreras', 'Plaza del Boquerón, 11 Granada', '22'),
('62876328X', 'Antonio', 'Velasco Escobar', 'Plaza de la Libertad, 1 Maracena', '21'),
('62928472N', 'Mari Ángeles ', 'Luque Romero', 'C/Carril del Picón, 10 Granada', NULL),
('66967456M', 'Christian', 'Olivas Solana', 'C/Alhamar, 22 Granada', '28'),
('68273288B', 'Marco Antonio', 'Rodríguez Molina', 'C/Arabial, 100 Granada', '21'),
('74191279Z', 'Sergio', 'Ortiz Vega', 'C/Palencia, 25 Granada', '20'),
('76849299C', 'Sergio Jesús', 'Villegas Pérez', 'Plaza de España, 5 Albolote', '19'),
('77889966L', 'José Domingo', 'Fresneda Sánchez', 'C/Cañaveral, 9 Granada', '19');
INSERT INTO `tienda_de_discos`.`discográficas`
(`código`,
`nombre`,
`domicilio_fiscal`,
`localidad`,
`teléfono`)
VALUES
('1', 'Warner Music', 'Avda. Cádiz, 1', 'Barcelona', '931234567'),
('2', 'Parlophone', 'Paseo de la Castellana, 102', 'Madrid', '912233445'),
('3', 'EMI Records', 'C/Preciados, 2', 'Madrid', '912345678'),
('4', 'Apple Records', 'Avda. América, 6', 'Valencia', '961111777'),
('5', 'Subterfuge Records', 'Cno. Ronda, 100', 'Granada', '958886644'),
('6', 'A&M Records', 'C/Diagonal, 90', 'Barcelona', '938743110');
INSERT INTO `tienda_de_discos`.`discos`
(`cod_disco`,
`título`,
`intérprete`,
`estilo`,
`discográfica`,
`fecha_publicación`,
`pvp`)
VALUES
('1', 'Más', 'Alejandro Sanz', 'pop', '1', '1997-09-09', '15.00'),
('2', 'A Night at the Opera', 'Queen', 'rock', '3', '1975-11-21', '12.00'),
('3', 'Abby Road', 'The Beatles', 'rock', '4', '1969-09-26', '13.00'),
('4', 'Revolver', 'The Beatles', 'rock', '3', '1966-08-05', '12.00'),
('5', 'Tanto', 'Pablo Alborán', 'pop', '3', '2012-11-06', '14.00'),
('6', 'Prometo', 'Pablo Alborán', 'pop', '1', '2017-11-17', '18.00'),
('7', 'A Day at the Races', 'Queen', 'rock', '3', '1976-12-10', '15.00'),
('8', 'A Kind of Magic', 'Queen', 'rock', '3', '1986-06-02', '13.00'),
('9', 'Yellow Submarine', 'The Beatles', 'rock', '3', '1969-01-17', '15.00'),
('10', 'Please, please me', 'The Beatles', 'rock', '2', '1963-03-22', '10.00'),
('11', '2 0 2', 'Carlota', 'rock', NULL, '2017-11-10', '12.00'),
('12', 'Breakfast in America', 'Supertramp', 'rock', '6', '1979-03-29', '11.50'),
('13', '3', 'Alejandro Sanz', 'pop', '1', '1995-06-03', '9.50'),
('14', 'Estrella de Mar', 'Amaral', 'indie', '3', '2002-02-04', '13.00'),
('15', 'Naturaleza Muerta', 'Fangoria', 'pop', '5', '2001-10-22', '10.00'),
('16', 'Pop', 'Los Planetas', 'indie', '5', '1996-01-29', '14.00');
INSERT INTO `tienda_de_discos`.`ventas`
(`cod_disco`,
`DNI_cliente`,
`cantidad`,
`precio_venta_unidad`,
`fecha_venta`)
VALUES
('1', '20837458P', '1', '10.00', '2018-01-27'),
('1', '49892872S', '1', '12.00', '2017-12-02'),
('2', '17693748M', '2', '11.00', '2017-12-24'),
('2', '66967456M', '1', '14.00', '2018-01-08'),
('2', '68273288B', '1', '10.00', '2018-01-28'),
('3', '52837498P', '1', '11.00', '2018-01-08'),
('3', '66967456M', '1', '10.00', '2017-11-10'),
('3', '77889966L', '1', '12.00', '2017-12-29'),
('4', '49892872S', '1', '15.00', '2017-12-30'),
('6', '44546323Z', '2', '11.00', '2017-12-02'),
('7', '19872937B', '2', '12.00', '2017-12-30'),
('7', '48703882A', '1', '12.00', '2018-01-07'),
('8', '23456781C', '3', '14.00', '2017-12-29'),
('8', '23897401M', '2', '12.00', '2018-01-30'),
('10', '12946817A', '1', '14.00', '2018-01-22'),
('11', '12946817A', '2', '15.00', '2017-12-29'),
('11', '28391987D', '1', '10.00', '2017-12-02'),
('11', '68273288B', '2', '13.00', '2017-12-15'),
('15', '49892872S', '2', '14.00', '2017-11-30'),
('16', '20837458P', '1', '11.00', '2018-01-25');





