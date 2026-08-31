package Capitulo_5_Dia_12.Understanding_Polymorphism.Polymorphic_Parameters;

public class ZooWorker {
    
    public static void feed(Reptile reptile) {
        System.out.println("Feeding reptile " + reptile.getName());
    }

    /*
    Metodo que acepta un parametro de tipo Reptile y llama al metodo getName() del objeto reptile.
    El metodo feed() acepta cualquier subtipo de Reptile (Alligator, Crocodile) gracias al upcasting
    implicito.
    Garantizado que dentro del metodo podemos llamar a cualquier Reptile que declare el metodo getName().
    */

    public static void main(String[] args) {
        feed(new Alligator());
        feed(new Crocodile());
        feed(new Reptile());

        /*
        Llamamos al metodo feed() con diferentes tipos de reptiles. 
        Gracias a la polimorfia, el metodo getName() llamado en feed()
        devuelve el nombre correcto de la clase del objeto pasado como parametro.

        -- El feed(new Alligator()); Alligator es de subtipo de Reptile
        Un upcasting implicito sin cast necesario. Compila sin problema.
        */

        // feed(new Rodent());  // NO compilaría
        /*
        No compilaría porque Rodent no extiende de Reptile por lo tanto no es un subtipo de 
        Reptile. El metodo feed() solo acepta subtipos de Reptile. Se rechaza la llamada.
        */
    }
}
