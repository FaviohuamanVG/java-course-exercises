package com.app.Working_with_Binary_Arithmetic_Operators.Numeric_Promotion;

public class NumericPromotion {
    /* Numeric Promoticon (promocion numerica).
    * Java puede cambiar automaticamente el tipo de dato durante una operacion
    * - Java puede convertir autom. un tipo pequeño
    *  en uno más pequeño.
    */
    public static void main(String[] args) {
        // Long en Suma con Int
        int x = 4;
        long y = 5;
        long z = x * y;
        System.out.println("Resultado de la multiplicacion: " + z);

        /*
        * int ---- long (int se convierte o promociona a long)
        * long --- long
        * long
        * 
        */

        // Float en Suma con Double
        /*double a = 39.21;
        float f = 2.1; // Esto no compila. (2.1 es double por defecto)
        */
       double a = 39.21;
       float f = 2.1f; // Esto compila. (debemos poner f al final del valor para float)
       double d = a + f;
       System.out.println("Resultado de la suma: " + d);

       // Short en Division con Short
       short c = 10;
       short g = 3;
       // short h = c / g; // Esto no compila. (c / g es int por defecto)
       int h = c / g;
       System.out.println("Resultado de la division: " + h);

       // Short, FLoat y Double en operaciones
       /* 
        * Se aplican multiples reglas de las promociones
        * 
        */
       short s = 14;
       // s -> se promociona primero a int luego a float
       float i = 13;
       // Ahora si podemos multiplicar float pq short es float
       double k = 30;
       // Para finalizar con la division de float y double, float se promociona a double
       double xs = s * i / k;
       System.out.println("Resultado de la operacion: " + xs);



    }

}
