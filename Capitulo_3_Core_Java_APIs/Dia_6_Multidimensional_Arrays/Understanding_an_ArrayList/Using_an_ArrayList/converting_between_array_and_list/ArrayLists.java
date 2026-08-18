package Dia_6_Multidimensional_Arrays.Understanding_an_ArrayList.Using_an_ArrayList.converting_between_array_and_list;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayLists {
    /*  
    Convertir ArrayList/List a Array
    Un array es un objeto de tamaño fijo. Si lo creamos para 2 elementos nunca tendra 3.
    Un ArrayList es como un Objeto el cual puede agregar y quitar elementos.
    */
   public static void main(String[] args) {
    // Convertir ArrayList a Array
    List<String> list = new ArrayList<>(); //Un arraylist complementamente vacio
    list.add("hawk"); // [hawk]
    list.add("robin"); // [hawk, robin]
    Object [] objectArray = list.toArray();
    System.out.println(objectArray.length); // 2
    String[] stringArray = list.toArray(new String[0]);
    System.out.println(stringArray.length); // 2

    // Convertir Array a ArrayList
    String[] array = {"hawk", "robin"};
    List<String> list2 = Arrays.asList(array);
    System.out.println(list2.size()); // retorna 2
    list2.set(1, "test"); // [hawk, test]
    array[0] = "new"; // [new, test]
    for (String b : array){ // bucle for each para recorrer el array
    System.out.println(b + " "); // new test
    };
    list2.remove(1); // !Error! - UnsupportedOperationException
   }
}
