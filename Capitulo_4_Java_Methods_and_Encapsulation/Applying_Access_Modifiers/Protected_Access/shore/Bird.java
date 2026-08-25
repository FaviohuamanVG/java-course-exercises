package Applying_Access_Modifiers.Protected_Access.shore;

public class Bird {
    /*
    Protected access: Es como default access, misma clase y mismo paquete acceden a ellos,
    pero le permite acceso a las subclases incluso si viven en otro paquete.
    - extends: Una regla importante que se necesita incluir para que las
    subclases puedan acceder a los miembros de esta clase padre.
    */

    protected String text = "floating"; // protected access
    protected void floatInWater(){ // protected access
        System.out.println(text);
    }

    // Declara una variable y metodo
    // Esta lista para ser usada por sus subclases o vecinos de paquete.


}
