package com.app.Capitulo_1_Dia_1.Distinguishing_Between_Object_References_and_Primitives;

public class PrimitiveTypes {

    public static void main(String[] args) {

        System.out.println(Integer.MAX_VALUE);

        System.out.println(56);    // 56
        System.out.println(0b11);  // 3
        System.out.println(017);   // 15
        System.out.println(0x1F);  // 31
    }

    /*
    Los tipos primitivos son los tipos de datos básicos que no son objetos. En Java, hay ocho 
    tipos primitivos: byte, short, int, long, float, double, char y boolean. 
    Estos tipos se utilizan para almacenar valores simples y no tienen métodos asociados como 
    los objetos.

    -- Siempre los primitivos se escriben en minusculas, por ejemplo: int, double, boolean, etc.
    byte: 8 bits, rango de -128 a 127, si se pasa de este rango produce un error de compilacion.
    -- Su valor por defecto del byte es 0.
    shot: 16 bits, rango de -32,768 a 32,767, su valor por defecto es 0.
    int: 32 bits, rango de -2,147,483,648 a 2,147,483,647 - valor por defecto es 0.
    String es un objeto, no es un tipo primitivo, pero su valor por defecto es null.
    long: 64 bits, rango de -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807 
    -- valor por defecto es 0L.

    long max = 3123456789; // DOES NOT COMPILE
    esto debido a que el valor asignado es un int literal y no es un long
    -- Solucion: long max = 3123456789L; // now Java knows it is a long

    int million1 = 1000000; -- Esto es un int literal y por lo cual es valido.
    int million2 = 1_000_000; -- Esto tambien es un int literal y es valido
    -- los guiones bajos ayudan a la legibilidad.
    -- Cuando no es valido? 
    int million3 = 1_000_000_; -- Esto no es valido, ya que el guion bajo no puede ir al final.
    int million4 = _1000000; -- Esto tampoco es valido, ya que el guion bajo no puede ir al inicio.

    double: 64 bits, rango de ±4.9e-324 a ±1.7e308, valor por defecto es 0.0.
    -- No compilan:
    double notAtStart = _1000.00; // DOES NOT COMPILE
    double notAtEnd = 1000.00_; // DOES NOT COMPILE
    double notByDecimal = 1000_.00; // DOES NOT COMPILE

    -- Los guiones bajos no pueden ir al inicio, al final o adyacentes a un punto decimal.
    -- Por eso no compilan.

    double annoyingButLegal = 1_00_0.0_0; // this one compiles
    Esto compila porque los guiones bajos no están al inicio, al final ni adyacentes a un punto decimal.

    boolean: 1 bit, valores posibles true o false, valor por defecto es false.

    ninguno de los primitivos pueden ser null.

    */

}
