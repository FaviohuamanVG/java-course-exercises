package com.app.Understanding_the_Java_Class_Structure.Fields_and_Methods;

public class Animal {
    // Variable de instancia
    String name;

    // Metodo que retorna el valor Name
    public String getName() {
        return name;
    }

    // Metodo asigna un valor
    public void setName(String newName){
        name = newName;
    }

    public static void main(String[] args) {
        // Creamos un objeto Animal
        Animal animal = new Animal();
        // Le brindamos un valor a la variable
        animal.setName("Firulais");
        //Imprimimos el valor de la variable
        System.out.println(animal.getName());
    }
}
