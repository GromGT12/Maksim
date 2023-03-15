package home_work_14.Task3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
В классе Application создайте строки: '2023-17-01', '23-2022-01', '15-07-2022'.
Распарсите эти строки в объекты LocalDate, используя DateTime formatter.
Каждую полученную дату выведите в консоль в нескольких форматах:
01-Mar-2022, Mar-01-2022, 2022-01-Mar, 01-March-2022
Создайте объект LocalDateTime и выведите его в консоль в каком-то нетипичном формате на ваше усмотрение.

 */


public class DateTime {
    public static void main(String[] args) {
        String Date = "2023-17-01";
        String Date1 = "23-2022-01";
        String Date2 = "15-07-2022";


        DateTimeFormatter firsmonths = DateTimeFormatter.ofPattern("MMM-dd-yyyy");
        DateTimeFormatter firsmonths1 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        DateTimeFormatter firsmonths2 = DateTimeFormatter.ofPattern("yyyy-MMM-dd");
        DateTimeFormatter firsmonths3 = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");

        LocalDate fromString = LocalDate.parse("2022-15-07", DateTimeFormatter.ofPattern("yyyy-dd-MM"));
        System.out.println(firsmonths.format(fromString));
        System.out.println(firsmonths1.format(fromString));
        System.out.println(firsmonths2.format(fromString));
        System.out.println(firsmonths3.format(fromString));

        LocalDateTime dataTime = LocalDateTime.now();
        System.out.println(dataTime);

    }
}