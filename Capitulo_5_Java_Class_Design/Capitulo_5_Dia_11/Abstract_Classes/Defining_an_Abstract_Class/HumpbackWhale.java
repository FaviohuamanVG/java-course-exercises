package Abstract_Classes.Defining_an_Abstract_Class;

public class HumpbackWhale extends Whale {
    /*private*/ public void sing() { // Para que compile, el metodo abstracto de la clase padre Whale debe ser publico.
        System.out.println("Humpback whale is singing");
    }
}
