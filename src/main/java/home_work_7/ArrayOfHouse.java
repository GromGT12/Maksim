package home_work_7;

public class ArrayOfHouse {
    public static void main(String[] args) {
        House[] houses = new House[7];

        //Может быть два типа SkyTower Individual
        houses[0] = new House("Individual", 9, 55);
        houses[1] = new House("Individual", 5, 50);
        houses[2] = new House("SkyTower", 9, 40);
        houses[3] = new House("SkyTower", 5, 25);
        houses[4] = new House("SkyTower", 6, 40);
        houses[5] = new House("SkyTower", 7, 20);
        houses[6] = new House("SkyTower", 10, 10);

        int sumResident = 0;
        for (int i = 0; i < houses.length; i++) {
            House house = houses[i];
            int residentsOfHouse = house.getResidentsOfHouse();
            sumResident += residentsOfHouse;
            System.out.println(house);
        }
        System.out.println(sumResident);
        for (int i = 0; i < houses.length; i++) {
            House house = houses[i];
            if ("Individual".equals(house.getType())) {
                System.out.println(house);
            }

        }
        // Нам нужно тут объявить переменный которые мы будет в цикле сравнивать. Такие мысли
        for (int i = 0; i < houses.length; i++) {

            if (("SkyTower".equals(houses[i].getType())) && (houses[i].getFloors() > 5)) {//тут сравнение идет как это сделать правильно не ясно  {
                houses[i].setHeatingOn(true);
                System.out.println("включили тепло!: " + houses[i]);
            }
        }
    }
}







