package com.app.Capitulo_2_Dia_4.Understanding_Advanced_Flow_Control.Nested_Loops;

public class NestedLoop {
    /*  
    *   Bucles Anidados: 
    *   - Un bucle puede estar dentro de otro bucle.
    * 
    */
    // Ejemplo con For-each/For anidados:
    public void nestedLoop() {
        int[][] myComplexArray = {{5,2,1,3},{3,9,8,9},{5,7,12,7}}; // se aplican los 2D - array bidimensional
            // dos for-each/for anidados:
        for(int[] mySimpleArray : myComplexArray) { // obtiene una fila completa
        for(int i=0; i<mySimpleArray.length; i++) { // recorre los elementos de esa fila
            System.out.print(mySimpleArray[i]+"\t");
        }
            System.out.println();
        }
        // por cada vuelta del bucle exterior, se ejecuta completamente el bucle interior.
    }

    public void nestedLoop2() {
        // primera vuelta que recorre el while, luego el do-while
        // se realiza otra vuelta pero ahora la variable x vale -> 3
        int x = 10; // una vez terminado el resultado de la primera vuelta la variables se modifica
        while(x > 0){ // esta entrando en el bucle - 1era vuelta --> 10
            // vuelve a ejecutarse el do-while en la segunda vuelta
            do{ // se ejecuta al menos una vez
                x -= 2; // luego entra al do-while
            }while(x > 5); // vuelve al do-while hasta que sea false

            x--; // sale de do-while y lo resta
            System.out.println(x + "\t"); // aplica el resultado
        }
    }

        public static void main(String[] args) {
           NestedLoop anidados = new NestedLoop();
           anidados.nestedLoop(); 
           anidados.nestedLoop2();
        }
}
