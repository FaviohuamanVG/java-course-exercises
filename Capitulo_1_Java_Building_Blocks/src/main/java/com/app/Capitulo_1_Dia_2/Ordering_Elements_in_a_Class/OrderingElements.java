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

    // Los comentarios pueden estar en cualquier lugar:
    /*
    /* header 
    package structure;

    // class Meerkat
    public class Meerkat {
    }
    */

    // Ejemplo que NO compila:
    /*
    import java.util.*;

    package structure; // DOES NOT COMPILE

    String name; // DOES NOT COMPILE

    public class Meerkat {
    }
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