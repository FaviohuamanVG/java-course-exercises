package Overloading_Methods.Putting_It_All_Together;

public class TooManyConversions {
    /*
    Java permite solo 1 conversion, no es posible realizar una cadena de conversiones.
    */
   public static void play(Long l) {

   }

   public static void play(Long... l) {

   }

   public static void main(String[] args) {
    // play(4); // Se realiza 2 conversiones, primero de int a Long, luego se autoboxea con long y long
    // son 2 conversiones encadenadas. Java no lo permite.
    play(4L); // Como ya es Long solo se hace autoboxing y COMPILE llamando a play(Long l).
   }

}
