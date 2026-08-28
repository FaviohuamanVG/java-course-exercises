/*--------------------------------------------
    Describe the Use of Group Functions
*/--------------------------------------------
-- Funciones en grupo:
-- Procesan un conjunto de varias filas y estas devuelven
-- un solo resultado por conjunto.
-- Ademas no se puede mezclar una misma lista del SELECT en una funcion
-- que quiere devolver N filas(funcion en grupo)con una que devuelve 1 
-- solo fila (funcion escalar).

-- Funcion escalar
-- Le preguntamos la edad a 30 niños, lo que recibimos es
-- 30 respuestas (una x cada fila).

-- Funcion en grupo
-- Calcular el promedio de edad de todo un salon. Recibimos
-- una sola respuesta para todos los alumnos juntos.

-- La función escalar procesa fila por fila
SELECT ITEM, PRICE, ROUND(PRICE) FROM SHIP_SHOP;
/*
Usamos la funcion escalar para procesar las 
filas generadas segun existentes en la tabla.
Y mostrara 1, 2 o 3 filas.
*/

SELECT AVG(PRICE) FROM SHIP_SHOP;
/*
Utilizamos la funcion AVG para calcular el
promedio de un valor acumulado. Y va unir
todas las filas en 1 sola
*/

SELECT ROUND(PRICE), AVG(PRICE) FROM SHIP_SHOP;
/*
No podemos combinar o mezclar las funciones
esto genera un error. Debido a que son 2
filas de agregacion.
*/

SELECT ROUND(AVG(PRICE)) FROM SHIP_SHOP;
SELECT AVG(ROUND(PRICE)) FROM SHIP_SHOP;
/*
Hacemos una consulta anidada el cual primero
ejecuta AVG(PRICE) y luego va aplicar ROUND()
a ese valor. Ambos operan al mismo nivel de
agregacion (1 fila).
*/


/*--------------------------------------------
                FUNTION COUNT
*/--------------------------------------------
-- Funciones en grupo:
-- Esta funcion solo cuenta los valores NO NULOS   
-- NOT NULL de una columna especifica. COUNT(columna)
-- Cuenta el numero de filas de tabla, esta incluye
-- filas con valores nulos o completamente vacias. COUNT(*)
-- Cuenta unicamente los valores unicos no nulos, ignorando
-- los duplicados. COUNT(DISTINCT columna)
-- Si la tabla esta vacia o solo contiene nulos, COUNT(columna)
-- devolver 0 nunca NULL.

-- Ver los datos de la tabla VENDORS
SELECT VENDOR_NAME, 
STATUS, CATEGORY FROM VENDORS;

/*
Seleccionamos las columnas VENDOR_NAME, STATUS y CATEGORY de
la tabla VENDORS.
*/

-- COUNT con columnas individuales (ignorando NULL)
SELECT COUNT(VENDOR_NAME), COUNT(STATUS), COUNT(CATEGORY) 
FROM VENDORS;

/*
Seleccionamos las columnas y utilizamos la funcion COUNT(column)
el cual nos dara resultado mostrandonos solo las datos e ignora
los NULLS.
*/

-- COUNT(*) para contar el total de las filas
SELECT COUNT(*) 
FROM VENDORS;

/*
Esta funcion nos ayuda a contar el total de la filas
que tiene registros pero solo nos muestra el total
mas no sus datos.
*/

-- Combinar el conteo de filas y conteo de columnas
SELECT COUNT(*), COUNT(VENDOR_NAME) 
FROM VENDORS;

/*
Usamos la funcion COUNT(*) + COUNT(column) para
combinar el conteo tanto de filas como de columna.
*/

-- ALL vs DISTINT
SELECT COUNT(ALL LAST_NAME), COUNT(DISTINCT LAST_NAME) 
FROM EMPLOYEES;

/*
Usamos esta funcion para retornar 5, eliminando los 2
apellidos los cuales estan duplicados y cuenta
unicamente solo los 5 unicos.
*/


/*--------------------------------------------
                FUNTION SUM
*/--------------------------------------------
-- Tipo de dato unico (SUM), solo acepta tipos de datos
-- numericos (otro tipo de dato da error).
-- Ignora absolutamente a los NULL
-- Puedes combinar SUM con la clausula WHERE para sumar
-- unicamente los datos que cumplan ciertos criterios
-- Toma N filas y devuelve solo 1 sola fila.

-- Suma total de una columna numérica
SELECT SUM(SUBTOTAL)
FROM ORDERS;

/*
Usamos la funcion subtotal para poder realizar
una suma total de la columna SUBTOTAL el cual
solo son valores numericos. No es aceptable
otro tipo de dato.
*/

