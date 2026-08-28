package Understanding_Exceptions.Calling_Methods_That_Throw_Exceptions;

public class Bunny {
    /*
    Llamada de los metodos checked exceptions, es decir aquellos metodos que 
    lanzan una excepcion con la firma throws.
    */

    public static void main(String[] args) throws NoMoreCarrotsException /*Caso 2 -- SOLUCION */  {
        // eatCarrot(); Caso 1.

        /*
        Primeramente nos da un error de compilacion, ya que el metodo eatCarrot() 
        lanza una excepcion, esto es porque el metodo main esta llamando a eatCarrot();
        pero este no tiene declarado throws en su firma, por lo tanto el compilador
        nos dice que debemos manejar la excepcion ya que la estamos llamado (nos estan
        pasando la responsabilidad). -- Caso 1.
        */
        eatCarrot(); // Caso 2. El main maneja la excepcion

        /*
        Como estamos manejando las excepcion en el main y declaramos la
        firma throws NoMoreCarrotsException, el compilador nos permite
        compilarlo y ya no da error. -- Caso 2.
        */

        // Caso 3 manejarlo con un try-catch
        try {
            eatCarrot(); // Caso 3. Manejarlo con un try-catch
        } catch (NoMoreCarrotsException e) {
            System.out.println("sad rabbit!");
        }

        /*
        Otra forma de manejar sin agregar la firma throws en el main, es 
        manejarlo con un try-catch, de esta manera el compilador ya no
        da mas errores y podemos manejar las excepcion nosotros mismos. 
        -- Caso 3.
        */
    }

    private static void eatCarrot() throws NoMoreCarrotsException {

    }

/* 
    // Casos inalcanzables, no se pueden compilar.

    private static void eatCarrot1() {
    }

    /*
    Es un metodo distinto a eatCarrot() ya que este no lanza error o
    no esta declarado con throws, por lo cual no es necesario
    manejarlo ni declararlo en el main.


    public void bad(){
        try {
            eatCarrot1();
        } catch (NoMoreCarrotsException  e) {
           System.out.println("sad rabbit!");
        }
    }
*/

    /*
    Metodo bad() esta intentando manejar una excepcion la cual
    no esta siendo lanzado por el metodo eatCarrot1(); asi que
    pq manejaria un error en un metodo que no lo lanza? Por lo
    cual el catch da error de compilacion ya que no existe
    esa excepcion lanzada en eatCarrot1();




    public void good() throws NoMoreCarrotsException {
        eatCarrot1();
    }
*/
    /*
    Estamos declarando good con la firma throws NoMoreCarrotsException
    pero recordemos que el metodo eatCarrot1(); no esta lanzando una
    excepcion o error asi que no es necesario declararlo pero el compilador
    no nos da ese error.
    */

}

class NoMoreCarrotsException extends Exception {}