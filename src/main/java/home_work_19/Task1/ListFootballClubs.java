package home_work_19.Task1;

import java.util.*;

public class ListFootballClubs {
    public static void main(String[] args) {
        FootballClub footballClub = new FootballClub("Chelsea", "England", "London");
        FootballClub footballClub1 = new FootballClub("Red Bull Lepzig", "Austria", "Viena");
        FootballClub footballClub2 = new FootballClub("Real Madrid", "Spain", "Madrid");
        FootballClub footballClub3 = new FootballClub("Borussia Dortmund", "Germany", "Dortmut");

        List<FootballClub> footballclubsList = new ArrayList<>(List.of(footballClub, footballClub1, footballClub2, footballClub3));

        // В условии задачи нам нужно было вывести только страны, но ты сгруппировал клубы по странам и эту инфу можно было
        // бы использовать где-то - пускай остается так
        /*Map<String, List<FootballClub>> myClubs = new HashMap<>();
        // переменная должна называться не list, а club, например
        for (FootballClub club : footballclubsList) {
            String country = club.getCountry();
            if (myClubs.containsValue(country)) {
                List<FootballClub> clubList = myClubs.get(country);
                clubList.add(club);
            } else {
                myClubs.put(country, new ArrayList<>(List.of(club)));
            }
        }
        for (Map.Entry<String, List<FootballClub>> stringListEntry : myClubs.entrySet()) {
            System.out.println(stringListEntry.getKey());
        }

         */
        Set<String> country = findUniqueCountrys(footballclubsList);
        System.out.println("Уникальные страны :" + country);
    }
    private static Set<String> findUniqueCountrys(List<FootballClub> footballclubsList) {
        Set<String> countryClub = new TreeSet<>();
        for(FootballClub footballClub:footballclubsList) {
            countryClub.add(footballClub.getCountry());
        }
        return countryClub;
    }
}


