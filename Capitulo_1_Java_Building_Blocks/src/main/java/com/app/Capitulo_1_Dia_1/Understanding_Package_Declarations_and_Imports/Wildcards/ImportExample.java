package com.app.Capitulo_1_Dia_1.Understanding_Package_Declarations_and_Imports.Wildcards;

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

  /*
  Al igual que las importaciones normales como import.java.util.Random;
  Las importaciones con wildcard pueden simplificar la importacion de las clases de un paquete.
  para utilizar el objeto Random, es necesario importar el paquete de java.util.Random y asi
  logre funcionar el codigo.
  si realizamos import java.util.*; podemos utilizar todas las clases del paquete.
  * <-- el asterico es el wildcard, que hace que importe todas las clases del paquete java.util.
  pero al igual que las imports normales, estas no importan subpaquetes.

  import java.util.*; Compile trae el paquete util con sus clases
  import java.util.Random; Compile trae la clase Random del paquete util
  Entonces? java.util traera clases del paquete concurrent?
  No pq concurrente es un subpaquete y las wildcards no importan subpaquetes, necesita su propio import.
  import java.util.concurrent.*;

  */
}
