package Applying_Access_Modifiers.Static_vs_Instance;

    /*
    La jerarquia de existencia entre Instancia y Static es la siguiente:
    1. Static pertenece a la clase, por lo que se puede acceder a él sin crear una instancia de la clase.
    2. Instancia pertenece a un objeto, por lo que se necesita crear una instancia
    */

public class Static {
        private String name = "Static class";
        public static void first() { }
        public static void second() { }
        public void third() { 
            System.out.println(name);  // DOES NOT COMPILE
            // Porque third() es un método de instancia, no puede acceder 
            // a la variable de instancia name sin una referencia a un objeto.
        }
        public static void main(String args[]) {
        first();
        second();
        // third(); // DOES NOT COMPILE
 } }
