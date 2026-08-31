package Understanding_Java_Arrays.Creating_Array_Primitive;

public class Methods {
    /*  
    Fundamentos de los arreglos (arrays) en Java
     - Un array es una estructura de datos ordenada (permitiendo duplicados):

    */

     /*
     Existen distintas formas de crear un array de tipo primitivo en Java
     - Los arrays son espacios en memoria que reserva un numero fijo de casillas
     para que se guarden los valores del mismo tipo.

     -- Decirle el tamaño: Java rellena el valor x defecto de ese tipo (0 para int,
     false para boolean, null para String, etc).
     -- Darles los valores directamente: Java crea el array con el tamaño exacto de
     esos valores y los coloca ahi.
     */

     public static void main(String[] args) {
        // Especificando el tamaño - valores x defecto
        int[] numbers1 = new int[3]; // definimos el tipo int y el tamaño 3 - 
        // int[] -> el tipo de array (array de enteros).
        // new int[3]; -> crear un array reservado con 3 espacios.
        // Al crearse se llena el valor x defecto con 0
        // [0, 0, 0] -> 3 espacios de memoria reservados para enteros

        // Especificando los valores iniciales
        int[] numbers2 = new int[] {42, 55, 99}; // Se asigna automaticamente los 
        // valores especificos en lugar de 0 (por defecto)
        // Como no ponemos el numero dentro del [] (seria redundante)
        // Resultado [42, 55, 99] -> 3 espacios de memoria reservados para enteros

        // intaxis abreviada (Anonymous Array)
    }
    int[] numbers3 = {42, 55, 99}; // Es un atajo que java conoce el tipo 
    // asi que permite omitir new int[]
    // Como no especificamos el tipo ni tamaño, java infiere del lado
    // izquierdo int[]

    // Variaciones en la ubicación de los corchetes []
    int[] numAnimals; // la mas comun 
    int [] numAnimals2;
    int numAnimals3[];
    int numAnimals4 [];
    /*
    Las 4 variaciones hacen lo mismo, declaran una variable tipo int[]
    Cambia solo el estilo de escritura (posicion[] o con o sin espacio)
    // la forma mas usada es int[] numAnimals;
    */

    // Declaración de múltiples variables en una sola línea
    int[] ids, types;
    int ids1[], types1;
}
