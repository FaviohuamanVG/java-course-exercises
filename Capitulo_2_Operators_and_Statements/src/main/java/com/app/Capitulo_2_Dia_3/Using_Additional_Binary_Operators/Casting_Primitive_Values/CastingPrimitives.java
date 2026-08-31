package com.app.Capitulo_2_Dia_3.Using_Additional_Binary_Operators.Casting_Primitive_Values;

public class CastingPrimitives {
    public static void main(String[] args) {
        /*
        *   Casting de tipos primitivos
        * - Quiero convertir este valor a este otro tipo.
        *  - Se escribe colocando el tipo entre paréntesis:
        */ 

        int x = (int)1.0; // double → int

        /*
        Estamos realizando un cast explicito, ya que estamos queriendo
        convertir un tipo de dato double a un tipo de dato int, a lo 
        cual no se puede realizar de una manera implicita, lo que debemos
        utilizar int variable = (tipoDato)valor;
        */


        short y = (short)1921222; // 20678 
        // Compila pero el valor no se representa como un short.

        /*
        Se realiza un cast explicito, ya que estamos queriendo convertir 
        un tipo de dato int a un tipo de dato short, a lo cual no se puede
        realizar de una manera implicita, lo que debemos utilizar 
        short variable = (tipoDato)valor;
        */


        int z = (int)9l; 

        /*
        Se quiere convertir un tipo dato long a un tipo de valor int,
        esto se realiza mediante un cast explicito, ya que no se puede
        realizar de manera implicita generando error de compilacion.
        */

        long t = 192301398193810323L;
        /*
            Overflow:
            - Cuando un valor es demasiado grande para el tipo de datos, se produce un desbordamiento.
            - El valor se ajusta al rango del tipo de datos.
        */

        System.out.print(2147483647 + 1); // -2147483648
        /*
        El valor 2147483647 es el valor maximo que puede tener un tipo de 
        dato int, al sumarle 1 se produce un overflow, lo que hace 
        que el valor se ajuste al rango del tipo de datos, generando un
        resultado de -2147483648.
        */

        /* 
        Casos donde no compila:
            short x = 10;
            short y = 3;
            short z = x * y; // DOES NOT COMPILE
            Si bien x e y son short, el resultado de la multiplicación es int por defecto.
        */

        /*
        No podemos realizar una operacion de multiplicacion entre 2 variable short
        ya que el resultado de la multiplicacion es int por defecto, lo que genera
        un error.
        */

        short a = 10;
        short b = 3;
        short c = (short)(a * b);

        /*
        Este tipo de operacion si genera una compilacion correcta, ya que
        estamos realizando un cast explicito, ya que el resultado de la
        multiplicacion es int por defecto, y lo estamos convirtiendo a short
        mediante un cast explicito.
        
        */

        System.out.println("\r\nCasting Primitive Values");

    }
}
