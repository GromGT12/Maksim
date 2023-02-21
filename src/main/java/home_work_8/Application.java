package home_work_8;

public class Application {
    public static void main(String[] args) {
        Person person = new Person("Maks", "Krymov", 1990, PersonGender.MALE, PersonFamilyStatus.SINGLE);
        Person person2 = new Person("Dima", "Ivanov", 2010, PersonGender.MALE, PersonFamilyStatus.MARRIED);
        Person person3 = new Person("Ira", "Evseyeva", 1997, PersonGender.FAMALE, PersonFamilyStatus.SINGLE);
        Person person4 = new Person("Diana", "Dudnik", 2012, PersonGender.FAMALE, PersonFamilyStatus.MARRIED);

        Person[] people = new Person[] {person, person2, person3, person4};
        Recommendator recommendator = new Recommendator();
        recommendator.recommend(people);
        recommendator.recommend(person);
    }
}

