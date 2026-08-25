package Creating_and_Manipulating_Strings.The_important_String_Methods.charAt;

public class CharAt {
    /*
    CharAt: Otro metodo de String
    charAt = "dame el caracter que esta en esta posicion"
    */

    public static void main(String[] args) {
        String string = "animals";
        System.out.println(string.charAt(0)); // a
        System.out.println(string.charAt(6)); // a
        System.out.println(string.charAt(7)); // Error no compila
        // charAt mira las posiciones, entonces si empieza desde 0-6
        // Por lo cual es 7 no existe.

        
    }
}
