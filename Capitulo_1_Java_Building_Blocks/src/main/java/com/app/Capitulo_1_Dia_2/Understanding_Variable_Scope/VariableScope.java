package com.app.Capitulo_1_Dia_2.Understanding_Variable_Scope;

public class VariableScope {

    // Las variables locales solo están disponibles
    // dentro del método donde fueron declaradas.
    public void eat(int piecesOfCheese) {
        int bitesOfCheese = 1;
    }

    /*
    el motodo eat tiene 2 variables locales, piecesOfCheese (parametro del metodo) y bitesOfCheese que
    es declarada dentro. Ambas tienen scope dentro del metodo no se pueden usar fuera de el.
    */

    // bitesOfCheese solo está disponible dentro del if.
    public void eatIfHungry(boolean hungry) {
        if (hungry) {
            int bitesOfCheese = 1;
        }

        // System.out.println(bitesOfCheese); // DOES NOT COMPILE
    }

    /*
    El metodo eatIfHungry tiene la como parametro hungry el cual tiene scope dentro de todo el metodo
    y bitesOfCheese esta declarado dentro de if, por lo tanto solo tiene scope dentro del if y no
    se puede usar fuera de el.
    Asi que System.out.println(bitesOfCheese); // DOES NOT COMPILE
    No compila por que bitesOfCheese no tiene scope fuera del if.
    */

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

    /*
    El metodo eatIfHungry2 tiene como parametro hungry el cual tiene scope dentro de todo el metodo
    y bitesOfCheese esta declarado dentro de if, por lo tanto solo tiene scope dentro del if y no
    se puede usar fuera de el.
    Dentro del if hay un bloque de codigo que tiene como variable teenyBit la cual solo tiene scope
    dentro de ese bloque, por lo tanto no se puede usar fuera de el.
    En la linea 44 es donde teenyBit sale fuera del scope del bloque, no puede ser usado fuera de el
    System.out.println(teenyBit); // DOES NOT COMPILE
    No compila por que teenyBit no tiene scope fuera del bloque.
    */

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

    /*
    El metodo eatMore tiene como parametros hungry y amountOfFood los cuales tienen scope dentro de
    todo el metodo, roomInBelly es declarada dentro del metodo y tiene scope dentro de todo el metodo,
    timeToEat es declarado dentro del if y tiene scope dentro de el, al igual que amountEaten que es
    declarado dentro del bloque while y tiene scope dentro de el.
    En la linea 75 se imprime amountOfFood, el cual tiene scope dentro de todo el metodo, por lo
    tanto no hay error de compilacion.
    Asi que imprime el valor de amountOfFood que es 5 pq los parametros dentro del scope del metodo no
    son afectados por los cambios dentro de los bloques de codigo. Asi que el valor de amountOfFood no
    cambia y sigue siendo 5, por lo tanto imprime 5.
    */

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

    /*
    El metodo grow tiene como parametros inches el cual tiene scope dentro de todo el metodo, 
    length es una variable de instancia y tiene scope dentro de todo el objeto, MAX_LENGTH 
    es una variable de clase y tiene scope dentro de toda la clase, newSize es declarada dentro 
    del if y tiene scope dentro de el.
    */

    public static void main(String[] args) {
        System.out.println("Variables y alcance (Scope)");
    }
}