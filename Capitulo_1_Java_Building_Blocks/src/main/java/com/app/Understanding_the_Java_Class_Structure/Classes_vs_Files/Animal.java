package com.app.Understanding_the_Java_Class_Structure.Classes_vs_Files;

// Una clase pública debe tener el mismo nombre que el archivo.
public class Animal {
    // Field de la clase Animal
    private String name;

    public static void main(String[] args) {

        System.out.println("Animal.java puede contener dos clases.");
    }

}

// Es posible tener otra clase en el mismo archivo.
// Esta clase NO es pública.
class Animal2{
    
}
