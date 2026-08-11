package com.app.Creating_Objects.Constructors;

public class Constructor {
    public static void main(String[] args) {
        
       // Random r = new Random(); 
       // Random es el tipo de variable, r es el nombre de la variable y new Random() es la instancia del objeto.

        Chick chick = new Chick();

    }
}

class Chick {
    public Chick(){
        System.out.println("in constructor");
    }
}

// Inializacion
class Chicken {

    int numEggs = 0;
    String name;

    public Chicken(){
        name = "Duke";
    }
}


