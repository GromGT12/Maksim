package home_work_25.Task6;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorCar {
    public static void main(String[] args) {
        Car car1 = new Car("Ferrari", "F430", 2004);
        Car car2 = new Car("Ferrari", "Enzo", 2000);
        Car car3 = new Car("Ferrari", "250 GTO", 1962);
        Car car4 = new Car("Ferrari", "550 Maranello", 1996);


        List<String> car = Arrays.asList("F430", "Enzo", "250 GTO", "550 Maranello");

        car.sort((o1, o2) -> {
           int firstCharComparison = o1.charAt(0) - o2.charAt(0);
            int secondCharComparison = -String.CASE_INSENSITIVE_ORDER.compare(o1.substring(1), o2.substring(1));
            return firstCharComparison != 0 ? firstCharComparison : secondCharComparison;
        });
        System.out.println(car);
    }
}


