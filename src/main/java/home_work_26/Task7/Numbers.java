package home_work_26.Task7;

import java.util.List;
import java.util.stream.IntStream;

// все гуд
public class Numbers {
    public static void main(String[] args) {

        List<Integer> integerList = IntStream.range(0, 150)
                .filter(Numbers::division)
                .boxed()
                .toList();
        System.out.println(integerList);
    }

    private static boolean division(int number) {
        return number % 7 == 0;
    }
}
