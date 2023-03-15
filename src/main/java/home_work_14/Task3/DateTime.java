package home_work_14.Task3;

import java.time.format.DateTimeFormatter;

public class DateTime {
    public static void main(String[] args) {
        String Date = "2023-17-01";
        String Date1 = "23-2022-01";
        String Date2 = "15-07-2022";
        /*

         */
        DateTimeFormatter firsmonths = DateTimeFormatter.ofPattern("MM-yyyy-dd");
        System.out.println(Date);

    }
}
