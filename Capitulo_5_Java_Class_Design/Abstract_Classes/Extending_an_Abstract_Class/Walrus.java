package Abstract_Classes.Extending_an_Abstract_Class;

public class Walrus extends Animal { // DOES NOT COMPILE
    // Error de compilacion: Al no ser abstracto tiene la obligacion de implementar todos los metodos 
    // abstractos pero no implemento getName().
    // Implementacion concreta del metodo getName(). Para que compile
    public String getName() {
        return "Walrus";
    }

    public static void main(String[] args) {
        Walrus walrus = new Walrus();
        System.out.println(walrus.getName());
    }
}
