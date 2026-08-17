package Using_the_StringBuilder_Class.char_int_length_etc;

public class Methods {
    /*  
    Metodos que se comportan igual que String:
    */

    // charAt(index) → índice basado en 0, lanza excepción si es inválido
    // indexOf(...) → busca coincidencias, devuelve -1 si no encuentra
    // length() → cuenta normal (no basado en 0)
    // substring(begin, end) → "detiene antes" del índice final, mismas reglas de excepción
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("animals");
        // inicia el sb con un valor de cadena llamada "animals"
        String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));
        // primera a -> es el indice 0 -- subcadena indexOf "al" aperece en el indice 4-5, indice 4
        int len = sb.length();
        // cuenta normal de los caracteres pero la longitud es 7
        char ch = sb.charAt(6);
        // caracter en la posicion 6 's'
        System.out.println(sub + " " + len + " " + ch);
    }
}
