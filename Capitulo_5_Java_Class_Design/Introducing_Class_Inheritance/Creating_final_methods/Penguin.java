package Introducing_Class_Inheritance.Creating_final_methods;

public class Penguin extends Bird {
    
    /*
    public final boolean hasFeathers() { // DOES NOT COMPILE.
        return false;
        // Al estar marcado como final desde la clase padre, eso le permite que ninguna otra subclase
        // puede redefinir ese metodo. Bajo ninguna sircunstancia.
    }
    */

    public static void main(String[] args) {
        System.out.println("Creating Final Methods");
        System.out.println("Los metodos finales no pueden ser redefinidos en las subclases. Esto es util para evitar que se cambie el comportamiento de un metodo que es critico para la clase padre.");
    }

}
