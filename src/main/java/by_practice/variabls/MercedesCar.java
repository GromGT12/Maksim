package by_practice.variabls;

public class MercedesCar {
    String model;
    boolean headlightsOn;
    int currentGear;
    int currentSpeed;

    public MercedesCar(String model) {
        this.model = model;
        this.headlightsOn = false;
        this.currentGear = 1;
        this.currentSpeed = 0;
    }
    public void start() {
        System.out.println("Машина марки Mercedes модели " + model + " завелась.");
    }

    public void turnOnHeadlights() {
        headlightsOn = true;
        System.out.println("Фары включены.");
    }

    public void shiftGear(int gear) {
        currentGear = gear;
        System.out.println("Переключили передачу на " + gear);
    }

    public void accelerate(int speed) {
        currentSpeed += speed;
        System.out.println("Увеличили скорость на " + speed + " км/ч");
        if (currentSpeed > 200) {
            currentSpeed = 200; // Ограничение скорости до 200 км/ч
            System.out.println("Достигнута максимальная скорость 200 км/ч");
        }
    }

    // Метод для демонстрации процесса вождения
    public void drive() {
        start();
        turnOnHeadlights();
        shiftGear(1);
        accelerate(50);
        shiftGear(2);
        accelerate(100);
        shiftGear(3);
        accelerate(50);
    }
    public static void main(String[] args) {
        MercedesCar myMercedes = new MercedesCar("S-Class");
        myMercedes.drive();
    }
}
