-- A) GROUP BY y HAVING --
# 1. Cuenta cuántos pedidos hay por representante (rep) y muestra rep y total_pedidos.
SELECT rep, COUNT(num_pedido) AS total_pedidos FROM pedidos GROUP BY rep;
# 2. Calcula el importe total vendido (SUM(importe)) por cliente (clie) y muéstralo ordenado de mayor a menor.
SELECT clie, SUM(importe) total_vendido FROM pedidos GROUP BY clie ORDER BY total_vendido DESC;
# 3. Muestra las oficinas (oficina) con el total de ventas de sus representantes (SUM(repventas.ventas)) agrupado por oficina.
SELECT oficinas.oficina, SUM(repventas.ventas) total_ventas FROM oficinas JOIN repventas ON oficinas.oficina = repventas.oficina_rep GROUP BY oficinas.oficina;
# 4. Devuelve los representantes (rep) cuyo importe total de pedidos (SUM(importe)) sea mayor que 20000 (usa HAVING).
SELECT rep, SUM(importe) AS importe_total FROM pedidos GROUP BY rep HAVING importe_total > 20000;
# 5. Devuelve los clientes (clie) que tengan 2 o más pedidos (COUNT(*)) (usa HAVING).
SELECT clie, COUNT(*) AS unidad_pedidos FROM pedidos GROUP BY clie HAVING unidad_pedidos >= 2;
# 6. Para cada fabricante (fab), calcula el importe medio de pedido (AVG(importe)) y muestra solo los fabricantes con media > 5000 (HAVING).
SELECT fab, AVG(importe) AS importe_medio FROM pedidos GROUP BY fab HAVING importe_medio > 5000;
# 7. Muestra por ciudad de oficina (oficinas.ciudad) el número de representantes asignados (COUNT(repventas.num_empl)).
SELECT oficinas.ciudad, COUNT(repventas.num_empl) AS número_representantes FROM oficinas JOIN repventas ON oficinas.oficina = repventas.oficina_rep GROUP BY oficinas.ciudad;
# 8. Muestra por región (oficinas.región) el total de pedidos (COUNT(pedidos.num_pedido)) realizados por representantes de oficinas de esa región.
SELECT oficinas.región, COUNT(pedidos.num_pedido) AS total_pedidos FROM oficinas JOIN repventas ON repventas.oficina_rep = oficinas.oficina JOIN pedidos ON pedidos.rep = repventas.num_empl GROUP BY oficinas.región;
# 9. Para cada representante, muestra: total_pedidos, importe_total y el importe_medio; y filtra con HAVING los que tengan al menos 3 pedidos y un importe_total > 15000. 
SELECT rep, COUNT(num_pedido) AS total_pedidos, SUM(importe) AS importe_total, AVG(importe) AS importe_medio FROM pedidos GROUP BY rep HAVING total_pedidos >=3 AND importe_total > 15000;
# 10. Muestra las oficinas cuyo objetivo (oficinas.objetivo) se haya superado con las ventas reales de la oficina (usa SUM(repventas.ventas) agrupando por oficina y HAVING SUM(repventas.ventas) > oficinas.objetivo).
SELECT oficinas.oficina, oficinas.objetivo, SUM(repventas.ventas) AS ventas_oficina FROM oficinas JOIN repventas ON oficinas.oficina = repventas.oficina_rep  GROUP BY oficinas.oficina HAVING (SUM(repventas.ventas) > oficinas.objetivo);


-- B) Subconsultas --
# 1. Muestra los representantes cuyo valor de ventas sea mayor que la media de ventas de todos los representantes. ????????
SELECT * FROM repventas WHERE AVG(ventas) > (SELECT nombre, SUM(ventas) FROM repventas);
# 2. Muestra los productos cuyo precio sea mayor que el precio máximo de los productos del fabricante 'ACI'.
SELECT * FROM productos WHERE precio > (SELECT MAX(precio) FROM productos WHERE id_fab = 'ACI');
# 3. Muestra los clientes cuyo límite de crédito sea mayor que el límite de crédito medio de todos los clientes. REVISAR
SELECT empresa, límite_crédito FROM clientes WHERE límite_crédito > ALL(SELECT AVG(límite_crédito) FROM clientes);
# 4. Muestra las oficinas (oficina, ciudad) que no tengan ningún representante asignado (usa subconsulta).
SELECT oficina, ciudad FROM oficinas WHERE oficina = (SELECT oficina_rep FROM repventas WHERE oficina_rep IS NULL);
# 5. Muestra los pedidos cuyo importe sea mayor que el importe medio de los pedidos del mismo cliente (subconsulta correlacionada).
SELECT importe FROM pedidos ;
# 6. Muestra los clientes que tengan al menos un pedido (usa EXISTS o NOT EXISTS).
SELECT clie, num_pedido FROM pedidos WHERE num_pedido > EXISTS (SELECT num_pedido, cant FROM pedidos WHERE cant >= 1);
# 7. Muestra los representantes que atienden a algún cliente con límite de crédito > 60000 (usa subconsulta con IN o EXISTS).
# 8. Muestra los representantes que no han realizado ningún pedido (usa NOT EXISTS).
# 9. Muestra el/los cliente(s) con el mayor importe de pedido (si hay empate, deben salir todos) usando subconsulta.
# 10. Muestra las oficinas en las que todos los representantes tienen más de 40 años (usa NOT EXISTS).
