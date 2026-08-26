package com.app.Capitulo_1_Dia_2.Understanding_Default_Initialization_of_Variables.Instance_and_Class_Variables;

public class Variables {

    // Variable de instancia
    int number = 10;

    // Variable de clase
    static int numberStatic = 20;

    public static void main(String[] args) {

        Variables obj = new Variables();

        System.out.println("Variable de instancia: " + obj.number);
        System.out.println("Variable de clase: " + numberStatic);
        /*
        Estamos creando un objeto de la clase y estamos accediendo a las variables de instancia
        y de clase.
        Asi que al imprimirlas veremos los valores asignados a cada una de ellas.
        -- Imprimiran lo siguiente:
        Variable de instancia: 10
        Variable de clase: 20
        */

    }

    /*
    Las variables de instancia y las variables de clase son diferentes a las variables locales,
    ya que estas no necesitar ser inicializadas antes de ser utilizadas, Java les asigna un valor
    por defecto dependiendo del tipo de dato que sean.
 
    int = 0; // Variable de instancia
    double = 0.0;
    boolean = false;
    char = '\u0000';
    String = null;

    Mientras que las variables de clase son compartidas entre todos los objetos de la clase (todos)
    ven el mismo valor.
    -- Se diferencian pq tiene un modificador de acceso static en su declaracion, lo que significa
    que pertenece a la clase y no a un objeto en particular. Por lo tanto, se puede acceder a ellas
    sin necesidad de crear un objeto de la clase.

    static int numberStatic = 20; // Variable de clase

    */
}
