package Dia_6_Multidimensional_Arrays.Working_with_Dates_and_Times.Working_with_Periods;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

public class Periods {
    /*  
    La clase Period permite representar un intervalo de tiempo 
    (ejemplo: "cada 3 semanas", "cada 2 meses", "cada 1 año y 7 días") 
    de forma reutilizable y dinámica.
    - Creamos un objeto Period para pasar los intervalos de tiempo entre las fechas según el calendario
    */

    public static void main(String[] args) {
        // Crear un Periodo de 3 meses
        LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
        Period period = Period.ofMonths(1); // Creamos un periodo de 1 mes
        // Iterar sobre el periodo de tiempo
        LocalDate upTo = start;
        while (upTo.isBefore(end)) {
            System.out.println("give new toy: " + upTo);
            upTo = upTo.plus(period); // Le sumamos el periodo a la fecha
        }

        // Formas de crear un Period
        Period annually = Period.ofYears(1);             // Cada 1 año
        Period quarterly = Period.ofMonths(3);           // Cada 3 meses
        Period everyThreeWeeks = Period.ofWeeks(3);      // Cada 3 semanas
        Period everyOtherDay = Period.ofDays(2);         // Cada 2 días
        Period everyYearAndAWeek = Period.of(1, 0, 7);   // 1 año, 0 meses, 7 días

        // El encadenamiento falso (Method Chaining)
            // - NO puedes encadenar llamadas al crear un Period.
        Period wrong = Period.ofYears(1).ofWeeks(1); // ¡OJO! NO es 1 año y 1 semana
        // Java interpreta ese código como:
        Period wrong1 = Period.ofYears(1);
        wrong1 = Period.ofWeeks(7); // Sobrescribe el valor anterior. 
        // ¡El periodo final es solo 1 semana!

        // Aplicar un Period a un LocalTime
        LocalDate date = LocalDate.of(2015, 1, 20);
        LocalTime time = LocalTime.of(6, 15);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        Period period2 = Period.ofMonths(1);

        System.out.println(date.plus(period2));     // Funciona: 2015-02-20
        System.out.println(dateTime.plus(period2)); // Funciona: 2015-02-20T06:15
        System.out.println(time.plus(period2));     // ¡ERROR EN TIEMPO DE EJECUCIÓN! (UnsupportedTemporalTypeException)

    }
}
