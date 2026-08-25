/*------------------------------------------------------------------
                    Funciones LPAD y RPAD
*/------------------------------------------------------------------
-- Como extender una cadena de texto hacia una longitud especifica.
-- rellenandola ya sea por la izquierda o por la derecha con un 
-- caracter o cadena determinado.
-- LPAD(s1, n, s2), RPAD(s1, n, s2)
-- Parametros:
-- s1. cadena de caracteres base (requerido).
-- n: N° total de caracteres que debe medir la cadena de salida.
-- n(requerida). Si n es menor a la longitud de s1 la funcion
-- recortara el texto a la izquierda o derecha hasta ajustarse a n
-- s2. cadena de caracteres utilizada para rellenar (opcional) si
-- se omite, se rellena con una cadena vacia x defecto.

-- Funcion RPAD
SELECT RPAD('Chapter One - I Am Born', 40, '.') -- Relleno a la derecha
-- usando puntos como caracter de relleno
FROM DUAL; -- De la tabla dual

// Se utiliza la funcion RPAD para rellenar a la derecha y utiliza
// .... como caracteres de relleno.

-- Funcion RPAD + LPAD y concatenacion para una tabla de conten.
SELECT RPAD(CHAPTER_TITLE || ' ', 30, '.') -- Relleno de titulo hacia la derecha
-- utilizando puntos (hasta 30 caracteres) + concat ' ' para que no se peguen.
       || -- Conecta el bloque izquierdo con el derecho en una sola linea.
       LPAD(' ' || PAGE_NUMBER, 30, '.') "Table of Contents" -- Concatenacion
-- Rellena el numero de pagina hacia la izquierda con puntos (30 caracteres)
  FROM BOOK_CONTENTS -- Indicando la tabla BOOK_CONTENTS
 ORDER BY PAGE_NUMBER; -- Ordenando los resultados de menor a mayor PAG. NUMBER
 
/*------------------------------------------------------------------
                    Funciones LTRIM y RTRIM
*/------------------------------------------------------------------
-- Eliminar caracteres especificos de los extremos de una cadena de texto
-- Por la izquierda LTRIM o por la derecha RTRIM
-- LTRIM(s1, s2), RTRIM(s1, s2)
-- s1. cadena de caracteres base (requerido).
-- s2. cadena que indica que elementos deben buscarse y eliminar (opcional)
-- Si s2 se omite, se eliminan los espacios en blanco x default.

SELECT RTRIM('Seven thousand--------', '-') Result -- Va eliminar los - guiones
-- que sobran, los cuales estan ubicados en el lado derecho. 
FROM DUAL; -- De la tabla DUAL.

SELECT LTRIM('--------Seven thousand', '-') Result -- Va eliminar los - guiones
-- que sobran, los cuales estan ubicados en el lado izquierdo. 
FROM DUAL; -- De la tabla DUAL.

/*------------------------------------------------------------------
                            Función TRIM
*/------------------------------------------------------------------
-- Una alternativa con una sintaxis mas estructurada utilizando palabras
-- claves como LEADING, TRAILING o BOTH + la clausula FROM.
-- Sintaxis:
-- TRIM(trim_info trim_char FROM trim_source).
-- trim_info. Direccion del recorte, mediante las palabras clave LEADING izq.
-- TRAILING derec. o BOTH ambos lados. Opcionales, si se omiten se usa BOTH.
-- trim_char. Unico caracter que se desea recortar. Opcional si se especifica
-- sino se toma como un espacio en blanco.
-- trim_source. La cadena origen donde se realiza los recortes. Requerida, si
-- es omitida el valor devuelve NULL.

SELECT TRIM(TRAILING '-' FROM 'Seven thousand--------') TheOutput
-- Recorte de los guiones ubicados
-- TRAILING es trim_info, trim_char es '-' trim_source es 'Seven thousand--'
-- TheOutput alias de la cabecera de columna.
FROM DUAL; -- Utilizando la tabla virtual brindada x Oracle.


/*------------------------------------------------------------------
                           Función LENGTH
*/------------------------------------------------------------------
--  LENGTH, enseña a como calcular el numero total de caracteres que 
-- puede contener una cadena
-- LENGTH(s) s es un parametro requerido. Es la cadena origen desde
-- donde se medira la longitud.
-- Cuenta y contabiliza cada uno de los caracteres que conforman la cadena.
-- Tipo de salida es numerico.

