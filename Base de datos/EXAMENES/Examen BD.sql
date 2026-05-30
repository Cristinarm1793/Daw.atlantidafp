# A) GROUP BY y HAVING (10 ejercicios)
# 1) Cuenta cuántos pedidos hay por representante (rep) y muestra rep y total_pedidos. 9 filas
SELECT rep, COUNT(num_pedido) AS "total_pedidos" FROM pedidos GROUP BY rep;
# 2) Calcula el importe total vendido (SUM(importe)) por cliente (clie) y muéstralo ordenado de mayor a menor.15 filas
SELECT clie, SUM(importe) AS "importe_total_vendido" FROM pedidos GROUP BY SUM(importe) DESC;
#3 ) Muestra las oficinas (oficina) con el total de ventas de sus representantes (SUM(repventas.ventas)) agrupado por oficina.5 filas.
SELECT oficina, SUM(repventas.ventas) AS "total_ventas_representantes" FROM oficinas, repventas WHERE oficinas.oficina = repventas.oficina_rep GROUP BY oficina;
# 4) Devuelve los representantes (rep) cuyo importe total de pedidos (SUM(importe)) sea mayor que 20000 (usa HAVING).7 filas
SELECT rep, SUM(importe) AS "impote_total_pedidos" FROM pedidos, repventas WHERE pedidos.rep =  repventas.num_empl GROUP BY oficina HAVING SUM(importe) > 20000;
# 5) Devuelve los clientes (clie) que tengan 2 o más pedidos (COUNT(*)) (usa HAVING).9 filas
SELECT clie FROM clientes, perdidos WHERE clientes.num_clie = pedidos.clie GROUP BY clie HAVING COUNT(*) >= 2;
# 6) Para cada fabricante (fab), calcula el importe medio de pedido (AVG(importe)) y muestra solo los fabricantes con media > 5000 (HAVING).3 filas
SELECT fab, AVG(importe) AS "importe_medio" FROM pedidos GROUP BY fab HAVING AVG(importe) > 5000;
# 7) Muestra por ciudad de oficina (oficinas.ciudad) el número de representantes asignados (COUNT(repventas.num_empl)).5 filas
SELECT oficinas.ciudad, COUNT(repventas.num_empl) AS "num_representantes" FROM oficinas, repventas WHERE oficinas.oficina = repventas.oficina_rep GROUP BY oficinas.ciudad;
# 8) Muestra por región (oficinas.región) el total de pedidos (COUNT(pedidos.num_pedido)) realizados por representantes de oficinas de esa región.2 filas
SELECT oficinas.región, COUNT(pedidos.num_pedido) AS "total_pedidos" FROM oficinas, pedidos, repventas WHERE oficinas.oficina = repventas.oficina_rep GROUP BY oficinas.región; # falta algo
# 9) Para cada representante, muestra: total_pedidos, importe_total y el importe_medio; y filtra con HAVING los que tengan al menos 3 pedidos y un importe_total > 15000. 5 filas
SELECT rep, COUNT(num_pedido) AS "total_pedidos", SUM(importe) AS "importe_total", AVG(importe) FROM pedidos GROUP BY rep HAVING COUNT(num_pedido) >= 3 AND SUM(importe) > 15000;
# 10) Muestra las oficinas cuyo objetivo (oficinas.objetivo) se haya superado con las ventas reales de la oficina (usa SUM(repventas.ventas) agrupando por oficina y HAVING SUM(repventas.ventas) > oficinas.objetivo).3 filas
SELECT oficina, objetivo FROM oficinas, repventas WHERE oficinas.oficina = repventas.oficina_rep GROUP BY oficina HAVING SUM(repventas.ventas) > oficinas.objetivo;


# B) Subconsultas (10 ejercicios)
# 1) Muestra los representantes cuyo valor de ventas sea mayor que la media de ventas de todos los representantes.5 filas

# 2) Muestra los productos cuyo precio sea mayor que el precio máximo de los productos del fabricante 'ACI'.2 filas
(SELECT MAX(precio) FROM productos WHERE id_fab = 'ACI');
# 3) Muestra los clientes cuyo límite de crédito sea mayor que el límite de crédito medio de todos los clientes.11 filas
SELECT empresa FROM clientes WHERE límite_crédito > (SELECT AVG(límite_crédito) FROM clientes);
# 4) Muestra las oficinas (oficina, ciudad) que no tengan ningún representante asignado (usa subconsulta).0 filas
SELECT oficina, ciudad FROM oficinas, repventas WHERE oficinas.oficina = repventas.oficina_rep NOT IN (SELECT nombre FROM repventas WHERE oficina_rep IS NULL); #??
# 5) Muestra los pedidos cuyo importe sea mayor que el importe medio de los pedidos del mismo cliente (subconsulta correlacionada).9 filas.
SELECT importe FROM pedidos WHERE importe > (SELECT clie, AVG(importe) FROM pedidos GROUP BY clie);
# 6) Muestra los clientes que tengan al menos un pedido (usa EXISTS o NOT EXISTS).15 filas
SELECT DISTINCT clie FROM pedidos WHERE EXISTS (SELECT COUNT(num_pedido) FROM pedidos GROUP BY clie);
# 7) Muestra los representantes que atienden a algún cliente con límite de crédito > 60000 (usa subconsulta con IN o EXISTS).3 filas
(SELECT nombre FROM repventas, clientes WHERE límite_crédito > 60000);
# 8) Muestra los representantes que no han realizado ningún pedido (usa NOT EXISTS).1 fila
SELECT * FROM repventas  WHERE NOT EXISTS (SELECT * FROM pedidos WHERE repventas.num_empl = pedidos.rep);
# 9) Muestra el/los cliente(s) con el mayor importe de pedido (si hay empate, deben salir todos) usando subconsulta.1 fila
SELECT (SELECT empresa, MAX(importe) FROM clientes, pedidos WHERE clientes.num_clie = pedidos.clie GROUP BY empresa);
# 10) Muestra las oficinas en las que todos los representantes tienen más de 40 años (usa NOT EXISTS). 2 filas


