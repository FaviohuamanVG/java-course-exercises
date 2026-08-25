
public class OverlayVarArgs {
    /*  
    Aunque (int[] lengths) e (int... lengths) se ven diferentes. La realidad es que son 
    el mismo tipo de parametro.
    Los varargs (int... lengths) son solo vistas sinteticas. Internamente Java los convierte
    en un array (int[] lengths). Por lo tanto, no se puede sobrecargar.
    */

    public void fly(int[] lengths) { } // COMPILE
    // metodo que recibe un array int --> un array de enteros

    // public void fly(int... lengths) { }  DOES NOT COMPILE
    // metodo "parece" diferente pero en realidad es igual que el anterior.
    // Internamente es un ARRAY.

    // Formas validas de llamar (si solo existiera uno de los dos métodos):
    //  fly(new int[] {1, 2, 3}); funciona como un array o varargs.
    // fly(1, 2, 3);  solo funciona con varargs.

    public static void main(String[] args) {
        System.out.println("Overloading and Varargs");
    }

}
