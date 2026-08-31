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

        /*
        Aqui no incluimos un else, por lo que si la 
        condicion no se cumple, no se imprime nada.
        */
        
        // Los dos sentencias if son totalmente independientes.
        
        if(hourOfDay >= 11) {
            System.out.println("Good Afternoon");
        }

        /*
        Nuevamente, aqui no incluimos un else, por lo que si la
        condicion no se cumple, no se imprime nada.
        */

        // Es un if-then-else statement, solamente se ejecuta una de las dos ramas.

        if(hourOfDay < 11) {
            System.out.println("Good Morning");
        } else {
            System.out.println("Good Afternoon");
        }

        /*
        Estamos incluyendo un else, lo que tenemos 2 caminos a
        seguir, si la condicion se cumple, se imprime el mensaje
        "Good Morning", si no se cumple la condicion, se imprime
        el mensaje "Good Afternoon".
        */


        // Podemos tener más de dos posibilidades con el else if:
        if(hourOfDay < 11) {
            System.out.println("Good Morning");
        } else if(hourOfDay < 15) {
            System.out.println("Good Afternoon");
        } else {
            System.out.println("Good Evening");
        }

        /*
        Podemos tener mas de 2 posibilidades con el else if, 
        donde podemos tener hasta 3 caminos a seguir, si la 
        primera no se cumple, se evalua la segunda condicion, 
        si esta se cumple se imprime el mensaje "Good Afternoon", 
        si no se cumple ninguna de las 2 condiciones, se imprime el mensaje
        "Good Evening".
        */

        // Tambien se puede hacer que el orden de las condiciones hace que el else if sea inalcanzable.
        if (hourOfDay < 15) {
            System.out.println("Good Afternoon");
        } else if (hourOfDay < 11) {
            System.out.println("Good Morning"); // UNREACHABLE CODE
        } else {
            System.out.println("Good Evening");
        }

        /*
        Asi mismo hacemos que el orden de las condiciones 
        hace que el else if sea inalcanzable y no se
        ejecute nunca, si la primera condicion se cumple.
        */
        

    }

}
