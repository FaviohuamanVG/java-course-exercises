package com.app.Capitulo_2_Dia_3.Understanding_Java_Statements.The_if_then_else_Statement;

public class ThenElse {
    /* If-then-else statement 
    *
    * Con else tenemos una segunda posibilidad:
    *  - solamente se ejecuta una de las dos ramas.
    */

    public static void main(String[] args) {
    
    int hourOfDay = 10;
    
        if(hourOfDay < 11) {
            System.out.println("Good Morning");
        }
        
        // Los dos sentencias if son totalmente independientes.
        
        if(hourOfDay >= 11) {
            System.out.println("Good Afternoon");
        }

        // Es un if-then-else statement, solamente se ejecuta una de las dos ramas.

        if(hourOfDay < 11) {
            System.out.println("Good Morning");
        } else {
            System.out.println("Good Afternoon");
        }

        // Podemos tener más de dos posibilidades con el else if:
        if(hourOfDay < 11) {
            System.out.println("Good Morning");
        } else if(hourOfDay < 15) {
            System.out.println("Good Afternoon");
        } else {
            System.out.println("Good Evening");
        }

        // Tambien se puede hacer que el orden de las condiciones hace que el else if sea inalcanzable.
        if (hourOfDay < 15) {
            System.out.println("Good Afternoon");
        } else if (hourOfDay < 11) {
            System.out.println("Good Morning"); // UNREACHABLE CODE
        } else {
            System.out.println("Good Evening");
        }

    }

}
