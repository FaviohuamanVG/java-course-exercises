package Understanding_Java_Arrays.Sorting;

//import java.util.*  import whole package including Arrays
import java.util.Arrays; // import just Arrays

public class Methods {
    /*  
    Importar la clase Arrays
    - Arrays pertenece al paquete java.util, por lo que requiere un import explícito para poder usarse
    Opción A (Importar todo el paquete): import java.util.*;
    Opción B (Importar solo la clase): import java.util.Arrays;
    Opción C (Nombre completo en código): Usar java.util.Arrays.sort(...) directamente cada vez que se invoque.
    
    Ordenar arreglos numéricos (int[])

    */
    public static void main(String[] args) {
        // Ordenar arreglos numéricos (int[])
        int[] numbers = { 6, 9, 1 };
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++)
            System.out.print(numbers[i] + " ");

        // Ordenar arreglos de cadenas (String[])
        String[] strings = { "10", "9", "100" };
        Arrays.sort(strings);
        for (String string : strings)
            System.out.print(string + " ");

        // Uso del bucle for-each (Enhanced for loop)
        // for (String string : strings)
    }
}
