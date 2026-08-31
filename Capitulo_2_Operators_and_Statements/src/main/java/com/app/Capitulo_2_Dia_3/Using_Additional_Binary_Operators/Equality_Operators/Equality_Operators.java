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

        /*
        Son valores totalmente incompatibles, no se pueden
        comparar entre un boolean con un int, un boolean 
        con un String y un boolean asignarle int y compararlo
        con un String.
        */

        boolean y = false;
        boolean x = (y = true); // La asignación y = true devuelve true, por eso x también recibe true.
        System.out.println(x); // Outputs true

        /*
        Primero le asignamos un valor boolean a la variable y, luego
        en la variable x se le asigna el valor de y, que es true, por
        lo que se le esta reasignando el valor de y a x, y luego se 
        imprime el valor de x, que es true.
        */

        File t = new File("myFile.txt");
        File h = new File("myFile.txt");
        File j = t;
        System.out.println(t == h); // Outputs false t y h apuntan a objetos diferentes.
        System.out.println(t == j); // Outputs true t y j apuntan al mismo objeto.

        /*
        Aqui estamos comparando 2 objetos de tipo File, donde
        t y h son creados como 2 objetos diferentes, por lo cual
        al compararlos con el operador == nos devuelve false, ya que
        son 2 objetos diferentes, mientras que t y j apuntan al mismo
        objeto, por lo cual al compararlos con el operador == nos devuelve
        true, ya que son el mismo objeto.
        */

    }
}
