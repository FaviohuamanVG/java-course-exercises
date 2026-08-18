package Dia_6_Multidimensional_Arrays.Understanding_an_ArrayList.Using_an_ArrayList.clear;

import java.util.ArrayList;
import java.util.List;

public class Clear {
    /*
    Es un metodo de ArrayList que borra todos los elementos de la lista.
    - Pero la lista siga existiendo, solo que vacia.
    */
   // void clear() Borra todos los elementos de la lista. No recibe parametros, no devuelve nada.
   public static void main(String[] args) {
    List<String> birds = new ArrayList<>(); // creamos la lista vacia y le agregamos 2 elementos.
    birds.add("hawk"); // [hawk]
    birds.add("hawk"); // [hawk], [hawk]
    System.out.println(birds.isEmpty()); // FALSE
    System.out.println(birds.size()); // 2
    birds.clear(); // [] borra todos los elementos de la lista. 
    System.out.println(birds.isEmpty()); // TRUE
    System.out.println(birds.size()); // 0
   }

}
