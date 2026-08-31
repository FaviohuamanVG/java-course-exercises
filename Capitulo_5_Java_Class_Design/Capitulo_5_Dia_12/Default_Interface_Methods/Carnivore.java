package Capitulo_5_Dia_12.Default_Interface_Methods;

public interface Carnivore {
    
    /*
    Ejemplos que no compilan:
    
    public default void eatMeat();
    1. Tiene la palabra default pero no tiene cuerpo, viola su regla y no compila.


    public int getRequiredFoodAmount() { // NO COMPILA
      return 13;
   }
   2. Tiene cuerpo pero no tiene default en el metodo, una interface con cuerpo debe tener 
   obligatoriamente la palabra default, de lo contrario esta no COMPILARA.
   */
}
