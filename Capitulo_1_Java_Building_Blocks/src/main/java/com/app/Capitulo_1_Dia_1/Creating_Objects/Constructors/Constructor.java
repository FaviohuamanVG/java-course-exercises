package com.app.Capitulo_1_Dia_1.Creating_Objects.Constructors;

public class Constructor {
    public static void main(String[] args) {
        
       // Random r = new Random(); 
       // Random es el tipo de variable, r es el nombre de la variable y new Random() es la instancia del objeto.

        Chick chick = new Chick();
        // Al utilizar new Chick(), se ejecuta automáticamente el constructor.

    }
}

// Constructor:
// 1. Tiene el mismo nombre que la clase.
// 2. No tiene tipo de retorno.
class Chick {
    public Chick(){
        System.out.println("in constructor");
    }
}

/*
Son clases que se utilizan para crear objetos.
Tienen un constructor que no tiene tipo de retorno
y debe tener el mismo nombre que la clase
el constructor imprime un mensaje en la consola
"in constructor"
*/

// Inicialización de campos.
class Chicken {

    int numEggs = 0;
    String name;

    public Chicken(){
        name = "Duke";
    }
}


