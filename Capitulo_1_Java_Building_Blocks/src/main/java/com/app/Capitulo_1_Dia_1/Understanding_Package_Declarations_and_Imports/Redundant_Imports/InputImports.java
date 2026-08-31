package com.app.Capitulo_1_Dia_1.Understanding_Package_Declarations_and_Imports.Redundant_Imports;

import java.nio.file.*; // import con wildcard

public class InputImports {
    public void read(Files files) {
        Paths.get("name");
    }

    /*
    Estamos utilizando 2 clases Files y Paths, ambas pertenecientes al paquete java.nio.file
    - import java.nio.file.*; estamos utilizando un import con wildcard y estamos incluyendo
    todas las clases del paquete java.nio.file, con Files y Paths.

    Tambien podriamos realizar la siguiente importacion:
    import java.nio.file.Files; 
    import java.nio.file.Files;

    Las cuales son validas ya que las estamos trayendo 1 x 1 y estan separadas.
    Pero tambien hay imports los cuales no funcionan.

    import java.nio.*; // NO GOOD
    Se debe a que el wildcard solo funciona para traer las clases de un paquete,
    pero no trae subpaquete y solo traera las clase de java.nio, pero Files y Paths
    son un subpaque de java.nio.file, por lo que no compilara.

    import java.nio.*.*; // NO GOOD
    Solo puede haber un wildcard por import y deberian ir asi al final del nombre
    import java.nio.file.*; // GOOD 
    2 asterios son una sintaxis invalida y no compilaria.

    import java.nio.files.Paths.*; // NO GOOD
    Tenemos 2 errores en los cuales files esta como plural cuando en la importacion
    deberia ser singula file, por otro lado el wildcard no puede ir despues del
    nombre de la clase (Paths) // No compilan
    */
}