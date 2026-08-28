package com.app.Capitulo_2_Dia_3.Working_with_Binary_Arithmetic_Operators.Numeric_Promotion;

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
        Pq int pasa a long? Esto es pq long es mas grande que int, java
        no puede convertir long a int pq no convertiria un valor grande 
        a uno pequeño, existen reglas de promocion numerica.


        */

        // Float en Suma con Double
        /*double a = 39.21;
        float f = 2.1; // Esto no compila. (2.1 es double por defecto)
        */
       double a = 39.21;
       float f = 2.1f; // Esto compila. (debemos poner f al final del valor para float)
       double d = a + f;

        /*
        En los decimales, double es mas grande que float, entonces float es el que debe
        promocionarse a double para que se logre hacer la operacion. Siguiendo la regla
        de promocion numerica.
        */

       System.out.println("Resultado de la suma: " + d);

       // Short en Division con Short
       short c = 10;
       short g = 3;
       // short h = c / g; // Esto no compila. (c / g es int por defecto)
       int h = c / g;

       /*
       Tanto byte, char y short son datos pequeños, diminutos a los cuales
       estos siempre seran promocionados a int, para que se pueda realizar
       la operacion.
       */

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

        /*
        Se convierte short a float, pq de igual manera float es mas grande que short, luego
        el resultador de la multiplicacion es float, y luego se divide entre double, 
        entonces float se promociona a double.
        */

       System.out.println("Resultado de la operacion: " + xs);



    }

}
