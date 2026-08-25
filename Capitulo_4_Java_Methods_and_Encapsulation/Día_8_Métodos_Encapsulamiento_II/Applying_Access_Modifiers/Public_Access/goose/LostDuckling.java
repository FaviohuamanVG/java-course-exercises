package Applying_Access_Modifiers.Public_Access.goose;

import Applying_Access_Modifiers.Public_Access.duck.DuckTeacher;

public class LostDuckling {
    public void swim(){ // Puede acceder a la clase DuckTeacher, porque es public.
        DuckTeacher duck = new DuckTeacher();
        duck.swim();
        System.out.println("Thanks " +duck.name); // Como todo el public se puede acceder normalmente.
    }

    public static void main(String[] args) {
        LostDuckling lost = new LostDuckling();
        lost.swim();
    }
}
