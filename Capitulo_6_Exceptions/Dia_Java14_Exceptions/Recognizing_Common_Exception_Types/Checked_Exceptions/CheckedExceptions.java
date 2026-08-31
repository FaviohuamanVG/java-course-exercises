package Dia_Java14_Exceptions.Recognizing_Common_Exception_Types.Checked_Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptions {
    /*
    Estas representan condiciones y errores externos que pueden ocurrir
    en el programa, el codigo esta fuera de control, se elimino alguna
    o algun archivo en determinado proceso o ruta y dejo de existir.
    Conexiones de red que se caen, bases de datos que no estan disponibles,
    etc, etc.
    */

    /*
    El compilador te fuerza a que los manejes con try-catch o
    que simplemente le pases la responsabilidad al metodo que lo
    llame declarando throws
    */

    // Jerarquia: FileNotFoundException extends IOException
    // FileNotFoundException debe ir antes que IOException
    // si va despues el compilador no lo permite y marca error.

    public void leerArchivo(String ruta) throws IOException{
        FileReader reader = new FileReader(ruta);
        reader.read(); 
        reader.close(); 
    }

    /*
    Aqui estamos manejando el checked exception con throws, el
    cual le estamos delegando la responsabilidad al metodo que
    lo llame. 
    Si no existe la linea 27 puede lanzar FileNotFoundException
    y reader.read();  puede lanzar IOException, si en caso
    haya problemas leyendo el archivo.
    
    */

    public void leerArchivoSeguro(String ruta){
        try {
            FileReader reader = new FileReader (ruta);
            reader.read(); 
            reader.close(); 
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado: " + ruta);
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: ");
        }
    }
    /*
    Aqui estamos manejando el checked exception con try-cath 
    directamente, el cual nos permite manejar la excepcion y 
    continuar con el flujo del programa.
    La line 47 siempre se coloca la sub-clase primero
    Y luego la super-clase, en este caso FileNotFoundException
    es la sub-clase y IOException es la super-clase.
    Nunca debe ir al reves, si se hace el compilador marca error.
    */

    public static void main(String[] args) throws IOException {
        CheckedExceptions ch = new CheckedExceptions();
        ch.leerArchivo("null");
        ch.leerArchivoSeguro("null");
    }

}
