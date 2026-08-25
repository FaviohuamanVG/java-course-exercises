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

    }
}
