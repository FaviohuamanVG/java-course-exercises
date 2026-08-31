package com.app.Capitulo_1_Dia_1.Understanding_Package_Declarations_and_Imports.Creating_a_New_Package.PackageB;
// Importamos ClassA porque pertenece a otro paquete.
import com.app.Capitulo_1_Dia_1.Understanding_Package_Declarations_and_Imports.Creating_a_New_Package.PackageA.ClassA;

public class ClassB {
    public static void main(String[] args) {
        // Podemos utilizar ClassA porque la hemos importado.

        ClassA a;
        System.out.println("Got it");
    }

    /*
    Estamos en el paquete PackageB y dentro del paquete tenemos la clase ClassB, 
    queremos utilizar la clase ClassA que esta ubicado en el paquete PackageA, 
    entonces como accedemos a ello?

    - Debemos importar la clase ClassA en el paquete PackageB, para ello hacemos lo siguiente:

    import com.app.Capitulo_1_Dia_1.Understanding_Package_Declarations_and_Imports.Creating_a_New_Package.PackageA.ClassA;

    Sin este import la inicializacion que hacemos en ClassA a; el cual esta en la linea 9
    nunca compilaria, ya que es necesario importarla.

    Como el paquete PackageA esta importado el ClassA a; se declara pero no se inicializa
    por lo tanto no tiene valor y no se puede utilizar.

    y al final simplemente System.out.println("Got it"); imprime un mensaje en la consola.

    */
}
