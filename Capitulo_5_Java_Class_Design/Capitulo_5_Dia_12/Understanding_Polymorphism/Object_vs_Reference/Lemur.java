package Capitulo_5_Dia_12.Understanding_Polymorphism.Object_vs_Reference;

public class Lemur {
    /*
    En Java nunca accedes al objeto directamente, siempre se hace atravez de una referencia.
    Existen 2 reglas que determinan el comportamiento de un objeto.
    - Todo objeto se maneja a traves de una referencia.
    1. El tipo de objeto determina que propiedades existen en memoria y esto no cambia nunca:
    Lemur siempre sera Lemur en memoria sin importar cual sea su referencia.
    2. El tipo de referencia determina que propiedades son accesibles y esto si puede cambiar:
    (depende del tipo de variable se le asigne al Objeto).
    */

    // Todas las clases heredan implícitamente java.lang.Object

    Lemur lemur = new Lemur();

    /*
    Se crea el objeto de tipo Lemur en memoria, la referencia lemur es de tipo Lemur asi que tiene
    visibilidad total sobre el.
    */

    Object lemurAsObject = lemur;
    /*
    Se crea una nueva referencia de tipo Object llamada lemurAsObject y apuntan al mismo Objeto Lemur
    el cual sigue en memoria. No hace falta cast pq todo objeto de Java es en ultima instancia un
    Object (relacion de herencia implicita).
    */

    // No cambia: 
    // Lemur sigue siendo el objeto en memoria y puede tener todas sus propiedades (age, isTailStriped(),
    //  hasHair()) nada de eso desaparece ni se transforma.

    // Si cambia:
    // Lo que la referencia lemurAsObject solo puede ver, es lo que se define (metodos, variables). Pero 
    // no puede llamar lemurAsObject.age ni lemurAsObject.isTailStriped() sin un cast explicito de vuelta a 
    // Lemur pq no tiene visibilidad sobre esas propiedades.

    public static void main(String[] args) {
        System.out.println("Objets vs Reference");
        System.out.println("Objeto Lemur en memoria, referencia lemur de tipo Lemur");
        System.out.println("Objeto Lemur en memoria, referencia lemurAsObject de tipo Object");
    }
}
