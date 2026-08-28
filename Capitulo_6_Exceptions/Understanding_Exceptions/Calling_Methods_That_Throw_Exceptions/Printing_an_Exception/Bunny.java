package Understanding_Exceptions.Calling_Methods_That_Throw_Exceptions.Printing_an_Exception;

import java.io.IOException;

public class Bunny {
    /*
    Nos enseña a como imprimir una excepcion, ya que si no la 
    imprimimos nos dara un error de compilacion, ya que no 
    estamos manejando la excepcion. Ademas que hacer swallow
    es una mala practica.
    
    */

    public static void main(String[] args) {
        // Caso 1. RuntimeException
        try {
            hop();
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        /*
        Estamos manejando la excepcion del metodo hop() con la finalidad
        de imprimir dicha excepcion + su mensaje.
        try lanza una excepcion y salta al catch para poder manejarla.
        el valor se guarda en e y luego nosotros haciendo System.out.println(e) 
        nos imprime el nombre de la clase de la excepcion, ademas que 
        con e.getMessage() conseguimos imprimir cannot hop nada del tipo.
        Y con e.printStackTrace() nos imprime la pila de llamadas que
        se hicieron hasta llegar a la excepcion.
        */


        // Caso 2. IOException
        String textInFile = null;
        try {
            readInFile();
        } catch (IOException e) {
            // Ignora la excepcion.
        }
        System.out.println(textInFile.replace(" ", " "));

        /*
        Aqui se realizo un swallow de la excepcion, ya que se ignoro y no se
        hizo nada con la excepcion, por lo cual nos dara un error de compilacion
        y NullPointerException pq no se le asigno nada, pero la causa raiz fue que
        IOException silenciosamente fue ignorada.
        */


    }

    public static void hop() {
        throw new RuntimeException("cannot hop");
    }

    /*
    Declaramos el metodo static hop() que lanza una 
    excepcion RuntimeException que es unchecked, por
    lo cual no nos obliga a manejarla, pero si lo hacemos podemos
    imprimir la excepcion y su mensaje.
    */

    public static void readInFile() throws IOException {
        throw new IOException();
    }




}
