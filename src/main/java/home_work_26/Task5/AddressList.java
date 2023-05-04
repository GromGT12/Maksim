package home_work_26.Task5;

import home_work_26.Task2.Address;

import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.toSet;

public class AddressList {
    public static void main(String[] args) {

        List<Address> address = List.of(
                new Address("Kiev", "Andriyivsky Descent", 25, 11),
                new Address("Kiev", "Antonovich Street", 12, 3),
                new Address("Kiev", "Andriyivsky Descent", 25, 11),
                new Address("Charkov", "Darwin street", 17, 7),
                new Address("Charkov", "Poltavskyi Shlyakh", 13, 9),
                new Address("Charkov", "Poltavskyi Shlyakh", 13, 9),
                new Address("Warsaw", "Pilsudskego Street", 23, 4),
                new Address("Warsaw", "Pilsudskego Street", 23, 4),
                new Address("Warsaw", "Winnie-the-Pooh Street", 22, 1),
                new Address("Lvov", "High Castle", 2, 18),
                new Address("Lvov", "Bogdan Khmelnitsky", 3, 8),
                new Address("Lvov", "Bogdan Khmelnitsky", 3, 8));

        Set<CityStreet> addressSet = address.stream()
                .map(address1 -> new CityStreet(address1.getCity(), address1.getStreet()))
                .filter(addressed -> "Warsaw".equals(addressed.getCity()))
                .collect(toSet());
        System.out.println(addressSet);


    }
}


