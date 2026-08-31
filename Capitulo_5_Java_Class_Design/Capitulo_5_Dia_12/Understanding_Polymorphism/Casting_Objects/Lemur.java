package Capitulo_5_Dia_12.Understanding_Polymorphism.Casting_Objects;

public class Lemur extends Primate {
    /*
    Podemos recuperar el acceso perdido a metodos, variables mas especificos haciendo un cast explicito
    de vuelta hacia el tipo original o a uno mas especifico.
    - Pero tambien hay limites solo se permite cast entre tipos relacionados gerarquicamente y aun asi
    podria fallar lanzando: ClassCastException si el objeto real no es del tipo al que se intenta castear.
    */

    // 1. Upcasting (subclase → superclase): no requiere cast explícito.
    // 2. Downcasting (superclase → subclase): requiere cast explícito obligatoriamente.
    // -- El compilador no lo hace por ti, porque no siempre es seguro.
    // 3. El compilador rechaza casts entre tipos no relacionados — si no existe ninguna relación de 
    // herencia/implementación entre dos clases, ni siquiera compila el cast.
    // 4. Un cast que compila puede fallar en tiempo de ejecución con ClassCastException, si el objeto 
    // real no es instancia del tipo al que intentas convertirlo
    
    public int age = 10;

    public static void main(String[] args) {
    // Creamos un objeto Lemur en memoria, la referencia lemur es de tipo Lemur.
    Lemur lemur = new Lemur();

    Primate primate = lemur;

    /*
    Se realiza un upcasting autom. porque Lemur es una subclase de Primate a lo cual no necesita cast.
    */
    // Lemur lemur2 = primate; // DOES NOT COMPILE
    /*
    Downcasting sin cast explicito, aunque se apunte al objeto Lemur el compilador no lo sabe con certeza
    y esta declarada en Primate pero puede apuntar a cualquier subclase de Primate no necesariamente a
    Lemur. Por eso no compila.
    */
    Lemur lemur3 = (Lemur)primate;

    /*
    Aqui estamos realizando un Downcasting con cast explicito, le decimos al compilador que estamos seguros
    y que confie en nosotros, que ahora estamos apuntando hacia Lemur. Y compila pq el objeto real si es
    un Lemur. Pero en caso que no lo fuera, lanzaria un ClassCastException.
    */

    System.out.println(lemur3.age);
    /*
    Como la referencia lemur3 es de tipo Lemur, recuperamos el acceso a la variable age y por lo tanto
    tendremos una salida en consola de 10.
    */
    }



    


}
