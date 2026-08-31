package Capitulo_5_Dia_12.Understanding_Polymorphism.Virtual_Methods;

public class Bird {
    /*
    El dispatch dinámico de métodos, cuando llamamos a un metodo no-final, no-static y no-private sobre
    un Objeto, el compilador no decide que implementacion ejecutar segun el tipo de referencia, sino que
    se basa en el tipo real del objeto en memoria.
    -- Tambien aplica cuando ese metodo es invocado internamente desde dentro de una clase padre.
    */

    // Metods no virtuales:
    /*
    private — no son heredados/visibles para override, se resuelven en compile-time.
    static — se resuelven por el tipo de la referencia (esto es "method hiding", no overriding).
    final — no pueden ser sobrescritos, por lo que no hay ambigüedad que resolver en runtime.
    */

    public String getName() {
        return "Unknown";
    }

    public void displayInformation() {
        System.out.println("The bird name is: " + getName());
    }

}
