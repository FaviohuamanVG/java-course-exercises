package com.app.Capitulo_2_Dia_3.Understanding_Java_Statements.The_if_then_Statement;

public class Senteces_Stament {
    /*
    Sentencia (statement) 
        Unidad completa de ejecución en Java. Normalmente termina con ;
    */
   public static void main(String[] args) {
    // Cada una de esas líneas es una sentencia.
        int x = 10;
        System.out.println(x);
        x++;

        // Condicionales
        int hourOfDay = 10;
        if(hourOfDay < 11) {
             System.out.println("Good Morning");
        }



        // Bucles
        int morningGreetingCount = 0;
        if(hourOfDay < 11) {
        System.out.println("Good Morning");
        morningGreetingCount++;


        }
    }
}
