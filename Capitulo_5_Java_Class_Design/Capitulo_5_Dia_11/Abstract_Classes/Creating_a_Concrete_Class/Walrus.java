package Abstract_Classes.Creating_a_Concrete_Class;

public abstract class Walrus extends Animal { 
    // DOES NOT COMPILE
    //Declarada concreta, tiene la obligacion de implementar todos los metodos 
    // abstractos de la clase padre Animal.
    public abstract String getName();
    // Necesita de public abstract class Walrus extends Animal para compilar
}