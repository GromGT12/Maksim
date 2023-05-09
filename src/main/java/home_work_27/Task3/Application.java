package home_work_27.Task3;

import home_work_27.Task1.Abonent;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Application {
    public static void main(String[] args) {
        ServiceAbonent serviceAbonent = new ServiceAbonent();
        List<Abonent> abonents = new ArrayList<>(List.of(
                new Abonent("Maks", "Krymov", "1234", LocalDate.of(1990, 12, 11), LocalDate.of(2023, 5, 12), true, "Dubai"),
                new Abonent("Dima", "Kutuzov", "1222", LocalDate.of(1995, 11, 9), LocalDate.of(2022, 6, 18), true, "London"),
                new Abonent("Maria", "Partnenko", "1289", LocalDate.of(2000, 8, 23), LocalDate.of(2019, 7, 2), false, "Charkov"),
                new Abonent("Artem", "Pavlov", "9945", LocalDate.of(1985, 4, 25), LocalDate.of(2018, 9, 27), true, "Wroclaw"),
                new Abonent("Jack", "Karter", "7723", LocalDate.of(1989, 2, 20), LocalDate.of(2017, 1, 5), false, "Krakow"),
                new Abonent("Sveta", "Shtych", "7321", LocalDate.of(2001, 12, 5), LocalDate.of(2012, 3, 30), false, "Zurich")));

        Map<String, Abonent> stringMap = serviceAbonent.filteringNotVip(abonents);
        System.out.println(stringMap);

        Map<String, List<Abonent>> abonentsCity = serviceAbonent.groupByCity(abonents);
        System.out.println(abonentsCity);

    }
}

