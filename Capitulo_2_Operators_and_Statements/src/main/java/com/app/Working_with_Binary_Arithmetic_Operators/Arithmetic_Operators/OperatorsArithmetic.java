package com.app.Working_with_Binary_Arithmetic_Operators.Arithmetic_Operators;

public class OperatorsArithmetic {
    /* Operadores Basicos:
    *   + = Suma -> 5+3 = 8
    *   - = Resta -> 5-3 = 2
    *   * = Multiplicacion -> 6*2 = 12
    *   / = Division -> 6/2 = 3
    *   % = Mudulo -> 10%3 = 1
    */
    int x = 2 * 5 + 3 * 4 - 8;
    // Java no evalua de izquierda a derecha, sino a la precedencia
    /*
    * - 2 * 5 = 10;
    * - 3 * 4 = 12;
    * Queda: 10 + 12 - 8
    * Ahora si, evaluamos de Izquierda a Derecha
    * - 10 + 12 = 22
    *  22 - 8 = 14
    *  X = 14;
    */ 

    // Los paréntesis cambian el orden
    int y = 2 * ((5 + 3) * 4 - 8);
    // Se realiza primero la operación dentro de los paréntesis
    /*
    *  (5 + 3) = 8
    * Luego : ( 8 * 4 - 8); -> 8 * 4 = 32
    *  ( 32 - 8); = 24
    *  y = 2 * 24 ->  Y = 48;
    */

    public static void main(String[] args) {

        System.out.println(9 / 3); // output : 3
        System.out.println(9 % 3); // output : 0
        System.out.println(10 / 3); // output : 3
        System.out.println(10 % 3); // output : 1
        System.out.println(11 / 3); // output : 3
        System.out.println(11 % 3); // output : 2
        System.out.println(12 / 3); // output : 4
        System.out.println(12 % 3); // output : 0
        
    }


}
