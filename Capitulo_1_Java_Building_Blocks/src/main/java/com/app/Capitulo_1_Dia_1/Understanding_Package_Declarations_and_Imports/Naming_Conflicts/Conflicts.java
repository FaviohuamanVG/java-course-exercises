package com.app.Capitulo_1_Dia_1.Understanding_Package_Declarations_and_Imports.Naming_Conflicts;

// Dos wildcards → Date es ambiguo.
// import java.util.*;
// import java.sql.*;

// Import explícito + wildcard → funciona.
// import java.util.Date;
// import java.sql.*;

// Dos imports explícitos → NO COMPILA.
// import java.util.Date;
// import java.sql.Date;

// Solución final.
// Importamos una de las clases explícitamente.
import java.util.Date;

public class Conflicts {

    // Como java.util.Date está importado,
    // podemos utilizar simplemente Date.
    Date date;

    // Para utilizar la otra clase Date,
    // escribimos su nombre completamente calificado.
    java.sql.Date sqlDate;

    public static void main(String[] args) {

        Conflicts conflicts = new Conflicts();

        conflicts.date = new Date();
        conflicts.sqlDate = new java.sql.Date(System.currentTimeMillis());

        System.out.println(conflicts.date);
        System.out.println(conflicts.sqlDate);
    }

    /*
    En los imports pueden ver conflictos porque podemos tener 2 clases con el mismo nombre,
    pero en paquetes diferentes, como java.util.Date y java.sql.Date. Si realizamos esas
    importaciones

    // Con 2 wildcards.
    import java.util.*;
    import java.sql.*;

    - El compilador no sabra a que clase Date intentas llamar pq el wildcard trae las clases
    Date y el compilador tira el error de Date is ambiguos.

    Una solucion a ello es realizar un import explicito + wildcard:
    import java.util.Date;
    import java.sql.*;

    -- El import explicito siempre tiene prioridad sobre el wildcard. Mientras que util apunta
    al Date de java.util, java.sql apunta a sus otras clases y ya no compite x el Date.

    // Un caso sin solucion:
    import java.util.Date;
    import java.sql.Date;

    -- Ambos estan en conflicto, no pueden existir 2 importacion explicitas pq estas diciendo
    que ambas usen Default para Date, ademas que no debe existe 2 valores con el mismo nombre.
    // The import java.sql.Date collides with another import statement

    soluciones:
    import java.util.*;

    public class Conflicts {
        Date date; - - apunta a java.util.Date
        java.sql.Date sqlDate;
    }

    utilizamos una sola importacion con wildcard el cual apunta a java.util
    y usamos el nombre completo de la otra clase Date que apunta a java.sql.Date
    haciendo que de esta manera COMPILE.

    // No realizar ninguna import
    public class Conflicts {
        java.util.Date date; 
        java.sql.Date sqlDate;
    }

    utilizamos el nombre completo (clase + paquete) de ambas clases Date
    haciendo que compile.


    */

}