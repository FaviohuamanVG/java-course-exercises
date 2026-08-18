package Dia_6_Multidimensional_Arrays.Understanding_an_ArrayList.Using_an_ArrayList.equals;

import java.util.ArrayList;
import java.util.List;

public class Equals {
    /*  
    Compara los ArrayList y verifica si son iguales.
    Devuelve boolean true o false.
    */
   // boolean equals(Object object) Recibe un Object (valor buscado)
   // Devuelve true o false, si son iguales o no.
   public static void main(String[] args) {
    // Creamos 2 listas de tipo String, one y two
    List<String> one = new ArrayList<>();
    List<String> two = new ArrayList<>();
    System.out.println(one.equals(two)); // true, ambas listas estan vacias.
    one.add("a"); // agregamos un elemento a la lista one.
    System.out.println(one.equals(two)); // false, las listas no son iguales.
    two.add("a"); // agregamos un elemento a la lista two.
    System.out.println(one.equals(two)); // true, las listas son iguales.
    one.add("b"); // [a], [b]
    two.add(0, "b"); // [b], [a]
    System.out.println(one.equals(two)); // false, las listas no son iguales.
   }

}
