package home_work_26.Task6;

import home_work_26.Task2.Addresses;
import home_work_26.Task5.CityStreet;

import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.toSet;

public class AddressList {
    public static void main(String[] args) {
        List<Addresses> address = List.of(
                new Addresses("Kiev", "Andriyivsky Descent", 25, 11),
                new Addresses("Kiev", "Antonovich Street", 12, 3),
                new Addresses("Kiev", "Andriyivsky Descent", 25, 11),
                new Addresses("Charkov", "Darwin street", 17, 7),
                new Addresses("Charkov", "Poltavskyi Shlyakh", 13, 9),
                new Addresses("Charkov", "Poltavskyi Shlyakh", 13, 9),
                new Addresses("Warsaw", "Pilsudskego Street", 23, 4),
                new Addresses("Warsaw", "Pilsudskego Street", 23, 4),
                new Addresses("Warsaw", "Winnie-the-Pooh Street", 22, 1),
                new Addresses("Lvov", "High Castle", 2, 18),
                new Addresses("Lvov", "Bogdan Khmelnitsky", 3, 8),
                new Addresses("Lvov", "Bogdan Khmelnitsky", 3, 8));

        Set<CityStreet> adressSet = address.stream()
                .map(address1 -> new CityStreet(address1.getCity(), "улица: " + address1.getStreet()))
                .filter(addressed -> "Kiev".equals(addressed.getCity())).collect(toSet());
        System.out.println(adressSet);

    }
}
