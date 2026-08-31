package com.app.Capitulo_1_Dia_1.Creating_Objects.Reading_and_Writing_Object_Fields;

public class Name {

    String first = "Theodore"; // set variable
    String last = "Moose"; // set variable
    String full = first + last; // get variable

    /*
    Aqui tenemos 2 set en las variables first y last, pero no tenemos un set en la variable full
    esto debido a que full no es un set es un get de firs y last, por lo que ya no se podria
    modificar sino que ahora solo se puede leer.

    y al final nos dara el resultado de la variable full. La cual es la concatenacion de las
    variable first y last. Por lo que el resultado sera "TheodoreMoose"
    */

    public static void main(String[] args) {
        Name name = new Name();
        System.out.println(name.full); // get variable
    }
}
