public class Arrays {
    /*
    Multidimensional Arrays: Los arrays con objetos. Un array puede tener referencias
    de otros arrays, lo que permite crear arrays multidimensional.
    // arrays normal
    int [] name_variable = new int[0];
    */

    public static void main(String[] args) {
        int[] numeros = new int[3]; // la caja con 3 casillas guarda un int.
        // Y si guardamos la referencia de otro array?
        int[][] matriz = new int[3][2]; // Es un array de 2D
        // Caja externa con 3 casillas, cada una de las cajas contiene la referencia de otro array

        // Variables:
        int[][] vars1; // 2D array
        int vars2 [][]; // 2D array
        int[] vars3[]; // 2D array
        int[] vars4 [], space [][]; // a 2D AND a 3D array

        // Creación con tamaño:
        String [][] rectangle = new String [3][2];
        // Asignacion de valores:
        rectangle [0][1] = "set";
        // Array iregular (asimetrico)
        int [][] differentSizes = {{1,4}, {3}, {9, 8, 7}};
        // Creacion de un array irregular en pasos separados:
        int [][] args1 = new int [4][];
        args1[0] = new int[5];
        args1[1] = new int[3];

        System.out.println("Using Multidimensional Arrays");

    }
}
