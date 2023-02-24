package home_work_8.Task1;

public class Recommendator {
    public void recommend(Person[] people) {
        for (Person person : people) {
            int age = 2020 - person.getYearOfBirth();

            if (age >= 18 && person.getFamilyStatus().equals(PersonFamilyStatus.SINGLE)) {
                if (person.getGender().equals(PersonGender.MALE)) {
                    String name = person.getName();
                    System.out.println("Уважаемый " + name + ", не желаете познакомится с девушкой?");
                }
                if (person.getFamilyStatus().equals(PersonFamilyStatus.SINGLE)) {
                    if (person.getGender().equals(PersonGender.FEMALE)) {
                        String name = person.getName();
                        System.out.println("Уважаемая " + name + ", не желаете познакомится с парнем?");
                    }
                }
            }
        }
    }
        public void recommend (Person person){
                        int age = 2020 - person.getYearOfBirth();

            if (age >= 18 && person.getFamilyStatus().equals(PersonFamilyStatus.MARRIED)) {
                if (person.getGender().equals(PersonGender.MALE)) {
                    String name = person.getName();
                    System.out.println("Уважаемый " + name + ", не желаете познакомится с девушкой?");
                }
                if (person.getFamilyStatus().equals(PersonFamilyStatus.MARRIED)) {
                    if (person.getGender().equals(PersonGender.FEMALE)) {
                        String name = person.getName();
                        System.out.println("Уважаемая " + name + ", не желаете познакомится с парнем?");
                    }
                }
            }
        }
    }



















