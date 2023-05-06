package home_work_27.Task2;

import home_work_27.Task1.Abonent;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

/*
Task 2
Напишите сервис, который будет собирать статистику об абонентах:
-  метод должен принять список абонентов, вычислять их возраст, и вычислять IntSummaryStatistics. Метод дожен вернуть строку-отчет: “Количество абонентов - хх. Самый юный - хх лет, самый возрастной - хх лет, средний возраст - хх лет
-  метод должен принимать список абонентов, отбирать только премиальных клиентов, вычислять, сколько уже длится их контракт и собирать статистику. Метод должен возвращать строку - отчет: Количесвто абонентов - жж, самый долгий контракт - хх, средний срок контрактв - хх
*/
public class ServiceAbonent {
    public static void main(String[] args) {
        List<Abonent> abonentList = new ArrayList<>(List.of(
                new Abonent("Maks", "Krymov", "1234", LocalDate.of(1990, 7, 11), LocalDate.of(2023, 5, 12), true, "Dubai"),
                new Abonent("Dima", "Kutuzov", "2267", LocalDate.of(1995, 11, 9), LocalDate.of(2022, 6, 18), true, "London"),
                new Abonent("Maria", "Partnenko", "7856", LocalDate.of(2000, 8, 23), LocalDate.of(2019, 7, 2), false, "Charkov"),
                new Abonent("Artem", "Pavlov", "9862", LocalDate.of(1985, 4, 25), LocalDate.of(2018, 9, 27), true, "Wroclaw"),
                new Abonent("Jack", "Karter", "7724", LocalDate.of(1989, 2, 20), LocalDate.of(2017, 1, 5), false, "Krakow"),
                new Abonent("Sveta", "Shtych", "6522", LocalDate.of(2001, 12, 5), LocalDate.of(2018, 3, 30), false, "Zurich")));

        List<LocalDate> localDate = Arrays.asList(
                LocalDate.of(1990, 7, 11),
                LocalDate.of(1995, 11, 9),
                LocalDate.of(2000, 8, 23),
                LocalDate.of(1985, 4, 25),
                LocalDate.of(1989, 2, 20),
                LocalDate.of(2001, 12, 5));


        IntSummaryStatistics stats = localDate.stream()
                .mapToInt(localDateList -> Period.between(localDateList, LocalDate.now()).getYears()).summaryStatistics();
        System.out.printf("Calculate subscribers: %d%n", stats.getCount());
        System.out.printf("Min age: %d%n", stats.getMin());
        System.out.printf("Max age: %d%n", stats.getMax());
        System.out.printf("Average age: %.2f%n", stats.getAverage());

        System.out.println("--------------------------------");

        List<LocalDate> Contractstatistic = Arrays.asList(
                LocalDate.of(2023, 5, 12),
                LocalDate.of(2022, 6, 18),
                LocalDate.of(2018, 9, 27));

        IntSummaryStatistics contractStats = Contractstatistic.stream()
                .mapToInt(localDateList -> Period.between(localDateList, LocalDate.now()).getYears()).summaryStatistics();

        System.out.printf("Number subscribers vip %d%n ", contractStats.getCount());
        System.out.printf("Max contract vip: %d%n", contractStats.getMax());
        System.out.printf("Average contract vip: %.2f%n ", contractStats.getAverage());

    }
}
