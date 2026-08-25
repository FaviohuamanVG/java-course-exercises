package com.app.Understanding_Package_Declarations_and_Imports.Wildcards;

// * es un wildcard.
// Importa las clases del paquete java.util.
import java.util.*;

public class ImportExample {
      public static void main(String[] args) {
    
        // Random pertenece al paquete java.util
        // y está disponible gracias al wildcard.
        Random r = new Random();
        
        System.out.println(r.nextInt(10));
  }
}
