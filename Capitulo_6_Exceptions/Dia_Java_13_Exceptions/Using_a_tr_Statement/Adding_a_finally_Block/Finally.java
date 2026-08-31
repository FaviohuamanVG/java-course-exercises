package Dia_Java_13_Exceptions.Using_a_tr_Statement.Adding_a_finally_Block;

public class Finally {
    /*
    Al bloque try-catch se le puede agregar la palabra o bloque finally.
    Esto es con el fin de que finally garantice que un cierto codigo 
    siempre se llegue a ejecutar asi exista o no exista una excepcion.
    El cual puede tener combinaciones:
    try - catch - finally
    try - finally

    try puede tener catch y finally o ambos, pero solo al menos uno
    de los 2 es obligatorio.
    */

    public static void explore(){
        try{
            seeAnimals();
            fall();
        } catch(Exception e){
            getHugFromDaddy();
        } finally{
            seeMoreAnimals();
        }
        goHome();
    }

    /*
    Es un metodo utilizando tanto try-catch como finally. En este caso pasa
    por los metodos seeAnimals() y fall(), el primer metodo logra ejecutarse
    pero fall() lanza una excepcion destruyendo el try y se ejecuta el
    metodo getHugFromDaddy() dentro del catch para finalmente ejecutar 
    seeMoreAnimals() y terminar con goHome() el cual lanza otra excepcion 
    y termina el programa.
    */

    public static void seeAnimals(){
        System.out.println("La niña se cae al ver animales");
    }
    /*
    Metodo de exploracion, y prueba del bloque try.
    */

    public static void fall(){
        throw new RuntimeException("Ow! I fell.");
    }
    /*
    Metodo de excepcion en el try el cual rompe el flujo del
    programa haciendo que se ejecute ahora el catch
    */

    public static void getHugFromDaddy(){
        System.out.println("El papá la abraza y le dice que todo va a estar bien");
    }
    /*
    Metodo de catch, el cual se ejecuta gracias ala excepcion lanzada en el fall()
    e imprime un mensaje de consuelo para la niña.
    */

    public static void seeMoreAnimals(){
        System.out.println("La niña ve más animales");
    }
    /*
    Metodo de finally, el cual se ejecuta luego del catch y garantiza que
    se ejecute el codigo dentro de el.
    */

    public static void goHome(){
        throw new RuntimeException("Ow! I foll.");
    }

    /*
    Metodo de excepcion el cual se ejecuta gracias a que 
    finally no lanza un error antes de su ejecucion, si 
    finally tiraba excepcion entonces goHome() no se ejecutaria.
    */

    public static void main(String[] args) {
        explore();
    }

    

}
