package Dia_6_Multidimensional_Arrays.Understanding_an_ArrayList.Using_an_ArrayList.add;
import java.util.ArrayList; // Import para ArrayList
import java.util.List; // Import para List

public class Add {
    /*
    Aprenderemos a como usar los ArrayList y sus metodos, ahora utilizaremos el metodo add().
    - Inserta un nuevo valor en el ArrayList.
    */

    // E como parametro generico, puede ser cualquier tipo de dato.
        /*boolean add(E element)
        void add (int index, E element)*/

    public static void main(String[] args) {
        System.out.println("Ejercicio 1 con Generics:");
        // Sin generics:
        ArrayList list = new ArrayList(); // lista sin generics, pero internamente tiene E = object;
        list.add("hawk");
        list.add(Boolean.TRUE); //el object acepta cualquier tipo de dato
        System.out.println(list);

        System.out.println("Ejercicio 2 con Generics:");
        // Con generics:
        ArrayList<String> safer = new ArrayList<>(); // Ahora el objecto es de tipo String
        safer.add("sparrow");
        // safer.add(Boolean.TRUE);  DOES NOT COMPILE
        System.out.println("Ejercicio 2 no compilara");
        // <String> es de tipo String no aplica con un Boolean, por eso no compila

        System.out.println("Ejercicio 3 agregando en posiciones:");
        // Agregar en posiciones especificas:
        List<String> birds = new ArrayList<>();
        birds.add("hawk"); // "hawk" en el indice 0
        birds.add(1, "robin"); // "hawk", "robin" en el indice 1
        birds.add(0, "blue jay"); // "blue jay" en el indice 0, reemplazando a "hawk".
        birds.add(1, "cardinal"); // "blue jay", "cardinal" toma el indice 1, "hawk", "robin"
        System.out.println(birds);
    }
}
