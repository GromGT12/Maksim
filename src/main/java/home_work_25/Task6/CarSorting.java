package home_work_25.Task6;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CarSorting {
    public static void main(String[] args) {

        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Ferrari", "F430", 2004));
        carList.add(new Car("Ferrari", "Enzo", 2000));
        carList.add(new Car("Ferrari", "GTO 256", 1962));
        carList.add(new Car("Ferrari", "550 Marranello", 1996));

        Collections.sort(carList, (o1, o2) -> 0);
        Collections.sort(carList, (o1, o2)->(o2.getModel().compareTo(o1.getModel())));
        System.out.println("Сортировка в обратном порядке" + carList);
    }
}
