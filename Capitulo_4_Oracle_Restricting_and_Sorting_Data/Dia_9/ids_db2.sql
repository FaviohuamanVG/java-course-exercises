/*----------------------------------------------------------------------
    EL OPERADOR IN Y NOT IN
    - Simplifica múltiples comparaciones OR sobre la misma columna.
  ----------------------------------------------------------------------*/
-- 1. Consulta usando múltiples OR
SELECT PORT_NAME
  FROM PORTS
 WHERE COUNTRY = 'UK' OR COUNTRY = 'USA' OR COUNTRY = 'Bahamas';

-- 2. Consulta utilizando IN
SELECT PORT_NAME
FROM PORTS
WHERE COUNTRY IN ('UK', 'USA', 'Bahamas');

-- Ejemplo 3: Uso de NOT IN para excluir los valores de la lista
SELECT PORT_NAME
FROM PORTS
WHERE COUNTRY NOT IN ('UK', 'USA', 'Bahamas');

/*----------------------------------------------------------------------
    EL OPERADOR BETWEEN
    - Evalúa un rango de valores de forma inclusiva.
    - El valor menor SIEMPRE debe ir a la izquierda del AND.
    - Es equivalente a usar >= <= combinados con un AND
  ----------------------------------------------------------------------*/
-- Ejemplo 1: Sintaxis base con BETWEEN
SELECT PORT_NAME
  FROM PORTS
 WHERE CAPACITY BETWEEN 3 AND 4;
 // Seleccion los valores entre 3 y 4

-- Equivalente a usar Operadores de comparacion:
SELECT PORT_NAME
  FROM PORTS
 WHERE CAPACITY >= 3
   AND CAPACITY <= 4;

-- Uso de NOT excluyendo un rango de valores.
SELECT PORT_NAME
  FROM PORTS
 WHERE CAPACITY NOT BETWEEN 3 AND 4;
 // Excluye los valores de 3 y 4

-- Equivalencia sintactica del uso de NOT.
SELECT PORT_NAME
  FROM PORTS
 WHERE NOT CAPACITY BETWEEN 3 AND 4;

/*----------------------------------------------------------------------
    MANEJO DE VALORES NULL
    - Nunca uses "=" o "!=" para comparar nulos.
    - NULL es un valor desconocido = no lo sé.
  ----------------------------------------------------------------------*/
-- El modo INCORRECTO (Ejecuta pero nunca devuelve datos)
SELECT PORT_NAME
  FROM PORTS
 WHERE CAPACITY = NULL;

-- modo CORRECTO (Busca registros donde la capacidad es desconocida)
SELECT PORT_NAME
  FROM PORTS
 WHERE CAPACITY IS NULL;

-- Busca lo opuesto (Donde la capacidad si es conocida)
SELECT PORT_NAME
  FROM PORTS
 WHERE CAPACITY IS NOT NULL;
 
/*----------------------------------------------------------------------
    VARIABLES DE SUSTITUCIÓN (&)
    - Solicita valores al usuario en tiempo de ejecución.
  ----------------------------------------------------------------------*/
-- Sustituyendo un valor numerico:
SELECT ROOM_NUMBER, STYLE, WINDOW
  FROM SHIP_CABINS
 WHERE ROOM_NUMBER = &RNO
 ORDER BY ROOM_NUMBER;

-- Sustituyendo un valor de texto:
SELECT ROOM_NUMBER, STYLE, WINDOW
  FROM SHIP_CABINS
 WHERE WINDOW = '&Window_Type'
 ORDER BY ROOM_NUMBER;
 
-- Sustitución de columnas enteras
SELECT &Column_Choice
FROM SHIP_CABINS;
 
/*----------------------------------------------------------------------
    COMANDOS DEFINE Y UNDEFINE (SQL*Plus / SQL Developer)
    - Predefinen o eliminan valores de variables de sustitución en la sesión.
  ----------------------------------------------------------------------*/
-- Definimos la variable.
DEFINE vWindows = Ocean;


-- 2. Ejecutamos la consulta.
-- Como 'vWindows' ya existe, la consulta NO te pedirá el dato en pantalla, 
-- sino que filtrará automáticamente por 'Ocean'.
SELECT ROOM_NUMBER, STYLE, WINDOW
  FROM SHIP_CABINS
 WHERE WINDOW = '&vWindows'
 ORDER BY ROOM_NUMBER;
 
-- 3. Verificamos todas las variables definidas en nuestra sesión actual
 DEFINE;
 
-- 4. Limpiamos la variable de la sesión para que ya no exista
UNDEFINE vWindows

/*----------------------------------------------------------------------
    COMANDOS SET Y SHOW (Exclusivos de SQL*Plus / SQL Developer)
    - SET: Modifica el valor/estado de una variable de sistema.
    - SHOW: Imprime en pantalla el estado actual de la variable.
  ----------------------------------------------------------------------*/
-- Ver el estado de la variable de sistema DEFINE.
SHOW DEFINE;

-- Ver el estado de la variable VERIFY
SHOW VERIFY;

-- Ver todas las variables de sistema:
SHOW ALL;

/*----------------------------------------------------------------------
    LA VARIABLE DE SISTEMA "VERIFY"
    - Controla si vemos el reemplazo de las variables en la consola.
    -- SET VERIFY ON: Activa el reporte de cambios
    -- SET VERIFY OFF:Desactiva el reporte, por lo que el sistema 
    -- ejecutará el código silenciosamente
  ----------------------------------------------------------------------*/
