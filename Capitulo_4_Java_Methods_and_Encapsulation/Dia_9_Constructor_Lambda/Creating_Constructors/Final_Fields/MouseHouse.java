package Creating_Constructors.Final_Fields;
    /*
    Final Fields: Todas las variables con instancia final deben tener un valor asignado.
    final, puede recibir o asignarse el valor 1 unica vez
    Hay tres momentos posibles para hacerlo:
    */
public class MouseHouse {
    // 1. Linea de declaracion:
    private final int volume;
    private final String name = "The Mouse House";
    

    public MouseHouse(int length, int width, int height){

        // 2. En el constructor:
        volume = length * width * height;
        // 3. inicializador de instancia
        System.out.println(name);
    }

    public static void main(String[] args) {
        MouseHouse mh = new MouseHouse(2, 4, 0);
        System.out.println(mh.volume);
    }


}
