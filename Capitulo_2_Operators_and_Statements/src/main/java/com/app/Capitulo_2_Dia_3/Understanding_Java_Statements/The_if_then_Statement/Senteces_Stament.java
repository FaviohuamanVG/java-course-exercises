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

        /*
        Sintaxis basica de un if statement:

        Estamos declarando una variable de tipo int llamada x y 
        le estamos asignando un valor de 10, luego estamos 
        imprimiendo el valor de x para luego incrementar el valor
        de x en 1, lo que nos da un valor de 11.
        */

        // Condicionales
        int hourOfDay = 10;
        if(hourOfDay < 11) {
             System.out.println("Good Morning");
        }

        /*
        Aqui estamos realizando una condicion, donde estamos declarando
        una variable de tipo int llamada hourOfDay el cual tiene valor
        10, luego estamos realizando una condicion donde el valor de
        hourOfDay sea menor a 11, si se cumple la condicion, entonces
        se imprime el mensaje "Good Morning", si no se cumple la
        condicion entonces no se imprime nada.
        */


        /*
        Dentro de las estructuras de controla como las if,
        podemos generar bucles donde vamos a imprimir un 
        mensaje repetidamente, hasta que el valor de la 
        variable ya no cumpla la condicion.
        */


        // Bucles
        int morningGreetingCount = 0;
        if(hourOfDay < 11) {
        System.out.println("Good Morning");
        morningGreetingCount++;

        }

        /*
        Aqui estamos realizando una condicion, donde estamos declarando
        una variable de tipo int llamada morningGreetingCount el cual 
        tiene valor 0, luego estamos realizando una condicion donde el 
        valor de hourOfDay sea menor a 11, si se cumple la condicion, 
        entonces se imprime el mensaje "Good Morning", y luego se incrementa
        el valor de morningGreetingCount en 1, si no se cumple la
        condicion entonces no se imprime nada y el valor de morningGreetingCount
        no se incrementa.
        */





    }
}
