package com.app.Capitulo_1_Dia_1.Creating_Objects.Order_of_Initialization;

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

    /*
    Primero se inicializa con los fields, el cual son las variables de la clase y nuestra
    variable esta definida + inicializada es un tipo String y su valor es "Fluffy" y de acceso privado.
    Luego se ejecutaria el instance initializer, que es un bloque de codigo que imprimira lo siguiente
    "setting field" y luego culminaria con el constructor el cual imprimira "setting constructor" y
    reasigna el valor de name a "Tiny" el cual es el valor final de name.

    entonces el orden de inicializacion es el siguiente:
    1# Siempre se inicia por el field de la clase - private String name = "Fluffy";
    2# Luego se ejecuta el instance initializer - {System.out.println("setting field");}

    nunca se ejecutara de esta forma:
    
    {System.out.println(name);}
    private String name = "Fluffy";

    Error de compilacion.

    3# Por ultimo se ejecuta el constructor. public Chick() {}

    field -> instance initializer -> constructor

    */
}