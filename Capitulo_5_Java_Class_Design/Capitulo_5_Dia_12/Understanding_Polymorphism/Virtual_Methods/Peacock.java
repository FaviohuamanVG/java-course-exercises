package Capitulo_5_Dia_12.Understanding_Polymorphism.Virtual_Methods;

public class Peacock extends Bird {

    public String getName() {
        return "Peacock";
    }


    /*
    Un método virtual es un método que puede ser sobrescrito en una subclase y cuya 
    implementación se determina en tiempo de ejecución (runtime) en lugar de tiempo 
    de compilación (compile-time). En Java, todos los métodos no estáticos, no finales 
    y no privados son virtuales por defecto. 
    */

    public static void main(String[] args) {
        Bird bird = new Peacock();

        /*
        El tipo de referencia es Bird determinando que metodos puedes llamar sin castear - verificandose
        en compile-time.
        El tipo real del objeto es Peacock (determinando que implementacion se ejecuta - resolucion en
        runtime).
        */
        bird.displayInformation();

        /*
        El compilador verifica que Bird tenga un metodo displayInformation, entonces compila.
        El compilador busca displayInformation en el objeto real Peacock. Pero como no se
        sobreescribe entonces usa la version heredada de Bird:

        System.out.println("The bird name is: " + getName());

        // getName se invoca sin calificador explicito lo cual internamente es this.getName()
        this es un Peacock no un Bird.
        El compilador consulta a Peacock para getName(), encuentra que esta sobreescrito y 
        ejecuta Peacock.getName() devolviendo "Peacock" y por lo tanto la salida en consola es:
        The bird name is: Peacock

        -- displayInformation No importa si esta escrito en Bird, el compilador se basa en el objeto
        real, no donde esta escrito el codigo.

        */
    }

}
