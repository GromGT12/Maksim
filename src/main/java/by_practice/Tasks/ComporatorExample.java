package by_practice.Tasks;

import java.util.*;

public class ComporatorExample {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("John", "Alice", "Bob", "Eve", null, "Charlie"));

        // Сортировка с учетом null значений в конце
        Collections.sort(names, Comparator.nullsLast(String::compareTo));
        System.out.println(names);

        // Использование естественного порядка сортировки для чисел
        List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 2, 8, 1, 3, 7));
        Collections.sort(numbers);
        System.out.println(numbers);
    }
}

