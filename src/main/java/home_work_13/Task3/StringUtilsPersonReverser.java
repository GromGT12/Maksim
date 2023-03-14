package home_work_13.Task3;

import org.apache.commons.lang3.StringUtils;

public class StringUtilsPersonReverser implements PersonReverser {

    @Override
    public Person reversePerson(Person person) {
        String reversedName = StringUtils.reverse(person.getName());
        String reversedSurname = StringUtils.reverse(person.getSurname());
        return new Person(reversedName, reversedSurname);
    }
}

