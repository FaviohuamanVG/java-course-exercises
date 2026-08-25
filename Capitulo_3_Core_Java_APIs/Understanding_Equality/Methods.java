package Understanding_Equality;

public class Methods {
    /*  
        Igualdad de referencias == con StringBuilder
        - El operador == en objetos verifica si son 2 variables apuntando exactamente al mismo
        objeto de memoria.
    */
        public static void main(String[] args) {
            System.out.println("Ejemplo 1:");
            
            StringBuilder one = new StringBuilder();
            // cadena vacia en one
            StringBuilder two = new StringBuilder();
            StringBuilder tree = one.append("a");
            // tree guarda el valor de la variable el cual es one+"a"
            System.out.println(one == two); // false
            System.out.println(one == tree); // true
            // Para que el valor nos brinde false debemos realizar lo siguiente:
            System.out.println(one != tree); // false

            System.out.println("Ejemplo 2:");

            // El caso especial de String y el String Pool
            String x = "Hello World";
            String y = "Hello World";
            System.out.println(x == y); // true
            // x e y apuntan al mismo espacio, por lo que == da true.
            
            System.out.println("Ejercicio 3:");
            // Creado en tiempo de ejecución (runtime)
            String a = "Hello World";
            String b = " Hello World".trim();
            System.out.println(a == b); // false

            System.out.println("Ejercicio 3.1: ");
            // Forzar un nuevo objeto con new
            String xa = new String("Hello World");
            String ya = "Hello World";
            System.out.println(xa == ya); // false

            System.out.println("Ejercicio 4:");
            // Igualdad lógica (.equals())
            String ax = "Hello World";
            String za = " Hello World".trim();
            System.out.println(x.equals(za)); // true

            System.out.println("Ejercicio 5:");
            // si una clase no implementa .equals()?
            String name;

            String t1 = new String();
            String t2 = new String();
            String t3 = t1;
            System.out.println(t1 == t1);     // true
            System.out.println(t1 == t2);     // false
            System.out.println(t1.equals(t2)); // false


        }

}
