package Designing_Methods.Method_Name;

public class MethodName {
    /*  
    Method Name: Reglas de nomenclatura para los nombres de los métodos:
    Puede contener a-z, A-Z, 0-9, _, $.
    Importante: No puede empezar con un numero.
    No se permite palabras reservadas: public, class, void, int, return, etc.

    Convencion:
    - Empezando con minusculas
    - Utilizando CamelCase (ej: miMetodo)
    */

    // [modificadores] tipoDeRetorno nombreMetodo(parámetros) { cuerpo }

    public void walk1(){
        //  Nombre valido
    }

    /*public void 2walk(){
        // Nombre invalido, empieza con un numero
    }*/

    /*public void walk3(){
        // El orden de los modificadores es incorrecto.
    }*/

    public void Walk_$(){
        // Nombre valido, empieza con mayuscula y contiene $.
    }

    /*public void (){
        // Falta el nombre del metodo.
    }*/

    public static void main(String[] args) {
        System.out.println("Method Name: Reglas de nomenclatura para los nombres de los métodos");
        MethodName mn = new MethodName();
        mn.walk1();
        mn.Walk_$();
    }
}
