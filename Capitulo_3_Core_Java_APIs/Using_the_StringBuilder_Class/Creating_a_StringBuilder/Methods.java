package Using_the_StringBuilder_Class.Creating_a_StringBuilder;

public class Methods {
    /*  
    Formas de crear un StringBuilder.
    */

    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        // valor vacio (sin caracter).
        StringBuilder sb2 = new StringBuilder("animal");
        // que ya empieza con un valor el cual es "animal"
        StringBuilder sb3 = new StringBuilder(10);
        // vacio pero reservando un espacio de 10 caracteres
        System.out.println(sb1);
        System.out.println(sb2);
        System.out.println(sb3);

        // StringBuilder sb = new StringBuilder(5);
        // valor reservado con 5 caracteres
        // sb.append("anim");
        // 0 - 1 - 2 - 3 - 4
        // sb.append("anim");
        // 0 - 1 - 2 - 3 - 4 - 5 - 6 - 7  

    }
}
