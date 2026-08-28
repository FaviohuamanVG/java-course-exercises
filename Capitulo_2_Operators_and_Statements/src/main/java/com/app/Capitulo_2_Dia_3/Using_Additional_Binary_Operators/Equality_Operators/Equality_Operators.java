package com.app.Capitulo_2_Dia_3.Using_Additional_Binary_Operators.Equality_Operators;
import java.io.File; // Importa la clase File para poder crear objetos de tipo File.


public class Equality_Operators {
 /* Operadores de igualdad
    Sirven para comparar dos valores y determinar si son iguales o no.
    == — Igualdad -> Devuelve true si ambos valores son iguales.
    != — Desigualdad -> Devuelve true si ambos valores son diferentes.
 */
    public static void main(String[] args) {
        
        /*boolean a = true == 3; // DOES NOT COMPILE
        // no se puede comparar un boolean con un número.
        boolean v = false != "Giraffe"; // DOES NOT COMPILE
        // no se puede comparar un boolean con una cadena.
        boolean c = 3 == "Kangaroo"; // DOES NOT COMPILE
        // no se puede comparar un número con una cadena.*/

        boolean y = false;
        boolean x = (y = true); // La asignación y = true devuelve true, por eso x también recibe true.
        System.out.println(x); // Outputs true

        File t = new File("myFile.txt");
        File h = new File("myFile.txt");
        File j = t;
        System.out.println(t == h); // Outputs false t y h apuntan a objetos diferentes.
        System.out.println(t == j); // Outputs true t y j apuntan al mismo objeto.
    }
}
