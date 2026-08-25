package Applying_Access_Modifiers.Protected_Access.shore;

public class BirdWatcher {

    // No se utiliza extend, porque vive en el mismo paquete que Bird.java, asi que no es necesario.

    public void watchBird(){
        Bird bird = new Bird();
        bird.floatInWater(); // Llamando al miembro protegido
        System.out.println(bird.text); // Llamando al miembro protegido
    }
}
