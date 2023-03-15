package home_work_14.Task3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
    public static void main(String[] args) {

        String Date = "2023-17-01";
        String Date1 = "23-2022-01";
        String Date2 = "15-07-2022";

        DateTimeFormatter firsmonths = DateTimeFormatter.ofPattern("MMM-dd-yyyy");
        DateTimeFormatter firsmonths1 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        DateTimeFormatter firsmonths2 = DateTimeFormatter.ofPattern("yyyy-MMM-dd");
        DateTimeFormatter firsmonths3 = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");

        LocalDate date = LocalDate.parse("2023-17-01", DateTimeFormatter.ofPattern("yyy-dd-MM"));
        LocalDate date1 = LocalDate.parse("23-2022-01", DateTimeFormatter.ofPattern("dd-yyy-MM"));
        LocalDate date2 = LocalDate.parse("15-07-2022", DateTimeFormatter.ofPattern("dd-MM-yyy"));
        System.out.println(firsmonths.format(date) + ":" + firsmonths1.format(date) + ":" + firsmonths2.format(date) + ":" + firsmonths3.format(date));
        System.out.println(firsmonths.format(date1) + ":" + firsmonths1.format(date1) + ":" + firsmonths2.format(date1) + ":" + firsmonths3.format(date1));
        System.out.println(firsmonths.format(date2) + ":" + firsmonths1.format(date2) + ":" + firsmonths2.format(date2) + ":" + firsmonths3.format(date2));


        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("MMMM d, yyyy HH:mm:ss");
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTimeFormatter1.format(dateTime));

    }
}
