package Applying_Access_Modifiers.Static_Imports;

import java.util.List;

// 1. Sintaxis correcta: Importa explícitamente un método estático
import static java.util.Arrays.asList; 

// 2. Sintaxis correcta con comodín: Importa todos los miembros estáticos de Math
import static java.lang.Math.*;

// ❌ ERRORES DE COMPILACIÓN TÍPICOS (Descomentar para comprobar en IDE):
// import static java.util.Arrays;   // ERROR: No se puede hacer static import de una clase sin miembro o '*'
// static import java.util.Arrays.*; // ERROR: El orden correcto es 'import static', no al revés

public class StaticImports {

    /* 
    // Si defines un método con el mismo nombre en esta clase, Java le da prioridad
    public static List<String> asList(String... args) {
        System.out.println("-> Método local ejecutado");
        return null;
    } 
    */

    public static void main(String[] args) {
        // Uso directo de asList gracias al static import (sin escribir Arrays.)
        List<String> list = asList("uno", "dos");
        System.out.println("Lista: " + list);

        // Uso directo de Math.PI y Math.sqrt gracias al comodín '*'
        System.out.println("PI: " + PI);
        System.out.println("Raíz cuadrada de 16: " + sqrt(16));
    }
}