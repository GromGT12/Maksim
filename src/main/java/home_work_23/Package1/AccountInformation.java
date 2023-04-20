package home_work_23.Package1;

import com.fasterxml.jackson.annotation.JsonIgnore;
import home_work_23.Package2.OnlyDigits;

public class AccountInformation {
    private String name;
    private String surname;
    @Email
    private String email;
    @OnlyDigits
    @JsonIgnore
    private int phoneNumber;

    public AccountInformation() {
    }

    public AccountInformation(String name, String surname, String email, int phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phoneNumber = phoneNumber;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "AccountInformation{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
