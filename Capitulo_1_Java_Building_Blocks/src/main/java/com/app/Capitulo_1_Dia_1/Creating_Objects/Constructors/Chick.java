package com.app.Capitulo_1_Dia_1.Creating_Objects.Constructors;

public class Chick {
    public Chick() {
        System.out.println("in constructor");
    }

    public void Chick(){
        // Esto no es un constructor, es un metodo con el
        // mismo nombre de la clase, la diferencia entre
        // un metodo y un constructor es que el metodo
        // ahora mismo tiene un valor de retorno void,
        // mientras que el constructor no tiene valor de retorno.
    }

    /*
    public Chick() es el constructor de la clase Chick.
    No tiene un valor de retorno y tiene el mismo nombre
    que la clase. Aqui no se creara un constructor por
    defecto pq ya esta integrado manualmente.
    Imprime en la consola "in constructor".
    */

    public static void main(String[] args) {
        new Chick();
        // Al utilizar new Chick(), se ejecuta automáticamente el constructor.
    }
}
