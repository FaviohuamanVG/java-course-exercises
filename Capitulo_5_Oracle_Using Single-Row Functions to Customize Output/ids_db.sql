/*------------------------------------------------------------------
                    Use Various Types of Functions
*/------------------------------------------------------------------
-- Una funcion en SQL fue diseñada para realizar una tarea especifica
-- sobre los datos.
-- Aceptan parametros. Reciben valores de entrada para realizar la tarea
-- Procesan los datos: Aplican una logica, calculo o transformacion
-- sobre datos de entrada.
-- Retornan un valor unico. Osea por cada fila procesada individualmente
-- se devuelve un solo valor de salida.

-- Pueden ser invocadas donde permita una expresion, dentro de las
-- sentencias SQL.
-- SELECT lista de seleccion y clausula WHERE.

SELECT LASTNAME, 
INITCAP(LASTNAME) -- Se invoca la funcion integrada INITCAP y se le
-- pasa la columna LASTNAME como parametro.
-- La primera letra se convierta en MAYUS y las demas en MINUS.
FROM ONLINE_SUBSCRIBERS; -- Tabla ONLINE_SUBSCRIBERS

/*------------------------------------------------------------------
                        Character Functions
*/------------------------------------------------------------------
-- Funciones de caracter que son diseñadas para manipular, transformar,
-- analizar y extraer informacion de datos.
-- Operan sobre cadenas de textos. Reciben 1 o mas parametros
-- Devuelve un valor manipulado.

SELECT LASTNAME, LENGTH(LASTNAME) -- Lenght devuelve un valor numerico
-- el cual representa la cantidad exacta de caracteres que contiene la
-- cadena.
FROM ONLINE_SUBSCRIBERS; -- Tabla: ONLINE_SUBSCRIBERS

/*--------------------------------------------------------------------
                            Number Functions
*/--------------------------------------------------------------------
-- Las funciones numericas aceptan valores numericos como parametro
-- devolviendo un unico resultado numerico procesado por cada fila
-- Operadores a diferencia de las funciones solo realizan calculos
-- basicos y no se consideran funciones propiamente pero se pueden
-- combinar perfectamente.
-- Trigonometrica:
-- SIN, ASIN, SINH (FUNCIONES PARA CALCULAR SENOS)
-- COS, ACOS, COSH (COSENOS)
-- TAN, ATAN, ATAN2, TANH (TANGENTES)

SELECT PRODUCT_ID, PRICE, 
    ROUND(PRICE, 1) AS ROUNDED_PRICE, 
    ABS(DISCOUNT_AMOUNT) AS ABS_DISCOUNT
FROM PRODUCTS;
-- Se aplica ROUND(n, [decimals])
-- Redonde un numero a una cantidad especif. de decimales
-- Si el parametro de decimales es positivo, redondea hacia
-- el punto decimal a la derecha (si es verdadero) sino se invierte.

-- TRUNC(n, [decimals])
-- Corta los digitos sin importar si el siguiente numero es >= 5.
-- SIGN(n):Validaciones, saber si el balance de una cuenta es 
-- positivo (1) o negativo (-1).

/*--------------------------------------------------------------------
                            Date Functions
*/--------------------------------------------------------------------
-- Operan sobre valores de tipo fecha y hora (DATE y TIMESTAM) devuelve
-- resultados de fecha o numericos segun la operacion.
-- SYSDATE: Devuelve la fecha y hora actual del servidor de BD. No es
-- requerido los parametros
-- SYSTIMESTAMP: Devuelve la fecha, hora actual y fraccionarios de
-- segundos, incluyendo la zona horaria.


SELECT ORDER_ID, 
    CUSTOMER_NAME,
    ORDER_DATE, -- Columnas seleccionadas sin modificar
    TRUNC(ORDER_DATE) AS CLEAN_ORDER_DATE, -- Elimina la porcion de
    -- hora de la fecha (dejandola por defecto a 00:00:00 del dia)
    ADD_MONTHS(ORDER_DATE, 3) AS WARRANTY_EXPIRATION, -- Suma exactamente
    -- 3 meses a la fecha de la orden
    SYSDATE - ORDER_DATE AS DAYS_SINCE_ORDER -- Resta la fecha de la orden
    -- a la fecha actual del sistema (SYSDATE), devuelve un numero de los
    -- dias exactos que transcurrieron.
  FROM ORDERS; -- Tabla ORDERS.
  
-- Other Functions:
SELECT USER -- Selecciona la columna USER  
  FROM DUAL; -- Para devolvernos un tipo de texto con el nombre del USER
  -- De la sesion actual.
-- Tabla Dual es brindada x Oracle para evaluar funciones que no requieren
-- calculas rapidos.

/*--------------------------------------------------------------------
                            The DUAL Table
*/--------------------------------------------------------------------
-- Tabla propiedad de Oracle que viene pre-instalada en todas las BD
-- Conteniendo una columna con un tipo de dato VARCHAR2 una fila
-- con un unico valor 'x'
-- Su funcion es para realizar calculos rapidos u obtener resultados
-- de funciones independ. como obtener una fecha.

