package home_work_27.Task1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        ServiceAbonent serviceAbonent = new ServiceAbonent();
        List<Abonent> abonentList = new ArrayList<>(List.of(
                new Abonent("Maks", "Krymov", "1234", LocalDate.of(1990, 12, 10), LocalDate.of(2023, 5, 12), true, "Dubai"),
                // new Abonent("Dima", "Kutuzov", "1234", LocalDate.of(1995, 11, 9), LocalDate.of(2022, 6, 18), true, "London"),
                new Abonent("Maria", "Partnenko", "1234", LocalDate.of(2000, 8, 23), LocalDate.of(2019, 7, 2), false, "Charkov"),
                new Abonent("Artem", "Pavlov", "1234", LocalDate.of(1985, 4, 25), LocalDate.of(2018, 9, 27), false, "Wroclaw"),
                new Abonent("Jack", "Karter", "1234", LocalDate.of(1989, 2, 20), LocalDate.of(2017, 1, 5), true, "Krakow"),
                new Abonent("Sveta", "Shtych", "1234", LocalDate.of(2001, 12, 5), LocalDate.of(2012, 3, 30), true, "Zurich")));

        boolean vip = serviceAbonent.anyAbonents(abonentList);
        System.out.println(vip);

        boolean dateConnect = serviceAbonent.allAbonents(abonentList);
        System.out.println(dateConnect);

        Optional<Abonent> anyAbonents = serviceAbonent.abonentFromCity(abonentList, "London");
        System.out.println(anyAbonents);
    }
}


