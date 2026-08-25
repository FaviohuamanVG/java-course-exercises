/*-------------------------------------------------
2.02 — Create a Simple Table
    - Creamos una tabla pero para poder crearla necesitamos
    definir: nombre_tabla, nombre_columnas, tipos_datos, etc.
    
    // CREATE objectType objectName atributos;
*/--------------------------------------------------
CREATE TABLE work_schedule(
work_schedule_id NUMBER, 
start_date DATE, 
end_date DATE
);

/*--------------------------------------------------
2.02 -Naming a Table or Other Object
      |
      |---> Quoted Names  
      
- Oracle permite aunque no es lo recomendado crear nombres
"Citados" o entre comillas
*/--------------------------------------------------
CREATE TABLE "Companies" (company_id NUMBER);

--- Asi mismo podemos llamar a la tabla "Companies"
SELECT * FROM "Companies";
-- Si creamos la tabla "Companies Employees" veremos que funciona igualmente
CREATE TABLE "Companies Employees"(
employees_id NUMBER, 
name VARCHAR2(35)
);
-- Y la podemos llamar igualmente:
SELECT * FROM "Companies Employees";
-- Pero si colocamos "COMPANIES EMPLOYEES" no lo llamara:
SELECT * FROM "COMPANIES EMPLOYEES";


/*
2.02 -- The SQL Statement CREATE TABLE
    En una base de datos aparte de poder crear simplemente
    columnas, tambien podemos crear constraint:
*/

CREATE TABLE cruises(
cruised_id NUMBER,
cruised_type_id NUMBER,
captain_id NUMBER,
ship_id NUMBER,
start_date DATE,
end_date DATE,
status VARCHAR2(10) DEFAULT 'DOCK',
CONSTRAINT cruises_pk PRIMARY KEY (cruised_id)
);


/*
2.03 - - Review the Table Structure
CREATE TABLE cruises(
cruised_id NUMBER,
cruised_type_id NUMBER,
captain_id NUMBER,
ship_id NUMBER,
start_date DATE,
end_date DATE,
status VARCHAR2(10) DEFAULT 'DOCK',
CONSTRAINT cruises_pk PRIMARY KEY (cruised_id)
);

*/

-- Si queremos verificar si la tabla a sido creada y se estructura:
DESC cruises

-- Con eso verificamos que columna tiene, datos, etc.


