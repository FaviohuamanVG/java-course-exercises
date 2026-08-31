package com.app.Capitulo_1_Dia_1.Understanding_the_Java_Class_Structure.Comments;

public class Comments {
    // comment until end of line. Todo después de // en esta línea es ignorado.
    // Se utilizan para comentar un sola linea de codigo.
    // Necesario para documentacion y explicacion. Asi mismo
    // para estudiar temas.

    /* abre comentario multilinea
    * Multi-line comment
    *  Puede ocupar varias líneas.
    cierra comentario multilinea  -> */
    
    /* - Desde donde quiero ignorar
    Los comentarios multi-lineas son utiles para ignorar varias lineas de codigo durante
    el desarrollo de un programa.
    A diferencia de los comentarios de una sola linea, este abarca multiples lineas de 
    codigo
    - Hasta donde quiero cerrar la linea que debo ignorar - - > */ 

    // Comentario Javadoc, parecido a los comentarios multi-linea, pero comienza con
    // un asterisco adicional y dos barras: /** 
    // Siempre terminan en el primer */ que encuentre, si hay otro*/ ya no es parte 
    // del comentario de Javadoc.

     /**   Valido pq cumple con la sintaxis de Javadoc
     * Javadoc multiple-line comment
     * @author Jeanne and Scott // Tiene una estructura especifica -> @author
     */

     /** Invalido pq no cumple con la sintaxis de Javadoc
      *  tiene otro 
      * Javadoc multiple-line comment
      * @param Jeanne and Scott
      */
      //  */ <-- tiene otro */ que no es parte del comentario de Javadoc, no compilara.

    /* <-- Inicio de comentario multi-linea
     * // anteater Comentario de una linea dentro del multi-line.
     * // 
    Fin del comentario multi-linea pq busca y termina en la primer cierre que encuentre -->*/ 
    // bear - - Comentario de una solo linea normal
    // // cat - - Es un comentario de una sola linea igualmente, aunque existan 2 solo importa el primero
    // /* dog */ - - Es igual a los anteriores, comentario de una sola linea pq el /**/ sigue del //
    /* elephant - - Comentario multi-linea normal y basico elephant esta comentado*/
    /*  < - - Se busca el primer apertura de comentario multi-linea 
    * /* ferret  todo lo que esta dentro esta comentado y busca el primer cierre de comentario --> */ 
  //  */   NO COMPILA. El primer cierre del comentario termina el comentario - Pero este es otro */ 
  // fuera del multi-linea por eso no compila. Esta comentado pq da error de compilacion.



// /* */ */  No Compila. El segundo */ queda fuera del comentario multi-linea.

    public static void main(String[] args) {

        System.out.println("Ejercicio de Comments");
    }

}
