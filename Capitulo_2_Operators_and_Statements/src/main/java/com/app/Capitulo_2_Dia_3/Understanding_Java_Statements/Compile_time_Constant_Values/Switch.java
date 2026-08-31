package com.app.Capitulo_2_Dia_3.Understanding_Java_Statements.Compile_time_Constant_Values;

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


        /*
        El switch el una estructura de control para la 
        simplificacion de multiples if-else, pero no es
        recomendable utilizarlo para casos donde estas
        necesiten de una expresion booleana, ya que no 
        es posible utilizarlos        
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

        /*
        Aqui estamos realizando un switch sin el uso de break, lo que
        hace que se ejecute el bloque de codigo del default ya que hay
        un break terminando el default deteniendo la ejecucion del switch.
        */



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

        /*
        
        Aqui estamos realizando un switch sin el uso de break, lo que
        hace que se ejecute el bloque de codigo del default ya el case 0
        no cumple con la condicion y se salta al default y como no existe
        un break con el que termine sigue hasta el caso 6 haciendo que se
        imprimian 2 valores: Weekday y Saturday.
        */

   }
}   
