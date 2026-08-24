package Introducing_Class_Inheritance.Applying_Class_Access_Modifiers;
    /*  
    Al existir una clase publica no da error, ya que la clase Roudents
     esta como default lo que significa que solo sera accesible a su mismo paquete.
    */
public class Groundhog extends Roudents {

    public static void main(String[] args) {
        System.out.println("Applying Class Access Modifiers");
        System.out.println("Compilacion de clases solo si existe un metodo public");
    }

}

/* 
public class Roudents{
    // DOES NOT COMPILE, no puede existir 2 clases publicas en el mismo archivo.
    // Da error de compilacion.
}
 */


class Roudents{
    // COMPILE, todo correcto.
    // Es una clase default, solo Groundhog puede acceder.
}



