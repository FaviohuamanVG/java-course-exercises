package com.app.Capitulo_1_Dia_2.Destroying_Objects.Garbage_Collection;

public class Scope {

    public static void main(String[] args) {

        String one, two;

        // Se crea el objeto "a" y one apunta hacia él.
        one = new String("a");

        // Se crea el objeto "b" y two apunta hacia él.
        two = new String("b");

        // one deja de apuntar a "a" y ahora apunta a "b".
        // El objeto "a" queda elegible para Garbage Collection.
        one = two;

        // three también apunta al objeto "b".
        String three = one;

        // one deja de apuntar a "b".
        // "b" sigue siendo accesible mediante two y three.
        one = null;

        System.out.println("Garbage Collection");
    }
}
