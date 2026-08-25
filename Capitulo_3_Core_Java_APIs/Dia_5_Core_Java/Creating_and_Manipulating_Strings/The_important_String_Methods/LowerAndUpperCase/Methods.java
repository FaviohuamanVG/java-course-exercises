package Creating_and_Manipulating_Strings.The_important_String_Methods.LowerAndUpperCase;

public class Methods {
    /*  
    toLowerCase() - convierte las letras mayuscula a minusculas
    toUpperCase() - convierte las letras minusculas a MAYUSCULAS

    ** Importante:
    - Solo tocan letras: Los numeros, espacios, etc. Se quedan sin cambios.
    - Los Strings son inmutables
    
    */
    public static void main(String[] args) {
    
        String string = "animals";
    System.out.println(string.toUpperCase()); // ANIMALS
    System.out.println("Abc123".toLowerCase()); // abc123
    }
}
