package com.app.Capitulo_1_Dia_2.Ordering_Elements_in_a_Class;

// import java.util.*; // El import va después del package

public class OrderingElements {

    // Ejemplo correcto:
    /*
    package structure;
    import java.util.*;

    public class Meerkat {
        double weight;

        public double getWeight() {
            return weight;
        }

        double height;
    }
    */

    /*
    El paquete debe ir siempre en la primera linea del archivo - 1
    El import va despues del paquete, por lo general linea 2 - 3
    Luego del import llega la clase (mismo nombre que el archivo)
    -- Puede estar en la linea 3 o 2 si no existe ninguna importación
    Luego vienen los fields and methods a los cuales estos van
    en cualquier orden.
    */


    // Los comentarios pueden estar en cualquier lugar:
    /* header 
    package structure;

    // class Meerkat
    public class Meerkat {
    }

    Los comentarios pueden estar el cualquier lugar, no afectan
    al orden de los elementos del archivo y clase.
    Pero no pueden estar comentados junto a algun metodo, variable
    o import necesario sino afectara a la compilación del mismo.
    // public class Meerkat { <-- NO COMPILA
    }
    */

    // Ejemplo que NO compila:
    /*
    import java.util.*;
    package structure; // DOES NOT COMPILE
    String name; // DOES NOT COMPILE
    public class Meerkat {
    }

    No compilan por que no estan en su orden correcto, el package
    debe ir primero luego los imports y luego la clase.
    */

    // Varias clases en un mismo archivo:
    /*
    public class Meerkat {
    }

    class Paw {
    }
    */

    public static void main(String[] args) {
        System.out.println("Ordering Elements in a Class");
    }
}