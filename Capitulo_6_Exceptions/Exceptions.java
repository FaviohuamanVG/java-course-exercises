import java.util.*;

public class Exceptions {
    /*
    Exceptions: Las excepciones aparecen o existen por estas razones:
    1. Puede ser culpa nuestra, errores de programacion, un metodo no soportado
    -- no inicializar una variable, no ejecutar un metodo.
    2. Fallos fuera de control (archivo borrado, conexion perdida, etc.)
    */


    public static void main(String[] args) {
        List<String> name1 = new ArrayList<>();
        name1.add("Juana");
        name1.add("Juana");
        name1.add("Juana");
        name1.set(4, "Juana"); // IndexOutOfBoundsException
    }

    // Es una excepcion IndexOutOfBoundsException
    /*
    Hacemos que el programa intente acceder a un indice inexistente
    en el ArrayList, lo que provoca que se lance una excepcion.
    No da error de compilacion pq la sintaxis es correcta, pero
    a la hora de ejecucion es el problema. Y lanza una Exception en
    tiempo de ejecucion.
    */

}