-- Suma condicional (solo abril 2017)
SELECT SUM(SUBTOTAL)
FROM ORDERS
WHERE TO_CHAR(ORDER_DATE, 'MON-RR') = 'ABR-17';

/*
Convierte la fecha al formato texto mes-año(ABR-17)
para que filtre unicamente las filas de abril de 2017
dandonos la suma solo las filas que cumplan.
*/

/*--------------------------------------------
                FUNTION MIN,MAX
*/--------------------------------------------
-- MIN y MAX utilizan datos mas flexibles, a diferencia
-- de SUM que solo aceptan numeros.
-- Aceptan fechas, cadenas de texto y numeros.
-- Logica de orden: ORDER BY
-- El valor mas pequeño es MIN y el mas grande MAX.
-- MIN el primero de la fila.
-- MAX el ultimo de la fila.

SELECT MIN(LAST_NAME), MAX(LAST_NAME) 
FROM EMPLOYEES;

/*
Usamos las funciones MIN - MAX para ordenar alfabeticamente
los apellidos y MIN retorno el primero mientras que
MAX retorna el ultimo valor de esa lista.
*/

/*--------------------------------------------
                FUNTION AVG
*/--------------------------------------------
-- Solo funciona con datos numericos al igual que la
-- funcion SUM.
-- Ignora los valores NULL automaticamente (SUM si
-- los toma en cuenta).
-- ROUND y TO_CHAR serian las que se pueden anidar.

-- Consulta basica:
SELECT AVG(SALARY) 
FROM PAY_HISTORY;

/*
Consultamos y utilizamos la funcion AVG en la columna
SALARY en la tabla PAY_HISTORY(ignorando los nulls
existentes).
*/

-- Redondear a 2 decimales usando ROUND
SELECT ROUND(AVG(SALARY), 2) 
FROM PAY_HISTORY;

/*
Usamos las funciones anidadas de ROUND(AVG(column), 2)
esto para redondear el resultado y simplemente nos de
2 decimales.
*/

-- Formatear a moneda usando TO_CHAR
SELECT TO_CHAR(ROUND(AVG(SALARY), 2), '$999,999.99') 
FROM PAY_HISTORY;

/*
Aqui usamos nuevamente una funciona anidada esto
para formatear una moneda utilizando TO_CHAR con
una mascara de formato.
*/

/*--------------------------------------------
                FUNTION MEDIAN
*/--------------------------------------------
-- A diferencia de AVG o SUM, esta funcion solo
-- acepta datos numericos y fechas no acepta
-- valores tipo texto VARCHAR2.
-- Fila impar - toma el unico valor central
-- Fila par - toma los 2 valores centrales.
-- Ignoran nulls.

-- Consulta del libro (Cantidad impar: 3 elementos -> 1, 3, 10)
SELECT MEDIAN(A) FROM TEST_MEDIAN;

/*
Usamos la funcion MEDIAN de la tabla TEST_MEDIAN
para consultar la fila con cantidad impar
-- Imaginemos que es 3 el resultado debe ser 3.
*/

-- Probar cantidad PAR de elementos
INSERT INTO TEST_MEDIAN VALUES (5);
COMMIT;

/*
Usamos nuevamente la funcion para que nos
intente devolver un resultado ahora PAR
*/

-- Resultado esperado 4.
SELECT MEDIAN(A) FROM TEST_MEDIAN;


/*--------------------------------------------
                FUNTION RANK
            - RANK: Analytic
*/--------------------------------------------
-- La funcion RANK asigna la misma posicion a filas
-- con valores identicos, pero salta posiciones 
-- posteriores. Si hay un empate en el puesto 1(1, 1)
-- el siguiente elemento recibe el puesto 3(no el 2).
-- Tiene una clausula OVER, definiendo la ventana
-- de trabajo. Obligatoria.
-- ORDER BY (opcional dentro de OVER)
-- RANK() OVER (PARTITION BY p1 ORDER BY ob1)
-- PARTITION BY (opcional)

-- Consulta con RANK() OVER analítico
SELECT SHIP_CABIN_ID, ROOM_STYLE, SQ_FT
     , RANK() OVER (PARTITION BY ROOM_STYLE ORDER BY SQ_FT) SQ_FT_RK
FROM   SHIP_CABINS
WHERE  SHIP_CABIN_ID <= 7
ORDER BY SQ_FT;

/*
Dividimos las filas en "grupos independientes" o cajas
separadas segun la categoria de camarote gracias a 
PARTITION BY ROOM_STYLE
ORDER BY SQ_FT - (dentro de OVER)
*/

