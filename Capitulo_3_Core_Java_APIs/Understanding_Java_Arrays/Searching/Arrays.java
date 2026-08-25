package Understanding_Java_Arrays.Searching;

public class Arrays {
    /*
    Arrays.binarySearch():

    Para encontrar la posición de un elemento dentro de un arreglo. Sin embargo, 
        es un requisito obligatorio que el arreglo esté ordenado previamente.
    */

    public static void main(String[] args) {

        System.out.println("Búsqueda binaria (Arrays.binarySearch())"); // -1
        /*int[] numbers = {2, 4, 6, 8};
        System.out.println(Arrays.binarySearch(numbers, 2)); // 0
        System.out.println(Arrays.binarySearch(numbers, 4)); // 1
        System.out.println(Arrays.binarySearch(numbers, 1)); // -1
        System.out.println(Arrays.binarySearch(numbers, 3)); // -2
        System.out.println(Arrays.binarySearch(numbers, 9)); // -5*/

        /*
        Líneas 4 y 5: El 2 está en el índice 0 y el 4 en el índice 1.

        Línea 6 (Búsqueda de 1): El 1 no está en el arreglo. Para mantener el orden, 
        debería insertarse en el índice 0. Aplicando la fórmula: -0 - 1 = -1.

        Línea 7 (Búsqueda de 3): Debería insertarse en el índice 1 (entre 2 y 4). 
        Aplicando la fórmula: -1 - 1 = -2.

        Línea 8 (Búsqueda de 9): Debería insertarse al final, en el índice 4. 
        Aplicando la fórmula: -4 - 1 = -5.
        */
    }
}
