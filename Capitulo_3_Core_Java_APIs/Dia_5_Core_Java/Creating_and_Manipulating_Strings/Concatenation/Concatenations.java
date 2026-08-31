package Creating_and_Manipulating_Strings.Concatenation;

public class Concatenations {
    /* 
    - La concatenacion es el proceso de unir
    una o más Strings (cadenas) para formar una nueva.
    String concatenacion = "Hola";
    String concatenacion2 = "Mundo";
    System.out.println(concatenacion + " " + concatenacion2);
    */

    public void concatenar(){
        System.out.println(1 + 2); //3
        System.out.println("a" + "b"); // ab
        System.out.println("a" + "b" + 3); //ab3
        System.out.println(1 + 2 + "c"); //3c
    }

    public void concatenar2(){
        int three = 3;
        String four = "4";
        System.out.println(1 + 2 + three + four); //64
    }

    public void concatenar3(){
        String s = "1"; // s currently holds "1"
        s += "2"; // s currently holds "12"
        s += 3; // s currently holds "123"
        System.out.println(s); // 123
    }

    public static void main(String[] args) {
        Concatenations concat = new Concatenations();
        System.out.println("Concatenacion 1:");
        concat.concatenar();
        System.out.println("Concatenacion 2:");
        concat.concatenar2();
        System.out.println("Concatenacion 3:");
        concat.concatenar3();
    }

    /*
    
    */
}
