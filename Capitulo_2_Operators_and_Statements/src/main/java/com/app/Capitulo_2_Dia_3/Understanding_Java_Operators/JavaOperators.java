package com.app.Capitulo_2_Dia_3.Understanding_Java_Operators;

public class JavaOperators {

    // Operador: Simbolo que realiza una operacion sobre uno o mas valores

    /*
    En java los operadores no se evaluan simplemente de izquierda a derecha
    estos tienen un orden una prioridad de que operacion se ejecuta primero 
    y cual despues.
    */
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

    // Resultado x = 9.0, y = 3

    /*
    int y = 4; se guarda su valor en memoria en la variable y
    3 + 2 * --y;  --y (el operador --y el cual resta 1 antes de usar el valor)
    es mas importante que *, y el * mas importante que el +
    entonce se decrememnta y que pasa de tener 4 a tener 3 y eso se usa
    en la operacion = 3 + 2 * 3 (se multiplica 2 * 3 al tener mas prioridad que el +)
    = 3 + 6 finalmente se puede sumar y el resultado es = 9.0;
    double x = 9.0;  y = 3;
    */

    
    // Imprimir los valores de x e y
    public static void main(String[] args) {
        JavaOperators operators = new JavaOperators();
        
        System.out.println("Valor de x: " + operators.x);
        
    }
    


}
