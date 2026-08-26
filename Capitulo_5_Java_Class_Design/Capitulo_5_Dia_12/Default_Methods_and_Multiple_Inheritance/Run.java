package Capitulo_5_Dia_12.Default_Methods_and_Multiple_Inheritance;

public interface Run {
    // Paso 2.
    public default int getSpeed() {
      return 10;
   }
   
   /*
   Definimos el mismo metodo default getSpeed() sin parametros y que devuelve el valor distinto al 5
   el cual es ahora de 10 que es de tipo int.
   */


}
