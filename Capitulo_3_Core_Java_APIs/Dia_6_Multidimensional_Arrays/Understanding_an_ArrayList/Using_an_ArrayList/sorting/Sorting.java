package Dia_6_Multidimensional_Arrays.Understanding_an_ArrayList.Using_an_ArrayList.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting {
    /*  
    Sorting: Ordenar elementos en un ArrayList

    */
   public static void main(String[] args) {
        // 
        List<Integer> numbers = new ArrayList<>();
        numbers.add(99); // agregamos el elemento 99 a la lista.
        numbers.add(5); // elemento 5 a la lista.
        numbers.add(81); // elemento 81 a la lista.
        Collections.sort(numbers); // ordenamos la lista de menor a mayor.
        System.out.println(numbers); // [5, 81, 99]
   }
}
