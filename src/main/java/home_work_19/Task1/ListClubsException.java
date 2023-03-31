package home_work_19.Task1;

import java.util.*;

public class ListClubsException {
    public static void main(String[] args) {
        FootballClub footballClub = new FootballClub("Chelsea", "England", "London");
        FootballClub footballClub2 = new FootballClub("Real Madrid", "Spain", "Madrid");
        FootballClub footballClub3 = new FootballClub("Borussia Dortmund", "Germany", "Dortmut");

        List<FootballClub> footballclubsList = new ArrayList<>(List.of(footballClub, footballClub2, footballClub3));
        Set<FootballClub> footballClubs = new HashSet<>(footballclubsList);

        SortedSet<String> sortedSet = new TreeSet<>();
        sortedSet.add(footballClub.getCountry());
        sortedSet.add(footballClub2.getCountry());
        sortedSet.add(footballClub3.getCountry());
        System.out.println(sortedSet);
    }
}

