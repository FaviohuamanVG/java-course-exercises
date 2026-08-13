package com.app.Understanding_Java_Operators;

public class JavaOperators {

    // Operador: Simbolo que realiza una operacion sobre uno o mas valores
    /* 
    * 5 + 3 - Donde 5 y 3 son operandos
    * y el + es el operador
    */ 
    // Funciones: 
    /*
    * Calculos matematicos, Comparar valores. 
    * Modificar variables.
    */
    // Tipos: 1. Unarios (Unary) - Operan sobre un solo operando
    /* Ejemplo:
    * int i = 5;
    * i++; (el ++ solo trabaja con i <-- )
    */
    // 2. Binarios (Binary) - Operan sobre dos operandos
    /*
    * 5 + 3
    * Son 2 operandos trabajando con un operador
    */
    // 3. Ternarios (Ternary) - Operan sobre tres operandos
    /*
    * condicion ? valor1 : valor2;
    * int edad = 18;
    * String result = 
    *  edad >= 18= "Mayor de edad" : "Menor de edad";
    * condicion = true -> "Mayor de edad"
    * condicion = false -> "Menor de edad"
    */

    int y = 4;
    double x = 3 + 2 * --y;

    
    // Imprimir los valores de x e y
    public static void main(String[] args) {
        JavaOperators operators = new JavaOperators();
        
        System.out.println("Valor de x: " + operators.x);
        
    }
    


}
