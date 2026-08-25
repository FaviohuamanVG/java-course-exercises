package Creating_and_Manipulating_Strings.The_important_String_Methods.subString;

public class SubString {
    /*  
    subString() - "dame un pedazo de la cadena"
    */

    // int substring(int beginIndex) -- desde donde empieza a tomar caracteres
    // int substring(int beginIndex, int endIndex) hasta donde llega sin incluirlo, se detiene antes de la posicion
    public static void main(String[] args) {
        String string = "animals";
        System.out.println(string.substring(3)); // mals
        System.out.println(string.substring(string.indexOf('m'))); // mals
        System.out.println(string.substring(3, 4)); // m
        System.out.println(string.substring(3, 7)); // mals

        // casos extraños o de error:
        System.out.println(string.substring(3, 3)); // empty string
        // String vacio
        System.out.println(string.substring(3, 2)); // throws exception
        System.out.println(string.substring(3, 8)); // throws exception

    }


}
