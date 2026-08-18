package Dia_6_Multidimensional_Arrays.Understanding_an_ArrayList.Using_an_ArrayList.contains;

import java.util.ArrayList;
import java.util.List;

public class Contains {
    /*  
    Verifica si un elemento existe en la lista.
    Devuelve true o false.
    */
   // boolean contains(Object object)
  // Recibe un Object (valor que buscas), devuelve un boolean.

  public static void main(String[] args) {
    List<String> birds = new ArrayList<>(); // una lista vacia y le agregamos elementos.
    birds.add("hawk"); // [hawk] agregamos un elemento.
    System.out.println(birds.contains("hawk")); // true, el elemento existe.
    System.out.println(birds.contains("robin")); // false, el elemento no existe.
  }
}
