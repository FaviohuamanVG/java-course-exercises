import java.io.IOException;
import java.io.FileReader;

public class Demo {
    /*
    Un catch y un finally pueden tener codigo valido en java, esto
    incluye que tenga otro try completo y sobre todo, que si tanto
    catch como finally lanzan excepciones solo la ultima excepcion
    lanzada es la que sobrevive, las anteriores se olvidan.

    try{
        // codigo valido
        // excepcion
    } catch (Excepcion e){
        // codigo valido
        // excepcion
    } finally {
        // codigo valido
        // excepcion
    }
    // excepcion lanzada

    -- Aqui, vemos que tanto el try, catch y finally tiene codigo valido
    pero tambien lanzan excepciones, en tal caso como se puede observar
    la excepcion de finally es la ultima que sobrevive y es la que se lanza
    ignorando por completo las excepcion lanzadas antes y tambien ignorando
    la excepcion fuera de try pq nunca llego a ejecutarse.

    */

    public static void main(String[] args) throws Exception {
        FileReader reader = null;
        try{
            reader = read();
            System.out.println("Paso 1:");
        } catch (IOException e){
            System.out.println("Paso 2:");
            try{
                if(reader != null){
                    reader.close();
                } else {
                    System.out.println("Paso 3");
                }
            } catch(IOException inner){
                System.out.println("Paso 4:");
            }
        }
        System.out.println("Paso 5:");
        
        Demo demo = new Demo();
        Demo.exceptions();
        Demo.abstracts();

    }

    /*
    el try inicial lanza una excepcion IOException a lo cual el try es roto y se salta pasando 
    ahora al catch el cual tiene la excepcion e imprime por ejemplo: Paso 2, luego ingresa al 
    try dentro del catch y este verifica si reader != null pero reader no cambia su valor a lo
    cual reader.close(); nunca aparece y se va al else el cual imprime: Paso 3, al no ver excepcion
    tampoco se ingresa al catch y se termina ese try interno y luego como tambien termino el try 
    externo imprime Paso 5 al final.
    
    */

    private static FileReader read() throws IOException {
        throw new IOException("archivo no encontrado");
        // 
    }

    public static void abstracts() throws Exception{
        try{
            System.out.println("Paso 1:");
            throw new RuntimeException();
        } catch(RuntimeException e){
            System.out.println("Paso 2:");
            throw new RuntimeException();
        } finally {
            System.out.println("Paso 3:");
            throw new Exception();
        }
    }

    /*
    Se entra al try y como ese tiene un imprimir antes de throw new
    RuntimeException(); se imprime Paso 1 y luego lanza RuntimeException();
    saltandose al catch el por que coincide con la excepcion RuntimeException
    cual tambien tiene un imprimir antes del new RuntimeException y este seria
    el error final demostrado si no hubiera un finally pero como existe entonces
    se ejecuta finally(pq siempre se ejecuta) entonces imprime Paso 3 y lanza 
    la ultima excepcion ignorando a las demas.
    */

    public static String exceptions() {
        String result = "";
        String v = null;
        try{
            try {
                result += "before";
                v.length();
                result += "after";
            } catch (NullPointerException e){
                result += "catch";
                throw new RuntimeException();
            } finally {
                result += "finally";
                throw new Exception();
            }
        } catch (Exception e){
            result += "done";
        }
        return result;
    }

    /*
    El try externo ingresa al try interno y ese concatena primero al result ahora es before,
    v.length(); genera un NullPointer  y se rompe try interno, saltando a catch luego result
    vale beforecatch gracias al catch y lanza excepcion RuntimeException pero existe finally 
    entonces result vale beforecatchfinally y lanza ese excepcion ignorando a las demas y asi
    terminando ese try y luego con la excepcion de finally Exception que es capturada por el
    catch exterior se salta a ese catch valiendo ahora beforecatchfinallydone y lanzando esa 
    exception terminando el try y termina retornando beforecatchfinallydone.
    */



}
