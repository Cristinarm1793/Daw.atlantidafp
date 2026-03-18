-- PRÁCTICA MODULO II --

-- PARTE 1 --
# 1.- Inserta un cliente con los siguientes datos: código: 2130, nombre: Construcciones Fernández S.L., empleado asignado: 109, límite de crédito: 43000.
INSERT INTO clientes (num_clie, empresa, rep_clie, límite_crédito)
VALUES (2130, 'Construcciones Fernández S.L.', 109, 43000);

# 2.- Inserta los datos de una nueva oficina abierta en Granada. El código es el 15, el director es 105. Y el objetivo es 25000. Los otros datos se desconocen.
INSERT INTO oficinas (oficina, ciudad, región, dir, objetivo, ventas) 
VALUES (15, 'Granada', NULL, 105, 25000, NULL);

# 3.- Inserta los datos de tres productos nuevos inventados por ti. Inserta los tres a la vez.
INSERT INTO productos (id_fab, id_producto, descripción, precio, existencias)
VALUES 
('CRM', '1001C' ,'Tornillo industrial', 150, 200),
('CRM', '1002R' ,'Tuerca reforzada', 80, 500),
('CRM', '1003M' ,'Arandela metálica', 30, 1000);

# 4.- Inserta los datos de una tabla de productos antiguos que estaban en otra tabla llamada PRODUCTOS_ANT en la tabla PRODUCTOS. Ambas tienen los mismos campos. Insértalos todos. La tabla PRODUCTOS_ANT no existe y no hay que crearla. Ésta consulta no la vas a poder probar
INSERT INTO productos (id_fab, id_producto, descripción, precio, existencias)
SELECT id_fab, id_producto, descripción, precio, existencias
FROM productos_ant;


-- PARTE 2 --
# Eliminar clientes que trabajaron con Pedro Cruz
DELETE FROM pedidos 
WHERE
    clie IN (SELECT 
        num_clie
    FROM
        clientes
    
    WHERE
        rep_clie = (SELECT 
            num_empl
        FROM
            repventas
        
        WHERE
            nombre = 'Pedro Cruz'));
    
        
# Eliminar a Pedro Cruz
DELETE FROM clientes 
WHERE
    rep_clie = (SELECT 
        num_empl
    FROM
        repventas
    
    WHERE
        nombre = 'Pedro Cruz');
    
# Eliminar empleados con ventas < 10000
DELETE FROM repventas 
WHERE
    ventas < 10000 
    AND num_empl IS NOT NULL;
    
# Insertar nuevos clientes
SET @rep_menos_clientes = (SELECT rep_clie FROM clientes GROUP BY rep_clie ORDER BY COUNT(*) ASC LIMIT 1);
INSERT INTO clientes (num_clie, empresa, rep_clie, límite_crédito) 
VALUES 
(2130, 'TOMTOM S.L.', @rep_menos_clientes, 45000), 
(2135, 'ALBARICIAS S.A.', @rep_menos_clientes, 38000);

# Subir la cuota un 50%
UPDATE repventas 
SET 
    cuota = cuota * 1.5;


-- PARTE 3 --
# 1.- Insertar en una tabla inventada llamada CLIENTES S.L. a aquellos clientes que correspondan a este tipo de empresa, la tabla CLIENTES S.L. tiene las mismas columnas que la tabla clientes.
INSERT INTO  CLIENTES_SL 
SELECT 
    *
FROM
    clientes
WHERE
    empresa LIKE '%S.L.%';
    
# 2.-Elimina todos los vendedores que tengan menos de 5 pedidos.
DELETE FROM repventas 
WHERE
    num_empl IN (SELECT 
        rep
    FROM
        pedidos
    GROUP BY rep
    HAVING COUNT(*) < 5);
    
# 3.- Elimina todos los vendedores que estén en una oficina de Valencia.
DELETE FROM repventas 
WHERE
    oficina_rep IN (SELECT 
        oficina
    FROM
        oficinas
    
    WHERE
        ciudad = 'Valencia');
        
# 4.-Cambia la oficina de Madrid y trasládala a Vigo.
UPDATE oficinas 
SET 
    ciudad = 'Vigo'
WHERE
    ciudad = 'Madrid';
    
# 5.-Cambia x2 al importe de los pedidos de aquellos pedidos que su responsable este situado en Barcelona.
UPDATE pedidos 
SET 
    importe = importe * 2
WHERE
    rep IN (SELECT 
            num_empl
        FROM
            repventas
        WHERE
            oficina_rep IN (SELECT 
                    oficina
                FROM
                    oficinas
                WHERE
                    ciudad = 'Barcelona'));
                    
# EXTRA Y OPCIONAL. Elimina todos aquellos pedidos cuyo número de existencias es menos a 1000 unidades.
DELETE FROM pedidos 
WHERE
    (fab , producto) IN (SELECT 
        id_fab, id_producto
    FROM
        productos
    
    WHERE
        existencias < 1000);
