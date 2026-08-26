package com.app.Capitulo_1_Dia_2.Understanding_Default_Initialization_of_Variables.Local_Variables;

public class LocalVariable {
    /*public int notValid(){
        int y = 10;
        int x;
        int reply = y + x;
        return reply;
    }*/

    /*public void findAnswer(boolean check) {
        int answer;
        int onlyOneBranch;
            if (check) {
            onlyOneBranch = 1;
            answer = 1;
            } else {
            answer = 2;
            }
            System.out.println(answer);
            System.out.println(onlyOneBranch); // DOES NOT COMPILE
        }
        */
   
    /*
    Las variables locales no se inicializan x defecto, por lo que si no se les asigna un valor antes
    de ser utilizadas, el compilador nos lanza un error de compilacion.

    Siempre son inicializadas dentro de un metodo, constructor o bloque de codigo. Incluyendo parametros
    del metodo. 

    Las locales contienen "basura" osea memoria sin definir hasta que se le asigna algo.
    El compilador no permite leer una variable local que no ha sido inicializada, por que sino
    dara un error de compilacion. 

    public int notValid(){
        int y = 10;
        int x;
        int reply = x + y;
        return reply;
    }
    
    Aqui hay un error de compilacion, ya que la variable x no ha sido inicializada, esto genera un
    error de compilacion.

    public int valid(){
        int y = 10;
        int x;
        x = 5;
        int reply = x + y;
        return reply;
    }

    Aqui si es valido, no hay error de compilacion, ya que la variable x ha sido inicializada antes
    de que pueda ser utilizada.   

    // En el metodo findAnswer, la variable answer es inicializada en ambos caminos del if, por lo 
    // tanto no hay error de compilacion. Sin embargo, la variable onlyOneBranch solo es inicializada
    //  en un camino del if, por lo tanto el compilador nos lanza un error de compilacion, ya que no 
    // puede garantizar que la variable onlyOneBranch haya sido inicializada antes de ser utilizada.

    -- Solucion: Inicializar la variable onlyOneBranch en el else para que no haya error de compilacion.
    */

}
