package home_work_14.Task4;

import java.time.LocalTime;

/*
В классе Application создайте строку:
"Fedor, Petrov, 7, 1980-25-02; Peter, Parker, 4, 1970-01-01; Inna, Filatova, 6, 1994-02-10"
(имя, фамилия, номер любимого дня, дата рождения)
 */
public class Application {
    public static void main(String[] args) {
        PersonParser parser = new PersonParser();
        Person parsePerson = parser.parsePerson("Fedor, Petrov, 7, 1980-25-02");
        System.out.println(parsePerson);

    }
}
