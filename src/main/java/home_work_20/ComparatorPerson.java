package home_work_20;

import java.time.LocalDate;
import java.util.*;

public class ComparatorPerson {
    public static void main(String[] args) {
        List<AccountInfo> accountInfos = List.of(
                new AccountInfo("Ivan", "Ivanov", "607499636", "ivan@tu.by", LocalDate.of(2000, 10, 11)),
                new AccountInfo("Fedor", "Ivanov", "607499636", "ivan@tu.by", LocalDate.of(1990, 10, 11)),
                new AccountInfo("Anna", "Ivanova", "607499636", "ivan@tu.by", LocalDate.of(2000, 10, 15)),
                new AccountInfo("Egor", "Egorov", "607499636tr", "ivan@tu.by", LocalDate.of(1989, 2, 3)),
                new AccountInfo("Andy23", "Aity", "607499636", "ivan@tu.by", LocalDate.of(2000, 10, 11)),
                new AccountInfo("Pavel", "Pavlov23", "607499636", "ivan@tu.by", LocalDate.of(2000, 10, 11)));

        List<AccountInfo> accountInfo = new ArrayList<>(accountInfos);

        //Comparator<AccountInfo> lambdaaccountInfo = (ac1, ac2) -> ac1.getDateOfBirth().compareTo(ac2.getDateOfBirth());
        //accountInfo.sort(lambdaaccountInfo);
        //System.out.println(accountInfo);
        //              .thenComparing(AccountInfo::getSurname);
        //accountInfos.sort(accountInfoComparator);
        //accountInfo.sort(Comparator.comparing(AccountInfo::getName));
        //accountInfo.forEach(System.out::println);
        //Comparator<AccountInfo> accountInfoComparator = Comparator.comparing(AccountInfo::getName)
        //            .thenComparing(AccountInfo::getSurname);
        //accountInfo.sort(accountInfoComparator);
        //System.out.println(accountInfo);
        System.out.println("sorting");
        System.out.println("name" + " , " + "surname" + " : ");
        Collections.sort(accountInfo);
        for (AccountInfo accountInfo1 : accountInfos) {
            System.out.println(accountInfo1.getName() + " " + accountInfo1.getSurname() + " ");

        }
        System.out.println();

        System.out.println("sorting");
        System.out.println("dateOfBirth: ");
        Collections.sort(accountInfo);
        //Set<AccountInfo> accountInfoSet = new TreeSet<>(accountInfo);
        for (AccountInfo accountInfo1 : accountInfos) {
            System.out.println(/*accountInfoSet*/  " " + accountInfo1.getDateOfBirth() + " ");

        }
        System.out.println();
        System.out.println("sorting");
        System.out.println("name" + " , " + "surname" + " , " + " " + "dateOfBirth :");

        Collections.sort(accountInfo);
        for (AccountInfo accountInfo1 : accountInfos) {
            System.out.println(accountInfo1.getName() + " "
                    + accountInfo1.getSurname() + " "
                    + accountInfo1.getDateOfBirth());
        }
    }
}
