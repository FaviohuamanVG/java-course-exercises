package Creating_and_Manipulating_Strings.String_Pool;

public class StringPool {
    /*
    String Pool = Intern pool el cual es una zona administrada por
    la JVM de Java donde mantienen los String que son literales:
    - Java reutiliza los Strings literales iguales para no consumir
    demasiada memoria.
    */

    public static void main(String[] args) {
        
        // String literales que apuntan al mismo contenido
        String name = "Fluffy";
        String name2 = "Fluffy";
        // Creacion de un nuevo Objeto String
        String name3 = new String("Fluffy");
        
        System.out.println(name == name2);  // true
        System.out.println(name == name3);  // false
       // compara contenido
        System.out.println(name.equals(name3));  // true

    }

    // String name y String name = new String();
    // A simple vista parecen estar iguales, pero la forma de creacion es distinta



}
