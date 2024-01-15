package by_practice.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {
    public static void main(String[] args) {
        Date today = new Date();
        System.out.println("current date and time: " + today);

        Date currentDate = new java.sql.Date(today.getTime());
        System.out.println("current day: " + currentDate);

        Date currentTime = new java.sql.Time(today.getTime());
        System.out.println("current time: " + currentTime);

        DateFormat df = new SimpleDateFormat("ddMMyyyy");
        String todayDate = df.format(today);
        System.out.println("Today is date in MMddyyyy format: " + todayDate);

        df = new SimpleDateFormat("MM/dd/yyyy");
        todayDate = df.format(today);
        System.out.println("Today is date in MM/dd/yyyy format: " + todayDate);
    }
}
