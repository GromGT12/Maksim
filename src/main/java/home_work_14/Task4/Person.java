package home_work_14.Task4;
import java.time.DayOfWeek;
import java.time.LocalDate;
/*
Создайте класс Person, в котором хранится имя, фамилия, дата рождения и любимый день недели (используйте
классы из пакета
java.time).
Представим, что вам пришли данные из другой системы и вам нужно преобразовать их в объекты типа Pesron.
В классе Application создайте строку:
"Fedor, Petrov, 7, 1980-25-02; Peter, Parker, 4, 1970-01-01; Inna, Filatova, 6, 1994-02-10" (имя, фамилия, номер любимого дня, дата рождения)
    1. Напишите метод, который распарсит (преобразует) эту строку в массив обхектов Person.
    2. Вынесите данный метод в класс PersonParser, в классе Application создавайте объект этого типа и работайте с ним.
    3. Измените входные данные на "Fedor, Petrov, 7, 1980-25-02; Maks, Ermolaev, 12, 1987-02-03; Peter, Parker, 4, 1970-01-01; Inna, Filatova, 6, 1994-02-10"
    обработайте полученную ошибку в классе PersonParser таким образом, чтобы программа не прерывала работу
 */

public class Person {

    private final String name;
    private final String surname;
    private final LocalDate birthday;
    private final DayOfWeek myday;

    public Person(String name, String surname, LocalDate birthday, DayOfWeek myday) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.myday = myday;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public DayOfWeek getMyday() {
        return myday;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthday=" + birthday +
                ", myday=" + myday +
                '}';
    }
}
