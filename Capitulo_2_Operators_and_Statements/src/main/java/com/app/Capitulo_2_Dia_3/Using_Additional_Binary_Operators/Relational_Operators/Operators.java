package com.app.Capitulo_2_Dia_3.Using_Additional_Binary_Operators.Relational_Operators;

public class Operators {
    public static void main(String[] args) {
        /*
            Operadores relacionales
        */
       int x = 10, y = 20, z = 10;

       /*
         El resultado de la comparación siempre es un boolean:
         true o false.
       */
        System.out.println(x < y); // Outputs true
        System.out.println(x <= y); // Outputs true
        System.out.println(x >= z); // Outputs true
        System.out.println(x > z); // Outputs false

        /*
        Tenemos 4 tipos de impresiones con el operador de comparacion, donde
        la primera nos da un resultado de true pq 10 es menor que 20 haciendo
        que la comparacion sea < menor que, la segunda nos da un resultado de 
        true pq 10 es menor o igual que 20, la tercera nos da un resultado de 
        true pq 10 es mayor o igual que 10 y la cuarta nos da un resultado de 
        false pq 10(x) no es mayor que 10(z).
        */


    }
}
