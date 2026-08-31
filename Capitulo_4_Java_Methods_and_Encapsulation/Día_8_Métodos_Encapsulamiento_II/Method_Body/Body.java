package Designing_Methods.Method_Body;

public class Body {
    /*  
    Method Body: El cuerpo de un metodo, cuerpo delimitado por llaves.
    - Llaves obligatorias, sin importar cuantas sentencias tenga el metodo.
    - Puede estar vacio.
    */

    // modificadores tipoRetorno nombreMetodo(parámetros) throws Excepciones { cuerpo }

    public void walk1(){
        // Cuerpo del metodo, puede estar vacio.
    }

    //  public void walk2; DOES NOT COMPILE, falta el cuerpo + () que definen el metodo.

    public void walk3(int a){ // Valido, cuerpo con una sentencia.
        int name = 5; // Declaracion de una variable local.
    }

    public static void main(String[] args) {
        System.out.println("Method Body: El cuerpo de un metodo, cuerpo delimitado por llaves.");
    }
}
