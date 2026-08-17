package Creating_and_Manipulating_Strings.The_important_String_Methods.contains;

public class Methods {
    /*  
    contains() - Devuelve true si el texto brindado aparece en cualquier
    parte del String no importa si al principio o al final    
    */

    // boolean contains(String str)

    public static void main(String[] args) {
        System.out.println("abc".contains("b")); // true
        // la b esta en algun lugar del string
        System.out.println("abc".contains("B")); // false 
        // no aparece en ningun lugar 
    }
 // str.contains(otherString) es como decir str.contains(otherString) != -1
}
