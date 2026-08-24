package Introducing_Class_Inheritance.Defining_Constructors;

public class Zebra extends Animal{

    public Zebra(int age){
        super(age); // Invoca al constructor de la clase padre Animal.
        // Aqui el hijo pasa el argumento.
    }

    public Zebra(){ // Delega el valor 4 a age, no llama al padre directamente.
        this(4);
    }

    public static void main(String[] args) {
        System.out.println("Defining Constructors");
        System.out.println("Zebra extends Animal, delega el valor 4 a age.");
    }

}
