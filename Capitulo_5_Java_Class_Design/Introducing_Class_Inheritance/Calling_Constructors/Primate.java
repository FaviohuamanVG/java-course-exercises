package Introducing_Class_Inheritance.Calling_Constructors;
    /*
    El constructor padre siempre se ejecuta primero que el cuerpo del constructor hijo.
    Si no se invoca explícitamente al constructor padre, el compilador lo hace automáticamente.
    - El compilador inserta un constructor vacio si no esta definido super().
    */
public class Primate {

}

class Primate1{
    public Primate1(){ // Implicitamente extiende a Object ya que no esta extendido a nada.
        System.out.println("Primate"); // Imprime primate.
    }       
}

class Ape extends Primate1{
    public Ape(){ // Inserta super() como primera linea, Apuntando al constructor padre Primate1()
        System.out.println("Ape"); // Imprime Ape.
    }
}
