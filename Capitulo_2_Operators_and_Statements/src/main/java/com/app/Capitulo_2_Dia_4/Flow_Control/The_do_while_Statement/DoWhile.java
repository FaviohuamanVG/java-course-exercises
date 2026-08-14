package com.app.Capitulo_2_Dia_4.Flow_Control.The_do_while_Statement;

public class DoWhile {
    /*
    *   do While: Bucle parecido al while, pero su diferencia es que
    *   el bloque de codigo se ejecuta al menos una vez.
    *
    *  do {
            // código
        } while(condicion);
    */
    public void eatCheese(int bitesOfCheese){

        int x = 0;

        do{  // A diferencia del while
            x++; // primero ejecuta el bloque
        } while(false); // luego pregunta la condicion - ; es obligatorio al final del while.
        System.out.println("El valor de x es: " + x); // el valor de x es 1, porque se ejecuta al menos una vez.

    }

        public static void main(String[] args) {
            DoWhile cheese = new DoWhile();
            cheese.eatCheese(2);
        }

        /*
            While, do-While e if:

            while(x > 10) {
                x--;
            }

            do-while:
             do {
            x--;
            } while(x > 10);

            and if:
            if(x > 10) {
            do {
                x--;
            } while(x > 10);
            } else {
                x++;
            }
        */

}
