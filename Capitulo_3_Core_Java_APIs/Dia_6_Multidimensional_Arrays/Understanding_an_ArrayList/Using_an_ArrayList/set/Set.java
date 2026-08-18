package Dia_6_Multidimensional_Arrays.Understanding_an_ArrayList.Using_an_ArrayList.set;

import java.util.List;
import java.util.ArrayList;

public class Set {
    /*  
    Ahora utilizaremos el metodo set() para reemplazar un elemento de la lista.
    - list.set(1, "robin"); // Reemplaza el elemento en la posición 1 (segundo elemento) con "robin"
    */

    // E set(int index, E newElement)
    // Solo funcionan con index existentes.
    public static void main(String[] args) {
        System.out.println("Ejercicio 1: set(int, E)");
        List<String> birds = new ArrayList<>();
        birds.add("hawk"); // [hawk]
        System.out.println(birds.size()); // 1 Confirma que hay un elemento en la lista
        birds.set(0, "robin"); //[robin] Reemplaza el elemento en una posición existente
        System.out.println(birds.size()); // 1 Vuelve a confirmar que hay un elemento en la lista
        System.out.println(birds.set(1, "robin")); // IndexOutOfBoundsException

    }
}
