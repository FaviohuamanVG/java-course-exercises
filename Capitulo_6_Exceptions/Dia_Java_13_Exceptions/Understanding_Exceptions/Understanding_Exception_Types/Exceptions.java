package Dia_Java_13_Exceptions.Understanding_Exceptions.Understanding_Exception_Types;

public class Exceptions {
    /*
    La jerarquia de tipos de excepciones en Java.
    -- Reglas tecnicas:
    Throwable - Tiene subclases: Error, RuntimeException.
    */

    // 3 Tipos de Errores:
    // a) Error: Algo salio mal y el programa no se recupera. Por lo general
    // son problemas que nunca vamos a manejar nosotros mismos.
    // b) RuntimeException: Son errores inesperdados pero no necesariamente
    // fatalaes. (Runtime = Unchecked Exception). Errores de programacion.
    // c) Checked Exception: Errores mas anticipados y esperados
    // No extienden de RuntimeException, Java nos obligar a hacer una de estas 2:
    // Manejar(handle): Usar un try-catch dentro del metodo.
    // Declarar(declare): usar throws NameException y delegar la responsabilidad
    // a quien llama al metodo.

    public void fall() throws Exception {
        throw new Exception("Error"); // new Exception() esta creando
        // un objeto nuevo de tipo exception.
    }

    /*
    Este metodo tiene throws y throw, ambos son diferentes:
    - throws: Es declarado en la firma del metodo nos avisa,
    si el metodo puede o no lanzar una excepcion. Ademas quien
    lo llame sera necesario manejarlo con un try-catch.

    - throw: Usada dentro del metodo y lanza una excepcion desde ya.
    Es una accion, java detiene el programa y busca quien pueda
    manejar esa excepcion. Si no hay nadie, el programa termina.
    */
   
    public static void main(String[] args) {
        System.out.println("Understanding Exception Types");
        System.out.println("Son 3 tipos de errores: Error, RuntimeException y Checked Exception");
    }


}
