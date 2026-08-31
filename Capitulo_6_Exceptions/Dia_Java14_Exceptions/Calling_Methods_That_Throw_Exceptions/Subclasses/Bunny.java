package Dia_Java14_Exceptions.Calling_Methods_That_Throw_Exceptions.Subclasses;

public class Bunny extends Hopper {
    /*
    Subclases:
    */
    // Caso 1:
    /*public void hop() throws CanNotHopException {

    }

    class Hopper {
        public void hop(){

        }
    }

    Aqui tenemos un error de compilacion, ya que la subclase esta agregando una excepcion
    checked nueva que Hopper no tiene. Nos da error en tiempo de ejecucion nos daria una
    excepcion ya que nadie estaba preparado para poder manejarla.
    */

    // Solucion: Caso 1
    // Declarar mas o menos.

    public static void hop() /*throws CanNotHopException*/{
        /*
        Ahora podemos declarar el metodo hop() sin la firma o con la firma
        throws del mismo metodo pero no una nueva, por que la subclase no 
        puede declarar una excepcion que no esta marcada o declara en 
        la superclase.
        */
    }

    // Caso 2:
    public void hop2() throws IllegalStateException { }

    /*
    Porque no da error de compilacion? esto es debido a que con las RuntimeExceptions
    estan nos aplican las mismas reglas que tienen las checked exceptions, ya que estas
    al ser unchecked con los metodos sobreescritos o no, siempre lanzan una excepcion
    runtime sin declararla.
    */


    public static void main(String[] args) {
        System.out.println("Subclases y excepciones");
        System.out.println("Caso 1: Declarar mas o menos");
        System.out.println("Caso 2: RuntimeException");
        System.out.println("En el caso 1 aplica la regla de checked exceptions, en el caso 2 no aplica la regla de checked exceptions");
    }

}

class CanNotHopException extends Exception{}

// Solucion: Caso 1
class Hopper {
    public static void hop() throws Exception {

    }
    /*
    Declaramos la firma throws CanNotHopException, haciendola una excepcion 
    checked, nos dice que puede o no lanzar una excepcion y quien la llame
    debe estar preparado para poder manejarla. En tal claso bunny deberia poder
    manejarla al declararlo.
    */

    public void hop2() {

    }

}
