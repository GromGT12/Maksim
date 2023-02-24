package home_work_8.Task3;

public class CarArray {
    public static void main(String[] args) {
        Car car = new Car("passenger", "CU57ABR", 2, 1600);
        Car car2 = new Car("freight", "QA65HGJ", 3, 9000);
        Car car3 = new Car("freight", "MK99CVZ", 4, 7000);
        Car car4 = new Car("passenger", "DF78LPO", 5, 1500);
        Car car5 = new Car("passenger", "TR21SDQ", 2, 1800);

        Car[] cars = new Car[] {car, car2, car3, car4, car5};
        CarServise carServise = new CarServise();
        carServise.CarServise();

        System.out.println();
        System.out.println();

    }
}
