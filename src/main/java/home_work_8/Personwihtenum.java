package home_work_8;

import java.util.Objects;

public class Personwihtenum {
    private String name;
    private String surname;
    private int yearOfBirth;
    private PersonGender gender;
    private PersonFamalyStatus familyStatus;

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

    public PersonFamalyStatus getFamilyStatus() {
        return familyStatus;
    }

    public void setFamilyStatus(PersonFamalyStatus familyStatus) {
        this.familyStatus = familyStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personwihtenum that = (Personwihtenum) o;
        return yearOfBirth == that.yearOfBirth && Objects.equals(name, that.name) && Objects.equals(surname, that.surname) && gender == that.gender && familyStatus == that.familyStatus;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, yearOfBirth, gender, familyStatus);
    }

    @Override
    public String toString() {
        return "Personwihtenum{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", gender=" + gender +
                ", familyStatus=" + familyStatus +
                '}';
    }

    public Personwihtenum(String name, String surname, int yearOfBirth, PersonGender gender, PersonFamalyStatus familyStatus) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.gender = gender;
        this.familyStatus = familyStatus;
        {

        }

    }
}