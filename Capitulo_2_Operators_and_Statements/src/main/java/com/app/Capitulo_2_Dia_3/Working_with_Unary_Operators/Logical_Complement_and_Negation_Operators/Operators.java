package com.app.Capitulo_2_Dia_3.Working_with_Unary_Operators.Logical_Complement_and_Negation_Operators;

public class Operators {
    // Operador ! — complemento lógico
    // El operador ! invierte el valor de una expresión booleana.

    /*
    Estos operadores no se pueden aplicar a tipos de datos que no sean booleanos. 
    Por ejemplo, el siguiente código no compila:
    */

    public static void main(String[] args) {
        boolean x = false;
        System.out.println(x); // false
        x= !x;
        System.out.println(x); // true

        /*
        Estamos realizando una operación de negación lógica sobre la variable x.
        Declaramos el valor de boolean como false, luego de eso aplicamos el operador
        ! que es de negacion logica y el resultado booleano ya no es false sino que
        ahora es tru.
        */

        // Operador - — negación
        double a = 1.21;
        System.out.println(a); // 1.21
        a = -a;
        System.out.println(a); // -1.21
        a = -a;
        System.out.println(a); // 1.21

        /*
        Aqui no usamos la operacion de negacion con ! sino que al ser un tipo de
        dato numerico usamos el operador - que es de negacion y esto nos permite
        poder cambiar el valor de una variable numerica de positiva a negativa.
        */

        /*
        * int x = !5; // DOES NOT COMPILE
        * boolean y = -true; // DOES NOT COMPILE
        * boolean z = !0; // DOES NOT COMPILE
        */
    
    }

}
