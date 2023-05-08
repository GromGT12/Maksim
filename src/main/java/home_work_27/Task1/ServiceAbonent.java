package home_work_27.Task1;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class ServiceAbonent {

    // метод нужно назвать в соответсвии с тем, что он делает, например isAnyVipInCity
    // вторым параметром в этот метод надо передать String city и фильтровать по нему
    public boolean anyAbonents(List<Abonent> abonents) {
        boolean any = abonents.stream()
                .anyMatch(Abonent::getVip);
        return any;
    }

    // в этот метод вторым параметром нужно передать объект LocalDate и использовать его в isBefore
    //метод проверяет, все ли абоненты подключились до этой даты, поэтому его лучше назвать isAllContractedBefore например
    public boolean allAbonents(List<Abonent> abonents) {
        LocalDate date = LocalDate.now();
        boolean all = abonents.stream()
                .allMatch(abonent -> abonent.getContractDate().isBefore(date));
        return all;
    }

    // можно назвать findAnyAbonentFromCity
    // этот метод должен вернуть абонента, а не optional
    public Optional<Abonent> abonentFromCity(List<Abonent> abonents, String city) {
        Optional<Abonent> abonentOptional = abonents.stream()
                .filter(abonent -> abonent.getCity().equals("London"))
                .findAny();
        // вот этот объект и нужно возвращать
        Abonent abonent = abonentOptional.orElseThrow(() -> new IllegalArgumentException("Такого абонента нет"));
        return abonentOptional;
    }
}
