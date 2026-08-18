/*----------------------------------------------------------------------
    TRUNCATE TABLE
  ----------------------------------------------------------------------
- Es la mejor alternativa cuando se necesita vaciar una tabla entera.
- -
-- ¿Porque no usar DELETE?
-- DELETE procesa fila por fila, actualiza indices, etc.
-- Una operacion costosa y lenta en tablas con miles de registros.
-- DROP TABLE?
-- Borra todo (datos y estructura). Es necesario recrear todo.
-- TRUNCATE TABLE: elimina todas las filas de golpe y vacia los indices
-- pero deja la estructuras intactas.
----------------------------------------------------------------------*/

-- Sintaxis correcta:
TRUNCATE TABLE VENDORS;

-- CARACTERÍSTICAS VITALES):
-- TRUNCATE realiza un commit, implicito en la base de datos.

/*----------------------------------------------------------------------
    RECURSIVELY TRUNCATE CHILD TABLES (Oracle 12c+)
  ----------------------------------------------------------------------
-- Se introdujo una nueva caracteristica para TRUNCATE TABLE
-- CASCADE para truncar las tablas hijas dependientes.
-- REQUISITO INDISPENSABLE:
-- Para que TRUNCATE en cascada funcione, la restriccion de la FK
-- en la tabla hija debe tener su clausula "ON DELETE CASCADE", 
-- es obligatorio añadir la palabra CASCADE.
-- PROBLEMA:
-- Si se usa TRUNCATE TABLE normal en una tabla padre (PORTS)
-- que tiene registros en la tabla hija (SHIPS) mostrara un error:
-- "ORA-02266"
---------------------------------------------------------------------*/

-- 1. Escenario(ON DELETE CASCADE):
CREATE TABLE PORTS
  (PORT_ID    NUMBER,
   PORT_NAME  VARCHAR2(20),
   COUNTRY    VARCHAR2(40),
   CAPACITY   NUMBER,
   CONSTRAINT PORT_PK PRIMARY KEY (PORT_ID));

CREATE TABLE SHIPS
  (SHIP_ID       NUMBER,
   SHIP_NAME     VARCHAR2(20),
   HOME_PORT_ID  NUMBER,
   CONSTRAINT SHIPS_PORTS_FK FOREIGN KEY (HOME_PORT_ID) 
              REFERENCES PORTS (PORT_ID) 
              ON DELETE CASCADE); -- CLAVE PARA QUE TRUNCATE CASCADE FUNCIONE
              
-- 2. Agregando datos de prueba:
INSERT INTO PORTS VALUES (315, 'Atlanta', 'USA', 100000);
INSERT INTO SHIPS VALUES (4000, 'Codd Land Rover', 315);
INSERT INTO SHIPS VALUES (4001, 'Codd Vessel Two', NULL);

-- 3. Este comando FALLARÁ lanzando el error ORA-02266:
-- TRUNCATE TABLE PORTS;

-- 4. Forzar CORECTAMENTE la eliminacion
TRUNCATE TABLE PORTS CASCADE;

/*----------------------------------------------------------------------
    INSERT ROWS INTO A TABLE (Parte 1: Introducción)
  ----------------------------------------------------------------------
-- La instruccion INSERT se usa para agregar filas a una tabla.
-- 1. Que la tabla destino exista.
-- 2. Valida que las columnas especificadas existan.
-- 3. Evalúa las expresiones (los valores entregados).
-- 4. Compara los tipos de datos.
-- 5. Aplica las restrincciones PK o NOT NULL.
-- Si se cumple todo, la fila se inserta.
  ----------------------------------------------------------------------*/
-- 1. Detalla la lista de columnas:
-- El orden aqui no tiene que coincidir con el comando DESC de la tabla.
INSERT INTO CRUISES
  (CRUISE_ID, CRUISE_TYPE_ID, CRUISE_NAME,
   CAPTAIN_ID, START_DATE, END_DATE,
   STATUS)
VALUES
  (1, 1, 'Day At Sea',
   101, '02-ENE-10', '09-ENE-10', -- Cambiado a ENE
   'Sched');
   
