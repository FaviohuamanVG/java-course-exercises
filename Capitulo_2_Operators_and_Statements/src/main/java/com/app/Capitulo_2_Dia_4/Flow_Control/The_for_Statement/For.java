package com.app.Capitulo_2_Dia_4.Flow_Control.The_for_Statement;

public class For {
    /*  
    *   Bucle For: Utilizado para repetir un bloque de codigo determinadas veces.
        - Siempre y cuando la condicion sea verdadera.
    * 
        estructura:
        for(inicializacion; condicion; actualizacion) {
            // código
        }
    */

    public void forTest(int forTests){
        for(int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
    }

    // 1. Creating an Infinite Loop
    /*
        for( ; ; ) {
            System.out.println("Hello World");
        }
    */

    // 2. Adding Multiple Terms to the for Statement
    public void forTest1(int forTests1){
        int x = 0;
        for(long y = 0, z = 4; x < 5 && y < 10; x++, y++) {
            System.out.print(y + " ");
        }
            System.out.print(x);
    }

    // 3. Redeclaring a Variable in the Initialization Block
    public void forTest2(int forTests3){
        /*int a = 0;
        for(long y = 0, a = 4; a < 5 && y < 10; a++, y++) { // DOES NOT COMPILE
            System.out.print(a + " "); // Estamos repitiendo la variable a, ya que la declaramos en el bloque de inicializacion del for y tambien fuera de este.
        }*/

        int ac = 0;
        long b = 10;
        for(b = 0, ac = 4; ac < 5 && b < 10; ac++, b++) {
            System.out.print(ac + " ");
        }

    }

    /*public void forTest3(int forTests4){ 
        // Error: No podemos declarar una variable de tipo primitivo y otra de tipo objeto en el mismo bloque de inicializacion del for.
        for(long y = 0, int x = 4; x < 5 && y<10; x++, y++) { // DOES NOT COMPILE
            System.out.print(x + " "); 
        }
    }*/

    /*public void forTest4(int forTests5){ 
    for(long y = 0, x = 4; x < 5 && y < 10; x++, y++) {
    System.out.print(y + " ");
    }
    System.out.print(x); // DOES NOT COMPILE
                    // La variable x no es visible fuera del bloque del for, ya que fue declarada en el bloque de inicializacion del for.
    }*/

    public static void main(String[] args) {
        For forLoop = new For();
        System.out.println("=== FOR TEST ===");
        forLoop.forTest(10);
        System.out.println("\n=== FOR TEST 1 ===");
        forLoop.forTest1(10);
        System.out.println("\n=== FOR TEST 2 ===");
        forLoop.forTest2(10);
        //forLoop.forTest3(10);
        //forLoop.forTest4(10);
    }
}