-- 1. Apagamos el reporte de sustitución (Modo silencioso)
SET VERIFY OFF
-- Si ejecutas tu SELECT ahora, NO verás las líneas "old" y "new"
SELECT PORT_NAME
FROM PORTS WHERE CAPACITY = &CAP;
-- 2. Encendemos el reporte de sustitución (Modo informativo)
SET VERIFY ON

-- Ahora, al ejecutar, verás:
SELECT PORT_NAME 
FROM PORTS WHERE CAPACITY = &CAP;

/*----------------------------------------------------------------------
    SCRIPT INTERACTIVO CON PROMPT Y ACCEPT
    - Muestra mensajes, captura datos del usuario y los procesa.
    - PROMPT: Mostrar un mensaje interactivo en la pantalla
    -- No requiere comillas cuando se usa de forma independiente
    - ACCEPT: Se encarga de recibir los datos introducidos por el 
    - usuario y almacenarlos en una variable predef.
  ----------------------------------------------------------------------*/
PROMPT Welcome to our script. This report will look up data
PROMPT using the room number you provide.
PROMPT

-- Captura el valor ingresado por el usuario y lo guarda en vRoomNumber
ACCEPT vRoomNumber PROMPT "Enter a room number: "

-- Consulta utilizando la variable capturada
SELECT ROOM_NUMBER, STYLE, WINDOW 
FROM SHIP_CABINS 
WHERE ROOM_NUMBER = &vRoomNumber;
 
-- Mensaje final utilizando la variable
PROMPT Remember, you asked for the room number &vRoomNumber.

/*----------------------------------------------------------------------
    CONFIGURACIÓN DE LA VARIABLE DE SISTEMA DEFINE Y CAMBIO DE SÍMBOLO
  ----------------------------------------------------------------------*/
-- 1. Configuramos el entorno
SET ECHO ON
SET VERIFY OFF

-- 2. Apagamos DEFINE y comprobamos
SET DEFINE OFF
SHOW DEFINE

-- 3. Cambiamos el prefijo de ampersand (&) a asterisco (*) 
-- (Esto reactiva automáticamente DEFINE a ON)
SET DEFINE *
SHOW DEFINE

-- 4. Intentar usar '&' ya no funcionará (lo tratará como texto fijo)
SELECT ROOM_NUMBER, STYLE, WINDOW 
FROM SHIP_CABINS 
WHERE WINDOW = '&vWin';

-- 5. Usar el nuevo prefijo '*' sí disparará la solicitud de la variable de sustitución
SELECT ROOM_NUMBER, STYLE, WINDOW 
FROM SHIP_CABINS 
WHERE WINDOW = '*vWin';

/*----------------------------------------------------------------------
    CLÁUSULA FETCH (Limitación de filas en Oracle 12c+)
    - FETCH: Palabra obligatoria que indica el inicio de la limitación.
    - FIRST o NEXT: Una de las dos es obligatoria (sin diferencias funcionales)
    - Número u opción numérica: si se omite el número, por defecto toma 1
    - PERCENT (opcional): interpreta el número anterior como un porcentaje.
    - ROW o ROWS: Una de las dos es obligatoria por motivos de gramática.
    - ONLY o WITH TIES: Obligatorio al final, ONLY devuelve estrictamente
    - el número especificado mientras que WITH TIES incluye filas adicionales
    - si coinciden en criterio de ordenamiento (ORDER BY) con la última 
    - fila del límite.
  ----------------------------------------------------------------------*/
-- Limitar a un número exacto de filas (Maximo 8)
SELECT * 
  FROM ORDERS
 FETCH FIRST 8 ROWS ONLY;

-- Limitar utilizando un porcentaje
SELECT * 
  FROM ORDERS
 FETCH FIRST 50 PERCENT ROWS ONLY;
 
/*----------------------------------------------------------------------
    CLÁUSULA WITH TIES vs ONLY
  ----------------------------------------------------------------------*/
-- 1. Muestra cómo se ordenan las filas por LINE_ITEMS
SELECT * 
  FROM ORDERS
 ORDER BY LINE_ITEMS;

-- 2. Corta estrictamente al 50%
SELECT * 
  FROM ORDERS
 ORDER BY LINE_ITEMS
 FETCH FIRST 50 PERCENT ROWS ONLY;

-- 3. Incluye el 50% inicial más todas las filas adicionales
SELECT * 
  FROM ORDERS
 ORDER BY LINE_ITEMS
 FETCH FIRST 50 PERCENT ROWS WITH TIES;

-- 4. Demuestra que sin ORDER BY, WITH TIES no tiene efecto
SELECT * 
  FROM ORDERS
 FETCH FIRST 50 PERCENT ROWS WITH TIES;
 
/*----------------------------------------------------------------------
    CLÁUSULA OFFSET Y FETCH (Paginación en Oracle)
    - Salta las primeras 5 filas y recupera las siguientes 2 filas.
  ----------------------------------------------------------------------*/
-- Ignora desde las 5 primeras filas osea 1 al 5.
SELECT * 
  FROM ORDERS
 OFFSET 5 ROWS FETCH FIRST 2 ROWS ONLY;

