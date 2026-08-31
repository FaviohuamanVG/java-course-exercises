package com.app.Capitulo_2_Dia_3.Using_Additional_Binary_Operators.Logical_Operators;

public class OperatorsLogic {
    public static void main(String[] args) {
        /* Operadores lógicos(cortocircuito) 
            Sirven para combinar o evaluar condiciones booleanas (true o false).
            && — AND lógico ->  Solo da true cuando ambos valores son true.
            || — OR lógico ->  Da false únicamente cuando ambos son false.
        */

        /*  Tambien existen los operadores lógicos y bitwise:
        & (AND/Y)- Las 2 condiciones deben ser verdaderas para que el resultado
        sea verdadero.
        |(OR inclusivo/O) - Al menos una de las condiciones debe de ser verdaderas para que
        el resultado sea verdadero.
        ^ (XOR/O exclusivo) - Si las 2 condiciones son iguales, el resultado es false.
        Pero si las 2 condiciones son diferentes, el resultado es true.
        */

        /*boolean x = true;
        boolean y = false;
        */
        // x && y -- ¿x Y y son verdaderos?

        // boolean c = true || (y < 4);  // En un OR (||), si uno de los lados es 
        // true, el resultado siempre será true.


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
        * Termina la evaluación de la expresión.
        * a.getValue() → NO se ejecuta.
        * Esto no provoca NullPointerException.
        * Si a no es null:
        * a != null → true
        * a.getValue() → se ejecuta.
        * Esto es lo que se conoce como "cortocircuito".
        */

        /* 
        if(a != null & a.getValue() < 5) { // Throws an exception if x is null
            // Do something
        }

        Esto provoca NullPointerException, ya que el operador & no 
        es un operador de cortocircuito, por lo que se ejecuta 
        a.getValue() aunque a sea null.


        */

        // boolean x = true || (c < 4);
        /*
        Este operador es un operador de cortocircuito, por lo que 
        si la primera condicion es verdadera, no se ejecuta la 
        segunda condicion, ya que el resultado siempre sera verdadero.
        */

        int x = 6;
        boolean y = (x >= 6) || (++x <= 7);
        System.out.println(x);



    }
}
