package Introducing_Class_Inheritance.Overriding_a_Method;

public class BactrianCamel extends Canine{
    /* 
    // Violacion de reglas:
    private int getNumberOfHumps(){ // DOES NOT COMPILE.
        return 2;
    }
    // El tipo de retorno es incompatible con el metodo de la superclase.
    // La clase padre tiene un retorno de tipo String y aqui se aplica el int.

    public static void main(String[] args) {
        new BactrianCamel().getNumberOfHumps();
    }
    */
}
