package Introducing_Class_Inheritance.Defining_Constructors;
    /*
    Al utilizar constructores, de por si hace una llamada a this() - constructor de la clase
    o super() - constructor de la clase padre. Si no llamas a this() el compilador llama a 
    super() automaticamente. Siempre this o super van en la primera linea nunca despues.
    */
public class Animal {
    private int age;
    private String name;

    public Animal(int age){ // Para la subclase hija Zebra.
        super(); // Llama al constructor padre.
        this.age = age;
    }

    public Animal(int age, String name){
        super(); // Llama al constructor padre.
        this.age = age;
        this.name = name;
    }

    /* 
    public Animal(int age){
        super(); // Llama al constructor padre.
        this.age = age;
        this.name = null;
    }
    */
}
