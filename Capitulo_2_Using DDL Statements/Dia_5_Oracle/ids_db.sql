/*----------
    UNUSED
  ----------
-- Es una alternativa a DROP COLUMN, en lugar de eliminar una columna
-- puedes "desactivarlas" logicamente usando SET UNUSED.
-- Si tenemos una tabla en produccion y una columna no se usa podemos usar:
*/---------
ALTER TABLE order_returns DROP COLUMN CRUISE_ORDER_DATE;
-- DROP COLUMN es una operacion costosa y esto generaria bloqueos o lentitud.
-- La alternativa con SET UNUSED:
ALTER TABLE order_returns SET UNUSED COLUMN CRUISE_ORDER_DATE;
-- SET UNUSED hace que la columna se borre del SELECT * y cualquier
-- indice o constraint sobre ella se elimina:
-- Ejemplos:
 -- Una sola columna:
 ALTER TABLE order_returns 
 SET UNUSED COLUMN CRUISE_ORDER_DATE;
 -- Multiples columnas:
 ALTER TABLE order_returns 
 SET UNUSED (CRUISE_ORDER_DATE, FORM_TYPE, NAME_SUFFIX) ;
 -- Eliminar fisicamente columnas UNUSED
 ALTER TABLE order_returns DROP UNUSED COLUMNS;
 
 ----------------------------------------------------------------------------
 /*
    External Table
    -- Es una forma en la que oracle sql, lea un archivo de texto
    plano que vive fuera de la base de datos (.txt, csv) como si
    fuera una tabla normal. Usando SELECT
 */
 -- Permite consultar directamente ese archivo con SELECT (solo eso se puede)
 -- Los datos reales siguen viviendo afuera en el archivo del SO
 /*
 * No puedes crear una columna tipo LOB.
 * No se puede agregar un constraint a una tabla externa.
 * No puedes crear un INDEX sobre ella.
 * No se puede realizar un SET UNUSED porque Oracle lo vera como DROP
 */
 -- DIRECTORY Objects
 CREATE OR REPLACE DIRECTORY directory_name AS
directory_reference;
-- directory_name: nombre para identificar el objeto
-- directory_reference: una ruta fisica real del SO
-- OR REPLACE: opcional, por si existe y lo debemos reemplazar

GRANT READ ON DIRECTORY directory_name TO username;

-- Utilidades de Oracle Relacionadas:
-- SQL*LOADER
-- Oracle Data Pump Export
-- Oracle Data Pump Import

-- Crear la tabla externa:
-- Crear el directorio
CREATE OR REPLACE DIRECTORY INVOICE_FILES AS 'C:\LOAD_INVOICES';

-- CREAR TABLA EXTERNA:
CREATE TABLE INVOICE_EXTERNAL(
INVOICE_ID CHAR(3),
INVOICE_DATE CHAR(9),
ACCOUNT_NUMBER CHAR(13)
)
ORGANIZATION EXTERNAL (
TYPE ORACLE_LOADER
DEFAULT DIRECTORY INVOICE_FILES
ACCESS PARAMETERS(
RECORDS DELIMITED BY NEWLINE
SKIP 2
FIELDS(INVOICE_ID CHAR(3),
        INVOICE_DATE CHAR(9),
        ACCOUNT_NUMBER CHAR(13))
)
LOCATION ('INVOICE_DATA.TXT')
); 

-- Consultarla:
SELECT * FROM INVOICE_EXTERNAL;

-- Transformacion de Datos
SELECT TO_NUMBER(INVOICE_ID),
       TO_DATE(INVOICE_DATE,'MM/DD/RR') INVOICE_DATE,
       LTRIM(ACCOUNT_NUMBER,' ') ACCOUNT_NUMBER
FROM   INVOICE_EXTERNAL;
 