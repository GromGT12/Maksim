package home_work_27.Task2;

import home_work_27.Task1.Abonent;

import java.time.LocalDate;
import java.time.Period;
import java.util.IntSummaryStatistics;
import java.util.List;

public class ServiceAbonent {

    // этот метод должен возвращать строку, например
    // return String.format("Количество абонентов - %s. Самый юный - %s лет, самый возрастной - %s лет, средний возраст - %s лет", statistics.getCount(), statistics.getMin(), statistics.getMax(), statistics.getAverage());
    public IntSummaryStatistics subscriberCountAge(List<Abonent> abonents) {
        IntSummaryStatistics stats = abonents.stream()
                .mapToInt(abonent -> Period.between(abonent.getDateOfBirth(), LocalDate.now()).getYears()).summaryStatistics();
        return stats;
    }

    // этот метод также должен возвращать строку
    public IntSummaryStatistics subscriberCountAgeVip(List<Abonent> abonents) {
        IntSummaryStatistics contractStats = abonents.stream()
                .filter(abonent -> abonent.getVip() != false)
                .mapToInt(abonent -> Period.between(abonent.getContractDate(), LocalDate.now()).getYears()).summaryStatistics();
        return contractStats;
    }
}
