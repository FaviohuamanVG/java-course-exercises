package Introducing_Class_Inheritance.Overriding_vs_Hiding_Methods;

public class Kangaroo extends Marsupial {
    public static boolean isBiped() {
        return true;
    }

    public void getKangarooDescription() {
        System.out.println("Kangaroo hops on two legs: " + isBiped());
    }

    // Con overriding:
    public boolean isBiped1() {
        return true;
    }

    public void getKangarooDescription1() {
        System.out.println("Kangaroo hops on two legs: " + isBiped1());
    }

    public static void main(String[] args) {
        Kangaroo jey = new Kangaroo();
        jey.getMarsupialDescription();
        jey.getKangarooDescription();
        jey.getMarsupialDescription1();
        jey.getKangarooDescription1();
    }
}
