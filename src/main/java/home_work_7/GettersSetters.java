package home_work_7;

class GettersSettersCar {
    public static void main(String[] args) {
        Car car = new Car("Audi", "A8", 4);

        String brand = car.getBrand();
        System.out.println(car);

        int numbersofdoors = car.getNumberofDoors();
        System.out.println(" "
                + "Дверь 1 открыта" + " " + "Дверь два открыта" + " " + "Дверь 3 открыта" + " " + "Двверь 4 открыта");
    }
}
