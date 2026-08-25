package Abstract_Classes.Creating_a_Concrete_Class;

public class Flamingo extends Bird {

    // Aunque Flamingo por sí sola estaría bien escrita, la clase Bird ya rompió la compilación antes.
    public String getName() {
        return "Flamingo";
    }

    public static void main(String[] args) {
        final Flamingo flamingo = new Flamingo();
        System.out.println(flamingo.getName());
    }
}
