package com.app.Capitulo_1_Dia_1.Understanding_the_Java_Class_Structure.Fields_and_Methods;

// Una clase publica animal declarada - tiene que ser igual al nombre del archivo .java
// sino no podria compilar y generaria un error.
public class Animal {
    // Variable de instancia
    String name; // Tipo String, no hay valor asignado. Inicializa con null
    int age; // Tipo de dato int, no hay valor asignado. Inicializa con 0 y eso un dato primitivo.

    // Metodo que retorna el valor Name
    public String getName() { // Metodo public que retorna un String, no recibe ningun parametro.
        return name; // Retorna el valor de la variable name. Aunque es null, no va a generar errores
    } // Metodos siempre terminan con llaves {}, nunca con punto y coma ;. Si termina con ; no compila.

    // Metodo asigna un valor
    public void setName(String newName){ // Es un metodo public, que no retorna ningun valor debido 
    // al void pero recibe un parametro de tipo String dentro del metodo. Parametro newName
        name = newName; // Asigna el valor del parametro newName a la variable name.
        // El valor sigue siendo null, hasta que se le asigne un valor a la variable name.
    } // Siempre terminar con llaves {}, nunca con punto y coma ;. Si termina con ; no compila.

    public static void main(String[] args) {
        // Creamos un objeto Animal
        Animal animal = new Animal(); // Se crea un objeto de tipo Animal y se le asigna
        // a la variable animal. Se llama al constructor por defecto de la clase Animal.
        /*
        public Animal(){
            // Es el constructor por defecto de la clase Animal, no se mira en el codigo
            // esto se ejecuta autom. cuando se crea un objeto y se visualiza en el .class
        }
        */
        // Le brindamos un valor a la variable
        animal.setName("Firulais"); // El valor de la variable name es asignado y 
        // ahora es reemplazado por el valor null que tenia valiendo "Firulais". Ese es su
        // nuevo valor de newName.
        //Imprimimos el valor de la variable
        System.out.println(animal.getName()); // Se imprime el valor de la variable name, el
        // es cual ahora imprimira "Firulais" y no null. Ya que estamos trayendo el valor de 
        // la variable name que tiene el metodo getName().
    }
}
