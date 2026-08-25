package Applying_Access_Modifiers.Public_Access.duck;
    /*
    Public Access es el modificador de acceso mas permisivo.
    Cualquier otra clase puede acceder a los miembros public de la clase.
    */
public class DuckTeacher {
    public String name = "helpful"; // Palabra clave public, cualquier otra clase puede acceder a esta variable.
    public void swim(){ // Puede acceder cualquiera
        System.out.println("swim");
    }
}
