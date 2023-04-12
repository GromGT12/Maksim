package home_work_19.Task3;

/*
Task 3
Напишите класс, который описывает посещение сайта. В нем должен храниться имя пользователя
и строка-название посещенного сайта.
В классе CatalogProduct создайте список посещений, причем один пользователь мог посещать разные сайты,
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

        List<VisWebsite> visWebsite = new ArrayList<>(List.of(visitingWebsite1, visitingWebsite2, visitingWebsite3, visitingWebsite4, visitingWebsite5, visitingWebsite6, visitingWebsite7, visitingWebsite8));

        Set<String> userNames = searchUniqueUser(visWebsite);
        System.out.println("Пользователи сайтов :" + userNames);

        Set<String> sites = searchUniqueSite(visWebsite);
        System.out.println("Сайты :" + sites);

        Map<String, Integer> visitCountForSites = countNumberVisits(visWebsite);
        System.out.println("Количество посещений кажого сайта :" + visitCountForSites);

    }

    private static Map<String, Integer> countNumberVisits(List<VisWebsite> visWebsites) {
        Map<String, Integer> result = new HashMap<>();
        for (VisWebsite visWebsite : visWebsites) {
            String siteName = visWebsite.getNameWebsite();

            if (result.containsKey(siteName)) {
                Integer visitCount = result.get(siteName);
                Integer updateCount = visitCount + 1;
                result.put(siteName, updateCount);
            } else {
                result.put(siteName, 1);
            }
        }
        return result;
    }

    private static Set<String> searchUniqueUser(List<VisWebsite> visWebsites) {
        Set<String> sites = new HashSet<>();
        for (VisWebsite visWebsite : visWebsites) {
            sites.add(visWebsite.getUser());
        }
        return sites;
    }

    private static Set<String> searchUniqueSite(List<VisWebsite> visWebsites) {
        Set<String> result = new HashSet<>();
        for (VisWebsite visWebsite : visWebsites) {
            result.add(visWebsite.getNameWebsite());
        }
        return result;
    }
}






