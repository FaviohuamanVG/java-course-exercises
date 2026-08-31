package Dia_Java_13_Exceptions.Understanding_Exceptions.Throwing_an_Exception;

public class Throw {
    /*
    Como se lanza una excepcion en Java?
    Podemos usar la palabra reservada throw para lanza una excepcion.
    throw new Exception("Error"); // new Exception() esta creando
    // un objeto nuevo de tipo exception.

    Nosotros podemos lanzar una excepcion a proposito. Hay un patron
    al cual debemos seguir:
    throw new NombreException("Mensaje de error");

    - Se puede pasar un String como mensaje (casi todas las excepciones
    tiene un constructor que lo permite).
    - O tal vez no pasar nada y dejarlo vacio.
    */



    public static void main(String[] args) {

        // Excepcion (bug oculto) sin utilizar Throw explicito.

        String[] animals = new String[0];
        System.out.println(animals[0]);

        // ArrayIndexOutOfBoundsException pq no hay indices validos.

        // Throw explicitos:
        /*
        throw new Exception();
        //Crea un objeto tipo Exception sin mensaje y lo lanza es checked
        // gracias a Exception y necesita estar dentro de un metodo.

        throw new Exception("Ow! I fell.");
        // Igual que el anterior pero con un mensaje de error. Este sigue
        // siendo checked y necesita estar dentro de un metodo.

        throw new RuntimeException();
        // Crea un objeto tipo RuntimeException sin mensaje y lo lanza.
        // Pero ahora es unchecked y no necesita throws ni catch para compilar.

        throw new RuntimeException("Ow! I fell.");
        // Igual que el anterior pero con un mensaje de error. Este sigue
        // siendo unchecked y no necesita throws ni catch para compilar.
        */
    }

}
