package com.app.Capitulo_1_Dia_1.Understanding_Package_Declarations_and_Imports.Code_Formatting_on_the_Exam;

// ArrayList pertenece al paquete java.util.
import java.util.ArrayList;

public class CodeFormattingOnExam {

    /*
     * EJEMPLO 1 DEL LIBRO
     *
     * El código comienza en la línea 6.
     * Se puede asumir que los imports anteriores son correctos.
     *
     * Por lo tanto, COMPILA.
     */
    public void method(ArrayList list) {
        if (list.isEmpty()) {
            System.out.println("e");
        } else {
            System.out.println("n");
        }
    }

    /*
    Porque decimos que complia?
    Porque al empeza por la linea 6, estamos asumiendo que hay imports antes de la linea 6.

    package com.app.Code_Formatting
    import java.util.ArrayList;

    public class LineNumbers {
    
    public void method(ArrayList list) { -- Linea 6 por lo tanto compila
        if (list.isEmpty()) {
            System.out.println("e");
        } else {
            System.out.println("n");
        }

    }

    Es un metodo sin retorno, que esta recibiendo un parametro de tipo ArrayList.
    Este metodo revisa si la lista esta vacia en el --> if (list.isEmpty())
    Si esta vacia imprime "e" si no imprime "n".
    Por lo tanto va imprimir e pq la lista, se encuentra vacia.
    */

    /*
     * EJEMPLO 2 DEL LIBRO
     *
     * El código comienza en la línea 1.
     * No podemos asumir que existen imports anteriores.
     *
     * ArrayList necesita:
     * import java.util.ArrayList;
     *
     * Por lo tanto, SIN este import, NO COMPILA.
     */

    /*
    public class LineNumbers { -- Linea 1 por lo tanto no hay imports antes de la clase
        public void method(ArrayList list) {
            if (list.isEmpty()) {
                System.out.println("e");
            } else {
                System.out.println("n");
            }
        }
    }
    */

    public static void main(String[] args) {
        CodeFormattingOnExam obj = new CodeFormattingOnExam();
        obj.method(new ArrayList());
    }

    // Metodo main que crea un objeto de la clase CodeFormattingOnExam llamado obj
    // y llama al metodo method donde le pasa un nuevo objeto de ArrayList como argumento.
    // pero igualmente como el metodo reviza si la lista sigue vacia, seguira imprimiendo
    // e debido a que el nuevo objeto que se le paso sigue estando vacio.
}