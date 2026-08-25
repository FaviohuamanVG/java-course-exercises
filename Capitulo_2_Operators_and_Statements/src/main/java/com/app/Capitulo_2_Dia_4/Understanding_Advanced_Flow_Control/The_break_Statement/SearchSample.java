package com.app.Capitulo_2_Dia_4.Understanding_Advanced_Flow_Control.The_break_Statement;

public class SearchSample {
    /*
    * Break Statement: break termina inmediatamente el bucle en el que se encuentra.
    */

     public static void main(String[] args) {
        int[][] list = {{1,13,5},{1,2,5},{2,7,2}};
        int searchValue = 2;
        int positionX = -1;
        int positionY = -1;

        PARENT_LOOP: for(int i=0; i<list.length; i++) { // Loop principal
            // etiqueta para poder salir directamente del bucle externo:
            // Se usa para salir del bucle principal cuando se encuentra el valor buscado

            for(int j=0; j<list[i].length; j++) {

                if(list[i][j]==searchValue) { // ¿list[i][j] es igual a 2?
                // Cuando encuentra un 2:
                    positionX = i; // guarda 1
                    positionY = j; // guarda 1
                    break PARENT_LOOP; // Rompe el bucle principal
                }
            }
        }

        /* if: break sin etiqueta
         (Pero el bucle externo continúa.)
         // 2.0 luego de romper el bucle interno, el bucle externo continúa ejecutándose.
            if(list[i][j] == searchValue) { // 2.0 Vuelve a ingresar al if
                positionX = i; // 1.0 Guarda 1
                // 2.0 ahora cambia el valor de 1 a 2 debio al bucle externo.
                positionY = j; // 1.0 Guarda 1
                // 2.0 ahora el valor es 0.
                break; // 1.0 break no sabe de ninguna etiqueta, así que rompe únicamente el for más cercano.
            }
        */
        
        /* if: sin break
        // if sigue haciendo exactamente la misma pregunta.
            if(list[i][j] == searchValue) {
                positionX = i;
                positionY = j;
                // sin break         → continúa recorriendo TODO.
            }
                // después de encontrar un 2, no detenemos ningún bucle.
        */
        
        if(positionX==-1 || positionY==-1) {
            System.out.println("Value "+searchValue+" not found");
        } else {
            System.out.println("Value "+searchValue+" found at: " +
            "("+positionX+","+positionY+")");
        }
    }
}   
