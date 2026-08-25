package Applying_Access_Modifiers.Protected_Access.inland;

import Applying_Access_Modifiers.Protected_Access.shore.Bird;

public class BirdWatcherFromAfar { // No utiliza extend, por lo cual no puede acceder a la clase Bird
    // Esta protegido y mientras no tenga extends no puede acceder a Bird.
    public void watchBird(){
        Bird bird = new Bird();
        // bird.floatInWater(); 
        // System.out.println(bird.text);
    }

}
