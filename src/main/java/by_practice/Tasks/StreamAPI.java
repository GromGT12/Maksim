package by_practice.Tasks;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int sumNotParralel = numbers.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Выводим не паралелный поток" + sumNotParralel);

        List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Создание параллельного стрима
        Stream<Integer> parallelStream = numbers.parallelStream();

        // Применение операций к элементам стрима параллельно
        int sum2 = parallelStream
                .filter(n -> n % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Вывод паралельного потока" + sum2);
    }
}





