package Creating_Constructors.Overloading_Constructors;
    /*  
    Al igual que los metodos, se puede tener varios constructores en la misma clase, siempre
    y cuando tengan lista de paremetros diferentos.
    El nombre siempre es igual. No se usa criterio de diferenciacion.
    Y como evitarlo utilizando this() como llamada especial.
    */
public class Hamster {
    private String color;
    private int weight;

    public Hamster(int weight){ // Primer constructor con 1 parametro.
        this.weight = weight;
        color = "brown";
    }

    public Hamster(int weight, String color){ // Segundo constructor + 2 parametros.
        this.weight = weight;
        this.color = color;
    }

    /* 
    // Intentos Fallidos:
    public Hamster(int weight){ // DOES NOT COMPILE
        Hamster(weight, "brown");
    }

    public Hamster(int weight){ // Compila pero NO hace lo que queremos
        new Hamster(weight, "brown");
    }
    */

    /* 
    // Solucion Correcta:
    public Hamster(int weight){ // 
        this.weight = weight;
    }
    */

    // Regla de posicion:
    /*
    public Hamster(int weight){
        System.out.println("in constructor");
        // 
        this(weight, "brown"); // DOES NOT COMPILE, debe ser la primera linea del constructor.
    }
    */





}
