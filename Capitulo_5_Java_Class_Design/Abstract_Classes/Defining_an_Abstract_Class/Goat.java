package Abstract_Classes.Defining_an_Abstract_Class;

public abstract class Goat {
    public abstract /*final*/ void chew(); // DOES NOT COMPILE
    // final en un metodo significa que nada ni nadie puede sobreescribirme ni las clases hijas.
    // Pero abstract obliga a la clase hija a sobreescribirlo. Se contradicen.
    
    // quitar final luego de abstract para que compile, pero no se puede instanciar.
}
