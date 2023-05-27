package home_work_31;

public class Application {
    public static void main(String[] args) throws InterruptedException {
        GravelHeap gravelHeap = new GravelHeap(0);

        Truck truck1 = new Truck(gravelHeap);
        Truck truck2 = new Truck(gravelHeap);
        Truck truck3 = new Truck(gravelHeap);
        Truck truck4 = new Truck(gravelHeap);

        truck1.start();
        truck2.start();
        truck3.start();
        truck4.start();

        truck1.join();
        truck2.join();
        truck3.join();
        truck4.join();

        System.out.println(gravelHeap.getWeight());
    }
}
