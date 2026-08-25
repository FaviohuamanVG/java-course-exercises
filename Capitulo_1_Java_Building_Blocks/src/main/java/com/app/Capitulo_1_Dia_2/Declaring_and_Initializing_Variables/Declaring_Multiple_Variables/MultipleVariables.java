package com.app.Capitulo_1_Dia_2.Declaring_and_Initializing_Variables.Declaring_Multiple_Variables;

public class MultipleVariables {

    public static void main(String[] args) {

        // Múltiples variables del mismo tipo
        String s1, s2;

        // Variables inicializadas
        String s3 = "yes", s4 = "no";

        // Variables declaradas pero solo i3 es inicializada
        int i1, i2, i3 = 0;

        // No compila: no se pueden mezclar tipos
        // int num, String value;

        // Declaración válida
        boolean b1, b2;

        // Declaración válida: solo s5 está inicializada
        String s5 = "1", s6;

        // No compila: no se puede repetir el tipo
        // double d1, double d2;

        // Dos declaraciones diferentes, ambas válidas
        int i5;
        int i6;

        // No compila: i4 no tiene tipo
        // int i7; int i8; int i9; i4;

        System.out.println("Multiple variables");
    }
}