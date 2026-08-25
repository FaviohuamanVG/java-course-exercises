package Creating_Constructors.Order_of_Initialization;
    /*
    Orden de Inicializacion:
    1. Si hay superclases, se inicializan primero.
    2. Variables estaticas e inicializadores estaticos.
    3. Variables de instancia e inicializadores de instancia.
    4. Constructor.
    */
public class InitializationOrderSimple {
    private String name = "Torchie";

    {System.out.println(name);}

    private static int COUNT = 0;

    static {System.out.println(COUNT);}

    static{COUNT += 10; System.out.println(COUNT);}

    public InitializationOrderSimple(){
        
        System.out.println("constructor");
    }
}
