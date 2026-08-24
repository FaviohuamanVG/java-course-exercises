package Introducing_Class_Inheritance.Hiding_Variables;

public class Jellyfish extends Animal {
    public int length = 5;
    public static void main(String[] args) {
        Jellyfish jf = new Jellyfish();
        Animal an = new Jellyfish();
        System.out.println(jf.length);
        System.out.println(an.length);
    }

}
