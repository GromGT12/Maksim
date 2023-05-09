package home_work_27.Task3;

import home_work_27.Task1.Abonent;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ServiceAbonent {

    public Map<String, Abonent> filteringNotVip(List<Abonent> abonents) {
        Map<String, Abonent> stringMap = abonents.stream()
                .filter(abonent -> abonent.getVip() != true)
                .collect(Collectors.toMap(Abonent::getContractId, Function.identity()));
        return stringMap;
    }

    public Map<String, List<Abonent>> groupByCity(List<Abonent> abonents) {
        Map<String, List<Abonent>> abonentsCity = abonents.stream()
                .collect(Collectors.groupingBy(Abonent::getCity));
        return abonentsCity;
    }
}
