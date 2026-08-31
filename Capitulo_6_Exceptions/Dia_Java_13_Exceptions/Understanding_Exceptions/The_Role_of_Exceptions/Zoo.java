package Dia_Java_13_Exceptions.Understanding_Exceptions.The_Role_of_Exceptions;

public class Zoo {
    /*
    Cual es el rol y funcion de una excepcion.
    Cuando algo sale mal, Java tiene 2 caminos al cual ir:
    1. Manejar el problema alli mismo o delegar la responsabilidad 
    a quien llamo al metodo.
    */

    public int indexOf(String[] names, String name){
        for(int i = 0; i < names.length; i++){
            if(names[i].equals(name)){
                return i;
            }
        }
        return -1;
    }

    /*
    Se crea un metodo indexOf de tipo public con 2 parametros, Array y String.
    Pasa por un bucle for, para recorrer el Array posicion x posicion
    i = empieza con 0.
    i < names.length - - Mientras i sea menor que el tamaño del Array entonces
    tomara los valores antes de llegar al final del Array. 5 - i = 0,1,2,3,4
    - En cada vuelta del bucle, se compara el valor actual con el que buscas
    : names[i] - Actual, name - Buscado.
    Si encontro devuelve el indice i y si no devuelve -1.
    */



    public static void main(String[] args) {

        System.out.println(args[0]);
        System.out.println(args[1]);
    }

    /*
    Excepcion no manejada, si intentamos ejecutar el programa de esta manera:
    javac Zoo.java
    java Zoo Zoo

    -- Nos dara una Excepcion en la ejecucion, ya que el programa espera 2 argumentos
    y solo le estamos pasando solo 1.
    System.out.println(args[0]); - - Le pasamos solo Zoo
    System.out.println(args[1]); - - No le pasamos nada, a 
    lo cual da esa excepcion ArrayIndexOutOfBoundsException.
    */

}
