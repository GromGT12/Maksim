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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class VisitationListService {
    public static void main(String[] args) {

        VisWebsite visitingWebsite = new VisWebsite("Maks", "Netflix.com");
        VisWebsite visitingWebsite1 = new VisWebsite("Jack", "Pinterest.com");
        VisWebsite visitingWebsite2 = new VisWebsite("Monica", "Lady-makeup.Pl");
        VisWebsite visitingWebsite3 = new VisWebsite("Taras", "Ebay.com");
        VisWebsite visitingWebsite4 = new VisWebsite("Adrian", "Otomoto.Pl");
        VisWebsite visitingWebsite5 = new VisWebsite("Maks", "Netflix.com");
        VisWebsite visitingWebsite6 = new VisWebsite("Jack", "Pinterest.com");
        VisWebsite visitingWebsite7 = new VisWebsite("Maks", "Facebook");


        HashMap<String, String> Website = new HashMap<>();
        Website.put(visitingWebsite.getUser(), visitingWebsite.getNameWebsite());
        Website.put(visitingWebsite1.getUser(), visitingWebsite1.getNameWebsite());
        Website.put(visitingWebsite2.getUser(), visitingWebsite2.getNameWebsite());
        Website.put(visitingWebsite3.getUser(), visitingWebsite3.getNameWebsite());
        Website.put(visitingWebsite4.getUser(), visitingWebsite4.getNameWebsite());
        Website.put(visitingWebsite5.getUser(), visitingWebsite5.getNameWebsite());
        Website.put(visitingWebsite6.getUser(), visitingWebsite6.getNameWebsite());
        Website.put(visitingWebsite7.getUser(), visitingWebsite7.getNameWebsite());


        Set<String> keys = Website.keySet();
        System.out.println("Уникальные имена " + keys);

        ArrayList<String> values = new ArrayList<>(Website.values());
        System.out.println("Уникальные сайты " + values);
        System.out.println();

        Map<VisWebsite, Integer> visitUser = new HashMap<>();
        visitUser.put(visitingWebsite, 2);
        visitUser.put(visitingWebsite2, 3);
        visitUser.put(visitingWebsite3, 5);
        visitUser.put(visitingWebsite4, 6);
        visitUser.put(visitingWebsite5, 10);
        visitUser.put(visitingWebsite6, 8);
        visitUser.put(visitingWebsite7, 4);

        System.out.println(visitUser);
    }
}
