package Dia_Java14_Exceptions.Recognizing_Common_Exception_Types.Errors;

public class Errors {
    /*
    Representan los problemas y errores graves del sistema, o errores
    de logica del programador. Estas nunca se manejan ni se declaran
    simplemente es reconocerlas y prevenirlas antes de que ocurran.
    Si se permite hacer catch(Error e) no es un error de compilacion
    pero Error representa una condicion de la que el programa no se
    puede recuperar y por lo tanto no deberia ser capturada.
    */

    // Error es una clase hermana de Exception ambas extiende de 
    // Throwable pero nunca sera checked, porque estas son unchecked exceptions.


    // ExceptionInInitializerError

    // StackOverflowError

    // NoClassDefFoundError

    public static void recursionInfinita(){
        recursionInfinita();
    }

    /*
    Se crea un metodo que se llama a si mismo de manera infinita, esto provoca
    un StackOverflowError, que es un error que ocurre cuando se excede
    el limite de la pila de llamadas del programa. Es un error que no se puede
    manejar y que no se puede recuperar, por lo tanto es una unchecked exception.
    */

    // ExceptionInInitializerError 
    static int resultado = 10 / 0;

    /*
    El bloque estatico se lanza y maneja, esto ocurre durante
    la inicializacion de la clase. Esto ocurre durante la
    inicializacion de la clase.
    */

    public static void main(String[] args) {
        recursionInfinita(); // provoca StackOverflowError
    }

}
