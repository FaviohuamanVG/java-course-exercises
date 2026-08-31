package Applying_Access_Modifiers.Static_Initialization;

/*  
- Los bloques static se ejecutan UNA SOLA VEZ cuando la clase se carga en memoria (incluso antes de ejecutar el main).
- Las variables static final deben recibir un valor EXACTAMENTE UNA VEZ (en su declaración o en un bloque static).
*/
public class Initializers {

    // Forma 1 de inicializar static final: En un bloque static
    private static final int NUM_SECONDS_PER_HOUR;
    static {
        System.out.println("-> Ejecutando primer bloque static...");
        int numSecondsPerMinute = 60;
        int numMinutesPerHour = 60;
        NUM_SECONDS_PER_HOUR = numSecondsPerMinute * numMinutesPerHour;
    }

    private static int one;
    private static final int two;
    
    // Forma 2 de inicializar static final: En la misma línea de declaración
    private static final int three = 3; 
    
    // private static final int four; // NO COMPILA: jamás se inicializa dentro del bloque ni en su declaración.

    static {
        System.out.println("-> Ejecutando segundo bloque static...");
        one = 1;      // OK: no es final, admite múltiples asignaciones.
        two = 2;      // OK: primera y única asignación válida para "two".
        
        // three = 3; // NO COMPILA: reasignación de "three" (ya se asignó arriba).
        // two = 4;   // NO COMPILA: reasignación de "two" (ya se le asignó valor en la línea anterior).
    }

    // --- MÉTODO MAIN PARA DOCUMENTAR Y PROBAR EL CÓDIGO ---
    public static void main(String[] args) {
        System.out.println("\n--- Entrando al método main ---");
        System.out.println("NUM_SECONDS_PER_HOUR: " + NUM_SECONDS_PER_HOUR); // Imprime 3600
        System.out.println("one: " + one);                                   // Imprime 1
        System.out.println("two: " + two);                                   // Imprime 2
        System.out.println("three: " + three);                               // Imprime 3
    }
}