package Task3;

import org.apache.commons.lang3.StringUtils;

public class ArrayPersonReverser implements PersonReverser{


    @Override
    public Person reversePerson(Person person) {
        String reversedName = reverse(person.getName());
        String reversedSurname = reverse(person.getSurname());
        return new Person(reversedName, reversedSurname);


    }
    private String reverse(String word) {
        char[] result = new char[word.length()];
        char[] wordChars = word.toCharArray();
        for (int i = 0; i < wordChars.length; i++) {
            result[word.length()-i-1]=wordChars[i];

        }
        return String.valueOf(result);
    }
}

