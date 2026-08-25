package com.app.Capitulo_2_Dia_4.Understanding_Advanced_Flow_Control.The_continue_Statement;

public class SwitchSample {
    /*   
    *   Continue: Continue termina únicamente la iteración actual del bucle y 
        hace que Java vuelva a evaluar la condición del bucle.
    continue  → "Esta vuelta la salto, pero sigo con el bucle."
    *
    */

    public static void main(String[] args) {
        FIRST_CHAR_LOOP: for (int a = 1; a <= 4; a++) {
            for (char x = 'a'; x <= 'c'; x++) {
            if (a == 2 || x == 'b')
            continue FIRST_CHAR_LOOP;
            System.out.print(" " + a + x);
            }
        }
    }
}
