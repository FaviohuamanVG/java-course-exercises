package com.app.Capitulo_1_Dia_1.Distinguishing_Between_Object_References_and_Primitives;

public class KeyDifferenc {
   //  int value = null; // DOES NOT COMPILE
    String s = null; // COMPILE

    /*
    Las variable con inicializadas con referencias pueden ser null y no apuntar a nada
    pero las variables de tipo primitivo no pueden nunca ser null, eso ya es un error 
    de compilacion. Dara error siempre como el caso:
    int value = null;
    */

    String reference = "hello";
    int len = reference.length();
    // int bad = len.length(); // DOES NOT COMPILE
    /*
    Las referencias pueden invocar metodos
    String reference = "hello"; -- Apunta a un objeto de tipo String
    int len = reference.length(); -- Invoca el metodo length() del objeto String
    al ser reference una referencia puede llamar a esos metodo y al ser valido
    devolvera un int el cual es 5 por la longitud de la palabra hello.
    Pero si se intenta invocar un metodo en un primitivo este dara error de 
    compilacion, ya que los primitivos no tienen metodos asociados asi que
    int no reconoce el metodo length().
    */
}
