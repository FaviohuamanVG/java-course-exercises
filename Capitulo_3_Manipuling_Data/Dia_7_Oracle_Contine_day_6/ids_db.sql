/*----------------------------------------------------------------------
    TRANSACTIONS: EXPLICIT AND IMPLICIT COMMITS
  ----------------------------------------------------------------------
-- Una vez que hay un COMMIT, los cambios DML son permanentes y el
-- ROLLBACK ya no funciona para esos datos.
----------------------------------------------------------------------*/
-- 1. COMMIT EXPLICITO:
INSERT INTO POSITIONS(
POSITION_ID, 
POSITION_NAME) 
VALUES(100, 'Manager');

COMMIT; -- Guarda el INSERT anterior permanentemente.
-- COMMIT WORK; // Tambien es un comando valido, hace exactamente lo mismo

-- 2. COMMIT IMPLICITO:
UPDATE SHIPS SET home_port_id = 12 
WHERE SHIP_ID = 31;

-- Es comando es un DDL(ALTER TABLE).
-- Forzara un COMMIT automatico "ANTES" de alterar
-- la tabla. El UPDATE quedara guardado para siempre
-- incluso si el ALTER falla.
ALTER TABLE PORTS ADD AUTHORITY_NOTE VARCHAR2(75);
COMMIT;

/*----------------------------------------------------------------------
    COMMIT AND MULTIPLE SESSIONS (Visibilidad de los datos)
  ----------------------------------------------------------------------
-- Los cambios realizados pero no confirmados (uncommitted) viven
-- en un "borrador". Simplemente son visibles en la sesion que
-- hizo el cambio.
  ----------------------------------------------------------------------*/
  
  -- USER A: hace un cambio
  UPDATE SHIPS
  SET SHIP_NAME = 'EMBUTIDO'
  WHERE SHIP_ID = 1;
  
  -- USER B: consulta al mismo tiempo
  SELECT SHIP_NAME
  FROM SHIPS
  WHERE SHIP_ID = 1;
  
/*----------------------------------------------------------------------
    ROLLBACK (Deshacer cambios)
  ----------------------------------------------------------------------*/
-- 1. Aseguramos que todo lo anterior este guardado.
COMMIT;

-- 2. Realizar un pequeño error en la tabla SHIPS
UPDATE SHIPS SET SHIP_NAME = 'WHOOPS';

SELECT * FROM SHIPS;

-- 3. Podemos deshacer el error volviendo al estado del ultimo COMMIT
ROLLBACK;

/*----------------------------------------------------------------------
    SAVEPOINT (Marcadores dentro de una transacción)
  ----------------------------------------------------------------------
-- Permite deshacer cambios parciales sin perder todo el trabajo
-- Deben incluir un nombre todos los SAVEPOINT.
-- Los COMMIT los destruye.
  ----------------------------------------------------------------------*/
-- Aseguramos todo el trabajo
COMMIT;

-- Crear un nombre
SAVEPOINT MARK_01;

-- 2do Cambio:
UPDATE SHIPS 
   SET SHIP_NAME = 'CHORIZOS' 
 WHERE SHIP_ID = 1;
 
-- 3. Hacemos un SELECT para ver el cambio.
SELECT SHIP_ID, SHIP_NAME 
FROM SHIPS WHERE SHIP_ID = 1;

-- 4. Deshacemos el cambio.
ROLLBACK TO MARK_01;

-- 5. Seleccionamos la tabla
SELECT SHIP_ID, SHIP_NAME FROM SHIPS WHERE SHIP_ID = 1;


/*----------------------------------------------------------------------
    ROLLBACK Revisited (Detalles de Sintaxis y Errores)
  ----------------------------------------------------------------------
-- 1. ROLLBACK Global:
-- Ignora cualquier SAVEPOINT y deshace TODO el trabajo desde el
-- ultimo COMMIT.
-- 2. ROLLBACK Específico:
-- ROLLBACK TO name; deshace solo hasta ese marcador.
-- WORK - Es opcional: ROLLBACK WORK TO name;
-- TO - Es obligatoria al nombrar un marcador.
  ----------------------------------------------------------------------*/
-- Si se hace un ROLLBACK a un SAVEPOINT inexistente o que fue
-- destruido por un COMMIT. SQL lanzara un ERROR.
-- ROLLBACK TO name; y ROLLBACK WORK TO name; hacen el mismo trabajo.
