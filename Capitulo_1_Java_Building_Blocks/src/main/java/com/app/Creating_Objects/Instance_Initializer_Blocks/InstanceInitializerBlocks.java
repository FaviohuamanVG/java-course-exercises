package com.app.Creating_Objects.Instance_Initializer_Blocks;

public class InstanceInitializerBlocks {

    public static void main(String[] args) {

        // Bloque de código dentro del método main().
        {
            System.out.println("Feathers");
        }

        // Creamos un objeto para ejecutar el instance initializer.
        new InstanceInitializerBlocks();
    }

    // Instance initializer: está fuera de cualquier método.
    {
        System.out.println("Snowy");
    }
}