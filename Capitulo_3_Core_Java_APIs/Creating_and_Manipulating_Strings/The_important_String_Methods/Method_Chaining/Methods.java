package Creating_and_Manipulating_Strings.The_important_String_Methods.Method_Chaining;

public class Methods {
    /*  
    Se puede llamar a otro metodo sobre el resultado, sin la necesidad de guardarlo primero en una variable
    En lugar de crea 4 String distintos en memoria se puede guardar en un propia variable
    */

    public static void main(String[] args) {
        // Ejemplo sin Encadenamieto de Metodos
    String name = "abc";
    String start = name.trim();
    String lower = start.toLowerCase();
    String replace = lower.replace("abc", "A");
    System.out.println(replace);

        // Metodos Encadenados:
        String result = "Animal ".trim().toLowerCase().replace("Animal", "animal");
        System.out.println(result);

    }

}
