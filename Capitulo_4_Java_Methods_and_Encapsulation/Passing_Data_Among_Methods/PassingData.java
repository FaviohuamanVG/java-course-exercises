package Passing_Data_Among_Methods;

/*  
REGLA DE ORO: Java es SIEMPRE Pass-by-Value (paso por valor).
1. Primitivos: Se pasa una copia del valor. Reasignar no afecta al llamador.
2. Referencias: Se pasa una copia del puntero/dirección de memoria.
   - Reasignar el parámetro (ej. name = "Sparky") NO afecta al llamador.
   - Modificar el objeto interno (ej. s.append("Webby")) SÍ afecta al objeto original.
3. Valores de retorno ignorados: Si un método regresa algo pero no lo reasignas, el cambio se pierde.
*/
public class PassingData {

    public static void main(String[] args) {
        
        // 1. Primitivo (Paso por valor)
        int num = 4;
        newNumber(num);
        System.out.println("1. Primitivo num: " + num); // Imprime 4 (Sin cambios)

        // 2. Referencia con Reasignación (String / Objeto)
        String name = "Webby";
        speakString(name);
        System.out.println("2. String name: " + name); // Imprime Webby (Sin cambios)

        // 3. Referencia con Mutación de Objeto (StringBuilder)
        StringBuilder sbName = new StringBuilder();
        speakStringBuilder(sbName);
        System.out.println("3. StringBuilder sbName: " + sbName); // Imprime Webby (¡SÍ CAMBIÓ!)

        // 4. Retorno Ignorado vs Retorno Asignado
        int number = 1;
        String letters = "abc";

        number(number);              // ⚠️ EL RETORNO SE IGNOORA: number sigue siendo 1
        letters = letters(letters);  // ✅ EL RETORNO SE ASIGNA: letters ahora es "abcd"

        System.out.println("4. Resultado combinado: " + number + letters); // Imprime 1abcd
    }

    public static void newNumber(int num) {
        num = 8; // Afecta solo a la variable local 'num'
    }

    public static void speakString(String name) {
        name = "Sparky"; // Reasigna la referencia local, el String original no cambia
    }

    public static void speakStringBuilder(StringBuilder s) {
        s.append("Webby"); // Modifica el contenido del mismo objeto en memoria Heap
    }

    public static int number(int number) {
        number++;
        return number;
    }

    public static String letters(String letters) {
        letters += "d";
        return letters;
    }
}
