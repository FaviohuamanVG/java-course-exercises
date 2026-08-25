package com.app.Capitulo_1_Dia_2.Destroying_Objects.Finalize;

public class Finalizer {

    // Método que puede ser llamado por el Garbage Collector.
    protected void finalize() {
        System.out.println("Calling finalize");
    }

    public static void main(String[] args) {

        // Se crea un objeto Finalizer.
        Finalizer f = new Finalizer();

        // finalize() podría no ejecutarse.
        System.out.println("finalize()");
    }
}