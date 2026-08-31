package Capitulo_5_Dia_12.Understanding_Polymorphism.Polymorphism_and_Method_Overriding;

public class Animal {
    /*
    Cuando se accede a un parametro atravez de una referencia de tipo Superclase, el compilador
    no conoce el "contrato" de la superclase por lo tanto no sabe nada de la subclase real.


    3 Reglas:
    Un método sobrescrito debe ser igual o más accesible que el original.
    Un método sobrescrito no puede declarar excepciones checked nuevas o más amplias que el original.
    Un método sobrescrito debe tener un tipo de retorno covariante (igual o subtipo) respecto al original.
    */

    // Accesibilidad (no reducir visibilidad)
    // Si Animal.getName() es public entonces cualquier codigo que tenga un referencia a Animal asume
    // que puede llamar a getName() libremente.

    /* 
    // Pero si Gorilla pudiera sobrescribirlo como protected, tendrías esta contradicción:
    Animal animal = new Gorilla();
    animal.getName(); 
    Si java permite que un metodo sobrescrito reduzca la visibilidad, entonces el compilador
    deberia fallar en tiempo de compilacion. Pero java prohibe reducir la accesibilidad asi que 
    la sobreescritura de getName() no se construye.
    */

    public String getName() {
        return "Animal";
    }


}
