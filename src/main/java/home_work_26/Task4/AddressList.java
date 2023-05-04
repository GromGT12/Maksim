package home_work_26.Task4;

import home_work_26.Task2.Address;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

// все гуд
public class AddressList {
    public static void main(String[] args) {

        List<Address> address = List.of(
                new Address("Kiev", "Andriyivsky Descent", 25, 11),
                new Address("Kiev", "Antonovich Street", 12, 3),
                new Address("Kiev", "Andriyivsky Descent", 25, 11),
                new Address("Charkov", "Darwin street", 17, 7),
                new Address("Charkov", "Poltavskyi Shlyakh", 13, 9),
                new Address("Charkov", "Poltavskyi Shlyakh", 13, 9),
                new Address("Lvov", "High Castle", 2, 18),
                new Address("Lvov", "Bogdan Khmelnitsky", 3, 8),
                new Address("Lvov", "Bogdan Khmelnitsky", 3, 8));

        Set<String> city = address.stream()
                .map(Address::getCity)
                .collect(Collectors.toSet());
        System.out.println(city);
    }
}



