package com.app.Capitulo_1_Dia_1.Writing_a_main_Method;

public class Zoo {

    public static void main(String[] args) {

        // args[0] obtiene el primer argumento.
        System.out.println(args[0]);

        // args[1] obtiene el segundo argumento.
        System.out.println(args[1]);

    }

    /*
    El metodo main() es el punto de entrada de Java para correr el codigo.
    La firma mas comun de utilizar es public static void main(String[] args) pero hay otras variantes.

    -- javac NombreArchivo.java - - > Compila el archivo .java y genera bytecode .class
    -- java NombreArchivo - - > Ejecuta el bytecode sin la extendsion .class 

    El metodo main() imprime los argumentos que se les pasan al programa desde la terminal.
    debemos pasarle los 2 argumentos:
    args[0] = "Valor1" - Primer argumento despues del nombre de la clase
    args[1] = "Valor2" - Segundo argumento despues del nombre de la clase

    java Zoo Valor1 Valor2 - Imprime el valor:
    Valor1
    Valor2

    Existe variantes para los argumentos que les pasamos al programa, ejemplo:
    java Zoo "Valor1" "Valor2" - Imprime lo siguiente:
    Valor1
    Valor2

    Variante 2: Podemos utilizar comillas dobles a un solo argumento y al otro argumento no, ejemplo:
    java Zoo "Valor1" Valor2 - Imprime lo siguiente:
    Valor1 (Las comillas agrupan los 2 argumentos en un solo argumento)
    Valor2 (El segundo argumento tambien es considerando un argumento con comillas dobles aunque 
    no le hayamos asignado comillas).

    Error:
    java Zoo Valor1
    Solo se le paso un argumento args[0] = "Valor1", el programa espera 2 pero al imprimir no tiene
    ese valor y lanza una excepcion: 
    Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 1
    */
}