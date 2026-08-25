package Dia_6_Multidimensional_Arrays.Working_with_Dates_and_Times.Formatting_Dates_and_Times;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FormatingDate {
    /*  
        Consiste en convertir esos objetos en cadenas de texto (String).
        Se introduce la clase DateTimeFormatter (ubicada en el paquete java.time.format).
    */

        public static void main(String[] args) {
            // Formatos Estándar (ISO)
            LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
            System.out.println(date.getDayOfWeek()); // MONDAY
            System.out.println(date.getMonth());     // JANUARY
            System.out.println(date.getYear());      // 2020
            System.out.println(date.getDayOfYear());  // 20

            // Formatos Locales
            LocalDate date1 = LocalDate.of(2020, Month.JANUARY, 20);
            LocalTime time = LocalTime.of(11, 12, 34);
            LocalDateTime dateTime = LocalDateTime.of(date, time);

            System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
            System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
            System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

            // Formatos Locales
            DateTimeFormatter shortDateTime = 
            DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
            System.out.println(shortDateTime.format(dateTime)); // 1/20/20
            System.out.println(shortDateTime.format(date));     // 1/20/20
            //System.out.println(
            //shortDateTime.format(time)); // UnsupportedTemporalTypeException


            DateTimeFormatter shortDateTime1 = 
                DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
            System.out.println(dateTime.format(shortDateTime1));
            System.out.println(date.format(shortDateTime1));
            //System.out.println(time.format(shortDateTime1));

            // Dos formatos predefinidos: SHORT y MEDIUM
            LocalDate date2 = LocalDate.of(2020, Month.JANUARY, 20);
            LocalTime time1 = LocalTime.of(11, 12, 34);
            LocalDateTime dateTime2 = LocalDateTime.of(date2, time1);

            DateTimeFormatter shortF = DateTimeFormatter
                .ofLocalizedDateTime(FormatStyle.SHORT);
            DateTimeFormatter mediumF = DateTimeFormatter
                .ofLocalizedDateTime(FormatStyle.MEDIUM);

            System.out.println(shortF.format(dateTime));  // 1/20/20 11:12 AM
            System.out.println(mediumF.format(dateTime)); // Jan 20, 2020 11:12:34 AM

            // O crear un formato personalizado con el método ofPattern()
            DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
            System.out.println(dateTime.format(f)); // January 20, 2020, 11:12

            


        }
}
