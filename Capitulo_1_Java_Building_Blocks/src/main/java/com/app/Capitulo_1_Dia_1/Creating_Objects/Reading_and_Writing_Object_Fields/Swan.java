package com.app.Capitulo_1_Dia_1.Creating_Objects.Reading_and_Writing_Object_Fields;

public class Swan {
    int numberEggs;
    public static void main(String[] args) {
        
        Swan mother = new Swan();
        // Escribir en la variable (setting)
        mother.numberEggs = 1; // set variable
        // Leer la variable (getting)
        System.out.println(mother.numberEggs); // get variable

        /*
        Aqui declaramos la variable de la clase Swan de valor int con nombre numberEggs, luego
        creamos un objeto de la clase Swan al cual llamaremos mother, asi mismo vamos a tener
        que inicializar el valor de numberEggs porque tenia un valor por defecto de 0, a lo
        cual ese valor cambio y ahora vale 1 y luego imprimimos el valor de numberEggs que es 1.
        */
    }
}
