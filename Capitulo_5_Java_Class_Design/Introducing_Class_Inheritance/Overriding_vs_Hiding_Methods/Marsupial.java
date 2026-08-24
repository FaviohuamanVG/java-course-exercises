package Introducing_Class_Inheritance.Overriding_vs_Hiding_Methods;

public class Marsupial {
    public static boolean isBiped() {
        return false;
    }

    public void getMarsupialDescription() {
        System.out.println("Marsupial walks on two legs: " + isBiped());
    }

    public boolean isBiped1() {
        return false;
    }

    public void getMarsupialDescription1() {
        System.out.println("Marsupial walks on two legs: " + isBiped1());
    }
}