SELECT LENGTH('Supercalifragilisticexpialidocious') WordLength
-- LENGTH(calcula el numero total de caracteres.)
-- Supercalifragilisticexpialidocious -- cadena a contar.
-- WordLength -- Alias personalizado de la consulta.
FROM DUAL; -- Utilizando la tabla virtual de ORACLE.

/*------------------------------------------------------------------
                           Función INSTR
*/------------------------------------------------------------------
-- INSTR una abreviatura de IN STRING - "en la cadena", como localizar
-- la posicion exacta de la subcadena dentro de otra cadena de texto.
-- INSTR(s1, s2, pos, n)
-- s1. Cadena de texto principal donde se realizara las busqueda. Requerido
-- s2. Subcadena o patron que se quiere encontrar dentro de s1. Requerido
-- pos. Posicion numerica donde empezara a buscar (Opcional) x defecto 1
-- si se indica un n° negativo la busqueda empieza desde el final hacia atras.
-- n. El n° de la ocurrencia o repeticion exacta de s2 (Opcional) x defecto 1

SELECT INSTR('Mississippi', 'is', 1, 2) SecondOccurrence
-- 'Mississippi' es la cadena principal donde empezara la busqueda.
-- 'is' es la subcadena que se requiere encontrar dentro de s1.
-- 1 es la posicon donde empezara a buscar
-- 2 es la repeticion exacta del s2. Y dira en que caracter empieza la repet.
FROM DUAL; -- Tabla virtual

/*------------------------------------------------------------------
                        Función SUBSTR
*/------------------------------------------------------------------
-- SUBSTR es la abreviatura de SUB-STRING - "subcadena", permite extrae
-- un segmento especifico de una cadena de texto.
-- SUBSTR (s, pos, len).
-- s. Cadena de caracteres de origen donde se va a extraer el texto. Requerido
-- pos. Posicion donde comenzara la extraccion. Requerido.
-- len. Cantidad de caracteres que se desean extraer. Opcional si es omitido
-- la extraccion corre desde pos hasta el final de la cadena.

SELECT SUBSTR('Name: MARK KENNEDY', 7) ExtractedName
-- Name: MARK KENNEDY' es la cadena de texto origen (s1).
-- 7 es la posicion inicial (pos) empieza desde (M)
-- Al omitir len, extraera todo el texto restante hasta el final
FROM DUAL; -- Tabla virtual

/*------------------------------------------------------------------
                        Función SOUNDEX
*/------------------------------------------------------------------
-- SOUNDEX es un esquema de codificación para traducir palabras en patrones
-- de sonido similar (util para buscar palabras de escritura diferentes
-- pero de pronunciamiento parecida).
-- SOUNDEX(s).
-- s. La cadena de caracteres fuente que sera traducida. Requerida

SELECT SOUNDEX('Worthington'), SOUNDEX('Worthen') Worthen
-- SOUNDEX traduce la palabra manteniendo la primera letra intacta y
-- convierte las siguientes consonantes a un codigo numerico hasta
-- completar 3 digitos, ignorando vocales y otras letras.
FROM DUAL; -- TABLA VIRTUAL.

/*------------------------------------------------------------------
          Ejemplo de consulta usando SOUNDEX en el WHERE
*/------------------------------------------------------------------

SELECT EMPLOYEE_ID, FIRST_NAME, LAST_NAME
  FROM EMPLOYEES
 WHERE SOUNDEX(LAST_NAME) = SOUNDEX('Worthen');
-- SOUNDEX se usa en ambos lados de la condicion WHERE para encontrar
-- apellidos que suenen igual o similar a Worthen
-- (como Worthington, Wurthinden, Worthan, etc.)

/*------------------------------------------------------------------
                        Funciones Numéricas
------------------------------------------------------------------*/
-- Seccion dedicada a valores numericos. Algunas funciones simples son
-- ABS (valor absoluto) y SQRT(raiz cuadrada). 
-- CEIL, FLOOR y ROUND son otras funciones más.

/*------------------------------------------------------------------
                        Función CEIL
*/------------------------------------------------------------------
-- CEIL devuelve el entero más pequeño que sea mayor o igual a n.
-- CEIL(n)
-- n. Cualquier tipo de dato numérico. Requerido

