package Introducing_Class_Inheritance.Hiding_Static_Methods;

public class Panda extends Bear {
    public static void eat() {
        System.out.println("Panda bear is chewing");
    }

    public static void main(String[] args) {
        Panda.eat();
    }

}
