package home_work_20;


import java.time.LocalDate;
import java.util.Objects;

public class AccountInfo implements Comparable<AccountInfo>{

    private final String name;
    private final String surname;
    private final String phone;
    private final String email;
    private final LocalDate dateOfBirth;

    public AccountInfo(String name, String surname, String phone, String email, LocalDate dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountInfo that = (AccountInfo) o;
        return Objects.equals(name, that.name) && Objects.equals(surname, that.surname) && Objects.equals(phone, that.phone) && Objects.equals(email, that.email) && Objects.equals(dateOfBirth, that.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, phone, email, dateOfBirth);
    }

    @Override
    public String toString() {
        return "AccountInfo{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }

/*
Отсортируйте список данных по имени и фамлии пользователя, выведите в консоль
Отсортируйте список данных по дате рождения в порядке убывания, выведите в консоль
Отсортируйте список данных по имени, фамилии, дате рождения, выведите в консоль
 */

    @Override
    public int compareTo(AccountInfo accountInfo) {
        int result = this.name.compareTo(accountInfo.getName());
        if(result !=0) {
            return result;
        }
        result = this.surname.compareTo(accountInfo.getSurname());
        if(result != 0){
            return result;
        }
        result = this.phone.compareTo(accountInfo.getPhone());
        if(result !=0){
            return result;
        }
        result = String.CASE_INSENSITIVE_ORDER.compare(this.email, accountInfo.getEmail());
        if(result !=0){
            return result;
        }
        return this.dateOfBirth.compareTo(this.dateOfBirth);
    }

}