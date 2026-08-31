package com.app.Capitulo_2_Dia_3.Working_with_Unary_Operators.Increment_and_Decrement_Operators;

public class Operators {
    public static void main(String[] args) {
        // Preincremento: ++counter
        int counter = 0;
            System.out.println(counter); // Outputs 0
            System.out.println(++counter); // Outputs 1
            System.out.println(counter); // Outputs 1
            System.out.println(counter--); // Outputs 1
            System.out.println(counter); // Outputs 0

        /*
        Tenemos el operador tanto de incremento y decremento,
        inicializamos la variable counter con un valor 0. Luego imprimimos
        el valor de counter que primero nos da 0, luego aplicamos el
        operador de preincremento que nos da 1, luego se imprime el valor.
        Luego aplicamos el operador de postdecremento que nos da 1 y luego
        imprimimos el valor de counter que nos da 0.    
        */
        

        int x = 3;
        int y = ++x * 5 / x-- + --x;
        System.out.println("x is " + x);
        System.out.println("y is " + y);

        /*
        int y = 4 * 5 / x-- + --x; // x assigned value of 4
        int y = 4 * 5 / 4 + --x; // x assigned value of 3
        int y = 4 * 5 / 4 + 2; // x assigned value of 2
        int y = 20 / 4 + 2;
        int y = 5 + 2;
        int y = 7;
        */

        /*
        Tenemos el operando tanto de incremento y decremento, inicializamos la
        variable x con un valor 3. Luego en la variable y realizamos una operacion
        con 2 operadores adicionales de postdecremento y predecremento, luego 
        imprimimos el valor de x que nos da 2 y el valor de y que nos da 7.
        
        */


    }

}
