package com.app.Capitulo_2_Dia_3.Using_Additional_Binary_Operators.Logical_Operators;

public class OperatorsLogic {
    public static void main(String[] args) {
        /* Operadores lógicos 
            Sirven para combinar o evaluar condiciones booleanas (true o false).
            && — AND lógico ->  Solo da true cuando ambos valores son true.
            || — OR lógico ->  Da false únicamente cuando ambos son false.
        */

        /*boolean x = true;
        boolean y = false;
        */
        // x && y -- ¿x Y y son verdaderos?

        // boolean c = true || (y < 4);  // En un OR (||), si uno de los lados es true, el resultado siempre será true.


        /*if(a != null && a.getValue() < 5) {
            // Do something
        }*/

        /*
         * Como && necesita que AMBAS condiciones sean true,
        * Java ya sabe que el resultado será false.
        * Por eso NO ejecuta a.getValue().
        * Esto evita un NullPointerException.
        */

        /*if(a != null && a.getValue() < 5) {
            // Do something
        }*/

        /*
        * Si a es null:
        * a != null → false
        * a.getValue() → intenta ejecutarse
        * Esto provoca NullPointerException.
        */

        int x = 6;
        boolean y = (x >= 6) || (++x <= 7);
        System.out.println(x);



    }
}
