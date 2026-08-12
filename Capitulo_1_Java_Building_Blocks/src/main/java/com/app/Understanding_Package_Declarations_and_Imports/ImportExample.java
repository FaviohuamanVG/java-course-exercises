package com.app.Understanding_Package_Declarations_and_Imports;
// Importamos Random porque pertenece al paquete java.util
import java.util.Random;

public class ImportExample {
    public static void main(String[] args) {
    // Creamos un objeto Random
    Random r = new Random();   // DOES NOT COMPILE
    System.out.println(r.nextInt(10));  
  }

}