/*--------------------------------------------
            - RANK: Agregate
*/--------------------------------------------
-- Evalua donde encajaria un valor literal (533)
-- dentro de una columna SQ_FT
-- Su sintaxis con: WITHIN GROUP a diferencia de
-- OVER esta es asi: WITHIN GROUP (ORDER BY ...)
-- Sus parametros RANK(c1, c2) el mismo numero
-- de columnas ordenadas y ORDER BY (e1, e2) sus
-- tipos de datos deben coincidir en pares.

-- RANK como función de agregación
SELECT RANK(533) WITHIN GROUP (ORDER BY SQ_FT) AS RANK_HIPOTETICO
FROM   SHIP_CABINS
WHERE  SHIP_CABIN_ID <= 7;

/*
Usamos la funcion agregada de RANK y esta devuelve solo la fila
del resultado, el cual vendria hacer 4.
*/

/*--------------------------------------------
                DENSE_RANK
            - DENSE_RANK: Analytic
*/--------------------------------------------
-- La funcion DENSE_RANK asigna el mismo numero a los valores
-- empatados, pero nunca salta numeros al continuar la
-- secuencia.
-- DENSE_RANK() OVER (PARTITION BY p1 ORDER BY ob1)
-- Ejemplo: Si una fila empata 3 veces en columna entonces
-- la 4ta recibira la posicion 2
-- A diferencia de RANK que salta la posicion iguala y le
-- agrega +1.

SELECT SHIP_CABIN_ID, ROOM_STYLE, SQ_FT,
       DENSE_RANK() OVER (PARTITION BY ROOM_STYLE ORDER BY SQ_FT) SQ_FT_DRK
FROM   SHIP_CABINS
WHERE  SHIP_CABIN_ID <= 7
ORDER BY SQ_FT;

/*
Usamos la funcion DENSE_RANK() para generar una secuencia
continua de numeros enteros estos sin dejar huecos.
(1, 1, 2, 3).
PARTITION BY: Reiniciar el contador no afecta en nada
*/

/*--------------------------------------------
            - DENSE_RANK: Agregate
*/--------------------------------------------
-- Al igual que el RANK_AGREGATE, calcula que posicion
-- ocuparia un valor literal si esta es insertada en
-- la tabla (ejm. 554)
-- Si el valor cae despues de un grupo empatado, la
-- posicion devuelta sera el numero entero siguiente.

-- Función de agregación (valor hipotético)
SELECT DENSE_RANK(586) WITHIN GROUP (ORDER BY SQ_FT) AS DENSE_RANK_HIPOTETICO
FROM   SHIP_CABINS
WHERE  SHIP_CABIN_ID <= 7;

/*
Usamos esta funcion para agregar un valor hipotetico y
visualizar en que lugar va estar, pero antes de agregarlo
cuenta los valores unicos previos y luego lo inserta
*/

/*--------------------------------------------
                 FIRST,LAST
*/--------------------------------------------
-- Esta funcion permite ordenar un conjunto de datos
-- por una columna e1, filtrando primeramente el primer
-- subgrupo(FIRST) o el ultimo con (LAST) y luego
-- una de agregacion MAX, MIN, AVG, SUM para otra
-- columna diferente.
-- Usa una clausula KEEP - KEEP (DENSE_RANK FIRST/LAST ORDER BY ...)

SELECT MAX(SQ_FT) KEEP (DENSE_RANK FIRST ORDER BY GUESTS) "Largest"
FROM   SHIP_CABINS;

/*
Ordenamos todas las cabinas de menor a mayor cantidad de
huespedes.
KEEP (DENSE_RANK FIRST ...) Se queda solo con filas
que tienen el valor minimo de huespedes.
MAX(SQ_FT) de ese subgrupo filtrado de cabinas pequeñas
*/

/*--------------------------------------------
    Group Data by Using the GROUP BY Clause
*/--------------------------------------------
-- GROUP BY, permite colapsar multiples filas que comparten
-- valores comunes en sub-groups (mini-SELECTS) para aplicarlos
-- funciones de agregacion (AVG, MAX, MIN, COUNT, etc.)
-- Solo exite en la sentencia SELECT
-- No es obligatorio listar la columna agrupada
-- Se puede usar ORDER BY 2 DESC para ordenar la segunda
-- expresion SELECT.

SELECT SHIP_CABIN_ID, ROOM_NUMBER, ROOM_STYLE,
       ROOM_TYPE, WINDOW, GUESTS, SQ_FT
FROM   SHIP_CABINS
WHERE  SHIP_ID = 1;

/*
Esta consulta muestra todos los datos detallados de cada
camarote que perteneces al barco 1, esta sin GROUP BY
osea que esta sin agrupar.
*/

