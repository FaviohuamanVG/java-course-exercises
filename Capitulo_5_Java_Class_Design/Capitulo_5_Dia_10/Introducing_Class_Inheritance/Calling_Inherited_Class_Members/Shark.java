package Introducing_Class_Inheritance.Calling_Inherited_Class_Members;

public class Shark extends Fish1{
    private int numberOffins = 8;

    public Shark(int age){
        super(age);
        this.size = 6;
    }

    /*  
    public void displaySharkDetails() {
        System.out.println("Shark with age: " + getAge());
        System.out.println(" and " + size + "metters long");
        System.out.println(" with " + numberOffins + " fins");
    }
    */

    // Version con this
    /* 
    public void displaySharkDetails() {
        System.out.println("Shark with age: " + this.getAge());
        System.out.println(" and " + this.size + "metters long");
        System.out.println(" with " + this.numberOffins + " fins");
    } 
    */

    // Version con super
    public void displaySharkDetails() {
        System.out.println("Shark with age: " + super.getAge());
        System.out.println(" and " + super.size + "metters long");
        System.out.println(" with " + this.numberOffins + " fins");
    }

    public static void main(String[] args) {
        Shark shark = new Shark(5);
        shark.displaySharkDetails();
    }

    /* 
    // Error de compilacion:
    public void displaySharkDetails() {
        System.out.println("Shark with age: " + super.getAge());
        System.out.println(" and " + super.size + "metters long");
        System.out.println(" with " + super.numberOffins + " fins");
        // Error de compilacion: numberOffins es privado en Shark, super() solo ve los miembros
        de Fish y numberOffins no existe en fish es un error de compilacion.
    }
    */
}
