package Creating_Constructors.Default_Constructor;
    /*  
    Default Constructor: Que toda clase java siempre tiene 1 constructor por defecto.
    - Si no se define un constructor, java creara uno x defecto
    - Solo es visible en el .class compilado.
    */
   // public class Rabbit(){} -- Sin parametros ni cuerpo, Java generara este constructor 
   // por defecto, si la clase no tiene ningun constructor definido.

public class Rabbit {

    public Rabbit() {}
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit(); // Hacemos la llamada al constructor x defecto.

    }
}

class Rabbit1{
}

class Rabbit2{
    public Rabbit2(){

    } 
}

class Rabbit3{
    public Rabbit3(boolean b){
        // Java no agrega ningun constructor x defecto sin argumentos. NO COMPILE
    }
}
class Rabbit4{
    private Rabbit4(){

    }
}
