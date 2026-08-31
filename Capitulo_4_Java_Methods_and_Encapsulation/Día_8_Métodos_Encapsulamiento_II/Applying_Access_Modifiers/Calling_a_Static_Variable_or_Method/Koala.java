package Applying_Access_Modifiers.Calling_a_Static_Variable_or_Method;

/*  
Las distintas formas en las que puedes invocar o acceder a un miembro static (variables y métodos).
- La forma estándar de acceder a ellas es Koala.count o Koala.main(args)
- Pero se puede acceder a ellas a través de una instancia u objeto (k.count)
*/
public class Koala {

    // ¡OJO! Esta variable NO debe estar comentada para que el código funcione
    public static int count = 0; 

    public static void main(String[] args) {
        
        // --- PRUEBA 1: Objeto Null ---

        Koala k = new Koala();
        System.out.println(k.count); // Imprime 0
        k = null; // k es null, pero aún así se puede acceder a count porque es static.
        System.out.println(k.count); // Imprime 0 sin lanzar NullPointerException
   

        // --- PRUEBA 2: Valor compartido ---
        /* 
        Koala.count = 4;
        Koala koala1 = new Koala();
        Koala koala2 = new Koala();
        koala1.count = 6;
        koala2.count = 5;
        
        System.out.println(Koala.count); // Imprimirá 5
        */ 

    }
}
