package Abstract_Classes.Defining_an_Abstract_Class;

public abstract class Turtle {
    
    public abstract void swim(); /*{}*/ // DOES NOT COMPILE
    public abstract int getAge(); /*{
        return 10;
    }*/
    // Errores de compilacion: Un metodo abstracto no puede tener un cuerpo
    // Debe terminar siempre en ; no en llaves {}
}
