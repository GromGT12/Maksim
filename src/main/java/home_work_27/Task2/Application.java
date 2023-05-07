package home_work_27.Task2;

import home_work_27.Task1.Abonent;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;


public class Application {
    public static void main(String[] args) {
        ServiceAbonent serviceAbonent = new ServiceAbonent();
        List<Abonent> abonents = new ArrayList<>(List.of(
                new Abonent("Maks", "Krymov", "1234", LocalDate.of(1990, 7, 11), LocalDate.of(2023, 5, 12), true, "Dubai"),
                new Abonent("Dima", "Kutuzov", "2267", LocalDate.of(1995, 11, 9), LocalDate.of(2022, 6, 18), true, "London"),
                new Abonent("Maria", "Partnenko", "7856", LocalDate.of(2000, 8, 23), LocalDate.of(2019, 7, 2), false, "Charkov"),
                new Abonent("Artem", "Pavlov", "9862", LocalDate.of(1985, 4, 25), LocalDate.of(2018, 9, 27), true, "Wroclaw"),
                new Abonent("Jack", "Karter", "7724", LocalDate.of(1989, 2, 20), LocalDate.of(2017, 1, 5), false, "Krakow"),
                new Abonent("Sveta", "Shtych", "6522", LocalDate.of(2001, 12, 5), LocalDate.of(2018, 3, 30), false, "Zurich")));


        IntSummaryStatistics contractStats = serviceAbonent.subscriberCountAge(abonents);

        System.out.printf("Calculate subscribers: %d%n", contractStats.getCount());
        System.out.printf("Min age: %d%n", contractStats.getMin());
        System.out.printf("Max age: %d%n", contractStats.getMax());
        System.out.printf("Average age: %.2f%n", contractStats.getAverage());

        System.out.println("--------------------------------");

        IntSummaryStatistics contractStatsVip = serviceAbonent.subscriberCountAgeVip(abonents);

        System.out.printf("Number subscribers vip %d%n ", contractStatsVip.getCount());
        System.out.printf("Max contract vip: %d%n", contractStatsVip.getMax());
        System.out.printf("Average contract vip: %.2f%n ", contractStatsVip.getAverage());

    }
}
