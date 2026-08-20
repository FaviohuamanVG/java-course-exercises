package Applying_Access_Modifiers.Default_Package_Private_Access.duck; // Es el mismo paquete que MotherDuck.java
// Puede acceder a los miembros de MotherDuck.
public class GoodDuckling {

    public void makeNoise(){
        MotherDuck duck = new MotherDuck();
        duck.quack(); // Tiene permiso de acceder, son el mismo paquete
        System.out.println(duck.noise); // Tiene acceso.
    }

    public static void main(String[] args) {
        GoodDuckling duckling = new GoodDuckling();
        duckling.makeNoise();
        System.out.println("BadCygnet no puede acceder a los miembros de MotherDuck pq es de otro paquete");
    }
}
