package home_work_25.Task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AthletesRunningDistance {
    public static void main(String[] args) {

        Sportsman sportsman1 = new Sportsman("Maks", 11, Medals.GOLD, Medals.BRONZE, Medals.SILVER);
        Sportsman sportsman2 = new Sportsman("Jack", 9, Medals.GOLD, Medals.BRONZE, Medals.SILVER);
        Sportsman sportsman3 = new Sportsman("Adam", 13, Medals.GOLD, Medals.BRONZE, Medals.SILVER);
        Sportsman sportsman4 = new Sportsman("Mike", 8, Medals.GOLD, Medals.BRONZE, Medals.SILVER);
        Sportsman sportsman5 = new Sportsman("George", 12, Medals.GOLD, Medals.BRONZE, Medals.SILVER);

        List<Sportsman> sportsmanList = new ArrayList<>(Arrays.asList(sportsman1, sportsman2, sportsman3, sportsman4, sportsman5));


        System.out.println();


        }
    }

