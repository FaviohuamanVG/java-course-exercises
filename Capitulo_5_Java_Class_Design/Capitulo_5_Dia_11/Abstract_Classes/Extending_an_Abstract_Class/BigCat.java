package Abstract_Classes.Extending_an_Abstract_Class;

public abstract class BigCat extends Animal {
    public abstract void roar();
    // BigCat extiende Animal, sigue siendo abstract, y agrega su propio método abstracto roar().

    // Clase abstracta intermedia que resuelve un método
    public String getName() {
        return "BigCat";
    }
}
