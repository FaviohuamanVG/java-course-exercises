package Applying_Access_Modifiers.Designing_Static_Methods_and_Fields;
    /*
    Los miembros Static, pertenecen a la clase en si misma. 
    - Crear funciones utilitarias (no necesita un objeto para funcionar)
    - Crear variables de clase (no necesita un objeto para funcionar)
    - Se puede acceder a los miembros static sin crear un objeto de la clase.
    */
public class Koala {
    public static int count = 0; // static variable, pertenece a la clase Koala
    // No es un objeto de la clase Koala.
    // No es necesario crear un objeto (new Koala()) para saber que vale 0.
    public static void main(String[] args) { // static method.
        System.out.println(count); // 
    }
}
