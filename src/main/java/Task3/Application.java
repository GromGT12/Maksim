package Task3;

public class Application {
    public static void main(String[] args) {
        Person person = new Person("Maks", "Petrov");
        Person person2 = new Person("Maks", "Petrov");


        PersonReverser personReverser = new StringUtilsPersonReverser();
        Person reversedperson1 = personReverser.reversePerson(person);
        System.out.println(reversedperson1);

        ArrayPersonReverser arrayPersonReverser = new ArrayPersonReverser();
        Person reversePerson2 = arrayPersonReverser.reversePerson(person2);
        System.out.println(reversePerson2);
        System.out.println(reversedperson1.equals(reversePerson2));

    }
}



