package Applying_Access_Modifiers.Default_Package_Private_Access.duck; // paquete duck

public class MotherDuck {
    /*
    Default Access: Que pasa cuando no escribes un modificador de acceso?
    - El mismo paquete puede acceder a los miembros de sus misma clase, sin
    embargo otra clase no puede usarlo.
    */

    String noise = "quack";  // Sin modificador, solo los de su mismo paquete pueden acceder.
    void quack(){ // Sin modificador, access default.
        System.out.println(noise);
    }

    private void noise(){
        quack();
    }
}
