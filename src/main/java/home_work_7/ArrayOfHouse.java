package home_work_7;

public class ArrayOfHouse {
    public static void main(String[] args) {
        House[] houses = new House[7];

        houses[0] = new House("Individual", 5, 55);
        houses[1] = new House("Individual", 5, 50);
        houses[2] = new House("SkyTower", 9, 40);
        houses[3] = new House("SkyTower", 8, 25);
        houses[4] = new House("SkyTower", 6, 40);
        houses[5] = new House("SkyTower", 7, 20);
        houses[6] = new House("SkyTower", 10, 10);

        int sumResident = 0;
        for (House house : houses) {
            int residentsOfHouse = house.getResidentsOfHouse();
            sumResident += residentsOfHouse;
            System.out.println(house);
        }
        System.out.println(sumResident);
        for (House house : houses) {
            if ("Individual".equals(house.getType())) {
                System.out.println(house);
            }

        }

        for (House house : houses) {
            if (("SkyTower".equals(house.getType())) && (house.getFloors() > 5)) {

                house.setHeatingOn(true);
                System.out.println("включили!:" + house);
            }
        }
    }
}







