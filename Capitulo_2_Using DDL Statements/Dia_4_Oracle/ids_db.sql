/*-------------------------------------------------------
                    Large Objects 
*/-------------------------------------------------------
 --- Lob:
   --- Significa Objeto Grande: LOB. Categoria de Oracle cuando necesitamos
   --- guardar cantidades enormes de informacion en una sola columna.
   /* Restricciones:
   * No puede ser PRIMARY KEY: Oracle no indexa LOBs de esa forma eficiente
   * No se puede usar DISTINT: Comparar datos gigantes y si son Distinct. Reduce el rendimiento
     No se puede usar en GROUP BY: Mismo problema con el rendimiento
     No se puede usar en ORDER BY ni JOINS: Ordenar distintos bytes es poco eficiente
                            Comparar tablas con LOB seria muy lento.
   */
   
   --- BLOB — Binary Large Object
   /*
    -- Guardar datos que no son texto: img, videos, pdf, audios, etc.
    -- No se especifica ningun numero simplemente escribes:
        image BLOB
   
   */
   
   -- CLOB — Character Large Object
   -- Es equivalente a BLOB pero para texto, no binario
   -- Htmls, JSON, Articulos, etc.
   
   -- NCLOB — National Character Large Object
   /*
   -- Es literalmente un CLOB pero garantizando que el contenido se guarde en
    UNICODE - N --> Prefijo que usan datos como NCHAR y NVARCHAR2 en Oracle.
   
   */
   
   --- Ejemplo: Tabla con columna CLOB.
   CREATE TABLE cruise_notes(
   cruise_notes_id NUMBER, 
   cruise_notes CLOB
   );
   
   // No declaramos constrains, simplemente declaramos una columna CLOB.
   

/*---------------------------------------------------------------------
Explain How Constraints Are Created at the Time of
Table Creation
*/--------------------------------------------------------------------
-- Podemos crear una constraint para dar soporte a otros objetos de una tabla.
-- Pero no existe una sentencia para crearla como CREATE CONSTRAINT.
-- Nunca vive sola, podemos elegir nosotros el nombre.

-- Ejemplo Tabla Positions incluyendo una CONSTRAINT.
CREATE TABLE positions(
position_id NUMBER,
position VARCHAR2(20),
exempt CHAR(1),
CONSTRAINT positions_pk PRIMARY KEY (position_id) -- Como crear una constraint.
);

-- Ademas podemos crear una constraint IN-LINE (sin nombre)
/*
CONSTRAINT - Anuncia que viene una constraint
position_pk - Nombre de la constraint
PRIMARY KEY - Tipo de constraint
position_id - Especificar la columna
*/
CREATE TABLE ports(
PORT_ID NUMBER PRIMARY KEY, -- Oracle genera autom. SYS_Cn, osea que es directo.
PORT_NAME VARCHAR2(20)
);
-- Pueden existir variables pero la constraint tendria nombre:
CREATE TABLE ports(
PORT_ID NUMBER CONSTRAINT port_ID_pk PRIMARY KEY, -- Asignado un nombre
PORT_NAME VARCHAR2(20)
);

-- Podemos crear una constraint NULL:
CREATE TABLE vendors(
vendor_id NUMBER,
vendor_name VARCHAR2(20),
status NUMBER(1) NOT NULL, -- Definimos que status no puede ser nunca NULL
category VARCHAR2(5)
);

-- Constrain con nombre explicito:
CREATE TABLE vendors(
vendor_id NUMBER,
vendor_name VARCHAR2(20),
status NUMBER(1) CONSTRAINT status_nn NOT NULL, -- Definimos que status no puede ser nunca NULL + definir nombre
category VARCHAR2(5)
);

-- Combinando multiples constraints.
CREATE TABLE vendors(
vendor_id NUMBER PRIMARY KEY,-- Oracle genera un SYS_Cn autom.
vendor_name VARCHAR2(20) NOT NULL,
status NUMBER(1) CONSTRAINT status_nn NOT NULL, -- Definimos que status no puede ser nunca NULL + definir nombre
category VARCHAR2(5)
);

