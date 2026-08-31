package Creating_and_Manipulating_Strings.The_important_String_Methods.startWith;

public class Methods {
    /*  Comparaciones de contenidos
    Metodos parecidos a equals pero son completamente distintos
    startWith() -- El string empieza con ese texto?
    endWith() -- El string termina en ese texto?
    */

    // boolean startsWith(String prefix)
    // boolean endsWith(String suffix)

    public static void main(String[] args) {
    
        System.out.println("abc".startsWith("a")); // true
        System.out.println("abc".startsWith("A")); // false
        System.out.println("abc".endsWith("c")); // true
        System.out.println("abc".endsWith("a")); // false

    }
}