SELECT CEIL(12.34), CEIL(-5.67) CEIL
-- CEIL(12.34) redondea hacia arriba al entero mayor o igual más cercano (13).
-- CEIL(-5.67) al ser negativo, el entero mayor o igual más cercano es (-5).
FROM DUAL; -- Tabla virtual

/*------------------------------------------------------------------
                        Función FLOOR
*/------------------------------------------------------------------
-- FLOOR devuelve el entero más grande que sea menor o igual a n.
-- FLOOR(n)
-- n. Cualquier tipo de dato numérico. Requerido

SELECT FLOOR(12.34), FLOOR(-5.67) FLOOR
-- FLOOR(12.34) redondea hacia abajo al entero menor o igual más cercano (12).
-- FLOOR(-5.67) al ser negativo, el entero menor o igual más cercano es (-6).
FROM DUAL; -- Tabla virtual


/*------------------------------------------------------------------
                        Función ROUND
*/------------------------------------------------------------------
-- ROUND redondea un número dependiendo del valor del entero i.
-- ROUND(n, i)
-- n. El número que será redondeado (puede incluir puntos decimales). Requerido
-- i. Entero opcional (por defecto es 0 si se omite).
--  Si i es 0, redondea al entero más cercano (sin decimales).
--  Si i es positivo, redondea a i lugares a la derecha del punto decimal.
--  Si i es negativo, redondea a i lugares a la izquierda del punto decimal.
-- El número 5 se redondea alejándose de cero.

SELECT ROUND(12.355143, 2), ROUND(259.99, -1) ROUNDNUMBER
-- ROUND(12.355143, 2) redondea a dos dígitos a la derecha del decimal (12.36).
-- ROUND(259.99, -1) redondea a las "tens" (decenas), un dígito a la izquierda del decimal (260).
FROM DUAL; -- Tabla virtual


/*------------------------------------------------------------------
                        Función TRUNC (Numérica)
*/------------------------------------------------------------------
-- TRUNC "redondea" hacia cero; en otras palabras, trunca los números cortando
-- decimales o digitos sobrantes sin redondear hacia arriba
-- TRUNC(n, i)
-- n. Numero requerido (puede incluir decimales). Requerido
-- i. Entero opcional (por defecto es 0 si se omite).
-- Si i es omitido, devuelve el mismo tipo de dato numerico de n
-- Si i es especificado, devuelve un tipo de dato NUMBER.

SELECT TRUNC(12.355143, 2), TRUNC(259.99, -1) TRUNC
-- TRUNC(12.355143, 2) trunca a dos posiciones exactas a la derecha del decimal (12.35).
-- TRUNC(259.99, -1) trunca a las decenas (un dígito a la izquierda del decimal) (250).
FROM DUAL; -- Tabla virtual

/*------------------------------------------------------------------
                        Función REMAINDER
*/------------------------------------------------------------------
-- REMAINDER identifica el múltiplo de n2 que está más cerca de n1 
-- y devuelve la diferencia entre esos dos valores (puede ser negativo 
-- si el múltiplo más cercano es mayor que n1).
-- REMAINDER(n1, n2)
-- n1. Número requerido.
-- n2. Número requerido.

SELECT REMAINDER(9,3), REMAINDER(10,3), REMAINDER(11,5) REMAINDER
-- REMAINDER(9,3) devuelve 0 porque 9 es múltiplo exacto de 3.
-- REMAINDER(10,3) devuelve 1 porque está a 1 unidad del múltiplo más cercano (9).
-- REMAINDER(11,3) devuelve -1 porque el múltiplo más cercano es 12 (que es mayor a 11).
FROM DUAL; -- Tabla virtual

/*------------------------------------------------------------------
                        Función MOD
*/------------------------------------------------------------------
-- MOD realiza la misma tarea que REMAINDER, excepto que MOD utiliza 
-- FLOOR en lugar de ROUND en su ecuación matemática.
-- MOD(n1, n2)
-- n1. Número requerido.
-- n2. Número requerido.

SELECT MOD(9,3), MOD(10,3), MOD(11,3) MOD
-- MOD(9,3) devuelve 0 porque no hay residuo.
-- MOD(10,3) devuelve 1 porque sobra 1.
-- MOD(11,3) devuelve 2, entregando el residuo matemático clásico que se esperaría.
FROM DUAL; -- Tabla virtual

