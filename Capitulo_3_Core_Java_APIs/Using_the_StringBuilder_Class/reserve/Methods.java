package Using_the_StringBuilder_Class.reserve;

public class Methods {
    /* 
    Reverse:
    */
    // StringBuilder reverse() -- Invierte el orden de todos los caracteres, se modifica el contenido pero devuelve una referencia

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("ABC");
        // sb inicia con un valor de cadena "ABC"
        sb.reverse();
        // invertimos el valor de sb
        System.out.println(sb); // CBA
    }
}
