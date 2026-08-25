package Overloading_Methods;

/*
REGLAS DE SOBRECARGA (Method Overloading):
1. OBLIGATORIO: Mismo nombre, pero DIFERENTE lista de parámetros (tipo, cantidad u orden).
2. OPCIONAL: Se puede cambiar el tipo de retorno, modificador de acceso, excepciones o 'static', siempre que los parámetros cambien.
3. ERROR: Cambiar SOLO el tipo de retorno, 'static', o el acceso MANTENIENDO los mismos parámetros produce un error de compilación.
*/
public class Overloading {

    // --- SOBRECARGAS VÁLIDAS ---
    
    public void fly(int numMiles) {
        System.out.println("Volar millas (int): " + numMiles);
    }

    public void fly(short numFeet) {
        System.out.println("Volar pies (short): " + numFeet);
    }

    public boolean fly() { // Cambia el retorno y la cantidad de parámetros
        System.out.println("Volar sin parámetros");
        return false;
    }

    void fly(int numMiles, short numFeet) { // Cambia el acceso y número de parámetros
        System.out.println("Volar int, short");
    }

    public void fly(short numFeet, int numMiles) throws Exception { // Cambia el orden y añade 'throws'
        System.out.println("Volar short, int con excepción");
    }

    // --- SOBRECARGAS IN VÁLIDAS (Descomentar para ver el error de compilación) ---

    // Error 1: Intenta sobrecargar cambiando SOLO el tipo de retorno
    // public int fly(int numMiles) { return numMiles; } // ❌ DOES NOT COMPILE

    // Error 2: Intenta sobrecargar cambiando SOLO a 'static'
    // public static void fly(int numMiles) { } // ❌ DOES NOT COMPILE

    public static void main(String[] args) {
        Overloading o = new Overloading();

        o.fly();                  // Ejecuta fly()
        o.fly(10);                // Ejecuta fly(int)
        o.fly((short) 5);         // Ejecuta fly(short) gracias al casting
        o.fly(100, (short) 20);   // Ejecuta fly(int, short)
    }
}