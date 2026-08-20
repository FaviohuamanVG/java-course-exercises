/*----------------------------------------------------------------------
    ORDER BY (Ordenar Resultados)
  ----------------------------------------------------------------------
-- 1. Siempre va al FINAL de la consulta SELECT.
-- 2. No altera la base de datos, solo la vista (visualizacion).
-- Si no se usa SQL devuelve filas en orden aleatorio.
----------------------------------------------------------------------*/

-- Ordenar por una columna (Por defecto ascendente)
-- Los que no tiene departamento (NULL) apareceran al final.
SELECT ADDRESS_ID, STREET_ADDRESS, CITY, STATE, COUNTRY
  FROM ADDRESSES
 ORDER BY STATE;
 
-- Orden por dos columnas
SELECT ADDRESS_ID, STREET_ADDRESS, CITY, STATE, COUNTRY
  FROM ADDRESSES
 ORDER BY STATE, CITY;

-- Ordenando sin mostrar las columnas
SELECT ADDRESS_ID, STREET_ADDRESS, COUNTRY
  FROM ADDRESSES
 ORDER BY STATE, CITY;

/*----------------------------------------------------------------------
    ASC and DESC (Dirección del Ordenamiento)
  ----------------------------------------------------------------------
-- 1. ASC Ascendente:
-- Ordena de menor a mayor (A-Z, numeros menores a mayores).
-- Es el valor x default, por lo que no es obligatorio escribirlo.

-- 2. DESC Descendente:
-- Ordena de mayor a mayor (Z-A, numeros mayores a menores).
-- Obligatorio escribirlo si se requiere este orden.

-- 3. Regla Importante:
-- Son operados de manera INDIVIDUAL en cada columna del ORDER BY.  
  ----------------------------------------------------------------------*/
-- ASC
SELECT SHIP_ID, PROJECT_COST, PROJECT_NAME, DAYS
  FROM PROJECTS
 ORDER BY SHIP_ID ASC;
 
-- ASC + DESC: Consulta combinada.
SELECT SHIP_ID, PROJECT_COST, PROJECT_NAME, DAYS
  FROM PROJECTS
 ORDER BY SHIP_ID ASC, PROJECT_COST DESC;
 
/*----------------------------------------------------------------------
    ORDER BY con Expressions (Expresiones y Cálculos)
  ----------------------------------------------------------------------
-- 1. No se obliga a ordenar solo por columnas existentes.
-- 2. Se puede usar expresiones matematicas (sumas, restas, etc.)
-- 3. Resultado del calculo determina la secuencia del ordenamiento.
  ----------------------------------------------------------------------*/
-- Usando asterisco (*) y ordenando por una expresión
SELECT *
  FROM PROJECTS
 ORDER BY PROJECT_COST / DAYS;

-- Mostrando la expresión explícitamente en el SELECT
SELECT PROJECT_ID, PROJECT_NAME, PROJECT_COST, DAYS, (PROJECT_COST / DAYS)
  FROM PROJECTS
 ORDER BY PROJECT_COST / DAYS;
 
/*----------------------------------------------------------------------
    THE COLUMN ALIAS (Alias de Columna en ORDER BY)
  ----------------------------------------------------------------------*/
-- Nombre alternativo que tu inventas, se utiliza en las columnas o 
-- expresiones en la lista SELECT, colocando opcionalmente
-- usando la palabra AS seguida de espacio.

-- 1. Consulta con alias usando la palabra opcional AS
SELECT PROJECT_ID, PROJECT_NAME, PROJECT_COST, 
       DAYS, PROJECT_COST/DAYS AS PER_DAY_COST
  FROM PROJECTS
 ORDER BY PER_DAY_COST;
 
-- 2. Consulta con alias usando comillas DOBLES:
SELECT PROJECT_ID, PROJECT_NAME, PROJECT_COST, 
       DAYS, PROJECT_COST/DAYS "Cost Per Day"
  FROM PROJECTS
 ORDER BY "Cost Per Day";  
 
/*----------------------------------------------------------------------
    REFERENCE BY POSITION (Referencia por Posición)
  ----------------------------------------------------------------------*/
-- 1. Es un método alternativo en la cláusula ORDER BY
-- Para identificar columnas o expresiones que se van a
-- ordenar utilizando su posición numérica dentro de la lista del SELECT

-- El número 5 hace referencia al quinto elemento 
-- del SELECT (PROJECT_COST/DAYS)
SELECT PROJECT_ID, PROJECT_NAME, PROJECT_COST, 
       DAYS, PROJECT_COST/DAYS 
  FROM PROJECTS
 ORDER BY 5;
 
-- 2. Ejemplo Inválido (Genera Error de SQL):
-- No se puede ordenar por la posición 5 si el SELECT solo tiene 2 columnas.
/*
SELECT PROJECT_ID, PROJECT_COST/DAYS 
  FROM PROJECTS
 ORDER BY 5;
*/

/*----------------------------------------------------------------------
    COMBINATIONS (Combinando técnicas en ORDER BY)
    - Se puede usar simultáneamente: nombre, alias y posición.
    - Permite combinar libremente las tecnicas de ordenamiento
  ----------------------------------------------------------------------*/
  
SELECT SHIP_ID, PROJECT_COST, PROJECT_NAME "The Project", DAYS 
FROM PROJECTS 
ORDER BY SHIP_ID DESC, "The Project", 2;

/* 
  Explicación de la consulta combinada:
  1. SHIP_ID DESC -> Referencia por nombre (en orden descendente).
  2. "The Project" -> Referencia por alias de columna.
  3. 2             -> Referencia por posición (segundo elemento: PROJECT_COST).
*/

-- ORDER BY y NULL
-- Cuando se hace un ordenamiento de ORDER BY, ORACLE
-- va a tratar cualquier valor NULL como si fuera
-- mayor que cualquier otro valor.

