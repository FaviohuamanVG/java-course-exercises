package Abstract_Classes.Extending_an_Abstract_Class;

public class Lion extends BigCat {
    public String getName() {
        return "Lion";
    }
    public void roar() {
        System.out.println("The Lion lets out a loud ROAR!");
    }

    // Para compilar correctamente, está obligada a implementar tanto getName() 
    // (heredado de Animal) como roar() (heredado de BigCat).

    // Clase abstracta intermedia que resuelve un método
    public void roar1() {
        System.out.println("The Lion lets out a loud ROAR!");
    }

    public static void main(String[] args) {
        Lion lion = new Lion();
        System.out.println(lion.getName());
        lion.roar();
        System.out.println("Abstrac Intermedio: --- ---");
        lion.roar1();
    }
}
