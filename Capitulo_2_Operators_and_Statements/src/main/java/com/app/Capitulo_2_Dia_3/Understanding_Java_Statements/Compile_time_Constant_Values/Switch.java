package com.app.Understanding_Java_Statements.Compile_time_Constant_Values;

public class Switch {
    /*  
    * Switch: Es una estructura de control que permite ejecutar diferentes bloques de 
    * código según el valor de una expresión.
    * 
    * switch acepta:

        - Enteros pequeños
        - int
        - char
        - String
        - enum
    *  Pero no:
        - boolean
        - long
        - Boolean
        - Long
    */
   public static void main(String[] args) {
        /*
        * Ejemplo de If:
        if(opcion == 1) {
            System.out.println("Alta");
        } else if(opcion == 2) {
            System.out.println("Modificar");
        } else if(opcion == 3) {
            System.out.println("Eliminar");
        }
        */

        // En lugar de realizar un if-else, se puede utilizar un switch para simplificar.
        int dayOfWeek = 5;
        switch(dayOfWeek) {
        default:
            System.out.println("Weekday");
        break;
        case 0:
            System.out.println("Sunday");
        break;
        case 6:
            System.out.println("Saturday");
        break;
        }

        int dayOfWeeks = 5;
        switch(dayOfWeeks) {
        case 0:
            System.out.println("Sunday");
        default:
            System.out.println("Weekday");
        case 6:
            System.out.println("Saturday");
        break;
        }

   }
}   
