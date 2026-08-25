package com.app.Understanding_Package_Declarations_and_Imports.Creating_a_New_Package.PackageB;
// Importamos ClassA porque pertenece a otro paquete.
import com.app.Understanding_Package_Declarations_and_Imports.Creating_a_New_Package.PackageA.ClassA;

public class ClassB {
    public static void main(String[] args) {
        // Podemos utilizar ClassA porque la hemos importado.

        ClassA a;
        System.out.println("Got it");
    }
}
