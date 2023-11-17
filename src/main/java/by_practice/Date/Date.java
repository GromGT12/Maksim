package by_practice.Date;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Date {
    public static void main(String[] args) {

        LocalDate currentDate = LocalDate.now();
        LocalDate yearStartDate = LocalDate.of(currentDate.getYear(), 1, 1);

        long days = ChronoUnit.DAYS.between(yearStartDate, currentDate);

        System.out.println("Days from start of year: " + days);
    }
}
