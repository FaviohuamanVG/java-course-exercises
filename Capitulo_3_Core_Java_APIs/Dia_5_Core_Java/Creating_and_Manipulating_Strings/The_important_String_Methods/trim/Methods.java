package Creating_and_Manipulating_Strings.The_important_String_Methods.trim;

public class Methods {
    /* 
        trim() = Quita los espacios de los bordes
    */
    //  public String trim()


    public static void main(String[] args) {

        System.out.println("abc".trim()); // abc
        // no hay nada que recortar. Simplemente devuelve la misma cadena.
        System.out.println("\t a b c\n".trim()); // a b c
        // Quita las cosas como \t y \n, los cuales son un espacio y un salto de linea
    }
}
