package com.app.Capitulo_2_Dia_4.Understanding_Advanced_Flow_Control.Adding_Optional_Labels;

public class Labels {
    /*
       Labels: Etiquetas opcionales
       Se utilizan para identificar bucles y controlar el flujo de ejecución.
       - nombre seguido de : que se coloca antes de un bucle.
        OUTER_LOOP:
        for(...) {
            ...
        }
    */

    public void labels() {
        int[][] myComplexArray = {{5,2,1,3},{3,9,8,9},{5,7,12,7}};
        OUTER_LOOP: for(int[] mySimpleArray : myComplexArray) { // se aplico la etiqueta antes del bucles
        INNER_LOOP: for(int i=0; i<mySimpleArray.length; i++) {
            System.out.print(mySimpleArray[i]+"\t");
        }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Labels labels = new Labels();
        labels.labels();
    }
}
