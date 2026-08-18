package Dia_6_Multidimensional_Arrays.Working_with_Dates_and_Times.Creating_Dates_and_Times;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class DatesTimes {
    /*  
    Para crear fechas y horas apartir de Java 8 en adelante, utilizas una de estas tres clases:
    LocalDate: Solo contiene Fecha (año, mes, día). Ejemplo: Tu cumpleaños este año.
    LocalTime: Solo contiene Hora (hora, minuto, segundo, nanosegundos). Ejemplo: La medianoche.
    LocalDateTime: Contiene Fecha y Hora juntas. Ejemplo: Año Nuevo a la medianoche.
    */

    public static void main(String[] args) {
        // Obtener la Fecha y Hora Actual (.now())
        System.out.println("Fecha y Hora Actual");
        System.out.println(LocalDate.now());     // Formato: 2015-01-20
        System.out.println(LocalTime.now());     // Formato: 12:45:18.401
        System.out.println(LocalDateTime.now()); // Formato: 2015-01-20T12:45:18.401

        // Crear Fechas y Horas Específicas (.of())
        LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
        LocalDate date2 = LocalDate.of(2015, 1, 20); // Mismo resultado
        // el primer elemento es el índice 0. Pero para los meses empieza con 1 = enero

        // Crear un LocalTime
        LocalTime time1 = LocalTime.of(6, 15);               // Hora y minutos (06:15)
        LocalTime time2 = LocalTime.of(6, 15, 30);           // + segundos (06:15:30)
        LocalTime time3 = LocalTime.of(6, 15, 30, 200);      // + nanosegundos

        // Crear un LocalDateTime
        // Opción A: Todo en una sola línea
        LocalDateTime dateTime1 = LocalDateTime.of(2015, Month.JANUARY, 20, 6, 15, 30);

        // Opción B: Combinando un LocalDate y un LocalTime
        LocalDateTime dateTime2 = LocalDateTime.of(date1, time1);


    }

}
