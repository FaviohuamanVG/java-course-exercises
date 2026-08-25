package com.app.Creating_Objects.Order_of_Initialization;

public class Chick {

    // El campo se inicializa primero.
    private String name = "Fluffy";

    // Instance initializer.
    // Se ejecuta después del campo.
    {
        System.out.println("setting field");
    }

    // El constructor se ejecuta después del campo
    // y del instance initializer.
    public Chick() {
        name = "Tiny";
        System.out.println("setting constructor");
    }

    public static void main(String[] args) {

        // Se crea el objeto y comienza el orden de inicialización.
        Chick chick = new Chick();

        // Se lee el valor final de name.
        System.out.println(chick.name);
    }
}