package Capitulo_5_Dia_12.Understanding_Polymorphism.Polymorphic_Parameters;

public class Reptile {
    /*
    Un metodo puede declarar un parametro de tipo superclase o interfaz y aceptar en 
    runtime cualquier subtipo sin necesidad de cast explicito - pq ir de subtipo a
    supertipo es una conversion implicita (upcasting) y no requiere cast explicito.
    */

    // public static void feed(Reptile reptile) { ... }

    /*
    Cuando se define un metodo asi: 
    Aceptamos cualquier tipo o subtipo de Reptile. Esto funciona pq el upcasting es 
    implicito.

    A diferencia del downcasting(supertipo → subtipo) que requiere un cast explicito y
    falla en runtime con ClassCastException.
    */

    /*
    El ejemplo con java.util.List:

    // ❌ Poco reutilizable — acopla el método a una implementación concreta
    public void process(ArrayList<String> items) { ... }

    // ✅ Reutilizable — acepta cualquier implementación de List
    public void process(List<String> items) { ... }
    */

    public String getName() {
        return "Reptile";
    }

    /*
    Metodo sin parametros que devuelve un String con el nombre de la clase.
    */


}
