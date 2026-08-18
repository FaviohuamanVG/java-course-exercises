package Dia_6_Multidimensional_Arrays.Using_a_Multidimensional_Array;

public class Arrays {
    /*  
    Using a Multidimensional Array:
    - Como recorrer un arreglo multidimensional utilizando el bucle for tradicional
    y el bucle for-each.
    */
    public static void main(String[] args) {
        System.out.println("Bucle for tradicional: ");
          //bucle for tradicional:
        int [][] twoD = new int[3][2];
        for(int i = 0; i < twoD.length; i++){
            for(int j = 0; j < twoD[i].length; j++)
                System.out.println(twoD[i][j]+ " ");
            System.out.println();
        }

        System.out.println("Bucle for-each: ");
        // bucle for-each:
        for(int[] inner : twoD){
            for(int num : inner)
                System.out.println(num + " ");
            System.out.println();
        }  
    }

}