SELECT ROUND(AVG(SQ_FT), 2)
FROM   SHIP_CABINS
WHERE  SHIP_ID = 1;

/*
Aqui calculamos un valor promedio general del metraje
SQ_FT de todos los camarotes del barco 1.
Aun sin agrupar (NO GROUP BY).
*/

SELECT ROUND(AVG(SQ_FT), 2)
FROM   SHIP_CABINS
WHERE  SHIP_ID = 1 AND ROOM_STYLE = 'Suite';

/*
Queremos calcular el promedio de metraje SQ_FT, 
filtrando unicamente los camarotes de estilo 'Suite'.
*/

SELECT ROUND(AVG(SQ_FT), 2)
FROM   SHIP_CABINS
WHERE  SHIP_ID = 1 AND ROOM_STYLE = 'Stateroom';

/*
Queremos calcular el promedio de metraje SQ_FT, 
filtrando unicamente los camarotes de estilo 'Stateroom'
y ya no con Suite.
*/

SELECT ROOM_STYLE, ROUND(AVG(SQ_FT), 2)
FROM   SHIP_CABINS
WHERE  SHIP_ID = 1
GROUP BY ROOM_STYLE;
/*
Esta consulta hace un resumen de las 2 consultas anteriores 
en una sola, agrupa ROOM_STYLE osea tanto
('Suite' y 'Stateroom') y calcula el promedio de metraje
para cada uno de esos 2 grupos
-- Aqui ya se usa el GROUP BY
*/


SELECT ROOM_STYLE,
       ROUND(AVG(SQ_FT), 2) "Average SQ FT",
       MIN(GUESTS) "Minimum # of Guests",
       COUNT(SHIP_CABIN_ID) "Total # of cabins"
FROM   SHIP_CABINS
WHERE  SHIP_ID = 1
GROUP BY ROOM_STYLE;

/*
Esta consulta muestra por cada ROOM_STYLE no solo el
promedio de metraje, sino tambien el numero minimo 
de huespedes y total de camarotes existente en
cada categoria.
*/

SELECT ROOM_TYPE,
       TO_CHAR(ROUND(AVG(SQ_FT), 2), '999,999.99') "Average SQ FT",
       MAX(GUESTS) "Maximum # of Guests",
       COUNT(SHIP_CABIN_ID) "Total # of cabins"
FROM   SHIP_CABINS
WHERE  SHIP_ID = 1
GROUP BY ROOM_TYPE
ORDER BY 2 DESC;

/*
Agrupa los camarotes por ROOM_TYPE, aplicando el formato
de monedas, aqui aplicamos la funcion TO_CHAR y usamos
la mascara que nos servira como formato.
Usando la posición de la 2.ª columna del SELECT
*/

SELECT TO_CHAR(ROUND(AVG(SQ_FT), 2), '999,999.99') "Average SQ FT",
       MAX(GUESTS) "Maximum # of Guests",
       COUNT(SHIP_CABIN_ID) "Total # of cabins"
FROM   SHIP_CABINS
WHERE  SHIP_ID = 1 AND ROOM_TYPE = 'Royal'
ORDER BY 1 DESC;

/*
Consulta para mostrar el funcionamiento interno del GROUP
BY calculando los mismo indicadores de la consulta 7, pero
filtrando solo la categoria Royal, en lugar de agruparla
todos a la vez.
*/

/*--------------------------------------------
                Multiple Columns
*/--------------------------------------------
-- Podemos incluir dos o mas columnas en el GROUP BY
-- Se agrupara por la primera columna ROOM_STYLE y 
-- dentro de cada uno de esos grupos, creamos
-- subgrupos basados en la segunda columna ROOM_TYPE
-- MIN(SQ_FT) - MAX(SQ_FT)
-- ORDER BY posicional: La clausula ORDER BY 3 ordena
-- el resultado de la columna del SELECT que corresponde
-- TO_CHAR(MIN(SQ_FT), '9,999')

SELECT ROOM_STYLE,
       ROOM_TYPE,
       TO_CHAR(MIN(SQ_FT), '9,999') "Min",
       TO_CHAR(MAX(SQ_FT), '9,999') "Max",
       TO_CHAR(MIN(SQ_FT) - MAX(SQ_FT), '9,999') "Diff"
FROM   SHIP_CABINS
WHERE  SHIP_ID = 1
GROUP BY ROOM_STYLE, ROOM_TYPE
ORDER BY 3;

-- En esta consulta se crea combinaciones de 6 filas
-- en total. Con la Diff restamos el valor minimo
-- de metros del valor maximo dentro de cada grupo
-- ORDER BY 3 ordenar numericamente por el resultado
-- de la 3ra expresion del select ("MIN")