/*------------------------------------------------------------------
                Funciones de Fecha (Date Functions)
------------------------------------------------------------------
-- Sección dedicada a funciones que trabajan principalmente con 
-- tipos de datos DATE. SYSDATE se utiliza en una de las funciones
*/

/*------------------------------------------------------------------
                        Función SYSDATE
*/------------------------------------------------------------------
-- SYSDATE devuelve la fecha y hora actual según el sistema operativo 
-- en el que está instalado el servidor de la base de datos Oracle.
-- SYSDATE
-- Parámetros: Ninguno (Parameters: None).
-- Nota: La información de hora está contenida pero no se muestra por defecto.

SELECT SYSDATE
-- Muestra la fecha actual del servidor de base de datos Oracle.
FROM DUAL; -- Tabla virtual

/*------------------------------------------------------------------
                        Función ROUND (para Fechas)
*/------------------------------------------------------------------
-- ROUND redondea un valor de fecha (DATE) al nivel de detalle
-- especificado por un modelo de formato opcional.
-- ROUND(d, i)
-- d. Valor de tipo fecha (DATE). Requerido
-- i. Modelo de formato para el nivel de detalle (Opcional).
-- Si se omite, redondea al día completo más cercano (a las 12:00:00 mediodía).
-- Valores con hora 12:00 del mediodía o superior se redondean hacia arriba al día siguiente.

SELECT SYSDATE TODAY,
       ROUND(SYSDATE, 'MM') ROUNDED_MONTH,
       ROUND(SYSDATE, 'RR') ROUNDED_YEAR
-- SYSDATE devuelve la fecha actual.
-- ROUND con 'MM' redondea al mes más cercano.
-- ROUND con 'RR' redondea al año más cercano.
FROM DUAL; -- Tabla virtual

-- funciones anidadas y TO_CHAR
SELECT TO_CHAR(SYSDATE, 'DD-MON-YY HH:MI:SS') AS RAW_DATE,
-- Demuestra el comportamiento de ROUND al omitir el formato (redondea al día).
       TO_CHAR(ROUND(SYSDATE), 'DD-MON-YY HH:MI:SS') AS ROUNDED_DATE
-- Al no mostrar la hora por defecto en el tipo DATE, usamos TO_CHAR para 
-- evidenciar el cambio a las 12:00:00.
FROM DUAL; -- Tabla virtual

/*------------------------------------------------------------------
                     Función TRUNC (para Fechas)
*/------------------------------------------------------------------
-- TRUNC realiza la misma tarea que ROUND para fechas, 
-- excepto que TRUNC siempre redondea hacia abajo.
-- TRUNC(d, i)
-- d. Es una fecha (requerida).
-- i. Es un modelo de formato (opcional).

SELECT SYSDATE TODAY,
       TRUNC(SYSDATE, 'MM') TRUNCATED_MONTH,
       TRUNC(SYSDATE, 'RR') TRUNCATED_YEAR
-- SYSDATE devuelve la fecha actual.
-- TRUNC con 'MM' trunca al inicio del mes.
-- TRUNC con 'RR' trunca al inicio del año.
FROM DUAL; -- Tabla virtual

/*------------------------------------------------------------------
                        Función NEXT_DAY
*/------------------------------------------------------------------
-- NEXT_DAY devuelve una fecha válida que representa la primera 
-- ocurrencia del día de la semana especificado que sigue a la fecha dada.
-- NEXT_DAY(d, c)
-- d. Es una fecha, requerida.
-- c. Es una referencia de texto a un día de la semana, requerida.

SELECT NEXT_DAY('31-MAY-19', 'SÁBADO') NEXT_DAY
-- '31-MAY-19' es la fecha de partida requerida (d).
-- 'Saturday' es el día de la semana que se busca encontrar (c).
-- Devuelve la fecha del primer sábado que sigue al 31 de mayo de 2019 (01-JUN-19).
FROM DUAL; -- Tabla virtual

/*------------------------------------------------------------------
                        Función LAST_DAY
*/------------------------------------------------------------------
-- LAST_DAY devuelve el último día del mes en el que cae la fecha dada.
-- LAST_DAY(d)
-- d. Es una fecha, requerida.

SELECT LAST_DAY('14-FEB-20'), LAST_DAY('20-FEB-21') LAST_DAY
-- '14-FEB-20' devuelve el último día de febrero de 2020 (año bisiesto: 29-FEB-20).
-- '20-FEB-21' devuelve el último día de febrero de 2021 (año normal: 28-FEB-21).
FROM DUAL; -- Tabla virtual

