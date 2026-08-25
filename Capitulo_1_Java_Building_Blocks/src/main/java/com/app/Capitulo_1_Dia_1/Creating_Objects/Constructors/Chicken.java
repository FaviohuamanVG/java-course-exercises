package com.app.Capitulo_1_Dia_1.Creating_Objects.Constructors;

public class Chicken {

    int numEggs = 0;
    String name;

    /*
    Estamos definiendo las variables de instancia numEggs y name para la clase Chicken.
    numEggs ya esta inicializado con 0, es un tipo de dato int primitivo.
    Mientras que name es un tipo de dato String, el cual no esta inicializado, por lo tanto
    su valor por defecto es null. Hasta que se le reasigne un nuevo valor.
    */

    public Chicken(){
        name = "Duke";
        // Colocamos un mensaje en la consola para mostrar el valor de la variable name.
        System.out.println("Name is: " +name);
    }

    /*
    Tenemos un constructor con el mismo nombre de la clase, sin parametros, que esta inicializando
    la variable de instancia tipo String name el cuale le esta dando un valor "Duke" que es de
    tipo String osea una cadena de caracteres.
    */

    public static void main(String[] args) {
        new Chicken();
        // Al utilizar new Chicken(), se ejecuta automáticamente el constructor.
    }


}
