package com.app.Capitulo_1_Dia_1.Distinguishing_Between_Object_References_and_Primitives;

public class ReferenceType {
    String a = "Hello";
    String b = a;

    java.util.Date today;
    String greeting;

    /*
    Se le asigna un valor a la variable a el cual es "Hello" y luego
    este mismo valor se le asigna a la variable b, pero no la forma
    tradicional String b = "Hello"; sino que se le asigna el valor
    del a haciendo que ambos apunten a la misma referencia de memoria
    Ambos apuntan al mismo Objeto.
    */

    public ReferenceType() {
        today = new java.util.Date();
        greeting = "Hello";
    }

    /*
    Today es declarado como referencia de tipo Date, pero este no apunta a nada
    String greeting de igual manera, declarado pero no apunta a nada.
    En el constructor se crea un objeto de tipo Date y today ahora apunta a ese
    objeto, solo puede ser accedido atraves de la variable today.
    greeting es reasignado con un nuevo valor de tipo String "Hello" y apunta
    hacia el.

    
    */

}
