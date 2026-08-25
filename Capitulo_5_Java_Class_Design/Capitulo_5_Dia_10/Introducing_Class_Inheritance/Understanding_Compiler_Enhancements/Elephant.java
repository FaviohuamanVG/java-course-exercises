package Introducing_Class_Inheritance.Understanding_Compiler_Enhancements;

public class Elephant extends Mammal {
    // Falta de constructor
    /* 
    public Elephant(){ // Constructor creado.
        // Invoca al constructor de la clase padre, pero no hay argumentos dentro
        // del constructor.
        // se intenta insertar super() sin argumentos. Falla pq Mammal no tiene
        // sobrecarga de constructor sin argumentos.
    }
    */

    public Elephant(int age){ // Agrega un constructor con argumento.
        // Invocando al constructor de la clase padre que acepta argumentos int.
        super(10); // Se agrega manualmente int
    }

    public static void main(String[] args) {
        System.out.println("Understanding Compiler Enhancements");
        System.out.println("Clases padres y subclases con constructores y parametros");
    }
}
