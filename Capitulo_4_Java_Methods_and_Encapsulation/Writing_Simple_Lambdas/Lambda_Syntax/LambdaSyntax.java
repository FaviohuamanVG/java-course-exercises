package Writing_Simple_Lambdas.Lambda_Syntax;

/*
Sintaxis de Lambda Expressions - reglas de "todo o nada".

- Java infiere el tipo del parametro por CONTEXTO (target typing),
  mirando el metodo abstracto de la interfaz funcional esperada.

PARENTESIS en los parametros:
- Se pueden OMITIR solo si: 1 solo parametro Y sin tipo declarado.
- En cualquier otro caso (0 parametros, 2+, o 1 con tipo) son OBLIGATORIOS.
- Si declaras el tipo de un parametro, debes declararlo en TODOS los
  parametros de esa lambda (no se puede mezclar).

LLAVES {} en el cuerpo - regla de "todo o nada":
- SIN llaves: una sola expresion, SIN return, SIN punto y coma.
  La expresion se convierte en el valor de retorno implicito.
- CON llaves: se comporta como un metodo normal -> si retorna algo,
  "return" es obligatorio, y cada sentencia termina en ";".
- No se puede mezclar: {} sin return, o expresion simple con return.

VARIABLES EXTERNAS (fuera del scope del examen OCA, pero util saberlo):
- Instance/static variables: sin restriccion.
- Local variables/parametros: deben ser "effectively final"
  (no se les puede reasignar valor despues de declaradas).

REDECLARACION:
- No se puede redeclarar un parametro de la lambda como variable
  local dentro del cuerpo (mismo error que redeclarar un parametro
  de metodo).
*/

public class LambdaSyntax {

    public static void main(String[] args) {

        // --- 0 parametros: parentesis vacios OBLIGATORIOS ---
       //  print(() -> true);

        // --- 1 parametro sin tipo: parentesis OPCIONALES (omitidos) ---
        print(a -> a.startsWith("test"));

        // --- 1 parametro CON tipo explicito: parentesis OBLIGATORIOS ---
        print((String a) -> a.startsWith("test"));

        // --- 2 parametros: parentesis OBLIGATORIOS (aunque no se use "b") ---
        print2((a, b) -> a.startsWith("test"));

        // --- 2 parametros con tipo explicito: parentesis OBLIGATORIOS ---
        print2((String a, String b) -> a.startsWith("test"));

        // --- Forma expandida equivalente a "a -> a.startsWith("test")" ---
        print((String a) -> {
            return a.startsWith("test");
        });

        // --- Acceso a variable externa effectively final ---
        boolean wantTest = true;
        print(a -> a.startsWith("test") == wantTest);

        /*
        INVALIDOS - no compilan (comentados para dejar evidencia del porque):

        print(a, b -> a.startsWith("test"));
        // Falta parentesis alrededor de la lista completa (2 parametros).

        print(a -> { a.startsWith("test"); });
        // Hay llaves {} pero falta "return" -> la interfaz espera boolean.

        print(a -> { return a.startsWith("test") });
        // Falta el punto y coma despues de la expresion dentro del bloque.

        print2((a, b) -> { int a = 0; return true; });
        // Redeclaracion invalida: "a" ya existe como parametro de la lambda.
        */
    }

    // Interfaces funcionales de apoyo para probar los ejemplos
    public interface CheckOne {
        boolean test(String a);
    }

    public interface CheckTwo {
        boolean test(String a, String b);
    }

    private static void print(CheckOne checker) {
        System.out.println(checker.test("test"));
    }

    private static void print2(CheckTwo checker) {
        System.out.println(checker.test("test", "ignored"));
    }
}