package Creating_and_Manipulating_Strings.The_important_String_Methods.replace;

public class Methods {
    /*  
    replace() -- Busca todas las apariciones de algo y las cambia por otras cosas
    */

    // String replace(char oldChar, char newChar) -- Trabaja con chars individuales (un solo caracter x otro)
    // String replace(CharSequence oldChar, CharSequence newChar) -- Trabaja con algo representativo del texto
    public static void main(String[] args) {
        System.out.println("abcabc".replace('a', 'A')); // AbcAbc
        System.out.println("abcabc".replace("a", "A")); // AbcAbc
    }

    // Reemplaza todas las coincidencias no solo las primeras, a diferencia de IndexOf que reemplaza la primera
    // Sigue inmutable, no reemplaza la cadena del string devuelve uno nuevo.

}
