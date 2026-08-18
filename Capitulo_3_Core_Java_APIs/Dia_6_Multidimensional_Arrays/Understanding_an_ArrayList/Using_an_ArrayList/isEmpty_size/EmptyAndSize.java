package Dia_6_Multidimensional_Arrays.Understanding_an_ArrayList.Using_an_ArrayList.isEmpty_size;

import java.util.ArrayList;
import java.util.List;

public class EmptyAndSize {
    /*  
    size() devuelve el número de elementos en la lista. Nunca mira la capacidad de la lista.
    isEmpty() devuelve true si la lista no tiene elementos, de lo contrario devuelve false.
    */

    // boolean isEmpty() ¿La lista tiene elementos?
    // int size() ¿Cuantos elementos tiene la lista?
   public static void main(String[] args) {
        List<String> birds = new ArrayList<>();
        System.out.println(birds.isEmpty()); // true, no hay elementos
        System.out.println(birds.size()); // 0, no hay elementos
        birds.add("hawk"); // agregando elementos a la lista
        birds.add("hawk"); 
        System.out.println(birds.isEmpty()); // false, hay elementos
        System.out.println(birds.size()); // 2, hay 2 elementos
   }
}
