package Dia_6_Multidimensional_Arrays.Working_with_Dates_and_Times.Parsing_Dates_and_Times;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ParsingDate {
    /*  
    convertir un String a una fecha u hora.
    el método parse() también recibe un formateador.
    */

    public static void main(String[] args) {
        // Formateador personalizado con espacio como separador
        DateTimeFormatter f = DateTimeFormatter.ofPattern("MM dd yyyy");

        // Parseo con formateador personalizado
        LocalDate date = LocalDate.parse("2024 01 02", f);

        // Parseo con el formateador estándar por defecto (ISO)
        LocalTime time = LocalTime.parse("11:22");

        System.out.println(date); // Imprime: 2015-01-02 (formato estándar ISO)
        System.out.println(time); // Imprime: 11:22
    }
}
