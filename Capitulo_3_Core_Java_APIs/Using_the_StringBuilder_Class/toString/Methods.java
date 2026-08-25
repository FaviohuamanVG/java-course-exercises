package Using_the_StringBuilder_Class.toString;

public class Methods {
    /* 
    StringB. es eficiente para modificar, construir texto, etc. Pero necesita el resultado final
    como un String de verdad.
    */
   // String toString() Convierte el StringB. en un String normal, con el contenido actual al que lo llamas.
   public static void main(String[] args) {
        StringBuilder string = new StringBuilder("ABC");
        String s = string.toString(); // convertimos "ABC" a string.
        string.append("dvc"); // agregamos el valor "dvc" a la cadena "ABC"
        System.out.println(s); // el valor no cambia y siempre sera ABC
   }
}
