package home_work_18.Task4;
/*
Есть две коллекции, нужно оставить в первой только те, которые есть во второй
 */

import java.util.ArrayList;
import java.util.List;

public class CarCollection {
    public static void main(String[] args) {
        List<String> listFirst = new ArrayList<>();

        listFirst.add("Ferrari F40");
        listFirst.add("Bugatti Chiron");
        listFirst.add("Nissan Skyline");
        listFirst.add("Maserati MC12");
        listFirst.add("Mazda RX7");

        List<String> listSecond = new ArrayList<>();
        listSecond.add("Toyota Supra");
        listSecond.add("Nissan Skyline");
        listSecond.add("Mazda RX7");
        listSecond.add("Porsche 911 turbo s");

        listFirst.retainAll(listSecond);

        System.out.println(listFirst);
        System.out.println(listSecond);
    }
}

