package home_work_22.Task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class UniqueHomeWork {
    public static void main(String[] args) {
        AutoInfo autoInfo1 = new AutoInfo("VW", "Polo", 3, 1.0f);
        AutoInfo autoInfo2 = new AutoInfo("VW", "Passat", 4, 1.6f);
        AutoInfo autoInfo3 = new AutoInfo("Skoda", "Fabia", 3, 1.2f);
        AutoInfo autoInfo4 = new AutoInfo("BMW", "5-series", 6, 3.0f);
        AutoInfo autoInfo5 = new AutoInfo("BMW", "2-series", 3, 1.5f);
        AutoInfo autoInfo6 = new AutoInfo("Toyota", "Tundra", 6, 3.7f);
        AutoInfo autoInfo7 = new AutoInfo("Audi", "A8", 8, 4.0f);

        List<AutoInfo> autoInfos = new ArrayList<>(List.of(autoInfo1, autoInfo2, autoInfo3, autoInfo4, autoInfo5, autoInfo6, autoInfo7));
        Set<String> brand = findUniqueBrand(autoInfos);
        System.out.println("Unique list car :" + brand);

        Set<String> model = findUniqueModel(autoInfos);
        System.out.println("Unique list car :" + model);

    }

    private static Set<String> findUniqueModel(List<AutoInfo> autoInfos) {
        Set<String> autoModel = new TreeSet<>();
        for (AutoInfo autoInfo : autoInfos) {
            autoModel.add(autoInfo.getModel());
        }
        return autoModel;
    }

    private static Set<String> findUniqueBrand(List<AutoInfo> autoInfos) {

        Set<String> autoBrand = new TreeSet<>();
        for (AutoInfo autoInfo : autoInfos) {
            autoBrand.add(autoInfo.getBrand());
        }
        return autoBrand;
    }
}


