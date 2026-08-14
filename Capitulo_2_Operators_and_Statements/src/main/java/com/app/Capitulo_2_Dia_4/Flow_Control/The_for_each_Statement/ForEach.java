package com.app.Capitulo_2_Dia_4.Flow_Control.The_for_each_Statement;

public class ForEach {
    /*
     * Bucle For Each: Utilizado para recorrer elementos de un array o colección.
     * 
     * estructura:
     * for(tipo nombre : coleccion) {
     *     // código
     * }
     */

    // for-each con un array
    public void forArray(){ // Recorre un array
        final String[] names = new String[3];
        names[0] = "Lisa";
        names[1] = "Kevin";
        names[2] = "Roger";

        for(String name : names) { // Recorre cada elemento del array names y lo asigna a la variable name
            System.out.print(name + ", ");
        }
    }

    // for-each con List
    public void forList(){ // Recorre una lista
    java.util.List<String> values = new java.util.ArrayList<String>();
    values.add("Lisa");
    values.add("Kevin");
    values.add("Roger");

        for(String value : values) { // Recorre cada elemento de la lista values y lo asigna a la variable value
            System.out.print(value + ", ");
        }
    }

    // String como lado derecho — NO compila
    /*public void forString(){ // No compila porque String no es un array ni una colección
    String names = "Lisa";

        for(String name : names) { // DOES NOT COMPILE
            System.out.print(name + " ");
        }
    }*/

    /*// 4. Tipo incorrecto — NO compila
    public void forList2(){ // No compila porque esta tratando de convertir un Integer a String
        String[] names = new String[3];

        for(int name : names) { // DOES NOT COMPILE
            System.out.print(name + " ");
        }
    }*/

    // Comparacion con for and for-each
    /*
    * for(String name : names) {
        System.out.print(name + ", ");
    }
    for(int i=0; i < names.length; i++) {
        String name = names[i];
        System.out.print(name + ", ");
    }
    
    // Comparación con List e Iterator
    * // Para List:
        for(int value : values) {
        System.out.print(value + ", ");
    }
    
    // Para Iterator:
    for(java.util.Iterator<Integer> i = values.iterator(); i.hasNext(); ) {
        int value = i.next();
        System.out.print(value + ", ");
    }
    */

    // for tradicional para evitar la coma final
    public void forArray2(){
        java.util.List<String> names = new java.util.ArrayList<String>();

        names.add("Lisa");
        names.add("Kevin");
        names.add("Roger");

        for(int i = 0; i < names.size(); i++) {
            String name = names.get(i);

            if(i > 0) {
                System.out.print(", ");
            }

            System.out.print(name);
        }
    }

    // for para comparar elementos consecutivos
    public void forArray3(){ // Recorre un array de enteros y compara elementos consecutivos
        int[] values = new int[3];

        values[0] = 10;
        values[1] = /*new Integer*/ (5); // new Integer esta deprecado por eso lo comento.
        values[2] = 15;
        // values[1] = 5; // Alternativa a new Integer(5)

        for(int i = 1; i < values.length; i++) { // Comienza en 1 para poder comparar con el elemento anterior
            System.out.print((values[i] - values[i - 1]) + ", "); // Compara el elemento actual con el anterior
        }
    }

    public static void main(String[] args) {
        ForEach bucles = new ForEach();
        System.out.println("=== FOR ARRAY ===");
        bucles.forArray();
        System.out.println("\n=== FOR LIST ===");
        bucles.forList();
        System.out.println("\n=== FOR ARRAY 2 ===");
        bucles.forArray2();
        System.out.println("\n=== FOR ARRAY 3 ===");
        bucles.forArray3();
    }

}
