package com.app.Understanding_Package_Declarations_and_Imports.Code_Formatting_on_the_Exam;

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
    public class LineNumbers {
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
}