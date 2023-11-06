package by_practice.tasks;

import java.util.HashSet;
import java.util.Set;

public class Main {
        public static void main(String[] args) {
            Set<Car> carSet = new HashSet<>();

            Car car1 = new Car("Toyota", "Camry");
            Car car2 = new Car("Honda", "Accord");
            Car car3 = new Car("Nissan", "Altima");
            Car car4 = new Car("Toyota", "Camry"); // Коллизия с car1

            carSet.add(car1);
            carSet.add(car2);
            carSet.add(car3);
            carSet.add(car4); // Здесь будет коллизия

            System.out.println("Размер HashSet: " + carSet.size());
            for (Car car : carSet) {
                System.out.println(car);
            }
        }
    }

