package com.app.Creating_Objects.Reading_and_Writing_Object_Fields;

public class Swan {
    int numberEggs;
    public static void main(String[] args) {
        
        Swan mother = new Swan();
        // Escribir en la variable (setting)
        mother.numberEggs = 1;
        // Leer la variable (getting)
        System.out.println(mother.numberEggs);
    }
}
