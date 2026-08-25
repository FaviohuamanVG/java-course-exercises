package Abstract_Classes;

public class Swan extends Animal {
    public String getName(){
        return "Swan";
    }

    public static void main(String[] args) {
        Swan swan = new Swan();
        System.out.println(swan.getName());
        swan.eat();
    }
}