-- Fecha y hora actual + DUAL.
SELECT SYSDATE -- Despliega la funcion integrada SYSDATE y esta misma
-- la consulta en el SO de la Base de datos para obtener la fecha y
-- hora actual.
FROM DUAL; -- Se ejecutara en la tabla DUAL con una unica fila 'X'.

/*--------------------------------------------------------------------
                    Character Functions in Detail
*/--------------------------------------------------------------------
-- No todas las funciones operan exclusivamente con datos Alfanumericos
-- ni devuelven textos.
-- Algunas funciones de esta categoria aceptan parametros de tipo
-- numerico o da resultados numericos.
-- Muchas de ellas interactuan con numeros.

SELECT LASTNAME, INSTR(LASTNAME, 'a') -- Recibe datos de texto y un
-- patron a buscar pero devuelve un numero donde representa la
-- posicion de la coincidencia. Eso aplica con funciones INSTR
AS POSITION_OF_A
  FROM ONLINE_SUBSCRIBERS;

/*--------------------------------------------------------------------
                            UPPER y LOWER
*/--------------------------------------------------------------------
--  UPPER(s1), LOWER(s1).
-- Se recibe un unico parametro s1.OBLIGATORIO y debe ser cadena de char.
-- UPPER - Transforma todos los caracteres de cadena ingresado en Mayusculas
-- LOWER - Transforma todos los caracteres de cadena ingresado en Minusculas
-- Devuelven una cadena de caracteres (char string) transformada.

SELECT EMPLOYEE_ID, FIRST_NAME, LAST_NAME -- Indica las columnas para devolver
-- el resultado de la consulta. ID del empleado, su nombre y su apellido.
  FROM EMPLOYEES -- Tabla EMPLOYEES
 WHERE UPPER(LAST_NAME) = 'GARCÍA'; -- Tomando el valor del apellido
 -- se convierte temp. a mayusculas 'GARCIA'. Se hace de forma interna.
 
-- Utilizando LOWER:
SELECT EMPLOYEE_ID, FIRST_NAME, LAST_NAME
  FROM EMPLOYEES
 WHERE LOWER(LAST_NAME) = 'garcía';
 
/*--------------------------------------------------------------------
                                INITCAP
*/--------------------------------------------------------------------
-- Transformar cadenas de texto en forma mixto.(Primero letra de cada
-- palabra en mayuscula y el resto en minuscula).
-- INITCAP(s1) el parametro de tipo cadena de char es OBLIGATORIO.
-- Convirtiendo el texto de entrada asegurando que cada letra inicial
-- de cada palabra comience en MAYUSCULA y el resto en minuscula.

SELECT INITCAP('napoleon'),-- Toma la palabra en minuscula y devuelve 
-- Napoleon capitalizando 'N' inicial. INITCAP(n) - N
INITCAP('RED O''BRIEN'), -- Forma mixto y lo respeta mostrando la comilla
-- interna correctamente. Comilla con 2 Apostrofes('R O' 'B').
INITCAP('McDonald''s')-- Limitacion de funcion porque separa la letra s
-- lo considera como el inicio de otra letra- 'M' 'S'
FROM DUAL; -- No requiere una tabla de negocio real, ejecuta la tabla
-- virtual de Oracle.

/*--------------------------------------------------------------------
                                CONCAT and ||
*/--------------------------------------------------------------------
-- Union de cadenas de texto: CONCAT y el operador de barra de concatenacion ||
-- Sintaxis: CONCAT: CONCAT(s1, s2)
-- Sintaxis de operador: s1 || s2
-- Parametros: s1 y s2 ambos tipos de cadena de char y obligatorios.
-- Unen o concatena 2 cadenas de texto distintas para formar una unica
-- cadena resultante.
-- Uso basico:
SELECT CONCAT('Hello, ', 'world!') -- Une 2 cadenas de textos diferentes
-- y formar una sola
  FROM DUAL; -- Tabla Dual.

  
-- Usando el Operador de doble barra ||
SELECT 'Hello, ' || 'world!' -- Uner 2 cadenas con operadores ||
  FROM DUAL; -- Tabla virtual

-- Encadenamiento multiple con el Operador ||
SELECT 'Hello, ' || 'world!' || ' Great to ' || 'see you.' -- Multiples
-- encadenamiento con el operador ||
  FROM DUAL; -- Tabla virtual dual.

-- Combinacion de columnas de una tabla, espacios y literales de texto.
SELECT FIRST_NAME || ' ' || LAST_NAME || ' of ship number ' || SHIP_ID || '.'
-- Combina columnas con columnas + espacios y literales. 
-- || concatena un espacio en blanco para evitar que las columnas combinen
  FROM EMPLOYEES -- Tablas EMPLOYEES.
 WHERE LAST_NAME = 'West'; -- Clausula de filtrado.
  
  