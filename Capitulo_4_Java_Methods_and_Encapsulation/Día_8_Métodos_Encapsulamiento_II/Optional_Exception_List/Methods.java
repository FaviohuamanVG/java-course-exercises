package Designing_Methods.Optional_Exception_List;

public class Methods {
    /*  
    Option Exception List: Nos presente la clausula throws, dentro de la
    firma de un metodo que es opcion y va dentro del metodo
    */

    // modificadores tipoRetorno nombreMetodo(parámetros) throws Excepcion1, Excepcion2 { cuerpo }
    // throws Avisa que existe la posibilidad de que se lance una excepcion.
    // Declarado luego de los parametros, antes de las llaves y del cuerpo del metodo.

    public void zeroExceptions(){ // Es valido
        // La lista de excepciones es opcional.  
    }

    public void oneException() throws IllegalArgumentException {
        // Existe la posiblidad de que se lance una excepcion.
    }

    public void twoExceptions() throws IllegalArgumentException, InterruptedException {
        // Podria lanzar cualquiera de las 2 excepciones.
    }

    public static void main(String[] args) {
        System.out.println("Optional Exception List: Nos presente la clausula throws, dentro de la firma de un metodo que es opcion y va dentro del metodo");
    }

}
