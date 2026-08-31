package Introducing_Class_Inheritance.Overriding_a_Method;

public class Snake extends Reptile {
    // Excepciones Validas
    protected boolean hasLegs(){
        return false;
    }

    protected double getWeight() throws InsufficientDataException {
        return 2;
    }
    
    /*  
    // Excepciones Invalidas:
    protected double getHeight() throws Exception { // DOES NOT COMPILE
        return 2;
    }

    protected int getLength() throws InsufficientDataException { // DOES NOT COMPILE
        return 10;
    }
    */
}
