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

        // Podemos escribirlo como:
        int a = 10;
        int b = (a > 5) ? (2 * a) : (3 * a);
        // Como y = 10:
        // 10 > 5 → true
        // Por lo tanto, b = 2 * 10 = 20

        // Devuelve el valor:
        int c = (a > 5) ? 20 : 30; // Nota personal: c equivale -->  a pq Java no permite una variable duplicada
        System.out.println((y > 5) ? 21 : "Zebra"); // Esto compila

       // int animal = (y < 91) ? 9 : "Horse";  No compila
        // Porque estás intentando hacer: Convertir Horse a int

        // condición ? valorSiVerdadero : valorSiFalso;

        // Si el valor es verdadero entonces no se ejecuta hasta el valor verdadero B++
        int B = 1;
        int V = 1;
        final int t = B<10 ? B++ : V++;
        System.out.println(B+","+V); // Outputs 2,1

        // Si el valor es falso entonces no se ejecuta hasta el valor falso V++
        int T = 1;
        int Z = 1;
        final int A = T>=10 ? T++ : Z++;
        System.out.println(T+","+Z); // Outputs 1,2




    }
}