/*----------------------------------------------------------------------
    THE WHERE CLAUSE (Filtrado de filas)
- Ubicación: Siempre va después del FROM.
- WHERE se utiliza para limitar y filtrar filas recuperadas
- en una sentencia SELECT
- Definir que filas seran modificadas en UPDATE
- Eliminadas en un DELETE.
- Opcional: Si no se usa, se devuelven todas las filas de la tabla.
  ----------------------------------------------------------------------*/
-- Ejemplo 1: Filtrar por un valor exacto
SELECT EMPLOYEE_ID
  FROM WORK_HISTORY
 WHERE SHIP_ID = 1;

-- Ejemplo 2: Filtrar usando operadores de comparación
SELECT PORT_NAME, CAPACITY
  FROM PORTS
 WHERE CAPACITY >= 5;
 
/*----------------------------------------------------------------------
    COMPARING EXPRESSIONS (Comparación de Expresiones en el WHERE)
    - Toda comparación evalúa a TRUE o FALSE por cada fila.
    - Se pueden usar operaciones matemáticas o columnas en ambos lados.
  ----------------------------------------------------------------------*/
-- Ejemplo 1: Comparando una columna con el 
-- resultado de una expresión matemática
SELECT *
  FROM EMPLOYEES
 WHERE SALARY >= 50899 * 1.12;

-- Ejemplo 2: Comparación de fechas
SELECT FIRST_NAME, START_DATE, END_DATE
  FROM EMPLOYEES
 WHERE START_DATE < END_DATE

/*----------------------------------------------------------------------
    COMPARING DATA TYPES (Comparación y Sensibilidad de Tipos)
    - Por defecto, las comparaciones de texto son case-sensitive.
    - Al ser comparadas ambas expresiones deben ser del mismo 
    - tipo de dato para que funcione correctamente.
  ----------------------------------------------------------------------*/
-- Ejemplo 1: Búsqueda exacta de cadenas de texto (Sensible a A-Z)
SELECT *
  FROM EMPLOYEES
 WHERE LAST_NAME = 'López';

-- Ejemplo 2: Esta consulta buscaría un resultado diferente debido a las mayúsculas
SELECT *
  FROM EMPLOYEES
 WHERE LAST_NAME = 'LÓPEZ';
 
/*----------------------------------------------------------------------
    EL OPERADOR LIKE Y SUS COMODINES (_, %)
- El patrón de búsqueda SIEMPRE va a la derecha de LIKE.
- Se utiliza para realizar búsquedas de comodines (wildcard searches).
- Datos de tipo carácter (CHAR y VARCHAR2).
  ----------------------------------------------------------------------*/
-- 1. Usando el guion bajo (_):
SELECT PORT_NAME
  FROM PORTS
 WHERE PORT_NAME LIKE 'San ____'; -- Busca San seguido de 4 char
 
-- 2. Usando el porcentaje (%):
SELECT PORT_NAME
  FROM PORTS
 WHERE PORT_NAME LIKE 'San%'; -- Busca San seguido de cualquier char
 
-- 3. Combinando comodines:
SELECT PORT_NAME
  FROM PORTS
 WHERE PORT_NAME LIKE '_o%'; -- Busca cualquier caracter
 -- posicionado primero que 'o'
 
 -- 4. Ejemplo correcto de búsqueda con patrón a la derecha
 SELECT PORT_NAME
  FROM PORTS
 WHERE PORT_NAME LIKE 'G_and%';
 

/*----------------------------------------------------------------------
    BOOLEAN LOGIC (Operadores AND y OR en el WHERE)
- Conecta múltiples comparaciones evaluando TRUE o FALSE.
- Permite conectar múltiples comparaciones de expresiones.
- Mediante operadores BOOLEANOS.
- AND: Requiere ambas expresiones sean TRUE sino es FALSE
- OR: Requiere que al menos una de las expresiones sea TRUE
-- para que la combinacion evalue a VERDADERO sino es FALSE.
  ----------------------------------------------------------------------*/

-- Uso del operador AND para filtrar múltiples condiciones
SELECT EMPLOYEE_ID
  FROM WORK_HISTORY
 WHERE SHIP_ID = 3
   AND STATUS = 'Pending';

-- Uso del operador OR
SELECT EMPLOYEE_ID, SHIP_ID, JOB_TITLE
  FROM WORK_HISTORY
 WHERE SHIP_ID = 3
    OR JOB_TITLE = 'Engineer';

/*----------------------------------------------------------------------
    EL OPERADOR NOT Y SUS EQUIVALENCIAS
- Invierte el resultado lógico de una condición.
- NOT es un operador booleano que se coloca delante de 
- una expresión para invertir su conclusión (de verdadero a falso, o viceversa).
- NOT (expresión): NOT SHIP_ID = 3 equivalente a SHIP_ID <> 3 o SHIP_ID != 3
  ----------------------------------------------------------------------*/
-- Ejemplo 1: Uso de NOT combinado con AND
SELECT EMPLOYEE_ID
  FROM WORK_HISTORY
 WHERE SHIP_ID = 3
   AND NOT STATUS = 'Pending';

-- Ejemplo 2: Uso de NOT de forma independiente
SELECT EMPLOYEE_ID
  FROM WORK_HISTORY
 WHERE NOT SHIP_ID = 3;

-- Ejemplo 3: Equivalente usando el operador de desigualdad (<>)
SELECT EMPLOYEE_ID
  FROM WORK_HISTORY
 WHERE SHIP_ID <> 3;

-- Ejemplo 4: Equivalente usando el operador de desigualdad (!=)
SELECT EMPLOYEE_ID
  FROM WORK_HISTORY
 WHERE SHIP_ID != 3;