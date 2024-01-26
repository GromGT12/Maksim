package by_practice.List;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapToArrayList {
    public static void main(String[] args) {
        // Создаем HashMap
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");
        hashMap.put(4, "Four");

        // Преобразуем HashMap в ArrayList
        List<String> arrayList = new ArrayList<>(hashMap.values());

        // Выводим результат
        System.out.println("HashMap: " + hashMap);
        System.out.println("ArrayList: " + arrayList);
    }
}