/*------------------------------------------------------------------
                        Función ADD_MONTHS
*/------------------------------------------------------------------
-- ADD_MONTHS añade una cantidad de meses (n) a una fecha dada (d) 
-- y devuelve un valor de fecha válido como resultado.
-- ADD_MONTHS(d, n)
-- d. Es una fecha, requerida.
-- n. Es un número entero (whole number), requerido.

SELECT ADD_MONTHS('31-ENE-17', 1)ADD_MONTH,
       ADD_MONTHS('01-NOV-17', 4)ADD_MONTH
-- ADD_MONTHS('31-JAN-17', 1) suma un mes al 31 de enero de 2017 
-- (da 28-FEB-17 por fin de mes).
-- ADD_MONTHS('01-NOV-17', 4) suma cuatro meses al 1 de noviembre de 2017 
-- (da 01-MAR-18).
FROM DUAL; -- Tabla virtual

/*------------------------------------------------------------------
                        Función MONTHS_BETWEEN
*/------------------------------------------------------------------
-- MONTHS_BETWEEN determina el número de meses entre dos fechas.
-- No se redondea automáticamente; si hay meses parciales, muestra un número real.
-- MONTHS_BETWEEN(d1, d2)
-- d1. Primera fecha (requerida). Si es mayor que d2, el resultado es positivo.
-- d2. Segunda fecha (requerida). Si es mayor que d1, el resultado es negativo.

SELECT MONTHS_BETWEEN('12-JUN-14', '03-OCT-13')MONTHS_BETWEEN
-- Calcula los meses entre el 12 de junio de 2014 y el 3 de octubre de 2013.
-- Como d1 ('12-JUN-14') es mayor que d2 ('03-OCT-13'), el resultado es un 
-- número positivo (~8.29).
FROM DUAL; -- Tabla virtual

/*------------------------------------------------------------------
                        Función NUMTOYMINTERVAL
*/------------------------------------------------------------------
-- NUMTOYMINTERVAL convierte información de fechas en forma numérica 
-- en un valor de intervalo de tiempo de tipo INTERVAL YEAR TO MONTH.
-- NUMTOYMINTERVAL(n, interval_unit)
-- n. Número requerido.
-- interval_unit. Unidad de intervalo, debe ser 'YEAR' o 'MONTH'.

SELECT NUMTOYMINTERVAL(27, 'MONTH')NUMTOYMINTERVAL
-- Transforma el número 27 en un intervalo de 27 meses (2 años y 3 meses).
-- El resultado devuelto es '2-3' del tipo INTERVAL YEAR TO MONTH.
FROM DUAL; -- Tabla virtual

/*------------------------------------------------------------------
                        Función NUMTODSINTERVAL
*/------------------------------------------------------------------
-- NUMTODSINTERVAL convierte información de fecha en forma numérica 
-- en un valor de intervalo de tiempo de tipo INTERVAL DAY TO SECOND.
-- NUMTODSINTERVAL(n, interval_unit)
-- n. Número requerido.
-- interval_unit. Unidad de intervalo, debe ser 'DAY', 'HOUR', 'MINUTE' o 'SECOND'.

SELECT NUMTODSINTERVAL(36, 'HOUR') NUMTODSINTERVAL
-- Traduce 36 horas a su representación formal de 1 día y 12 horas.
-- El resultado devuelto es de tipo INTERVAL DAY TO SECOND, mostrando 
-- días, horas, minutos, segundos y fracciones.
FROM DUAL; -- Tabla virtual

/*------------------------------------------------------------------
    Fechas y Constantes NUMÉRICAS (Dates and NUMBER Constants)
------------------------------------------------------------------
-- Para realizar operaciones aritméticas con valores DATE, se utilizan 
-- literales numéricos:
-- El número uno (1) representa un día.
-- Una hora se representa como 1/24 (ya que un día tiene 24 horas).
-- Un minuto se representa como 1/1440 
-- (60 minutos por 24 horas = 1,440 minutos en un día).
-- Nota: El tipo de dato TIMESTAMP funciona exactamente de la misma manera.
*/

