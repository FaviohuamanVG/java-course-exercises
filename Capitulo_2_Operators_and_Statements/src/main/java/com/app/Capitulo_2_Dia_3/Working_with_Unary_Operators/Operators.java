package com.app.Capitulo_2_Dia_3.Working_with_Unary_Operators;

public class Operators {
    public static void main(String[] args) {

        /* Operadores unarios 
        * - Trabaja con un solo operando
        * int x = 5;
        * x++; // Incremento en 1
        */
       // Operadores conocidos: +
        int x = +5; // Operador unario positivo + <-- Indicamos que es positivo

        // Operadores conocidos: -
        int y = -x; // Operador unario negativo - <-- Indicamos que es negativo
        /*
        * x= 5 , y = -5
        */

        // Operadores conocidos: ++
        int z = 6;
        z++; // Incremento en 1 - Ahora z = 7

        // Operadores conocidos: --
        int h = 7;
        h--; // Decremento en 1 - Ahora h = 6

        // Operadores conocidos: ! (trabaja con boolean)
        boolean isTrue = true; // Negacion logica
        // !isTrue; // Ahora isTrue = false

        System.out.println("Working with Unary Operators");

    }
}
