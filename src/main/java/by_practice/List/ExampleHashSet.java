package by_practice.List;

import java.util.HashSet;
import java.util.Iterator;

public class ExampleHashSet {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Apple");
        hashSet.add("Банан");
        hashSet.add("Оранжевый");
        hashSet.add("Apple"); // Повторяющийся элемент (игнорируется в HashSet)

        System.out.println("Элементы HashSet:");
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
