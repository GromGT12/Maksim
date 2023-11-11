package by_practice.tasks;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int sumNotParallel = numbers.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Outputting a non-parallel thread" + sumNotParallel);

        // Создание параллельного стрима
        Stream<Integer> parallelStream = numbers.parallelStream();

        // Применение операций к элементам стрима параллельно
        int sum2 = parallelStream
                .filter(n -> n % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Output of a parallel thread" + sum2);
    }
}





