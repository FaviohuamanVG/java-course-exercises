package com.app.Capitulo_1_Dia_2.Declaring_and_Initializing_Variables.Identifiers;

public class Identifiers {

    public static void main(String[] args) {

        // The following examples are legal:
        int okidentifier;
        String $OK2Identifier;
        String _alsoOK1d3ntifi3r;
        int __SStillOkbutKnotsonice$;

        System.out.println("Legal identifiers");

        // The following examples are illegal:
        // int 3DPointClass;
        // String hollywood@vine;
        // String *$coffee;
        // String public;

        System.out.println("Illegal identifiers");
    }

    /*
    Son las reglas exactas que permite Java para que los nombres (variable, metodo, clase, etc.) sean
    legales:
    -- Un identificador es un nombre cualquiera que nosotros le damos al codigo:
    Solo tiene 3 reglas importantes:
    1. Un identificador puede contener letras, digitos, el simbolo de dolar ($) y el guion bajo (_).
    2. Un identificador no puede empezar con un digito.
    3. Un identificador no puede ser una palabra reservada de Java.

    int $ossi3 = 5; // legal
    int _023iid = 5: // legal
    int Assfw = 5; // legal

    Aunque java permite el uso de Mayusculas y minusculas, sigue un estandar de nomenclatura que es el
    camelCase que consiste en las primeras letras pueden ir en minusculas y las siguientes en mayusculas.

    Por ejemplo: int myVariable = 5; // legal

    -- Pero hay veces en las cuales las reglas se rompen y no permiten compilar el codigo, por ejemplo:
    int 3DPointClass; // illegal
    // Empieza con un numero lo cual es ilegal y genera un error de compilacion.
    int hollywood@vine; // illegal
    // Contiene un simbolo que no es permitido lo cual es ilegal y genera un error de compilacion.
    int *$coffee; // illegal
    // Contiene un simbolo que no es permitido lo cual es ilegal y genera un error de compilacion.
    int public; // illegal
    // Es una palabra reservada de Java lo cual es ilegal y genera un error de compilacion.

    Java no permite el uso de caracteres especiales @, *, %, etc.

    */
}