package home_work_26.Task2;

import java.util.List;
import java.util.stream.Collectors;

public class AddressList {
    public static void main(String[] args) {
        List<Addresses> address = List.of(
                new Addresses("Kiev", "Andriyivsky Descent", 25, 11),
                new Addresses("Kiev", "Antonovich Street", 12, 3),
                new Addresses("Kiev", "Andriyivsky Descent", 25, 11),
                new Addresses("Charkov", "Andriyivsky Descent", 25, 11),
                new Addresses("Charkov", "Poltavskyi Shlyakh", 13, 9),
                new Addresses("Charkov", "Poltavskyi Shlyakh", 13, 9),
                new Addresses("Lvov", "Andriyivsky Descent", 25, 11),
                new Addresses("Lvov", "Bogdan Khmelnitsky", 3, 8),
                new Addresses("Lvov", "Bogdan Khmelnitsky", 3, 8));

        List<Addresses> city = address.stream()
                .filter(addressCity -> addressCity.getCity().equals("Kiev"))
                .collect(Collectors.toList());
        System.out.println(city);
    }
}

