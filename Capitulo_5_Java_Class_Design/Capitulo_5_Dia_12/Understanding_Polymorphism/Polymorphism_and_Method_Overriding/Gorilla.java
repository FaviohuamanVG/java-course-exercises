package Capitulo_5_Dia_12.Understanding_Polymorphism.Polymorphism_and_Method_Overriding;

public class Gorilla extends Animal {
    
    //protected String getName() { // DOES NOT COMPILE
    
    public String getName() { // Necesita ser public para que compile.
        return "Gorilla";
    }
    /*
    No compilara pero no se puede acceder a el desde una referencia de tipo Animal, 
    ya que la visibilidad se redujo a protected. Asi que en el runtime cuando
    se llame no ejecutara y dara un error de compilacion.
    */

    // Animal.getName() es public. Gorilla intenta sobrescribirlo como protected, 
    // que es menos accesible. Violando la regla 1.
}
