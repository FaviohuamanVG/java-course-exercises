package com.app.Capitulo_1_Dia_1.Understanding_Package_Declarations_and_Imports.Redundant_Imports;

import java.lang.System; // Redundante (java.lang se importa solo)
import java.lang.*;      // Redundante (java.lang se importa solo)
import java.util.Random;
import java.util.*;      // Redundante (Random ya está importado arriba)

public class ImportExample {
    public static void main(String[] args) {
        Random r = new Random();
        System.out.println(r.nextInt(10));
    }

    /*
    Existen importacion necesarias y redundantes.
    - Al realizar una importacion de un paquete, solo seria necesario
    importar la clase que vas a utilizar.
    - Pero podemos realizar 2 importaciones de la misma clase, una con
    el nombre completo y otro con una wildcard y asi hacerla redundante.

    import java.util.Random; El import necesario para utilizar la clase Random.
    pero nuevamente realizar: import java.util.*; ya es hacerlo redundante, ya
    que la clase Random ya fue importada y no es necesario tener que volver 
    a realizar la importacion.

    Algo parecido sucede si importamos el paquete java.lang, debido a que
    el java.lang es una importacion x defecto, no es necesario realizar una
    importacion de ese paquete, los cual estos los hacen redundante.

    import java.lang.System; // Redundante (el sistema lo importa automaticamente)
    import java.lang.*; // Redundante (el sistema lo importa automaticamente)

    */

}