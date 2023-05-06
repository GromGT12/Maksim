package home_work_26.Task1;

import java.util.stream.Stream;

// все хорошо
public class Filter {
    public static void main(String[] args) {

        Stream<String> cityList = Stream.of("Париж", "Лондон", "Мадрид", "Берлин", "Брюссель", "Лодзь");
        cityList.filter(s -> s.length() == 6).forEach(System.out::println);
    }
}
