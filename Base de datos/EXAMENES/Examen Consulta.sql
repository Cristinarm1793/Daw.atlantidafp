#1) Lista el número y nombre de todos los representantes de ventas cuyo título sea exactamente 'Rep. Ventas'.
SELECT num_empl, nombre FROM repventas WHERE título = 'Rep. Ventas';

#2) Muestra el nombre y edad de los representantes cuya edad esté entre 40 y 50 años (ambos incluidos).
SELECT nombre, edad FROM repventas WHERE edad BETWEEN 40 AND 50;

#3) Obtén el número de cliente y el nombre de la empresa de todos los clientes cuyo límite de crédito estéentre 40 000 y 60 000 (usa BETWEEN).
SELECT num_clie, empresa FROM clientes WHERE límite_crédito BETWEEN 40000 AND 60000;

#4) Lista el número de cliente y empresa de los clientes cuya empresa empiece por 'Exclusivas' (usa LIKE).
SELECT num_clie, empresa FROM clientes WHERE empresa LIKE 'Exclusivas%';

#5) Muestra id_fab, id_producto y descripción de los productos cuyo precio sea mayor o igual que 500,ordenados de mayor a menor precio.
SELECT id_fab, id_producto, descripción, precio FROM productos WHERE precio >= 500 ORDER BY precio DESC;

#6) Obtén el número de pedido, fecha_pedido y num_clie de los pedidos realizados entre '2000-01-01' y'2000-01-31' (usa BETWEEN sobre fecha_pedid
SELECT num_pedido, fecha_pedido, clie FROM pedidos WHERE fecha_pedido BETWEEN '2000-01-01'AND '2000-01-31';

#7) Muestra el nombre y la ciudad de todos los representantes, uniendo repventas con oficinas medianteINNER JOIN.
SELECT nombre, ciudad FROM repventas, oficinas WHERE repventas.oficina_rep = oficinas.oficina;

#8) Lista el nombre del representante y la región de la oficina en la que trabaja, solo para aquellos cuya región sea 'Este'.
SELECT nombre, región FROM repventas, oficinas WHERE repventas.oficina_rep = oficinas.oficina AND región = 'Este';

#9) Obtén el número de cliente, nombre de empresa y nombre del representante que lo atiende, uniendo clientes con repventas.
SELECT num_clie, empresa, nombre FROM clientes, repventas WHERE clientes.rep_clie = repventas.num_empl;

#10) Lista el número de pedido, empresa del cliente y nombre del representante que intervienen en el pedido, uniendo pedidos, clientes y repventas.
SELECT num_pedido, empresa, nombre FROM pedidos, clientes WHERE pedidos.clie = clientes.num_clie AND pedidos.rep = repventas.num_empl;

#11) Muestra id_fab, id_producto y descripción de los productos cuyo fabricante sea 'REI' o 'IMM' (usa IN)
SELECT id_fab, id_producto, descripción FROM productos WHERE id_fab IN ("REI", "IMM");

#12) Muestra id_fab, id_producto, descripción y existencias de los productos cuya descripción contenga la palabra 'Riostra' (usa LIKE con comodines)
SELECT id_fab, id_producto, descripción, existencias FROM productos WHERE descripci LIKE 'Riostra%';

#13) Lista num_empl y nombre de los representantes que no tienen oficina asignada (oficina_rep es NULL)
SELECT num_empl, nombre FROM repventas WHERE oficina_rep IS NULL;

#14) Lista num_clie, empresa y límite_crédito de los clientes cuyo representante tenga oficina en la ciudad 'Madrid' (usa JOIN entre clientes, repventa
SELECT num_clie, empresa, límite_crédito FROM clientes, repventas, oficinas WHERE clientes.rep_clie = repventas.num_empl AND repventas.oficina_rep = oficinas.oficina AND ciudad = 'Madrid';

#15) Muestra num_pedido, fecha_pedido y descripción del producto pedido (uniendo pedidos con productos) solo para pedidos del fabricante 'ACI'.
SELECT num_pedido, fecha_pedido, descripción FROM pedidos, productos WHERE pedidos.producto = productos.id_producto AND fab = 'ACI';

#16) Obtén num_pedido, empresa del cliente, nombre del representante y ciudad de la oficina correspondiente, para todos los pedidos (JOIN de pedidos, clientes, repventas y oficinas)
SELECT num_pedido, empresa, nombre, ciudad FROM pedidos, cliente, repventas, oficinas; #lo siento no me acordaba de los Join me bloquee. eres un maquina si tienes piedad conmigo.

#17) Muestra num_empl, nombre y ciudad de la oficina de todos los representantes cuyo nombre termine en 'Martínez' (usa LIKE con comodín al principio).
SELECT num_empl, nombre, ciudad FROM repventas, oficinas WHERE repventas.oficina_rep = oficinas.oficina AND nombre LIKE '%Martinez';

#18) Lista num_empl, nombre y contrato de todos los representantes contratados entre '1997-01-01' y '1999-12-31' (usa BETWEEN).
SELECT num_empl, nombre, contrato FROM repventas WHERE contrato BETWEEN  '1997-01-01' AND '1999-12-31';

#19) Muestra num_pedido, fecha_pedido y empresa del cliente de todos los pedidos cuyo importe esté entre 5 000 y 30 000 (usa BETWEEN
SELECT num_pedido, fecha_pedido, empresa FROM pedidos, clientes WHERE pedidos.clie = clientes.num_clie AND importe BETWEEN 5000 AND 30000;

#20) Muestra num_clie, empresa y nombre del representante solo de aquellos clientes cuyo nombre de empresa contenga la cadena 'S.L.' y cuyo límite de crédit
SELECT num_clie, empresa, nombre FROM clientes, repventas WHERE clientes.rep_clie = repventas.num_empl AND empresa LIKE '%S.L.' AND límite_crédito > 50000;
