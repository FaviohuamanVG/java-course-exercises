package Dia_Java14_Exceptions.Recognizing_Common_Exception_Types.Runtime_Exceptions;

public class RuntimeException {
    /*
    RuntimeException una de la 3 categorias de excepciones existentes en java
    Las runtime son unchecked exceptions quiere decir que todas extienden de 
    RuntimeException(directa o indirectamente). Una de sus caracteriristicas
    es que no es obligatorio manejarlas ni declaralas con throws.

    -- Bug: Son unchecked, la idea es que estos errores deberian ser detectados
    y prevenidos antes de ocurrir y no capturados despues del hecho.
    */

    public static void divisionPorCero(){
        int a = 1;
        int b = 0;
        int resultado = a / b; // lanza ArithmeticException
        /*
        ArithmeticException es cuando se intenta una division
        entera por cero. Es de las mas comunes de las RuntimeException
        y que ademas es una unchecked exception.
        */
    }

    public static void indiceInvalido(){
        int[] numeros = {1, 2, 3};
        System.out.println(numeros[5]);
    }

    /*
    ArrayIndexOutOfBoundsException es cuando se intenta acceder a
    un indice de un arreglo el cual no existe o esta fuera de su
    rango. Es una unchecked exception y una de las mas comunes
    de las RuntimeException. 
    */

    public static void castInvalido(){
        Object obj = "String";
        Integer num = (Integer) obj;
    }

    /*
    ClassCastException es cuando se intenta realizar
    un casteo a un tipo que no es compatible o que
    no corresponde entonces es un CastInvalido. Siendo
    una unchecked exception.
    */

    public static void argumentoInvalido(int edad){
        if(edad < 0){
            throw new IllegalArgumentException("La edad no puede ser negativa");
        }
    }

    /*
    IllegalArgumentException, es lanzado por el programador cuando
    el argumento brindado hacia el metodo no es valido o este no
    cumple con los requisitos dando un error. Es una unchecked 
    exception y una de las mas comunes.
    */

    public static void referenciaNula(){
        String texto = null;
        System.out.println(texto.length());
    }

    /*
    NullPointerException es cuando se esta intentando usar una
    referencia la cual es nula como si fuera un objeto valido.
    Es una unchecked exception y una de las mas comunes. 
    */

    public static void formatoInvalido(){
        String texto = "abc";
        int num = Integer.parseInt(texto);
    }

    /*
    NumberFormatException es cuando se esta intentando hacer
    una conversion de String a numero con un formato el cual
    es invalido.
    */

    public static void main(String[] args) {
        RuntimeException.divisionPorCero();
        RuntimeException.castInvalido();
    }

}
