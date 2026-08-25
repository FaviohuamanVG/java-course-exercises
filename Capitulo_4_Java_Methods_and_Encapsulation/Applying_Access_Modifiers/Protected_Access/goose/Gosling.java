package Applying_Access_Modifiers.Protected_Access.goose;

import Applying_Access_Modifiers.Protected_Access.shore.Bird;

public class Gosling extends Bird{ // extends: una subclase
    public void swim(){
        floatInWater(); // Llamando al miembro protegido.
        System.out.println(text); // Imprimiendo la variable protegida.
    }

}