--PK out-of-line sin nombre
CREATE TABLE ports(
PORT_ID NUMBER, 
PORT_NAME VARCHAR2(20),
PRIMARY KEY (PORT_ID)
);

--PK out-of-line con nombre
CREATE TABLE ports(
PORT_ID NUMBER, -- Asignado un nombre
PORT_NAME VARCHAR2(20),
CONSTRAINT PORT_ID_PK PRIMARY KEY (PORT_ID)
);

/*
Additional Ways to Create Constraints: ALTER TABLE
*/
-- CREATE TABLE No es la unica forma de crear una constrain
-- Podemos usar ALTER TABLE

DROP TABLE ports;

CREATE TABLE ports(
PORT_ID NUMBER, -- Asignado un nombre
PORT_NAME VARCHAR2(20)
);
-- El ALTER TABLE in-line, sin nombre
ALTER TABLE ports 
MODIFY (port_id NUMBER PRIMARY KEY);

-- consultar el nombre generado por el sistema
SELECT constraint_name 
FROM user_constraints WHERE table_name = 'PORTS';

-- Renombrar la constraint
ALTER TABLE ports 
RENAME CONSTRAINT sys_c007434 TO port_id_pk;

-- Out-of-line sin nombre
ALTER TABLE ports
  ADD PRIMARY KEY (port_id);
  
-- con nombre:
ALTER TABLE ports
  ADD CONSTRAINT port_id_pk PRIMARY KEY (port_id);

/*
Warning: NOT NULL Is Different
*/

-- sintaxis INVÁLIDA para NOT NULL:
CREATE TABLE ports
(port_id    NUMBER,
 port_name  VARCHAR2(20),
 NOT NULL   (port_id)); // Oracle no reconoce esta sintaxis
 
-- NOT NULL simplemente no puede ir out-of-line
CREATE TABLE ports
(port_id    NUMBER,
 port_name  VARCHAR2(20),
 CONSTRAINT port_id_nn NOT NULL (port_id)); // sin importar si la nombras o no

// Sintaxis Validas:

-- UNIQUE constraint:
CREATE TABLE ports
(port_id    NUMBER,
 port_name  VARCHAR2(20),
 CONSTRAINT port_id_un UNIQUE (port_id)); //Usa UNIQUE sí es completamente válido.

-- PRIMARY KEY constraint:
CREATE TABLE ports
(port_id    NUMBER,
 port_name  VARCHAR2(20),
 CONSTRAINT port_id_un PRIMARY KEY (port_id));
 
-- NOT NULL tampoco funciona out-of-line con ALTER TABLE
-- LTER TABLE, out-of-line, sin nombre
ALTER TABLE ports
  ADD NOT NULL (port_name);
  
-- ALTER TABLE, out-of-line, con nombre
ALTER TABLE ports
  ADD CONSTRAINT port_name_nn NOT NULL (port_name);
  
-- Las que funcionan:
-- ALTER TABLE, in-line
ALTER TABLE ports
  MODIFY PORT_NAME NOT NULL;
  
-- -- ALTER TABLE, con nombre
ALTER TABLE ports
  MODIFY PORT_NAME CONSTRAINT PORT_NAME_NN NOT NULL;
  
  
/*
The Types of CONSTRAINTS
*/
-- Null

-- Crear la tabla CUSTOMERS
CREATE TABLE customers( 
first_name   VARCHAR2(20),
  middle_name  VARCHAR2(20),
  last_name    VARCHAR2(30)
);

-- Insertar la fila sin middle_name
INSERT INTO customers (first_name, last_name) VALUES ('Angelina', 'Ellison');

-- PRIMARY KEY (simple)
CREATE TABLE employees( 
employee_id        NUMBER, 
ship_id            NUMBER, 
first_name         VARCHAR2(20), 
last_name          VARCHAR2(30), 
position_id        NUMBER, 
CONSTRAINT employees_pk PRIMARY KEY (employee_id));

