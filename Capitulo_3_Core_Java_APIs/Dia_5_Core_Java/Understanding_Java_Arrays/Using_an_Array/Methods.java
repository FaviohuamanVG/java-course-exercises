package Understanding_Java_Arrays.Using_an_Array;

public class Methods {
    /*  
    Como usar e interactuar con un arreglo de java:
    - el acceso de sus elementos mediante sus indices, el recorrido de los bucles y errores comunes.

    */
    public static void main(String[] args) {
        // Lectura de elementos e índice base cero
        String[] mammals = {"monkey", "chimp", "donkey"};
        System.out.println(mammals.length); // 3
        System.out.println(mammals[0]);      // monkey
        System.out.println(mammals[1]);      // chimp
        System.out.println(mammals[2]);      // donkey

        // La propiedad length no se preocupa por el contenido
        String[] birds = new String[6];
        System.out.println(birds.length); // Imprime 6

        // Recorrer un arreglo con un bucle for
        int[] numbers = new int[10];
         for (int i = 0; i < numbers.length; i++)
          numbers[i] = i + 5;
    }
}
