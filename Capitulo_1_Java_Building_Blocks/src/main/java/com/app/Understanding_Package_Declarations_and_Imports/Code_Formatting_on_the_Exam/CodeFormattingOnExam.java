package com.app.Understanding_Package_Declarations_and_Imports.Code_Formatting_on_the_Exam;

import java.util.ArrayList;

public class CodeFormattingOnExam {

    // Ejemplo del libro:
    // El código comienza en una línea posterior a la 1.
    // Se puede asumir que los imports están presentes.

    public void method(ArrayList list) {
        if (list.isEmpty()) {
            System.out.println("e");
        } else {
            System.out.println("n");
        }
    }

    /*
     * Segundo ejemplo del libro:
     *
     * 1: public class LineNumbers {
     * 2:     public void method(ArrayList list) {
     * 3:         ...
     * 4:     }
     * 5: }
     *
     * NO COMPILA si no existe:
     * import java.util.ArrayList;
     *
     * Como empieza en la línea 1, no podemos asumir
     * que el import fue omitido.
     */
}
