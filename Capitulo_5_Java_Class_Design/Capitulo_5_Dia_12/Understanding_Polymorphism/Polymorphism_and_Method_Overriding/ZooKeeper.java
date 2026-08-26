package Capitulo_5_Dia_12.Understanding_Polymorphism.Polymorphism_and_Method_Overriding;

public class ZooKeeper {
public static void main(String[] args) {
        Animal animal = new Gorilla();
        System.out.println(animal.getName());
    }

    /*
    El metodo getName() de la clase Gorilla es public, por lo que puede sobrescribir el metodo 
    getName() de la clase Animal, que tambien es public.
    Asi que no da error de ejecucion y se imprime "Gorilla" en la consola.
    Si el metodo getName() de la clase Gorilla fuera protected, no podria sobrescribir el metodo
    getName() de la clase Animal, que es public, y daria error de compilacion.
    */
}
