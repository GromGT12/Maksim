package home_work_8;

import java.util.Objects;
// Плиз, переименуй класс в просто Person
// нужно отформатировать код
public class Personwihtenum {
    private String name;
    private String surname;
    private int yearOfBirth;
    // поле должно быть типа PersonGEnder
    private PersonGender gender;
    // поле должно быть типа PersonFamilyStatus
    private String familyStatus;

    public Personwihtenum(String name, String surname, int yearOfBirth, PersonGender gender, String famalyStatus) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.gender = gender;
        this.familyStatus = famalyStatus;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getFamilyStatus() {
        return familyStatus;
    }
    public void setFamilyStatus(String familyStatus) {
        this.familyStatus = familyStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personwihtenum that = (Personwihtenum) o;
        return yearOfBirth == that.yearOfBirth && Objects.equals(name, that.name) && Objects.equals(surname, that.surname) && Objects.equals(gender, that.gender) && Objects.equals(familyStatus, that.familyStatus);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, surname, yearOfBirth, gender, familyStatus);
    }

    @Override
    public String toString() {
        return "PersonEnum{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", gender='" + gender + '\'' +
                ", famalyStatus='" + familyStatus + '\'' +
                '}';
    }
}



