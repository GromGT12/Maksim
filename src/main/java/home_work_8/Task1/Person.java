package home_work_8.Task1;

import java.util.Objects;

public class Person {
    private String name;
    private String surname;
    private int yearOfBirth;
    private PersonGender gender;
    private PersonFamilyStatus familyStatus;

    public Person(String name, String surname, int yearOfBirth, PersonGender gender, PersonFamilyStatus familyStatus) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.gender = gender;
        this.familyStatus = familyStatus;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public int getYearOfBirth() {
        return yearOfBirth;
    }
    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
    public PersonGender getGender() {
        return gender;
    }
    public void setGender(PersonGender gender) {
        this.gender = gender;
    }

    public PersonFamilyStatus getFamilyStatus() {
        return familyStatus;
    }
    public void setFamilyStatus(PersonFamilyStatus familyStatus) {
        this.familyStatus = familyStatus;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return yearOfBirth == person.yearOfBirth && Objects.equals(name, person.name) && Objects.equals(surname, person.surname) && gender == person.gender && familyStatus == person.familyStatus;
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, surname, yearOfBirth, gender, familyStatus);
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", gender=" + gender +
                ", familyStatus=" + familyStatus +
                '}';
    }
}