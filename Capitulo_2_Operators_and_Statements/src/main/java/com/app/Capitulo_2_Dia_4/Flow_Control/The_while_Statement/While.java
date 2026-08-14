package com.app.Capitulo_2_Dia_4.Flow_Control.The_while_Statement;

public class While {
    /*
    *   Bucle While:
    *  - Su objetivo es repetir un bloque de codigo mientras una condicion sea verdadera.
    * 
    *  while(condicion){ 
    *   // codigo a repetir
    * }
    * 
    * condicion siempre es un valor booleano.
    * 
    */


    int roomInBelly = 5;
    
    public void eatCheese(int bitesOfCheese) {
        while(bitesOfCheese > 0 && roomInBelly > 0){
            bitesOfCheese--;
            roomInBelly--;
        }
        System.out.println(bitesOfCheese +" pieces of cheese left.");
    }

    /*
    * Bucle infinito:
    *
    *  int x = 2;
    *  int y = 5;
    * while (x < 10){
    *   y++;  
    * }
    * 
    *  Porque? El valor de X nunca cambia, la variable Y va aumentando mientras la X siga siendo 2.
    * 
    */

        public static void main(String[] args) {
            While cheese = new While(); // creamos un objeto de la clase while
            cheese.eatCheese(10); // definimos el argumento para el metodo
        }
}
