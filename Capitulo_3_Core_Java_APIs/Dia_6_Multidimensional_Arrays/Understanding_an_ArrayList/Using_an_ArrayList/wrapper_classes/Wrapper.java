package Dia_6_Multidimensional_Arrays.Understanding_an_ArrayList.Using_an_ArrayList.wrapper_classes;

public class Wrapper {
    /* 
    Un ArrayList solo puede almacenar objetos, no tipos primitivos (int, char, boolean, etc.)

    primitivo  - wrapper - constructor
       int     - Integer - new Integer(1)
     boolean   - Boolean - new Boolean(true)
      byte     - Byte    - new Byte((byte) 1)
      float    - Float   - new Float(1.0f)
    tipoDato   -  Tipo   - new Tipo(valor)
    */
   public static void main(String[] args) {
    // Convertir String  -> primitivo o wrapper
    int primitive = Integer.parseInt("123"); // devuelve un int primitivo
    Integer wrapper = Integer.valueOf("123"); // devuelve un Integer wrapper

    // Exceptions:
    // int bad1 = Integer.parseInt("a"); // throws NumberFormatException
    // No es valido para un int primitivo
    // Integer bad2 = Integer.valueOf("123.45"); // throws NumberFormatException
    // Tiene un decimal lo cual no es valido para un Integer

    /*
    Tabla de conversion:

    wrapper  -  String ->primitivo -  String ->wrapper
    Boolean - Boolean.parseBoolean("true") - Boolean.valueOf("TRUE")
    Byte    - Byte.parseByte("1")         - Byte.valueOf("2") 
    Float   - Float.parseFloat("1")      - Float.valueOf("2.2")
    Type   - Type.parseType("1")         - Type.valueOf("2")
    */

    // Imprimir los valores
    System.out.println("Conversion de String a primitivo y wrapper:");

    System.out.println("primitive: " + primitive);
    System.out.println("wrapper: " + wrapper);
   }
   
}
