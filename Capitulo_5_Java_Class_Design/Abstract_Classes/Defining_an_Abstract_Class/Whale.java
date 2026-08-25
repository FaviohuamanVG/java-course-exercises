package Abstract_Classes.Defining_an_Abstract_Class;

public abstract class Whale {
    /*private*/ abstract void sing(); // DOES NOT COMPILE

    // El metodo dice que solo se vera dentro de Whale. Como es abstracto la clase hija 
    // HumpbackWhale necesita sobreescribirlo. Pero Whale no sabe que existe.
    // Error de compilacion por parte del padre.
}

