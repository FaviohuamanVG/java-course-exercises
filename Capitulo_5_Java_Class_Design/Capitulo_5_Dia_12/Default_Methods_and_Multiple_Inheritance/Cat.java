package Capitulo_5_Dia_12.Default_Methods_and_Multiple_Inheritance;

// Paso 3.
public class Cat implements Walk, Run { // DOES NOT COMPILE

    /*
    Cat hereda estas 2 implmentaciones default distintas para el mismo metodo.
    Al no existir jerarquia una sobre la otra, Java las trata como hermanas y
    el compilador no decide a cual usar, por eso no compila.
    */

   // Solucion: Paso 3.1: <-- 

   public int getSpeed() { // No necesita llevar default - es un metodo normal de clase no de interface.
      return 1; // O Run.super.getSpeed()
   }

   /*
   Al declarar explicitamente el metodo getSpeed() dentro de Cat, estamos sobreescribiendo el metodo default
   por lo tanto ya no existe ambiguedad y el compilador ya no se queja.
   La clase tiene su propia version concreta del metodo y tiene prioridad sobre cualquier default heredado.
   */

    // Paso 4.
    public static void main(String[] args) { // Nisiquiera llega a ejecutarse.
      System.out.println(new Cat().getSpeed());
   }
   /*
   Imprime 1, que es el valor devuelto por el metodo getSpeed() de la clase Cat.
   Por que ese metodo tiene mas prioridad que los defaults heredados de las interfaces Walk y Run.
   */

}
