package com.app.Capitulo_2_Dia_3.Understanding_Java_Statements.Ternary_Operator;

public class OperatorTernary {
    /* 
    * El operador ternario es una forma abreviada de escribir un if-then-else statement.
    */

    public static void main(String[] args) {

        // Ternario equivalente a if-else
        int y = 10;
        final int x;
        if(y > 5) {
        x = 2 * y;
        } else {
        x = 3 * y;
        }

        /*
        Los operadores ternarios es como realizar un if-else
        pero sin realizar un bloque de codigo, es decir, 
        podemos realizar una condicion y asignar un valor
        a una variable dependiendo de si la condicion se
        cumple o no.
        */


        // Podemos escribirlo como:
        int a = 10;
        int b = (a > 5) ? (2 * a) : (3 * a);

        // Esta es la sintaxis del operador ternario, donde
        // tenemos una condicion, si la condicion se cumple, 
        // se ejecuta el valorSiVerdadero, si no se cumple, 
        // se ejecuta el valorSiFalso.
        // int b = (valorV > valorF) ? (valorSiVerdadero) : (valorSiFalso);

        // Como y = 10:
        // 10 > 5 → true
        // Por lo tanto, b = 2 * 10 = 20

        // Devuelve el valor:
        int c = (a > 5) ? 20 : 30; // Nota personal: c equivale -->  a pq Java no 
        // permite una variable duplicada

        /*
        Aqui estamos realizando una condicion, donde estamos declarando
        una variable de tipo int llamada a el cual tiene valor 10, luego
        estamos realizando una condicion donde el valor de a sea mayor 
        a 5, si se cumple entonces se asigna el valor de 20 a la variable c,
        si no se cumple la condicion entonces se le asigna 30.
        */

        System.out.println((y > 5) ? 21 : "Zebra"); // Esto compila

        // int animal = (y < 91) ? 9 : "Horse";  No compila
        // Porque estás intentando hacer: Convertir Horse a int
        // No se le puede asignar un valor de tipo String a una
        // variable de tipo int, son incompatibles.

        // condición ? valorSiVerdadero : valorSiFalso;

        // Si el valor es verdadero entonces no se ejecuta hasta el valor verdadero B++
        int B = 1;
        int V = 1;
        final int t = B < 10 ? B++ : V++;
        System.out.println(B+","+V); // Outputs 2,1

        // Si el valor es falso entonces no se ejecuta el valor
        // verdadero y se lo salta hasta el valor falso V++
        int T = 1;
        int Z = 1;
        final int A = T >=10 ? T++ : Z++;
        System.out.println(T+","+Z); // Outputs 1,2




    }
}
