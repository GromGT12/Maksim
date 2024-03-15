package by_practice.comporator;

import by_practice.variabls.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainCar {
        public static void main(String[] args) {
            List<by_practice.variabls.Car> cars = new ArrayList<>();
            cars.add(new by_practice.variabls.Car("Toyota", "Camry", 2015, "Black", 25000));
            cars.add(new by_practice.variabls.Car("Honda", "Civic", 2018, "White", 20000));
            cars.add(new by_practice.variabls.Car("Ford", "Mustang", 2020, "Red", 35000));

            Collections.sort(cars, Comparator.comparingInt(by_practice.variabls.Car::getYear));
            System.out.println("Sorted Cars:");
            for (by_practice.variabls.Car car : cars) {
                System.out.println(car);
            }
        }
    }
