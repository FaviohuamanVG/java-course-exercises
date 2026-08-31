public interface CanSwim {
    /*
    Cuando se declara una variable dentro de una interfaz, el compilador puede asumir sus 3 modificadores:
    public - - Accesible desde cualquier clase
    static - - Pertenece a la interfaz y no a una instancia de la interfaz
    final - - No puede ser modificada, es una constante
    */

    // public static final 
    // Como es implicito ya no podemos usar los modificadores:
    // private o protected (chocan con final).
    // abstract (choca con final ya que final no puede quedar sin implementar/definir).
    // Final debe ser inicializado en la misma linea donde se declara.

    int MAXIMUN_DEPTH = 100; // No lleva modificadores explicitos
    final static boolean UNDERWATER = true; // Tiene 2 modificadores aqui el orden no importa
    public static final String TYPE = "Submersible"; // 3 modficadores explicitos y coinciden con el compilador

    /*
    Aqui estamos declarando variables de una interfaz, que son publicas, estaticas y finales.
    Aunque nosotros no lo pongamos el compilador les impone automaticamente estos modificadores:

    - public static final
    A lo cual nuestras variables internamente se mirarian asi:
    - public static final int MAXIMUN_DEPTH = 100;
    - public static final boolean UNDERWATER = true;
    - public static final String TYPE = "Submersible";

    Y se convierten en una constante de clase accesible sin instancia.
    */

    // Ejemplos donde no compilarian:
    /*
    private int MAXIMUM_DEPTH = 100;              // NO COMPILA
    protected abstract boolean UNDERWATER = false; // NO COMPILA
    public static String TYPE;                     // NO COMPILA

    private entra en conflicto con public que es obligatorio, ya que no puede ser modificada.
    protected choca con public q es obligatorio y abstract con final obligatorio (no puede ser abstracta)
    public static String TYPE; // No tiene valor asignado y falta final pero el compilador lo agrega    
    */

    public static void main(String[] args) {
        System.out.println("Interface Variables");
        System.out.println("Cuando declaramos una interfaz puede asumir 3 modificadores, gracias a que son implicitos, estos son: public, static y final.");
        System.out.println("Pero aveces pueden chocar con otros modificadores como private, protected o abstract.");
    }


}
