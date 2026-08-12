package com.app.Understanding_Package_Declarations_and_Imports.Naming_Conflicts;

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

}