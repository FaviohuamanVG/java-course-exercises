package com.app.Understanding_the_Java_Class_Structure.Comments;

public class Comments {
    // comment until end of line. Todo después de // en esta línea es ignorado.
    

    /* abre comentario multilinea
    * Multi-line comment
    *  Puede ocupar varias líneas.
    cierra comentario multilinea  -> */ 

     /**
     * Javadoc multiple-line comment
     * @author Jeanne and Scott
     */

     /* 
    * // anteater
    */
    // bear
    // // cat
    // /* dog */
    /* elephant */
    /*
    * /* ferret */
  //  */   NO COMPILA. El primer cierre del comentario termina el comentario


// /* */ */  No Compila. El segundo */ queda fuera del comentario.

    public static void main(String[] args) {

        System.out.println("Ejercicio de Comments");
    }

}
