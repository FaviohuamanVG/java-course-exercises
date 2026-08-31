package com.app.Capitulo_1_Dia_2.Destroying_Objects.Finalize;

import java.util.ArrayList;
import java.util.List;

public class Finalizer {

    private static List objects = new ArrayList();

    // Método que puede ser llamado por el Garbage Collector.
    protected void finalize() {
        // System.out.println("Calling finalize");
        objects.add(this);
    }

    /*
    Tenemos un metodo finalize() y tenemos
    objects que hace referencia a un ArrayList y
    este apuntara al objeto Finalizer que se esta
    desreferenciando.

    */

    public static void main(String[] args) {

        // Se crea un objeto Finalizer.
        Finalizer f = new Finalizer();
        f = null; // Se pierde la referencia al objeto Finalizer.
        System.gc();
        /*
        System.gc() es una sugerencia al Garbage Collector para que
        ejecute el metodo finalize() del objeto Finalizer que se esta
        desreferenciando. Pero no es seguro que se ejecute
        */

        // finalize() podría no ejecutarse.
        System.out.println("finalize()");
    }
}