SELECT * FROM CRUISES;

-- Sintaxis 2: Lista por defecto (Se omiten los nombres de las columnas).
INSERT INTO CRUISES
VALUES
  (2, 2, 'Day At Sea',
   102, '02-ENE-10', '09-ENE-10',
   'Sched');

/*----------------------------------------------------------------------
    EL PELIGRO DEL DEFAULT COLUMN LIST (Ejemplo TEST_SCORES)
  ----------------------------------------------------------------------
-- Cuando omites los nombres de las columnas, dependes del orden físico 
-- de la tabla. Si la tabla se reconstruye con otro orden, y los tipos de 
-- datos coinciden (ej. ambos son NUMBER), el INSERT no fallará, pero 
-- insertará los datos de forma ilógica.
----------------------------------------------------------------------*/

/*----------------------------------------------------------------------
    LA SOLUCIÓN: ENUMERATED COLUMN LIST (Lista Enumerada)
  ----------------------------------------------------------------------
-- Al enumerar las columnas, evitamos cualquier confusion.
-- Se puede colocar columnas en un orden distinto a la tabla.

-- No seguimos el orden del comando DESC
  ----------------------------------------------------------------------*/
INSERT INTO CRUISES
  (CRUISE_ID, CRUISE_NAME, STATUS, CAPTAIN_ID, START_DATE, END_DATE)
VALUES
  (3, 'Bermuda and Back', 'Done', 101, DATE '2008-04-07', DATE '2008-04-14');

/*----------------------------------------------------------------------
    DATA TYPE CONVERSION (Conversión de tipos de datos)
  ----------------------------------------------------------------------
-- Oracle requiere que los datos insertados sean "COMPATIBLES" con la
-- columna, no identicos.  
  ----------------------------------------------------------------------*/
-- 1. Oracle hace una "CONVERSION IMPLICITA", el valor '101' esta con
-- comillas simples, pero como la columna CAPTAIN_ID es de tipo NUMBER
-- se inserta con exito.
INSERT INTO CRUISES (CRUISE_ID, CAPTAIN_ID)
VALUES (2, '101');

/*----------------------------------------------------------------------
    INSERT AND CONSTRAINTS (Insertar con restricciones y secuencias)
  ---------------------------------------------------------------------
-- Violar una restriccion es un error de ejecucion "run-time-error"
-- no un error de sintaxis.  
  ----------------------------------------------------------------------*/
     
-- 1. Creamos la tabla con restricciones (Primary Key y Check)
CREATE TABLE CRUISES
  (CRUISE_ID NUMBER,
   CRUISE_NAME VARCHAR2(30),
   START_DATE DATE,
   END_DATE DATE,
   CONSTRAINT CRUISE_ID_PK PRIMARY KEY (CRUISE_ID),
   CONSTRAINT CRUISE_NAME_CK CHECK
     (CRUISE_NAME IN ('Hawaii', 'Bahamas', 'Bermuda', 
                      'Mexico', 'Day at Sea'))
  );
  
-- 2. Creamos un objeto SEQUENCE para generar números automáticos
CREATE SEQUENCE SEQ_CRUISE_ID

-- 3. INSERT usando la secuencia y cumpliendo el CHECK
-- Hawaii es un valor permitido gracias a la constraint
INSERT INTO CRUISES
  (CRUISE_ID, CRUISE_NAME)
VALUES
  (SEQ_CRUISE_ID.NEXTVAL, 'Hawaii');

-- 4. INSERT que falla por violar la restricción (run-time error)
-- 'Hawaii and Back' no esta en la lista de valores permitidos.
INSERT INTO CRUISES
  (CRUISE_ID, CRUISE_NAME)
VALUES
  (SEQ_CRUISE_ID.NEXTVAL, 'Hawaii and Back');
  
/*----------------------------------------------------------------------
    UPDATE ROWS IN A TABLE (Actualizar filas)
  ----------------------------------------------------------------------
-- UPDATE: modifica datos existentes. Sobreescribe lo que haya.
-- Si omitimos WHERE, !ACTUALIZAMOS toda la tabla¡
  ----------------------------------------------------------------------*/
