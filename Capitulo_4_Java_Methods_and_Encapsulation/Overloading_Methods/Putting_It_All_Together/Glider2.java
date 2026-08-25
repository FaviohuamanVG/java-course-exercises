package Overloading_Methods.Putting_It_All_Together;

public class Glider2 {
    /*
    Orden oficial que sigue Java para elegir la sobrecarga mas especifica:
    1. Coincidencia exacta: int con int
    2. Primitivo más grande: int con long
    3. Autoboxing: int con Integer
    4. Varargs: int con int...

    // Java permite solo 1 conversion, no es posible realizar una cadena de conversiones.
    */

    // Orden por prioridad con varargs:
    public static String glide(String s) { // COMPILE
        return "1"; // Solo 1 parametro String
    }
        public static String glide(String... s) { // COMPILE
        return "2";
    }

        public static String glide(Object s) { // COMPILE
        return "1";
    }

        public static String glide(String s, String t) { // COMPILE
        return "1";
    }

     public static void main(String[] args) {
        System.out.println(glide("a")); // Solo 1 parametro
        System.out.println(glide("a", "b")); // 2 parametros
        System.out.println(glide("a", "b", "c")); // Como no hay un metodo con 3, parametros
        // se recurre a la version con varargs. String... s
    }
}
