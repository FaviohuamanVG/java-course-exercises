package Capitulo_5_Dia_12.Understanding_Polymorphism.Casting_Objects;

public class Fish {
    public static void main(String[] args) {
      Fish fish = new Fish();
      // Bird bird = (Bird)fish; // DOES NOT COMPILE

      /*
      Bird y Fish no tienen ninguna relacion(extienden implicitamente a Object pero no entre si) a lo cual
      el compilador ve que es imposible que un objeto Fish y Bird sean simultaneamente el mismo objeto, 
      por lo que no permite hacer un cast de Fish a Bird. Error de compilacion.
      */
   }
}
