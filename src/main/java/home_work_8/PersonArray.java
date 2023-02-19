package home_work_8;


/*Создать класс Person с полями Имя, фамилия, год рождения, пол (два варианта - мужской и женский),
        семейный статус (singe/married). Используйте знания с лекции 8 при дизайне.

        Создайте класс, в котором создайте объект класса Pesron. Если человек старше 18 и single,
        предложите ему услуги своего сайта знакомств:
        "Уважаемый Павел, желаете ли познакомится с девушкой?" или "Уважаемая Светлана, мы поможем
        вам найти мужчину мечты!"

        Создайте еще один класс, в котором создайте массив Person, и сделайте для них все то же самое.
*/


public class PersonArray {

    public static void main(String[] args) {
        Personwihtenum person1 = new Personwihtenum("Dima", "Nowak", 22-11-1990,"Male", "single");
        Personwihtenum person2 = new Personwihtenum("Diana", "Evseyeva", 22-11-2000,"Female", "single");
        Personwihtenum person3 = new Personwihtenum("Alina", "Kiriyenko", 22-11-2002,"Female", "single");
        Personwihtenum person4 = new Personwihtenum("Maks", "Nilolaev", 22-11-1993,"Male", "single");

        Personwihtenum[] personwihtenum = new Personwihtenum[] {person1, person2, person3, person4};

        // Мы хотели тут реализовать глаынй код, но так и не сомгли понять как это сделать. Я уже молчу про остальное


    }
}

