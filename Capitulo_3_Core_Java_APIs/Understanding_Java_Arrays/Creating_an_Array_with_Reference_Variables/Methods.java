package Understanding_Java_Arrays.Creating_an_Array_with_Reference_Variables;

public class Methods {
    /*  
    Comportamiento de los arreglos como Objetos (equals() y toString())
     - Un arreglo es un objeto, sin importar si contiene primitivos (int[]) u objetos (String[]).
    */

     public static void main(String[] args) {
        String [] bugs = { "cricket", "beetle", "ladybug" };
        String [] alias = bugs;
        System.out.println(bugs.equals(alias)); // true
        System.out.println(bugs.toString());    // [Ljava.lang.String;@160bc7c0

        // Valores por defecto en arreglos de referencia
        /*
        class Names {
        String names[];
        }
        */
       // Caso b: Arreglo instanciado sin elementos
       /*
       class Names {
        String names[] = new String[2];
        }
       */

        // Casting de arreglos y ArrayStoreException

        /*String[] strings = { "stringValue" };
        Object[] objects = strings;
        String[] againStrings = (String[]) objects;
        againStrings[0] = new StringBuilder(); // NO COMPILA
        objects[0] = new StringBuilder();  */    // ¡Cuidado! Compila pero falla en runtime
     }
}
