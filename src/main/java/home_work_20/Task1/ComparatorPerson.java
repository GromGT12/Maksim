package home_work_20.Task1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorPerson {
    public static void main(String[] args) {
        List<AccountInfo> accountInfos = new ArrayList<>(List.of(
                new AccountInfo("Ivan", "Ivanov", "607499636", "ivan@tu.by", LocalDate.of(2000, 10, 11)),
                new AccountInfo("Fedor", "Ivanov", "607499636", "ivan@tu.by", LocalDate.of(1990, 10, 11)),
                new AccountInfo("Anna", "Ivanova", "607499636", "ivan@tu.by", LocalDate.of(2000, 10, 15)),
                new AccountInfo("Egor", "Egorov", "607499636tr", "ivan@tu.by", LocalDate.of(1989, 2, 3)),
                new AccountInfo("Andy23", "Aity", "607499636", "ivan@tu.by", LocalDate.of(2000, 10, 11)),
                new AccountInfo("Pavel", "Pavlov23", "607499636", "ivan@tu.by", LocalDate.of(2000, 10, 11))));

        List<AccountInfo> accountInfo = new ArrayList<>(accountInfos);

        Comparator<AccountInfo> accountInfoComparator1 = Comparator.comparing(AccountInfo::getName)
                .thenComparing(AccountInfo::getSurname);
        accountInfo.sort(accountInfoComparator1);
        accountInfo.forEach(System.out::println);
        System.out.println("-----------");

        Comparator<AccountInfo> accountInfoComparator2 = Comparator.comparing(AccountInfo::getDateOfBirth)
                .thenComparing(AccountInfo::getDateOfBirth).reversed();
        accountInfo.sort(accountInfoComparator2);
        accountInfo.forEach(System.out::println);
        System.out.println("-----------");

        Comparator<AccountInfo> accountInfoComparator3 = Comparator.comparing(AccountInfo::getName)
                .thenComparing(AccountInfo::getSurname)
                .thenComparing(AccountInfo::getDateOfBirth);
        accountInfo.sort(accountInfoComparator3);
        accountInfo.forEach(System.out::println);
    }
}
