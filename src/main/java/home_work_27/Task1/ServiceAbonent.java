package home_work_27.Task1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/*
Task 1
Напишите сервис с несколькими методами для работы со списком абонентов:

-  метод должен принять список абонентов и город, а вернуть true есть ли в этом городе хоть один вип-абонент (иначе вернуть false) (anyMatch)
-  метод должен принять список обонентов и дату, а вернуть true если все аюоненты в списке подключились до этой даты (allMatch)
-  метод должен принять список абонентов и город, и вернуть любого абонента из этого города, а если из этого города абонентов нет - выбросить исключение (findAny, optional)
 */
public class ServiceAbonent {
    public static void main(String[] args) {
        List<Abonent> abonentList = new ArrayList<>(List.of(
                new Abonent("Maks", "Krymov", "1234", LocalDate.of(1990, 12, 10), LocalDate.of(2023, 5, 12), true, "Dubai"),
                // new Abonent("Dima", "Kutuzov", "1234", LocalDate.of(1995, 11, 9), LocalDate.of(2022, 6, 18), true, "London"),
                new Abonent("Maria", "Partnenko", "1234", LocalDate.of(2000, 8, 23), LocalDate.of(2019, 7, 2), false, "Charkov"),
                new Abonent("Artem", "Pavlov", "1234", LocalDate.of(1985, 4, 25), LocalDate.of(2018, 9, 27), false, "Wroclaw"),
                new Abonent("Jack", "Karter", "1234", LocalDate.of(1989, 2, 20), LocalDate.of(2017, 1, 5), true, "Krakow"),
                new Abonent("Sveta", "Shtych", "1234", LocalDate.of(2001, 12, 5), LocalDate.of(2012, 3, 30), true, "Zurich")));


        LocalDate date = LocalDate.of(2023,5,12);
        abonentList.stream()
                .filter(abonent -> abonent.getContractDate().isBefore(date));
        System.out.println(date);



        Optional<Abonent> abonentOptional = abonentList.stream()
                .filter(abonent -> abonent.getCity().equals("London"))
                .findAny();
        if (abonentOptional.isPresent()) {
            System.out.println(abonentOptional.get());
        } else {
            Abonent abonent = abonentOptional.orElseThrow(() -> new IllegalArgumentException("Такого абонента нет"));
            System.out.println(abonent);
        }
    }
}

