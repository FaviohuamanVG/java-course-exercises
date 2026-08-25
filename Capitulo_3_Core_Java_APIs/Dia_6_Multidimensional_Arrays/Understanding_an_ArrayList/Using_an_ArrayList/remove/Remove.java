package Dia_6_Multidimensional_Arrays.Understanding_an_ArrayList.Using_an_ArrayList.remove;

import java.util.ArrayList;
import java.util.List;

public class Remove {
    /*  
    Ahora se utilizara el metodo remove() para eliminar un elemento de la lista.
    - list.remove(1); // Elimina el elemento en la posición 1 (segundo elemento)
    - Aqui existe una diferencia de tipo entre Object e int.
    */
    public static void main(String[] args) {
        // boolean remove(Object object) Quita el valor si existe. Te dice si encontro algo o no.
        // E remove(int index) Quita lo que esta en esa posicion. Te devuelve el elemento que quito.
        System.out.println("Ejercicio 1: remove(Object) + remove(int)");
        List<String> birds = new ArrayList<>();
        birds.add("hawk"); // [hawk]
        birds.add("hawk"); // [hawk, hawk]
        System.out.println(birds.remove("cardinal")); // print false, no existe
        System.out.println(birds.remove("hawk")); // print true, si existe y lo elimina
        System.out.println(birds.remove(0)); //print hawk
        System.out.println(birds);


    }

}
