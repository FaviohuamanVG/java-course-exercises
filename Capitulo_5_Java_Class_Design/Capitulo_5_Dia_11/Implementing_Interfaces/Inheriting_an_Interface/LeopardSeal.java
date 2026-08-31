package Implementing_Interfaces.Inheriting_an_Interface;

public class LeopardSeal implements HasTail, HasWhiskers { // DOES NOT COMPILE
    // Error de compilación: no implementó getTailLength() ni getNumberOfWhiskers().
    // Al ser una clase concreta, debe implementar metodos de las interfaces que se implemento.
    /*
    Lo que se debe implementar para que compile:
    */
   public int getTailLength(){
    return 4;
   }

   public int getNumberOfWhiskers(){
    return 6;
   }

   public static void main(String[] args) {
    LeopardSeal ls = new LeopardSeal();
    System.out.println("Tail length: " + ls.getTailLength());
    System.out.println("Number of whiskers: " + ls.getNumberOfWhiskers());
    }
}
