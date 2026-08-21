package Creating_Constructors.Default_Constructor;

public class RabbitsMultiply {
    public static void main(String[] args) {
        Rabbit1 r1 = new Rabbit1(); // Java le genera un constructor x defecto.
        Rabbit2 r2 = new Rabbit2(); // No tiene un constructor x defecto.
        // Ya tiene uno definido escrito a mano
        Rabbit3 r3 = new Rabbit3(true); // Constructor con parametro Boolean. 
       // Rabbit4 r4 = new Rabbit4();  DOES NOT COMPILE, private constructor.

        System.out.println("Constructor x defecto");
        System.out.println("Tipos de constructores");

    }
}
