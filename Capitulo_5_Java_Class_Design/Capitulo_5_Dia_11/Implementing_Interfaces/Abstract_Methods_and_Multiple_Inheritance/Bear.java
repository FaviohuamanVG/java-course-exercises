package Implementing_Interfaces.Abstract_Methods_and_Multiple_Inheritance;

public class Bear implements Herbivore, Omnivore { // Bear implementa Herbivore y Omnivore.
    public void eatMeat() { // Implementa eatMeat().
        System.out.println("Eating meat");
    }

    public int eatPlants(int quantity) { // Bear implementa la versión con parámetro int.
        System.out.println("Eating plants: "+quantity);
        return quantity;
    }

    public void eatPlants() { // Bear implementa la versión sin parámetros.
        System.out.println("Eating plants");
    }
    // Implementa eatPlants(). Esta única implementación de eatPlants() satisface al 
    // mismo tiempo el contrato de Herbivore y el de Omnivore

    public static void main(String[] args) {
        Bear bear = new Bear();
        bear.eatMeat();
        bear.eatPlants();
        bear.eatPlants(5);
    }
}
