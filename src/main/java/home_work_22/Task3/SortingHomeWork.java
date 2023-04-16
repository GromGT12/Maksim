package home_work_22.Task3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingHomeWork {
    public static void main(String[] args) {

        AutoInfo autoInfo1 = new AutoInfo("VW", "Polo", 3, 1.0f);
        AutoInfo autoInfo2 = new AutoInfo("VW", "Passat", 4, 1.6f);
        AutoInfo autoInfo3 = new AutoInfo("Skoda", "Fabia", 3, 1.2f);
        AutoInfo autoInfo4 = new AutoInfo("BMW", "5-series", 6, 3.0f);
        AutoInfo autoInfo5 = new AutoInfo("BMW", "2-series", 3, 1.5f);
        AutoInfo autoInfo6 = new AutoInfo("Toyota", "Tundra", 6, 3.7f);
        AutoInfo autoInfo7 = new AutoInfo("Audi", "A8", 8, 4.0f);

        List<AutoInfo> autoInfos = new ArrayList<>(List.of(autoInfo1, autoInfo2, autoInfo3, autoInfo4, autoInfo5, autoInfo6, autoInfo7));

        Comparator<AutoInfo> autoInfoComparator = Comparator.comparing(AutoInfo::getBrand)
                .thenComparing(AutoInfo::getModel);
        autoInfos.sort(autoInfoComparator);
        autoInfos.forEach(System.out::println);

        System.out.println();

        Comparator<AutoInfo> autoInfoComparator1 = Comparator.comparing(AutoInfo::getCylinderCount)
                .thenComparing(AutoInfo::getEngineVolume).reversed();
        autoInfos.sort(autoInfoComparator1);
        autoInfos.forEach(System.out::println);
    }
}

