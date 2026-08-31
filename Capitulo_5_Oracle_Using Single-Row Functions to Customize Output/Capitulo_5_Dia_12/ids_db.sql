/*------------------------------------------------------------------
            Función PERCENTILE_CONT (Percentil Continuo)
------------------------------------------------------------------
-- PERCENTILE_CONT utiliza interpolación lineal entre el límite superior 
-- (ceiling) y el límite inferior (floor) de un conjunto de filas para 
-- calcular el valor del percentil.
-- 
-- Recibe como parámetro un porcentaje (ej. 0.6 para 60%) y determina 
-- el valor numérico equivalente a ese porcentaje del total del grupo.
--
-- Sintaxis clave:
-- PERCENTILE_CONT(porcentaje) WITHIN GROUP (ORDER BY columna) OVER (...)
*/

SELECT WINDOW, 
       ROOM_NUMBER, 
       SQ_FT,
       -- Calcula el 60% del valor de los pies cuadrados dentro de cada grupo de ventana
       PERCENTILE_CONT(.6) 
           WITHIN GROUP (ORDER BY SQ_FT) 
           OVER (PARTITION BY WINDOW) AS "PCT"
FROM SHIP_CABINS
ORDER BY SQ_FT;

-- Calculo:
/*
-- (P = 0.6) - fila teórica caera al 60%
-- (RN = 4) -  4 filas
-- TR = (1 + (P x (RN - 1)))
-- 2.8 = (1 + (0.6 x (4 - 1)))
--
-- La fila 2.8 está entre la fila 2 (Floor) y la fila 3 (Ceil).
-- El valor en la fila 3 (Ceil) es 533, fila 2 (Floor) es 205.
-- (CEIL - TR) x (Value_at_FLOOR) + (TR - FLOOR) x (Value_at_CEIL)
-- ((3 - 2.8) x 205) + ((2.8 - 2) x 533) = 467.4
*/

/*------------------------------------------------------------------
            Funciones Anidadas (Nesting Functions)
------------------------------------------------------------------
-- Una funcion anidada cuando el resultado(salida) de una se convierte
-- en el parametro(entrada) de otra.
-- Cuando se anidan a multiples niveles, la mas interna se ejecuta PRIMERO
*/

SELECT ADDRESS2,
       INSTR(ADDRESS2, ',') AS THE_COMMA,
 -- 1. Función interna aislada: INSTR encuentra la posición de la coma ','
       SUBSTR(ADDRESS2, INSTR(ADDRESS2, ',') + 2, 2) AS STATE
-- 2. Funciones anidadas: INSTR se anida dentro de SUBSTR.
-- Al resultado de INSTR (la posición de la coma) le sumamos 2 
-- (1 para saltar la coma, 1 para saltar el espacio en blanco).
-- Luego le decimos a SUBSTR que extraiga 2 caracteres desde ahí.
FROM ORDER_ADDRESSES
-- Ordenamos el resultado final por el número de la columna en el SELECT (STATE)
ORDER BY 3;


       

