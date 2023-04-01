package home_work_19.Task3;

/*
Task 3
Напишите класс, который описывает посещение сайта. В нем должен храниться имя пользователя
и строка-название посещенного сайта.
В классе Application создайте список посещений, причем один пользователь мог посещать разные сайты,
мог по несколько раз посещать один и тот
же сайт.

2.1 Напишите метод, который примет на вход списко посещений и вернет коллекцию уникальных имен
пользователей.
2.2 Напишите метод, который примет на вход список посещений и вернет коллекцию уникальных сайтов.
2.3 напишите метод, который примет на вход список посещений и вернет Map<String, Integer> в которой
хранится количество посещений
 */

import java.util.*;

public class VisitationListService {
    public static void main(String[] args) {

        VisWebsite visitingWebsite1 = new VisWebsite("Maks", "Netflix.com");
        VisWebsite visitingWebsite2 = new VisWebsite("Jack", "Pinterest.com");
        VisWebsite visitingWebsite3 = new VisWebsite("Monica", "Lady-makeup.Pl");
        VisWebsite visitingWebsite4 = new VisWebsite("Taras", "Ebay.com");
        VisWebsite visitingWebsite5 = new VisWebsite("Adrian", "Otomoto.Pl");
        VisWebsite visitingWebsite6 = new VisWebsite("Maks", "Netflix.com");
        VisWebsite visitingWebsite7 = new VisWebsite("Jack", "Pinterest.com");
        VisWebsite visitingWebsite8 = new VisWebsite("Maks", "Facebook");

        //наш список который передаем всем методам на вход
        List<VisWebsite> visWebsite = new ArrayList<>(List.of(visitingWebsite1, visitingWebsite2, visitingWebsite3, visitingWebsite4, visitingWebsite5, visitingWebsite6, visitingWebsite7, visitingWebsite8));
        //метод 2.1
        List<String> userNames = searchUniqueNames(visWebsite);
        System.out.println("Пользователи сайтов" + userNames);
        //метод 2.1
        Set<String> sites = searchUniqueSites(visWebsite);
        System.out.println("Сайты" + sites);
        //метод 2.3
        Set<String, Integer> visitCountForSites = countNumberVisits(visWebsite);
        System.out.println("Количество посещений кажого сайта" + visitCountForSites);

    }
    //тут имплементируем методы
    private static Set<String> countNumberVisits(List<VisWebsite> visWebsite) {
        Map<String, Integer> result = new HashMap<>();
        for (VisWebsite visWebsite : visWebsite) {
            String siteName = visWebsite.getNameWebsite();

            if (result.containsKey(siteName)) {
                Integer visitCount = result.get(siteName);
                Integer updateCount = visitCount + 1;
                result.put(siteName, updateCount);
            } else {
                result.put(siteName, 1);
            }
        }
        return (Set<String>) result;

    }

    private static Set<String> searchUniqueSites(List<VisWebsite> visWebsite) {
        Set<String> sites = new HashSet<>();
        for (VisWebsite visWebsite : visWebsite) {
            sites.add(visWebsite.getUser());
        }
        return sites;
    }

    private static List<String> searchUniqueNames(List<VisWebsite> visWebsite) {
        Set<String> result = new HashSet<>();
        for (VisWebsite visWebsite : visWebsite) {
            result.add(visWebsite.getUser());
        }
        return result;
    }
}





