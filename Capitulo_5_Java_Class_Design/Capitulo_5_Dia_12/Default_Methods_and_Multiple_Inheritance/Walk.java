package Capitulo_5_Dia_12.Default_Methods_and_Multiple_Inheritance;

public interface Walk {
    /*
    Al permitir metodos default en interfaces y permitir que una clase implemente varias
    interfaces a la vez, Java se tope con el problema de la herencia multiple.

    Si hay 2 interfaces Run y Walk que cada una tenga su metodo default, que devuelvan valores 
    distintos y que una clase Cat implemente ambas, que version heredara Cat?
    */

    // Paso 1. 
    public default int getSpeed() {
      return 5;
   }
   /*
   Definimos un metodo default getSpeed() que devuelve el valor de 5
   */

    
}
