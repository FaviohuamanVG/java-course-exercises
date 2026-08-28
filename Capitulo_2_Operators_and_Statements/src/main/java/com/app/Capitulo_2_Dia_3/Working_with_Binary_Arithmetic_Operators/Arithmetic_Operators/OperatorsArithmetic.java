package com.app.Capitulo_2_Dia_3.Working_with_Binary_Arithmetic_Operators.Arithmetic_Operators;

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

        /*
        Es operador de division, el cual divide el primer operando entre el segundo operando
        y devuelve el cociente de la division.
        */

        System.out.println(9 % 3); // output : 0

        /*
        Es operador de modulo, el cual divide el primer operando entre el segundo y el
        resultado es el residuo de la division.
        */

        System.out.println(10 / 3); // output : 3

        /*
        Imprime 3, ya que el operador de division devuelve el
    cociente de la division, y 10/3 = 3.3333, pero el resultado es un entero
        */

        System.out.println(10 % 3); // output : 1

        /*
        El operador de modulo devuelve el residuo de la division, y 10/3 = 3.3333
        el residuo es 1, por lo tanto el resultado es 1.
        */

        System.out.println(11 / 3); // output : 3

        /*
        El operador de division devuelve el cociente de la division, y 11/3 = 3.6666
        aqui no se redondea el cociente es 3, por lo tanto el resultado es 3.
        */

        System.out.println(11 % 3); // output : 2

        /*
        El operador de modulo devuelve el residuo de la division, y 11/3 = 3.6666
        el residuo es 2, por lo tanto el resultado es 2.
        */

        System.out.println(12 / 3); // output : 4

        /*
        El operador de division devuelve el cociente de la division, y 12/3 = 4
        por lo tanto el resultado es 4.
        */

        System.out.println(12 % 3); // output : 0

        /*
        El operador de modulo devuelve el residuo de la division, y 12/3 = 4
        el residuo es 0, por lo tanto el resultado es 0.
        */
        
    }


}
