package Applying_Access_Modifiers.Default_Package_Private_Access.Swan; // Diferente paquete
// No puede acceder a los miembros de MotherDuck.

import Applying_Access_Modifiers.Default_Package_Private_Access.duck.MotherDuck;
// Por mas que importemos la clase, no se puede acceder. No son del mismo paquete.

public class BadCygnet {
    public void makeNoise(){
        MotherDuck duck = new MotherDuck(); // Puede crear una instancia de MotherDuck pq es Public
        // Pero no puede acceder a ellas.
       // duck.quack(); Aunque la variable sea public, el metodo quack() es default.
       // No se puede acceder desde otro paquete.
       // System.out.println(duck.noise);
    }
}
