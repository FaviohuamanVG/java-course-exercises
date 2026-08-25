package Introducing_Class_Inheritance.Hiding_Variables;

public class Rodent {
    protected int tailLength = 4;
    public void getRodentDetails() {
        System.out.println("[parentTail=" + tailLength + " ]");
    }
}
