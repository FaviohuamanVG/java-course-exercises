package Overloading_Methods.Autoboxing;

public class Autoboxing {
    /*  
    El autoboxing es la conversion autom. que hace Java entre primitivos
    int a Integer 
    2 sobrecargas: int(primitivo) e Integer(objeto)
    Si hay sobrecarga entre int e Integer y se llama a un literal, int siempre va ir primero.
    Java busca primero una coincidencia exacta.
    */

    // Version con Integer.
    public void fly(Integer numMiles) { }
   // fly(3);  COMPILE - Java hace autoboxing de int a Integer y llama a este metodo.

   // Ambas versiones:
    public void fly2(int numMiles) { } //
    public void fly3(Integer numMiles) { } //
    // fly2(3); COMPILE - Java llama a fly(int), no fly(Integer)
    // Java busca el que requiere menos trabajo, si hay un coincidencia exacta.

    public static void main(String[] args) {
        System.out.println("Autoboxing");
    }


}
