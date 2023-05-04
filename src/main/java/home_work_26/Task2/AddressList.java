package home_work_26.Task2;

import java.util.List;
import java.util.stream.Collectors;

public class AddressList {
    public static void main(String[] args) {
        // предложу переименовать переменную в addresses
        List<Address> address = List.of(
                new Address("Kiev", "Andriyivsky Descent", 25, 11),
                new Address("Kiev", "Antonovich Street", 12, 3),
                new Address("Kiev", "Andriyivsky Descent", 25, 11),
                new Address("Charkov", "Andriyivsky Descent", 25, 11),
                new Address("Charkov", "Poltavskyi Shlyakh", 13, 9),
                new Address("Charkov", "Poltavskyi Shlyakh", 13, 9),
                new Address("Lvov", "Andriyivsky Descent", 25, 11),
                new Address("Lvov", "Bogdan Khmelnitsky", 3, 8),
                new Address("Lvov", "Bogdan Khmelnitsky", 3, 8));

        List<Address> city = address.stream()
                // предложу переименовать переменную в address
                .filter(cityList -> cityList.getCity().equals("Kiev"))
                .collect(Collectors.toList());
        System.out.println(city);
    }
}

