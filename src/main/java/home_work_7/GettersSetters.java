package home_work_7;

class GettersSettersCar {
    public static void main(String[] args) {
        Car car = new Car("Audi", "A8", 4);

        String brand = car.getBrand();
        System.out.println(car);
    }
}
