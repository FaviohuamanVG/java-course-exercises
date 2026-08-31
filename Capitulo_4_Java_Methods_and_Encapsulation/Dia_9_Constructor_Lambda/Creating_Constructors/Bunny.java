package Creating_Constructors;
    /*
    Constructor: Es un metodo especial que se ejecuta al crear un objeto de la clase.
    - Se llama igual que la clase.
    - No tiene tipo de retorno.
    */
public class Bunny {
    private String color;
    private int height;
    private int length;

    /*
    public Bunny(String color){
        this.color = color;
    }
    */

    // Multiples Variables:
    public Bunny(int length, int theHeight){
        length = this.length; // Error logico esta alrevez, que hace que length siempre se inicie en 0
        // Nunca se actualice asi le pasemos un valor en el constructor.
        height = theHeight; // Java asigna el valor del parametro a la v. de instancia.
        this.color = "white"; // Es valido si se hubiera escrito color = "white", seria el mismo resultado.
    }


    // NOT VALIDE
    // public bunny(){} Escrito con minuscula, no coincide con el nombre de la clase.

    public void Bunny(){ } // Metodo valido pero no es un constructor.
    // Tiene void como retorno.

    public static void main(String[] args) {
        Bunny bn = new Bunny(1, 2);
        System.out.println(bn.length + " " + bn.height + " " + bn.color);
    }

}
