package home_work_27.Task2;

import home_work_27.Task1.Abonent;

import java.time.LocalDate;
import java.time.Period;
import java.util.IntSummaryStatistics;
import java.util.List;

public class ServiceAbonent {

    public IntSummaryStatistics subscriberCountAge(List<Abonent> abonents) {
        IntSummaryStatistics stats = abonents.stream()
                .mapToInt(abonent -> Period.between(abonent.getDateOfBirth(), LocalDate.now()).getYears()).summaryStatistics();
        return stats;
    }

    public IntSummaryStatistics subscriberCountAgeVip(List<Abonent> abonents) {
        IntSummaryStatistics contractStats = abonents.stream()
                .filter(abonent -> abonent.getVip() != false)
                .mapToInt(abonent -> Period.between(abonent.getContractDate(), LocalDate.now()).getYears()).summaryStatistics();
        return contractStats;
    }
}
