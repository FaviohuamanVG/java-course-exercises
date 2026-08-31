package com.app.Capitulo_2_Dia_3.Using_Additional_Binary_Operators.Compound_Assignment_Operators;

public class Operators {
    public static void main(String[] args) {
        /*
            Operadores de asignación compuesta

        int x = 2, z = 3;
        x = x * z; // Simple assignment operator
        x *= z; // Compound assignment operator

        long x = 10;
        int y = 5;
        y = y * x; // DOES NOT COMPILE

        // Esto genera un error de compilacion ya que estamos intentando
        asignar un valor de tipo long a una variable de tipo int, lo cual
        no es permitido, ya que el tipo long es mas grande que el tipo int.

        long x = 10;
        int y = 5;
        y *= x;

        // Esto compila correctamente, ya que el operador de asignacion
        compound realiza un cast implicito, lo que esto permite que el
        valor de tipo long se pueda asignar a una variable de tipo int, ya
        que el operador de asignacion compuesta realiza un cast implicito.

        long x = 5;
        long y = (x=3);
        System.out.println(x); // Outputs 3
        System.out.println(y); // Also, outputs 3

        // Esto es una declaracion de 2 variables de tipo long, 
        // donde la variable x se le asigna primeramente el
        // valor de 5, luego se le asigna el valor de 3, y 
        // la variable y se le asigna el valor de x, que es 3, por lo que
        // al imprimir el valor de x y y, ambos nos dan 3.

    */

    int x = 2, z = 3;
    x = x * z; // Simple assignment operator
    x *= z; // Compound assignment operator

    /*
    Estamos realizando una operacion de asignacion compuesta, donde la variable
    x se multiplica por la variable z y el resultado se asigna a la variable x,
    lo que es equivalente a x = x * z.
    y su sintaxis es corta x *= z; // Compound assignment operator
    */

    System.out.println("Using Additional Binary Operators - Compound Assignment Operators");
    System.out.println(x);
    System.out.println(z);
    System.out.println("Operacion de asignacion compuesta: x *= z;");

    }
}
