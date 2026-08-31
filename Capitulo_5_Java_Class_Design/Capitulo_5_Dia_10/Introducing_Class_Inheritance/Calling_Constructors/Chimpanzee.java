package Introducing_Class_Inheritance.Calling_Constructors;

public class Chimpanzee extends Ape{

    public static void main(String[] args) {
        new Chimpanzee();
        // Se dispara en cadena, haciendo que se ejecute primero el constructor Padre Primate1().
        // super() -> Ape() -> Primate1() -> Object().
        // La ejecucion del orden es inverson haciendo que primero se ejecute Object().
    }

}
