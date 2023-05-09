package home_work_27.Task2;

import home_work_27.Task1.Abonent;

import java.time.LocalDate;
import java.time.Period;
import java.util.IntSummaryStatistics;
import java.util.List;

public class ServiceAbonent {

    public String subscriberCountAge(List<Abonent> abonents) {
        IntSummaryStatistics statistics = abonents.stream()
                .mapToInt(abonent -> Period.between(abonent.getDateOfBirth(), LocalDate.now()).getYears()).summaryStatistics();
        return String.format("Количество абонентов - %s. Самый юный - %s лет, самый возрастной - %s лет, средний возраст - %s лет", statistics.getCount(), statistics.getMin(), statistics.getMax(), statistics.getAverage());
    }

    public String subscriberCountAgeVip(List<Abonent> abonents) {
        IntSummaryStatistics contractStats = abonents.stream()
                .filter(abonent -> abonent.getVip() != false)
                .mapToInt(abonent -> Period.between(abonent.getContractDate(), LocalDate.now()).getYears()).summaryStatistics();
        return String.format("Количесвто абонентов - %s. Самый долгий контракт - %s лет, средний срок контрактв - %s лет", contractStats.getCount(), contractStats.getMax(), contractStats.getAverage());
    }
}
