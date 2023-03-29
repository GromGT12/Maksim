package home_work_18.Task1;

import java.util.ArrayList;
import java.util.Scanner;

/*
Task 1
Вход на вечеринку только по списку.
Есть список имен (коллекция). Пользователь вводит с консоли свое имя,
а программа проверяет его наличие в списке,
после чего говорит может он пройти или нет
 */
public class PartyByList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        ArrayList<String> people = new ArrayList<>();

        people.add("Tom");
        people.add("Alice");
        people.add("Jessica");
        people.add("Bob");
        people.add("Marta");
        people.add("Maks");
        if (people.contains(name)) {
            System.out.println(name + ": " + "может пройти");
        }else{
            System.out.println("Такого имени в списке нет");
        }
    }
}

