package home_work_27.Task1;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class ServiceAbonent {

    public boolean anyAbonents(List<Abonent> abonents) {
        boolean any = abonents.stream()
                .anyMatch(Abonent::getVip);
        return any;
    }

    public boolean allAbonents(List<Abonent> abonents) {
        LocalDate date = LocalDate.now();
        boolean all = abonents.stream()
                .allMatch(abonent -> abonent.getContractDate().isBefore(date));
        return all;
    }

    public Optional<Abonent> abonentFromCity(List<Abonent> abonents, String city) {
        Optional<Abonent> abonentOptional = abonents.stream()
                .filter(abonent -> abonent.getCity().equals("London"))
                .findAny();
        Abonent abonent = abonentOptional.orElseThrow(() -> new IllegalArgumentException("Такого абонента нет"));
        return abonentOptional;
    }
}
