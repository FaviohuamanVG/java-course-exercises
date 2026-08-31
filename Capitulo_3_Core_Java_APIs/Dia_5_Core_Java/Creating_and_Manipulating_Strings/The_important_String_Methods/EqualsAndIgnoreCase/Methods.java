package Creating_and_Manipulating_Strings.The_important_String_Methods.EqualsAndIgnoreCase;

public class Methods {
    /*  
    equals() - 
    equalsIgnoreCase() - 
    
    */

    // boolean equals(String str) Compara caracter por caracter sin excepciones
    // boolean equalsIgnoreCase(String str) Compara caracter x caracter pero si hay mayusculas o minuscula los ignora

    public static void main(String[] args) {
        System.out.println("abc".equals("ABC")); // false
        // conceptualmente a es diferente de A como caracter exacto
        System.out.println("ABC".equals("ABC")); // true
        // coinciden caracter x caracter
        System.out.println("abc".equalsIgnoreCase("ABC")); // true
        // el metodo normaliza el caso antes de comparar

        String name = "abc";
        String name2 = "abc";
        System.out.println(name == name2);
        // En este caso son iguales por el String pool

        String name1 = new String("abc");
        // La cosa cambia cuando creamos un objeto nuevo con el mismo valor
        System.out.println(name == name1); // false
        System.out.println(name.equals(name1)); // true
    }
}
