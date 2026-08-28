package com.app.Capitulo_2_Dia_3.Working_with_Unary_Operators.Logical_Complement_and_Negation_Operators;

public class Operators {
    // Operador ! — complemento lógico
    // El operador ! invierte el valor de una expresión booleana.

    public static void main(String[] args) {
        boolean x = false;
        System.out.println(x); // false
        x= !x;
        System.out.println(x); // true

        // Operador - — negación
        double a = 1.21;
        System.out.println(a); // 1.21
        a = -a;
        System.out.println(a); // -1.21
        a = -a;
        System.out.println(a); // 1.21

        /*
        * int x = !5; // DOES NOT COMPILE
        * boolean y = -true; // DOES NOT COMPILE
        * boolean z = !0; // DOES NOT COMPILE
        */
    
    }

}
