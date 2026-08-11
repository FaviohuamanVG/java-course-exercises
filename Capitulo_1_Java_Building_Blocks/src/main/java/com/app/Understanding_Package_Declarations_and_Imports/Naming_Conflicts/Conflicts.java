package com.app.Understanding_Package_Declarations_and_Imports.Naming_Conflicts;
import java.util.Date;

public class Conflicts {

    // java.util.Date
    Date date;

    // java.sql.Date
    java.sql.Date sqlDate;

} 

/*
 * Naming Conflicts
 *
 * java.util.Date
 * java.sql.Date
 *
 * Si utilizamos:
 *
 * import java.util.*;
 * import java.sql.*;
 *
 * Date es ambiguo porque existen dos clases con el mismo nombre.
 *
 * Solución:
 *
 * 1. Import explícito:
 *    import java.util.Date;
 *
 * 2. Utilizar el nombre completo:
 *    java.sql.Date
 *
 * Un import explícito tiene prioridad sobre un wildcard.
 */