package Using_a_tr_Statement;

public class Try {
    /*
    Sintaxis basica de como usar un try-catch statement:
    Reglas rigidas definidas en las {} 

    try{
        // Codigo protegido
    } catch(Exception e){
        // manejo de excepcion
    }

    El codigo dentro del try se ejecuta linea x linea
    - Si una linea lanza una excepcion igual que el catch
    - el flujo del try se detiene y se salta al catch.
    - Si no hay excepcion, catch nunca se ejecuta.
    */

    public static void explore() {

        try{
            fall();
            System.out.println("never get here");
        } catch(Exception e){
            getUp();
        }
        seeAnimal();
    }

    /*
    Se crea un metodo explore() el cual contiene try-catch para el
    manejo de excepciones. Dentro del try se llama al metodo fall()
    el cual lanza una excepcion. El flujo de try se detiene y se salta
    al catch donde se llama al metodo getUp() que lanza una nueva
    UnsupportedOperationException. Como esta excepcion no es capturada
    dentro del explore(), el metodo termina alli y seeAnimal() nunca se
    logra ejecutar. Imprimiendo Unimplemented method 'getUp
    */


    public static void seeAnimal() {
        throw new UnsupportedOperationException("Unimplemented method 'seeAnimal'");
    }

    public static void getUp() {

        throw new UnsupportedOperationException("Unimplemented method 'getUp'");
    }

    public static void fall(){
        throw new RuntimeException();
    }

    /*
    Sintaxis que no compilan en un try-catch:

    try // DOES NOT COMPILE
        fall();
    catch (Exception e)
        System.out.println("get up")

    try-catch no compilara si esta no contiene
    las llaves que delimitan su bloque de codigo
    {} <-- son obligatorioas.
    */
    
    /* 
    try {// DOES NOT COMPILE
    fall();
    } 

    Declarada try pero no hay un catch por lo cual
    esto le impide que llega a compilar.
    try{

    } catch(){
    
    }
    */

    public static void main(String[] args) {
        explore();
    }

}
