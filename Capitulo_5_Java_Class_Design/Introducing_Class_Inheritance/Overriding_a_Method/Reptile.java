package Introducing_Class_Inheritance.Overriding_a_Method;

public class Reptile {
    // Excepciones Validas
    protected boolean hasLegs() throws InsufficientDataException { // La hija no lanza Excepcion, es valido 
        throw new InsufficientDataException();
        // La hija puede elimina o reducir las excepciones del padre. Pero nunca añadir nuevas.
    }

    protected double getWeight() throws Exception { // La hija lanza un excepcion mas especifica debido 
    // a la subclase de Exception. La hija lanza una excepcion igual o mas especifica. Nunca mas amplia que el Padre.
        return 2;
    }

    // Excepciones Invalidas:
    protected double getHeight() throws InsufficientDataException { // El padre lanza una excepcion mas especifica
        // la hija lanza uno mas general. Exception al no ser subclase de InsufficientDataException no COMPILA
        return 2;
    }

    protected int getLength() {
        return 10;
    }

}
