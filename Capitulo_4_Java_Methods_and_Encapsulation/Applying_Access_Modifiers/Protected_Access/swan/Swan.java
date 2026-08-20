package Applying_Access_Modifiers.Protected_Access.swan;

import Applying_Access_Modifiers.Protected_Access.shore.Bird;

public class Swan extends Bird { 
    public void swim() { // Utilizando lo que heredo de Bird.java
        floatInWater(); // Línea 5: OK
        System.out.println(text); // Línea 6: OK
    }
    
    public void helpOtherSwanSwim() { // Como la variable es de la misma clase, puede acceder a ella.
        Swan other = new Swan();
        other.floatInWater(); // Línea 10: OK
        System.out.println(other.text); // Línea 11: OK
    }
    
    public void helpOtherBirdSwim() { // Como la variable es de otra clase, no puede acceder a ella.
        Bird other = new Bird();
       // other.floatInWater(); // Línea 15: DOES NOT COMPILE
       // System.out.println(other.text); // Línea 16: DOES NOT COMPILE
    }

    public static void main(String[] args) {
        Swan swan = new Swan();
        swan.swim(); // Línea 21: OK
        swan.helpOtherSwanSwim(); // Línea 22: OK
        // swan.helpOtherBirdSwim(); // Línea 23: DOES NOT COMPILE
    }
}