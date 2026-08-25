package com.app.Capitulo_1_Dia_1.Creating_Objects.Instance_Initializer_Blocks;

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

    /*
    Las instancias de bloques inicializadoras, estas se ejecutan cada vez que se crea un objeto de la clase.
    En este caso tenemos 3 bloques de codigo.
    El metodo main() es 1# porque es un bloque de codigo y el propio cuerpo del metodo esta delimitado
    por las llaves {} por lo cual lo hace un bloque de codigo.
    El 2# se encuentra dentro del cuerpo del metedo main() pq hay otro par de llaves {} y este esta delimitado
    por dichas llaves, por lo tanto tambien es un bloque de codigo.
    Y el ultimo 3# es { System.out.println("Snowy"); } que se encuentra fuera del metodo main() y este es el
    bloque de codigo, ademas es el unico instance initializer pq no esta anidada a ningun metodo.

    
    */
}