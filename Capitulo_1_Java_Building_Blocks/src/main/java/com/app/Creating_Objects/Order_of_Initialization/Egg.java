package com.app.Creating_Objects.Order_of_Initialization;

public class Egg {

    // El constructor se ejecutará después
    // de los campos y bloques de instancia.
    public Egg() {
        number = 5;
    }

    public static void main(String[] args) {

        // Se crea el objeto.
        Egg egg = new Egg();

        // Se imprime el valor final de number.
        System.out.println(egg.number);
    }

    // Primero se inicializa en 3.
    private int number = 3;

    // Después se cambia a 4.
    {
        number = 4;
    }
}