-- Actualizamos 2 columnas
-- Usamos fechas con formato ANSI
UPDATE CRUISES
   SET CRUISE_NAME = 'Bahamas',
       START_DATE  = DATE '2011-12-01'
 WHERE CRUISE_ID = 1;


/*----------------------------------------------------------------------
    EXPRESSIONS IN UPDATE (Matemáticas y Funciones)
  ----------------------------------------------------------------------*/
-- En el SET podemos usar matematicas (SALARY * 1.03)
-- Y la funcion SYSDATE obtiene la fecha actual.
UPDATE COMPENSATION
   SET SALARY = SALARY * 1.03,
       LAST_CHANGED_DATE = SYSDATE
 WHERE EMPLOYEE_NUMBER = 83;
 
 SELECT * FROM COMPENSATION;
 
/*----------------------------------------------------------------------
    CONSTRAINTS Y LA REGLA DEL "TODO O NADA"
  ----------------------------------------------------------------------
-- Si un update intenta modificar varias filas y tan solo 1 de ellas
-- viola una restriccion el comando completo FALLARA y ninguno actualiza
----------------------------------------------------------------------*/
-- 1. CREAMOS TABLA
CREATE TABLE PROJECTS
( PROJECT_ID   NUMBER PRIMARY KEY
, PROJECT_NAME VARCHAR2(40)
, COST         NUMBER
, CONSTRAINT CK_COST CHECK (COST < 1000000) -- Límite: 1 millón
);

-- Insertar valores:
INSERT INTO PROJECTS VALUES (1, 'Hull Cleaning', 340000);
INSERT INTO PROJECTS VALUES (2, 'Deck Resurfacing', 964000);
INSERT INTO PROJECTS VALUES (3, 'Lifeboat Inspection', 12000);

-- 2. EL ERROR (Figura 3-5):
UPDATE PROJECTS SET COST = COST * 1.20;

-- 3. LA SOLUCIÓN (Figura 3-6):
-- Filtramos preventivamente en el WHERE para afectar solo a los 
-- proyectos que, incluso tras el aumento, seguirán por debajo del millón.
UPDATE PROJECTS
   SET COST = COST * 1.20
 WHERE COST * 1.20 < 1000000;
 
/*----------------------------------------------------------------------
    DELETE ROWS FROM A TABLE (Eliminar filas)
  ----------------------------------------------------------------------
-- DELETE elimina filas completas.
-- Si quiere limpiar un dato especifico de un columna
-- Si se omite el WHERE em el DELETE, se vaciara toda la tabla!
  ----------------------------------------------------------------------*/
-- CREAMOS LA TABLA
CREATE TABLE PROJECT_LISTING (
    CONSTRUCTION_ID NUMBER,
    PROJECT_NAME VARCHAR2(50)
)

INSERT INTO PROJECT_LISTING VALUES (10, 'Mall');
INSERT INTO PROJECT_LISTING VALUES (12, 'Bridge');
INSERT INTO PROJECT_LISTING VALUES (12, 'Tunnel');

-- Sintaxis 1: La forma clásica (con FROM)
DELETE FROM PROJECT_LISTING
 WHERE CONSTRUCTION_ID = 12;
 
 -- Sintaxis 2: La palabra FROM es opcional. Esto funciona perfectamente.
DELETE PROJECT_LISTING
 WHERE CONSTRUCTION_ID = 10;

/*----------------------------------------------------------------------
    CONTROL TRANSACTIONS (Introducción a TCL)
  ----------------------------------------------------------------------
-- DML (Insert, Update, Delete) manipula los datos.
-- TCL controla si esos cambios se guarda permanentemente o se 
-- deshacen en la sesion actual (COMMIT, ROLLBACK, SAVEPOINT).
  ----------------------------------------------------------------------*/
-- Ejemplo de Transacción:
INSERT INTO PROJECT_LISTING VALUES (99, 'Skyscraper');

-- El dato está en memoria (lápiz). Si ejecutamos ROLLBACK, se borra.
ROLLBACK;