package by_practice.comporator;

import by_practice.variabls.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Book A", "Author X", 2000));
        books.add(new Book("Book B", "Author Y", 1995));
        books.add(new Book("Book C", "Author Z", 2010));

        Collections.sort(books);
        for (Book book : books) {
            System.out.println(book);
        }

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", "Camry", 2015, "Black", 25000));
        cars.add(new Car("Honda", "Civic", 2018, "White", 20000));
        cars.add(new Car("Ford", "Mustang", 2020, "Red", 35000));

        Collections.sort(cars, Comparator.comparingInt(Car::getYear).thenComparing(Car::getYear));

        // Выводим отсортированный список машин
        System.out.println("Sorted Cars:");
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
