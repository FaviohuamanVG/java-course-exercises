package Applying_Access_Modifiers.Static_Variables;

import java.util.ArrayList;

/*  
    - Diferenciar entre variables estáticas que cambian durante la ejecución 
    (como un contador) y variables que permanecen congeladas (constantes).
    - Las variables estáticas se inicializan una sola vez, cuando la clase se carga en memoria.
    */
public class Initializers {
    // private static int counter = 0; initialization
    private static final int NUM_BUCKETS = 45; // Define una constante primitiva.
    // Las constantes se escriben en mayúsculas + guiones abajo, y se inicializan con un valor fijo.
    private static final ArrayList<String> values = new ArrayList<>(); // Declara una constante de referencia a un objeto. 
    // La referencia no puede cambiar, pero el objeto al que apunta sí puede cambiar.


    public static void main(String[] args) {
        System.out.println("Static variable :");
        // NUM_BUCKETS = 5;      // DOES NOT COMPILE
        // Java impide que se vuelva a usar el operador = para asignarle un
        // valor nuevo a la variable final.
        values.add("changed");    // COMPILES!
    }

}
