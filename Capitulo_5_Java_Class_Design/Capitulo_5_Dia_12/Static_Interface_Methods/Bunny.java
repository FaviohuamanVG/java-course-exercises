package Capitulo_5_Dia_12.Static_Interface_Methods;

public class Bunny implements Hop{
    // Paso 2. Implementacion que no compilara:
   
    /* 
    public void printDetails() {
      System.out.println(getJumpHeight()); // DOES NOT COMPILE
    }
    */

   /*
   No compila, aunque Bunny implemente Hop, no va heredar getJumpHeight() como si fuera propio.
   Ya que lo estamos llamando como si fuera un metodo local o heredado, por esa razon es la que
   falla porque Java no lo reconoce como parte de la clase Bunny.
   // Error de compilacion.
   */

   // Paso 2.1 que si compila:
   public void printDetails() {
      System.out.println(Hop.getJumpHeight());
   }

   /*
   A diferencia de lo anterior, este si compilara pq estamos poniendo el nombre de la interface
   Hop.getJumpHeight() el compilador sabe que es un metodo static sin la necesidad de herencia.
   Esto es obligatorio siempre que se usa el metodo static en una interface, ya que no se hereda.
   */

   public static void main(String[] args) {
        Bunny bunny = new Bunny();
        bunny.printDetails();
   }
}
