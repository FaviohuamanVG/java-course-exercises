package Understanding_Java_Arrays.Creating_Array_Primitive;

public class Methods {
    /*  
    Fundamentos de los arreglos (arrays) en Java
     - Un array es una estructura de datos ordenada (permitiendo duplicados):

    */

     public static void main(String[] args) {
        // Especificando el tamaño - valores x defecto
        int[] numbers1 = new int[3]; // definimos el tipo int y el tamaño 3 - Al crearse se llena el valor x defecto con 0

        // Especificando los valores iniciales
        int[] numbers2 = new int[] {42, 55, 99}; // Se asigna automaticamente los valores especificos en lugar de 0 (por defecto)

        // intaxis abreviada (Anonymous Array)
    }
    int[] numbers3 = {42, 55, 99}; // Es un atajo que java conoce el tipo asi que permite omitir new int[]

    // Variaciones en la ubicación de los corchetes []
    int[] numAnimals; // la mas comun 
    int [] numAnimals2;
    int numAnimals3[];
    int numAnimals4 [];

    // Declaración de múltiples variables en una sola línea
    int[] ids, types;
    int ids1[], types1;
}
