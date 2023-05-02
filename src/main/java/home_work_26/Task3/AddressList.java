package home_work_26.Task3;

import home_work_26.Task2.Address;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class AddressList {
    public static void main(String[] args) {

        List<Address> address = List.of(
                new Address("Киев", "Андреевский спуск", 25, 11),
                new Address("Киев", "Улица Антоновича", 12, 3),
                new Address("Киев", "Андреевский спуск", 25, 11),
                new Address("Харьков", "Улица Дарвина ", 17, 7),
                new Address("Харьков", "Полта́вский Шлях", 13, 9),
                new Address("Харьков", "Полта́вский Шлях", 13, 9),
                new Address("Львов", "Улица Высокий замок", 2, 18),
                new Address("Львов", "Улица Богдана Хмельницкого", 3, 8),
                new Address("Львов", "Улица Богдана Хмельницкого", 3, 8));

        List<String> street = address.stream()
                .map(Address::getStreet)
                .collect(Collectors.toList());
        System.out.println(street);

    }
}




