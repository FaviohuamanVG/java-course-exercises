package Introducing_Class_Inheritance.Defining_Constructors;

public class Gorilla extends Animal{
    public Gorilla(int age){ // Tenemos 2 constructores sobrecargados.
        super(age, "Gorilla");
        // 
    }

    public Gorilla(){ // Solo 1 constructor sobrecargado, delegado con el valor 5.
        this(5);
    }

    public static void main(String[] args) {
        System.out.println("Defining Constructors");
        System.out.println("Gorilla extends Animal, delega el valor 5 a age.");
    }

}
