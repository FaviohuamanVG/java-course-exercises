/*------------------------------------------------------------------
    CAPÍTULO 6: Funciones de Conversión y Expresiones Condicionales
    Subtema: Descripción de los Tipos de Funciones de Conversión
------------------------------------------------------------------
-- Las funciones de conversión transforman valores de un tipo de dato a otro.
-- Categorías principales de tipos de datos en Oracle:
-- 1. Texto: VARCHAR2, CHAR
-- 2. Numérico: NUMBER
-- 3. Fecha/Hora: DATE, TIMESTAMP
--
-- Tipos de Conversión:
-- Implícita: Oracle realiza la conversión automáticamente por detrás.
-- Explícita: El programador usa funciones dedicadas 
-- (TO_CHAR, TO_NUMBER, TO_DATE).
*/

/*------------------------------------------------------------------
            Conversión Implícita vs. Conversión Explícita
------------------------------------------------------------------
-- Conversión Explícita: Ocurre cuando se utilizan funciones dedicadas
-- (TO_CHAR, TO_NUMBER, TO_DATE) para especificar la transformación.
-- Conversión Implícita: Ocurre cuando sql detecta y requiere un tipo
-- de dato diferente al solicitado y realizar una conversion autom.
*/

SELECT 'Chapter' || 1 || ' . . . I am born.'
FROM DUAL;

-- Iniciamos la consulta solicitando evaluar  y devolver una expresion
-- 'Chapter'  es una cadena de texto estatica. 
-- Tiene || 1 || el operador de concatenacion con el valor central 1
-- Como el 1 es de tipo number Oracle lo convierte de forma implicita
-- y ahora es un texto '1' 
-- ' . . . I am born.' es la segunda cadena de texto que se une al final
-- de la expresion.
-- FROM DUAL; Tabla virtual de oracle.

SELECT SYSDATE,
       ADD_MONTHS(SYSDATE, SUBSTR('plus 3 months', 6, 1)) AS PLUS_THREE
FROM DUAL;

-- SYSDATE, se seleccion sysdate para devolver la fecha y hora actual
-- registrada en la bd.
-- ADD_MONTHS(fecha, número) Exigimos que el segundo parametro sea de
-- tipo NUMBER
-- SUBSTR('plus 3 months', 6, 1) Funcion interna  donde ubicamos el numero
-- 6 de la cadena '3' y extraemos solo 1 caracter. Devuelve '3' en VARCHAR2


SELECT 'TRUE' FROM DUAL WHERE '3' > '20';
-- WHERE '3' > '20'
-- Se evaluan como cadenas de texto VARCHAR2 pq tiene '3', '20'. La 
-- comparacion de texto se hace caracter por caracter de izq. a der.
-- Compara el primer caracter de cada uno: el '3' viene luego del
-- '2', por lo cual la condicion es TRUE y devuelve TRUE


SELECT 'TRUE' FROM DUAL WHERE '3' > 20;
-- WHERE '3' > 20

-- WHERE '3' > 2'
-- oracle aplica la regla de convertir el texto a numero.
-- Transforma la cadena '3' en valor numerico 3-
-- Pero 3 no es mayor que 20 la condicion evalua 20
-- por lo cual la condicion es FALSE y devuelve FALSE

/*------------------------------------------------------------------
    Uso de Funciones de Conversión Explícita y Modelos de Formato
------------------------------------------------------------------
-- Si intentamos insertar texto en una columna tipo DATE o TIMESTAMP,
-- oracle intenta aplicar una conversion implicita usando
-- la configuracion regional del sistema (NLS_DATE_FORMAT).
-- La insercion puede fallar si la cadena enviada no coincide exactamente
-- con el patron esperado.
*/

INSERT INTO CALLS (CALL_ID, CALL_DATE_TZ)
VALUES (1, '24-MAY-12 10:15:30');

-- La insercion va a fallar porque la cadena no tiene
-- ni el formato que esta por defecto.

INSERT INTO CALLS (CALL_ID, CALL_DATE_TZ)
VALUES (1, TO_TIMESTAMP_TZ('24-MAY-12 10:15:30', 'DD-MON-RR HH24:MI:SS'));

-- PQ esto si funciona? 
-- Funciona pq esta aplicando el formato y modelo, lo cual esta recibiendo
-- el segundo parametro de TO_TIMESTAMP_TZ
-- DD: dia numerico (24)
-- MM: Abrev. de meses (MAY)
-- RR: Año de  2 digitos con logica inteligente para resolver el siglo
-- HH24: Formato de hora / 24h. (10)
-- MI: Minutos (15)
-- SS: Segundos (30)

/*------------------------------------------------------------------
    Uso de Funciones de Conversión Explícita y Modelos de Formato
------------------------------------------------------------------
-- Convierte una cadena de texto (e1) en un tipo de dato NUMBER
-- utilizando el modelo de formato:
-- 9 Representando cualquier digitio numerico.
-- $ Indica la presencia de un digito dolar
-- D Caracter decimal NLS
-- G Separador de miles (grupo) segun NLS.
*/

SELECT TO_NUMBER('$17,000.23', '$999,999.99') AS NUMERO_LIMPIO
FROM DUAL;

-- SELECT TO_NUMBER: para que podemaos extraer los digitos
-- ignorando los simbolos $ y la coma ','
-- Con un alias NUMERO_LIMPIO el cual mostrara el valro
-- del resultado de la consulta.

SELECT TO_NUMBER('17.000,23', 
                 '999G999D99', 
                 'nls_numeric_characters='',.'' ') AS REFORMATTED_NUMBER
FROM DUAL;

-- SELECT TO NUMBER: para que podemas convertir la cadena de texto
-- que nos brinde '17.000,23' en un valor numerico.
-- Se hace una conversion europea: 'nls_numeric_characters='',.'' '
-- ',' asignando el separador decimal D.
-- '.' segundo caracter asignado al separador de miles de elementos.

-- Como los mapea 999G999D99?
-- 999 coincide con 17 y 000
-- G con el '.' de los miles
-- D con la coma ',' y el 99 con digitos decimales 23.