SELECT TO_CHAR(SYSDATE, 'DD-MON-YY HH:MI:SS') AS TODAY,
       TO_CHAR(SYSDATE+1, 'DD-MON-YY HH:MI:SS') AS TOMORROW,
       TO_CHAR(SYSDATE+1/24, 'DD-MON-YY HH:MI:SS') AS ONE_HOUR_FROM_NOW,
       TO_CHAR(SYSDATE+1/1440, 'DD-MON-YY HH:MI:SS') AS ONE_MIN_FROM_NOW
-- TODAY: Muestra la fecha y hora actual.
-- TOMORROW: Suma 1 (un día completo) para obtener mañana a la misma hora.
-- ONE_HOUR_FROM_NOW: Suma 1/24 para avanzar exactamente una hora.
-- ONE_MIN_FROM_NOW: Suma 1/1440 para avanzar exactamente un minuto.
FROM DUAL; -- Tabla virtual

/*------------------------------------------------------------------
                Funciones Analíticas (Analytical Functions)
------------------------------------------------------------------
-- Las funciones analíticas operan a través de una ventana de filas, 
-- pudiendo devolver múltiples filas dentro de un grupo. 
-- Se ejecutan antes de la cláusula ORDER BY (el paso final), por lo que 
-- solo se permiten en la lista SELECT o en la cláusula ORDER BY. 
-- Están prohibidas en las cláusulas WHERE, HAVING y GROUP BY.
*/

SELECT 
    EMPLOYEE_ID,
    DEPARTMENT_ID,
    SALARY,
    -- Calcula el salario promedio de todo el departamento 
    -- sin colapsar ni agrupar las filas individuales de los empleados.
    AVG(SALARY) OVER (PARTITION BY DEPARTMENT_ID) AS AVG_DEPT_SALARY
FROM EMPLOYEES;

/*------------------------------------------------------------------
          Funciones Analíticas con OVER, 
          PARTITION BY y ORDER BY (Tabla SHIP_CABINS)
------------------------------------------------------------------
-- A continuación, se muestra cómo crear la tabla de ejemplo y aplicar 
-- funciones analíticas para obtener totales acumulados (Running Total) 
-- y ventanas deslizantes (Subset) utilizando filas precedentes y siguientes.
*/

-- Agregado Simple
SELECT SUM(SQ_FT)
FROM SHIP_CABINS;

-- OVER (Sin Partición)
SELECT WINDOW, 
       ROOM_NUMBER, 
       SQ_FT,
       SUM(SQ_FT) OVER (ORDER BY SQ_FT) AS "Running Total",
       SUM(SQ_FT) OVER (ORDER BY SQ_FT 
                        ROWS BETWEEN 1 PRECEDING AND 
                        1 FOLLOWING) AS "Subset"
FROM SHIP_CABINS
ORDER BY SQ_FT;

-- PARTITION BY
SELECT WINDOW, 
       ROOM_NUMBER, 
       SQ_FT,
       SUM(SQ_FT) OVER (PARTITION BY WINDOW 
                        ORDER BY SQ_FT) AS "Running Total",
       SUM(SQ_FT) OVER (PARTITION BY WINDOW 
                        ORDER BY SQ_FT 
                        ROWS BETWEEN 1 PRECEDING AND 
                        1 FOLLOWING) AS "Subset"
FROM SHIP_CABINS
ORDER BY ROOM_NUMBER;

/*------------------------------------------------------------------
                Funciones Analíticas: LAG y LEAD
------------------------------------------------------------------
-- Las funciones LAG y LEAD son muy similares entre sí y operan dentro 
-- de una ventana de filas definida.
-- 
-- * LAG: Muestra el valor de una columna en la fila anterior (previa).
-- * LEAD: Muestra el valor de una columna en la fila siguiente.
--
-- Por defecto el desplazamiento (offset) es de 1 fila, pero puede 
-- modificarse. Si el offset especifica una fila que no existe 
-- (ej. la primera fila de la ventana para LAG), la función devuelve NULL.
*/

/*------------------------------------------------------------------
    Uso básico de LAG y LEAD ordenando la ventana y la salida
------------------------------------------------------------------*/
-- En este ejemplo, las funciones operan sobre una ventana ordenada por 
-- WINDOW y SQ_FT. La consulta final usa la misma lógica de ordenamiento.
-- Nota: La primera fila mostrará NULL en la columna "Lag".
SELECT WINDOW, 
       ROOM_NUMBER, 
       SQ_FT,
       LAG(SQ_FT) OVER (ORDER BY WINDOW, SQ_FT) AS "Lag",
       LEAD(SQ_FT) OVER (ORDER BY WINDOW, SQ_FT) AS "Lead"
