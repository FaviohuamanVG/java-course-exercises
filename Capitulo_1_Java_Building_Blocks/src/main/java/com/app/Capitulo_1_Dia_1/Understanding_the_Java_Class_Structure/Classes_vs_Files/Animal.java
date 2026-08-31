package com.app.Capitulo_1_Dia_1.Understanding_the_Java_Class_Structure.Classes_vs_Files;

// Una clase pública debe tener el mismo nombre que el archivo.
public class Animal {
    /* Las clases de Java esta compuesta por 2 elementos:
     * 1. Fields - Campos y variables:
        String name = "Animal";
        int age = 5;
     * 2. Methods - Metodos:
        public void eat(){ // Metodo sin retorno, pero que imprime un mensaje de consola
            System.out.println("Animal is eating"); // Dato a imprimir.
        }
     */
    // Field de la clase Animal
    private String name; // De tipo String.
    // Variable de instancia de la clase animal que almacena el nombre,
    // y que es privado, osea solo es accesible por la misma clase.
    // Esto es una definicion de instancia. Pero no tiene un valor inicial.

    public static void main(String[] args) {
        // Metodo principal de la clase Animal.
        // Donde vamos a ejecutar el programa.
        Animal an = new Animal(); // Creamos un objeto de la clase animal.
        an.name = "Perro"; // Asignamos un valor a la variable name del objeto an.
        // Este valor inicializa la variable name.

        System.out.println("Animal.java puede contener dos clases. " +an.name);
        // Imprime un mensaje en consola.
    }

}

// Es posible tener otra clase en el mismo archivo.
// Esta clase NO es pública.
class Animal2{
    // Es una clase default, solo accesible dentro del mismo paquete
    // No puede ser public porque Java lo prohibe, ya que solo puede
    // existir una unica clase public las demas son class default.
}
