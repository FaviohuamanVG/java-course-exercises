package com.app.Capitulo_1_Dia_2.Declaring_and_Initializing_Variables.Declaring_Multiple_Variables;

public class MultipleVariables {

    public static void main(String[] args) {

        // Múltiples variables del mismo tipo
        String s1, s2;

        // Variables inicializadas
        String s3 = "yes", s4 = "no";

        // Variables declaradas pero solo i3 es inicializada
        int i1, i2, i3 = 0;

        // No compila: no se pueden mezclar tipos
        // int num, String value;

        // Declaración válida
        boolean b1, b2;

        // Declaración válida: solo s5 está inicializada
        String s5 = "1", s6;

        // No compila: no se puede repetir el tipo
        // double d1, double d2;

        // Dos declaraciones diferentes, ambas válidas
        int i5;
        int i6;

        // No compila: i4 no tiene tipo
        // int i7; int i8; int i9; i4;

        System.out.println("Multiple variables");
    }

    /*
    Java permite varias declaraciones de variables en una sola linea. Siempre y cuando
    compartan el mismo tipo de dato.

    Podemos declarar multiples variables String:
    String s1, s2, s3;
    -- Cada una es separada x una coma y comparten el mismo tipo de dato.
    -- Podemos declarar multiples variables int
    int i1, i2, i3;

    Asi mismo podemos declarar e inicializar variables multiples en una sola linea:
    int i1, i2, i3 = 0;

    Aqui podemos pensar que todas las variables i1, i2 y i3 apuntan a 0 pero la realidad es
    que solamente i3 es inicializado, los demas son variables declaradas pero tienen valor
    y se quedan con 0 x su valor por defecto.

    -- No podemos mesclar tipos de datos en una sola linea:
    String st = "yes", int i = 0; // DOES NOT COMPILE
    Esta es una sintaxis incorrecta pq no podemos declarar variables de diferentes tipos.

    -- Asi mismo no podemos repetir el tipo de dato:
    int i1, int i2; // DOES NOT COMPILE
    double d1, double d2; // DOES NOT COMPILE
    // Es un error de compilacion pq no podemos repetir el tipo de dato en la misma linea.

    -- Podemos declarar multiples variables en lineas
    int i1; int i2; int i3;
    -- Pero no podemos dejar una variable sin tipo de dato:
    int i1; int i2; int i3; i4; // DOES NOT COMPILE
    // i4, no tiene tipo de dato y es un error de compilacion.

    */
}