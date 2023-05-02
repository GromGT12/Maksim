package home_work_26.Task2;

import java.util.List;
import java.util.stream.Collectors;

public class AddressList {
    public static void main(String[] args) {
        List<Address> address = List.of(
                new Address("Kyiv", "Андреевский спуск", 25, 11),
                new Address("Kyiv", "Улица Антоновича", 12, 3),
                new Address("Kyiv", "Андреевский спуск", 25, 11),
                new Address("Charkov", "Андреевский спуск", 25, 11),
                new Address("Charkov", "Полта́вский Шлях", 13, 9),
                new Address("Charkov", "Полта́вский Шлях", 13, 9),
                new Address("Lvov", "Андреевский спуск", 25, 11),
                new Address("Lvov", "Улица Богдана Хмельницкого", 3, 8),
                new Address("Lvov", "Улица Богдана Хмельницкого", 3, 8));

        List<Address> city = address.stream()
                .filter(cityList -> cityList.getCity().equals("Kyiv"))
                .collect(Collectors.toList());
        System.out.println(city);
    }
}

