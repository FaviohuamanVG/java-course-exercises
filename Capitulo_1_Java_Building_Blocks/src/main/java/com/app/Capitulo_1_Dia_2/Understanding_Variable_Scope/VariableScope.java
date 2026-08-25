package com.app.Capitulo_1_Dia_2.Understanding_Variable_Scope;

public class VariableScope {

    // Las variables locales solo están disponibles
    // dentro del método donde fueron declaradas.
    public void eat(int piecesOfCheese) {
        int bitesOfCheese = 1;
    }

    // bitesOfCheese solo está disponible dentro del if.
    public void eatIfHungry(boolean hungry) {
        if (hungry) {
            int bitesOfCheese = 1;
        }

        // System.out.println(bitesOfCheese); // DOES NOT COMPILE
    }

    // Un bloque interno puede acceder a variables
    // declaradas en un bloque externo.
    public void eatIfHungry2(boolean hungry) {
        if (hungry) {
            int bitesOfCheese = 1;

            {
                boolean teenyBit = true;
                System.out.println(bitesOfCheese);
            }

            // teenyBit ya está fuera de scope aquí.
        }

        // System.out.println(teenyBit); // DOES NOT COMPILE
    }

    // Ejemplo de varios bloques y variables locales.
    public void eatMore(boolean hungry, int amountOfFood) {
        int roomInBelly = 5;

        if (hungry) {
            boolean timeToEat = true;

            while (amountOfFood > 0) {
                int amountEaten = 2;

                roomInBelly = roomInBelly - amountEaten;
                amountOfFood = amountOfFood - amountEaten;
            }
        }

        System.out.println(amountOfFood);
    }

    // Variable de clase
    static int MAX_LENGTH = 5;

    // Variable de instancia
    int length;

    public void grow(int inches) {
        if (length < MAX_LENGTH) {
            int newSize = length + inches;
            length = newSize;
        }
    }

    public static void main(String[] args) {
        System.out.println("Variables y alcance (Scope)");
    }
}