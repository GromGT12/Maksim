package by_practice.List;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Создаем HashMap для хранения информации о людях
        Map<String, Person> peopleMap = new HashMap<>();

        // Добавляем несколько людей в HashMap
        peopleMap.put("John", new Person("John Doe", 25));
        peopleMap.put("Jane", new Person("Jane Smith", 30));

        // Получаем информацию о человеке по ключу
        Person john = peopleMap.get("John");
        if (john != null) {
            System.out.println("Information about John:");
            john.displayInfo();
        } else {
            System.out.println("John not found in the map.");
        }

        // Заменяем значение для существующего ключа
        peopleMap.put("John", new Person("John Updated", 26));

        // Получаем обновленную информацию о John
        Person updatedJohn = peopleMap.get("John");
        if (updatedJohn != null) {
            System.out.println("\nUpdated information about John:");
            updatedJohn.displayInfo();
        } else {
            System.out.println("John not found in the map.");
        }
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
