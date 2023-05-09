package home_work_27.Task1;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class ServiceAbonent {
    public boolean isAnyVipInCity(List<Abonent> abonents, String city) {
        boolean any = abonents.stream()
                .filter(abonent -> abonent.getCity().equals(city))
                .anyMatch(Abonent::getVip);
        return any;
    }

    public boolean isAllContractedBefore(List<Abonent> abonents, LocalDate of) {
        LocalDate date = LocalDate.now();
        boolean all = abonents.stream()
                .allMatch(abonent -> abonent.getContractDate().isBefore(date));
        return all;
    }

    public Abonent findAnyAbonentFromCity(List<Abonent> abonents, String city) {
        Optional<Abonent> abonentOptional = abonents.stream()
                .filter(abonent -> abonent.getCity().equals("London"))
                .findAny();
        Abonent abonent = abonentOptional.orElseThrow(() -> new IllegalArgumentException("Такого абонента нет"));
        return abonent;
    }
}
