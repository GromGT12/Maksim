package home_work_19.Task1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListClubsException {
    public static void main(String[] args) {
        FootballClub footballClub = new FootballClub("Chelsea", "England", "London");
        FootballClub footballClub1 = new FootballClub("Real Madrid", "Spain", "Madrid");
        FootballClub footballClub2 = new FootballClub("Borussia Dortmund", "Germany", "Dortmut");

        List<FootballClub> footballclubsList = new ArrayList<>(List.of(footballClub, footballClub1, footballClub2));

        Map<String, List<FootballClub>> myClubs = new HashMap<>();
        for (FootballClub list : footballclubsList) {
            String country = list.getCountry();
            if (myClubs.containsValue(country)) {
                List<FootballClub> clubList = myClubs.get(country);
                clubList.add(list);
            } else {
                myClubs.put(country, new ArrayList<>(List.of(list)));
            }
        }
        for (Map.Entry<String, List<FootballClub>> stringListEntry : myClubs.entrySet()) {
            System.out.println(stringListEntry.getKey());
        }
    }
}


