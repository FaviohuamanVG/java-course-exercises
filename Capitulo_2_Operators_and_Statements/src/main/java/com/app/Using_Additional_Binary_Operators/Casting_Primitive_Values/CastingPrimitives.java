package com.app.Using_Additional_Binary_Operators.Casting_Primitive_Values;

public class CastingPrimitives {
    public static void main(String[] args) {
        /*
        *   Casting de tipos primitivos
        * - Quiero convertir este valor a este otro tipo.
        *  - Se escribe colocando el tipo entre paréntesis:
        */ 

        int x = (int)1.0; // double → int
        short y = (short)1921222; // 20678 
        // Compila pero el valor no se representa como un short.
        int z = (int)9l; 
        long t = 192301398193810323L;
        /*
            Overflow:
            - Cuando un valor es demasiado grande para el tipo de datos, se produce un desbordamiento.
            - El valor se ajusta al rango del tipo de datos.
        */

        System.out.print(2147483647 + 1); // -2147483648

        /* 
        Casos donde no compila:
            short x = 10;
            short y = 3;
            short z = x * y; // DOES NOT COMPILE
            Si bien x e y son short, el resultado de la multiplicación es int por defecto.
        */

        short a = 10;
        short b = 3;
        short c = (short)(a * b);

        System.out.println("\r\nCasting Primitive Values");

    }
}
