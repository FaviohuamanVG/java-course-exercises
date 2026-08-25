package Creating_Constructors.Overloading_Constructors;
    /*
    Constructor Chaining: 
    Tiene varios constructores sobrecargados.
    Usar this() en forma encadenada.
    Al final llega a un unico constructor con todas las cadenas que asigna a todas las variables
    */
public class Mouse {
    private int numTeeth;
    private int numWhiskers;
    private int weight;

    public Mouse(int weight){
        this(weight, 16); // Llama al constructor de 2 parametros.
    }

    public Mouse(int weight, int numTeeth){
        this(weight, numTeeth, 24); // Llama al constructor de 3 parametros.
    }

    public Mouse(int weight, int numTeeth, int numWhiskers){
        this.weight = weight;
        this.numTeeth = numTeeth;
        this.numWhiskers = numWhiskers;
    }

    public void print(){
        System.out.println(weight + " " + numTeeth + " " + numWhiskers);
    }

    public static void main(String[] args) {
        Mouse mouse = new Mouse(15); // llama al constructor un 1 parametro
        // weigth = 15;
        // public Mouse(int weight) No se asigna nada, en su lugar llama al this(weight, 16) 
        // que llama al constructor de 2 parametros
        // numTeeth = 16;
        //Se llama al constructor de 3 parametros con this(weight, numTeeth, 24)
        // por lo cual numWhiskers = 24; Es su valor fijo.
        mouse.print();
    }

}
