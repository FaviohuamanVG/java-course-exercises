package com.app.Capitulo_1_Dia_1.Understanding_Package_Declarations_and_Imports;
// Importamos Random porque pertenece al paquete java.util
import java.util.Random;

public class ImportExample {
    public static void main(String[] args) {
    // Creamos un objeto Random
    Random r = new Random();   // DOES NOT COMPILE
    System.out.println(r.nextInt(10));  
  }

  /*
  Al crear el objeto Random, el compilador no pudo encontra la clase Random, esto es debido a que no se
  importo el paquete java.util.Random, por lo tanto esto llega a generar un error de compilacion y complica
  que el programa no ejecute.
  Solucion: Importar el paquete java.util.Random para que se pueda crear el objeto Random.
  import java.util.Random;
 
  Random r = new Random(); // COMPILE pq usa la clase importada de java.util.Random
  System.out.println(r.nextInt(10)); Esto imprimira un numero aleatorio entre 0 a 9.
  // El nextInt(10) genera un numero aleatorio entre 0 a 9 pero y 10?
  10 es excluido y no esta incluido en la generacion.
  Nota: java.lang. * --> Es importado por defecto aunque no este en las lineas de codigo.
  */

}
