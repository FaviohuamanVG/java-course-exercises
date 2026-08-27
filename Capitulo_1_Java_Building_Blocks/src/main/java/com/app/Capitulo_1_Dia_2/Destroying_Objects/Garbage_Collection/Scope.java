package com.app.Capitulo_1_Dia_2.Destroying_Objects.Garbage_Collection;

public class Scope {

    public static void main(String[] args) {

        String one, two;
        /*
        Declaracion de variables tipo String a y b, los cuales no estan
        inicializadas y su valor es null.
        */

        // Se crea el objeto "a" y one apunta hacia él.
        one = new String("a");

        // Se crea el objeto "b" y two apunta hacia él.
        two = new String("b");

        /*
        Se crean 2 objetos de tipo String los cuales son apuntados a las
        variables one y two.
        one = "a" - one ahora apunta al objeto "a".
        two = "b" - two ahora apunta al objeto "b".
        */

        // one deja de apuntar a "a" y ahora apunta a "b".
        // El objeto "a" queda elegible para Garbage Collection.
        one = two;
        /*
        one deja de apuntar al objeto "a" y ahora apunta al objeto "b".
        El objeto "a" se queda sin referencia apuntadas a el y queda
        elegible para Garbage Collection.
        */

        // three también apunta al objeto "b".
        String three = one;

        /*
        Creamos una nueva variable de tipo String llamada three
        la cual esta apuntando al mismo objeto que one, asi que
        valen "b" y "b" respectivamente.
        */

        // one deja de apuntar a "b".
        // "b" sigue siendo accesible mediante two y three.
        one = null;

        /*
        one deja de apuntar al objeto "b" y ahora su valor apunta
        a null, pero el objeto "b" sigue siendo accesible
        mediante las variables two y three.
        */

        System.out.println("Garbage Collection");
        System.out.println("one: " + one);
        System.out.println("two: " + two);
        System.out.println("three: " + three);
    }
}