FROM SHIP_CABINS
ORDER BY WINDOW, SQ_FT;

/*------------------------------------------------------------------
            Independencia del ORDER BY principal
------------------------------------------------------------------*/
-- Cambiamos el ORDER BY de la consulta principal (ahora por ROOM_NUMBER).
-- Los valores calculados por LAG y LEAD se mantienen idénticos al 
-- ejemplo anterior, lo que demuestra que la ventana analítica se define 
-- a sí misma (independiente de la cláusula ORDER BY principal).
SELECT WINDOW, 
       ROOM_NUMBER, 
       SQ_FT,
       LAG(SQ_FT) OVER (ORDER BY WINDOW, SQ_FT) AS "Lag",
       LEAD(SQ_FT) OVER (ORDER BY WINDOW, SQ_FT) AS "Lead"
FROM SHIP_CABINS
ORDER BY ROOM_NUMBER;

/*------------------------------------------------------------------
    Modificando el Offset (Compensación) de LAG
------------------------------------------------------------------*/
-- El offset por defecto es 1. Aquí lo cambiamos a 2 en la función LAG
-- (es decir: LAG(SQ_FT, 2)). Ahora buscará el valor dos filas hacia atrás.
-- Verás más valores NULL al inicio porque esas filas no tienen 
-- dos filas previas dentro de la ventana.
SELECT WINDOW, 
       ROOM_NUMBER, 
       SQ_FT,
       LAG(SQ_FT, 2) OVER (ORDER BY WINDOW, SQ_FT) AS "Lag",
       LEAD(SQ_FT) OVER (ORDER BY WINDOW, SQ_FT) AS "Lead"
FROM SHIP_CABINS
ORDER BY WINDOW, SQ_FT;

/*------------------------------------------------------------------
            Funciones STDDEV (Desviación Estándar) y VARIANCE
------------------------------------------------------------------
-- STDDEV devuelve la desviación estándar de una muestra de valores numéricos.
-- La desviación estándar representa el grado de dispersión (distribución) 
-- de los valores respecto a la media (promedio). 
-- Matemáticamente, la desviación estándar (STDDEV) es la raíz cuadrada 
-- de la varianza (VARIANCE).
--
-- Pasos matemáticos que estas funciones hacen por detrás:
-- 1. Calcular el promedio (AVG) de los valores.
-- 2. Restar el promedio a cada valor y elevar el resultado al cuadrado.
-- 3. Sumar esos cuadrados y dividirlos entre (Total de valores - 1) -> Varianza.
-- 4. Sacar la raíz cuadrada (SQRT) de la varianza -> Desviación Estándar.
--
-- Estas funciones se pueden usar de dos formas: como funciones de 
-- AGREGADO (devuelven un solo resultado general) o como funciones 
-- ANALÍTICAS (devuelven un cálculo acumulativo fila por fila).
*/

/*------------------------------------------------------------------
        STDDEV y VARIANCE como funciones de AGREGADO
------------------------------------------------------------------*/
-- Al igual que SUM o AVG, aquí evalúan el conjunto completo de filas
-- especificado en el SELECT y devuelven un único valor general para 
-- toda la tabla.
SELECT AVG(SQ_FT), 
       MEDIAN(SQ_FT), 
       STDDEV(SQ_FT), 
       VARIANCE(SQ_FT)
FROM SHIP_CABINS;


/*------------------------------------------------------------------
    STDDEV y VARIANCE como funciones ANALÍTICAS
------------------------------------------------------------------*/
-- Usando la cláusula OVER, evaluamos la Varianza y Desviación Estándar 
-- de manera acumulativa ("sliding window") fila por fila, 
-- ordenadas por los pies cuadrados (SQ_FT).
-- Notarás que el valor en la última fila coincidirá con el resultado 
-- del ejemplo de agregado anterior.
SELECT WINDOW, 
       ROOM_NUMBER, 
       SQ_FT,
       VARIANCE(SQ_FT) OVER (ORDER BY SQ_FT) AS "Variance",
       STDDEV(SQ_FT) OVER (ORDER BY SQ_FT) AS "Std Dev"
FROM SHIP_CABINS
ORDER BY SQ_FT;
