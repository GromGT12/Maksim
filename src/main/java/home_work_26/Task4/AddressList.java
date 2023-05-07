package home_work_26.Task4;

import home_work_26.Task2.Addresses;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

// все гуд
public class AddressList {
    public static void main(String[] args) {

        List<Addresses> address = List.of(
                new Addresses("Kiev", "Andriyivsky Descent", 25, 11),
                new Addresses("Kiev", "Antonovich Street", 12, 3),
                new Addresses("Kiev", "Andriyivsky Descent", 25, 11),
                new Addresses("Charkov", "Darwin street", 17, 7),
                new Addresses("Charkov", "Poltavskyi Shlyakh", 13, 9),
                new Addresses("Charkov", "Poltavskyi Shlyakh", 13, 9),
                new Addresses("Lvov", "High Castle", 2, 18),
                new Addresses("Lvov", "Bogdan Khmelnitsky", 3, 8),
                new Addresses("Lvov", "Bogdan Khmelnitsky", 3, 8));

        Set<String> city = address.stream()
                .map(Addresses::getCity)
                .collect(Collectors.toSet());
        System.out.println(city);
    }
}