-- CREATE TABLE que crearía una constraint PRIMARY KEY compuesta
CREATE TABLE helpdesk( 
hd_category    VARCHAR2(10), 
hd_year        NUMBER(4), 
hd_ticket_no   NUMBER, 
CONSTRAINT helpdesk_pk PRIMARY KEY (hd_category, hd_year, hd_ticket_no));
// En lugar de 1 sola constraint ponemos las tres separadas por coma.

/*
FOREIGN KEY - Constraint:
 - Un FOREIGN KEY es la característica que ayuda a garantizar que 
   dos tablas puedan "relacionarse" entre sí
*/

// Ejemplo:
-- Create table ports and ships:
-- Tabla ports
CREATE TABLE ports( 
port_id      NUMBER, 
port_name    VARCHAR2(50), 
CONSTRAINT ports_pk PRIMARY KEY (port_id));

-- Tabla ships
CREATE TABLE ships( 
ship_id         NUMBER, 
ship_name       VARCHAR2(50), 
home_port_id    NUMBER NOT NULL, 
CONSTRAINT ships_fk FOREIGN KEY (home_port_id)
       REFERENCES ports (port_id));
       
-- CREATE TABLE SHIPS con ON DELETE SET NULL
CREATE TABLE ships
(  ship_id         NUMBER, 
ship_name       VARCHAR2(50), 
home_port_id    NUMBER, 
CONSTRAINT ships_fk FOREIGN KEY (home_port_id)
       REFERENCES ports (port_id) ON DELETE SET NULL);
       
-- ON DELETE CASCADE
CREATE TABLE ships
(  ship_id         NUMBER
,  ship_name       VARCHAR2(50)
,  home_port_id    NUMBER
,  CONSTRAINT ships_fk FOREIGN KEY (home_port_id)
       REFERENCES ports (port_id) ON DELETE CASCADE);
// eliminará todas las filas de SHIP asignadas a una fila de PORT 
//al momento de la eliminación de la fila PORT

/*
Check: adjunta una expresión lógica a una columna
*/

-- CHECK constraint: solo permite STATUS = 4 o 5
CREATE TABLE vendors(
    vendor_id      NUMBER,
    vendor_name    VARCHAR2(20),
    status         NUMBER(1) CHECK (status IN (4,5)),
    category       VARCHAR2(5)
);

-- Multiple Constraints — Varios constraints en una tabla
-- Tabla con 5 constraints combinados
CREATE TABLE vendors(
    vendor_id      NUMBER   CONSTRAINT vendor_id_pk PRIMARY KEY,
    vendor_name    VARCHAR2(20) NOT NULL,
    status         NUMBER(1) CONSTRAINT status_nn NOT NULL,
    category       VARCHAR2(20),
    CONSTRAINT     status_ck   CHECK (status IN (4, 5)),
    CONSTRAINT     category_ck CHECK 
                   (category IN ('Active','Suspended','Inactive'))
);

/*
-- Dropping Columns — Eliminar columnas de una tabla
 -- Eliminar columnas que ya no se usan libera espacio de almacenamiento
*/

-- Variante 1: con la palabra clave COLUMN, sin paréntesis
ALTER TABLE order_returns DROP COLUMN cruise_order_date;

-- Variante 2: sin la palabra clave COLUMN, con paréntesis
ALTER TABLE order_returns DROP (cruise_order_date);

-- Restricción: columnas referenciadas por FOREIGN KEY

-- Tabla padre
CREATE TABLE cruise_orders
   (cruise_order_id   NUMBER,
    order_date        DATE,
    CONSTRAINT pk_co PRIMARY KEY (cruise_order_id));

-- Tabla hija (con FK apuntando a CRUISE_ORDERS)
CREATE TABLE order_returns
   (order_return_id    NUMBER,
    cruise_order_id    NUMBER,
    cruise_order_date  DATE,
    CONSTRAINT pk_or PRIMARY KEY (order_return_id),
    CONSTRAINT fk_or_co FOREIGN KEY 
               (cruise_order_id)
                REFERENCES cruise_orders (cruise_order_id));

