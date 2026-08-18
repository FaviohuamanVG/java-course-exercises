package Dia_6_Multidimensional_Arrays.Working_with_Dates_and_Times.Manipulating_Dates_and_Times;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class ManipulingDates {
    /*
     * En esta clase vamos a aprender a manipular fechas y horas.
    - Son Inmutables (Como los String)
     */

    // Las clases de fecha y hora (LocalDate, LocalTime, LocalDateTime) nunca cambian su valor interno.
    public static void main(String[] args) {

        // Crear un LocalDate + Sumar tiempo (plus...)
        LocalDate date = LocalDate.of(2014, Month.JANUARY, 20);
        System.out.println(date); // 2014-01-20
        date = date.plusDays(2);  // 2014-01-22
        date = date.plusWeeks(1); // 2014-01-29
        date = date.plusMonths(1);// 2014-02-28
        date = date.plusYears(5); // 2019-02-28

        // Crear un LocalDate + Restar tiempo (minus...)y Encadenamiento (Chaining)
        LocalDate date1 = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time = LocalTime.of(5, 15); // mostramos solo horas y minutos
        LocalDateTime dateTime = LocalDateTime.of(date1, time)
        .minusDays(1) // restamos un día
        .minusHours(10) // restamos horas
        .minusSeconds(30); // restamos segundos
        System.out.println(dateTime); // 2020-01-18T19:14:30
        // Si restamos segundos, Java detecta que los segundos ahora importan

        // Ignorar el valor retornado (Inmutabilidad)
        LocalDate date2 = LocalDate.of(2020, Month.JANUARY, 20);
        date2.plusDays(10); // no lo guardamos y se pierde en la memoria
        System.out.println(date2); // Imprime: 2020-01-20

        // Llama a métodos que la clase no tiene
        /*LocalDate date3 = LocalDate.of(2020, Month.JANUARY, 20);
        date3 = date3.plusMinutes(1); // ¡NO COMPILA!*/
        // No podemos agregar minutos ni segundos a un LocalDate que no lo almacena.

    }







}
