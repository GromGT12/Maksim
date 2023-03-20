package home_work_14.Task4;

import home_work_14.Task3.DateTime;
import org.apache.commons.lang3.StringUtils;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PersonParser {
    public Person parsePerson(String personString) {

        String[] split = StringUtils.split(personString, ",");
        String name = split[0].strip();
        String surname = split[1].strip();
        DayOfWeek myDay = DayOfWeek.of(Integer.parseInt(split[2].strip()));
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-dd-MM");
        LocalDate birtday = LocalDate.parse(split[3].strip(),dateTimeFormatter);
        return new Person(name, surname, birtday, myDay);
    }
}

