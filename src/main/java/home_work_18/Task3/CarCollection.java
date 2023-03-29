package home_work_18.Task3;

import java.util.ArrayList;
import java.util.List;

/*
Есть две коллекции, нужно удалить из первой те, которые есть во второй
 */
public class CarCollection {
    public static void main(String[] args) {
        List<String> listFirst = new ArrayList<>();

        listFirst.add("Ferrari F40");
        listFirst.add("McLaren 720");
        listFirst.add("Nissan Skyline");
        listFirst.add("Maserati MC12");
        listFirst.add("Mazda RX7");

        List<String> listSecond = new ArrayList<>();
        listSecond.add("Toyota Supra");
        listSecond.add("Nissan Skyline");
        listSecond.add("Mazda RX7");
        listSecond.add("Porsche 911 turbo s");

        listFirst.removeAll(listSecond);
        System.out.println(listFirst);
        System.out.println(listSecond);
    }
}
