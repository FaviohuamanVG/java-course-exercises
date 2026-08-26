package com.app.Capitulo_1_Dia_2.Declaring_and_Initializing_Variables;

public class Declaration {

    public static void main(String[] args) {
        // Declaracion
        String zooName;
        int numberAnimals;

        // Inicialización
        zooName = "The Best Zoo";
        numberAnimals = 4;

        System.out.println(zooName);
        System.out.println(numberAnimals);

    }

    /*
    Podemos declarar variables sin inicializarlas, tendran su valor x default segun su tipo de dato.
    Pero no podemos cambiar su valor hasta inicializarlas, de lo contrario seguiran con su valor.
    
    // Declaracion de variables:
    String zooName; -- Esto es una declaracion de variable de tipo String, no tiene un valor asignado
    por lo tanto, zooName es null ya que String es un objeto y esto x default son null.

    int numberAnimals; -- Esto es una declaracion de variable de tipo int, al igual que String no
    tiene un valor asignado, por lo tanto numberAnimals es 0 ya que int es un tipo primitivo.

    // Inicializacion de variables:
    zooName = "The best Zoo"; -- Estamos inicializando una variable de tipo String, su valor
    ya no es null, ahora se redirigio y tiene un valor asignado "The best Zoo" de tipo String.

    numberAnimals = 4; -- Estamos inicializando una variable de tipo int, su valor ya no es 0,
    ahora se redirigio y tiene un valor asignado 4 de tipo int.

    */

}   
