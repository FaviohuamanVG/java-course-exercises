package com.app.Capitulo_2_Dia_3.Using_Additional_Binary_Operators.Assignment_Operators;

public class Operators {
    public static void main(String[] args) {
        /*
        * Operador de asignación
        * 
        * 
        */
        // el mas basico -->  =
        int x = 1;
        // Guarda el valor 1 dentro de la variable x.

        // No se puede asignar un valor double a una variable int

        /* 
        int x = 1.0; // DOES NOT COMPILE
        // Porque 1.0 es considerado un double. Y un valor double 
        // nunca puede guardarse como int, genera un error de
        // compilacion
        
        short y = 1921222; // DOES NOT COMPILE
        // 1921222 es demasiado grande para un short. Es un valor no
        // soportado por short, genera un error de compilacion.

        int z = 9f; // DOES NOT COMPILE
        // Este número es float. Un tipo de dato float genera un error
        // de compilacion al intentar asignarlo a un tipo de dato int.

        long t = 192301398193810323; // DOES NOT COMPILE
        // Ese número es demasiado grande para int. El tipo de dato long
        // es más grande que int, por lo que genera un error de compilacion.
        */

        System.out.println("Using Additional Binary Operators - Assignment Operators");
        System.out.println(x);
        
    }
}
