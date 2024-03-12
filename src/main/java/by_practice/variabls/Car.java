package by_practice.variabls;

public class Car {
    // Нестатические переменные (для каждого экземпляра класса)
    String brand;          // Марка
    String model;          // Модель
    int numberOfDoors;     // Количество дверей
    boolean engineRunning; // Запущен ли двигатель
    int currentSpeed;      // Текущая скорость

    // Статическая переменная (общая для всех экземпляров класса)
    static int carCount;

    // Конструктор класса Car
    public Car(String brand, String model, int numberOfDoors) {
        this.brand = brand;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
        this.engineRunning = false; // По умолчанию двигатель выключен
        this.currentSpeed = 0;      // По умолчанию машина стоит
        carCount++;                 // Увеличиваем счетчик созданных машин
    }

    // Метод для запуска двигателя
    public void startEngine() {
        this.engineRunning = true;
        System.out.println("Engine started.");
    }

    // Метод для остановки двигателя
    public void stopEngine() {
        this.engineRunning = false;
        System.out.println("Engine stopped.");
    }

    // Метод для увеличения скорости
    public void accelerate(int speed) {
        if (engineRunning) {
            this.currentSpeed += speed;
            System.out.println("Accelerating. Current speed: " + currentSpeed + " km/h");
        } else {
            System.out.println("Can't accelerate, engine is not running.");
        }
    }

    // Метод для уменьшения скорости
    public void decelerate(int speed) {
        if (engineRunning) {
            this.currentSpeed -= speed;
            if (currentSpeed < 0) {
                this.currentSpeed = 0;
            }
            System.out.println("Decelerating. Current speed: " + currentSpeed + " km/h");
        } else {
            System.out.println("Can't decelerate, engine is not running.");
        }
    }

    // Метод для вывода информации о машине
    public void displayInfo() {
        System.out.println("Car Information:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Number of doors: " + numberOfDoors);
        System.out.println("Engine running: " + (engineRunning ? "Yes" : "No"));
        System.out.println("Current speed: " + currentSpeed + " km/h");
    }

    // Главный метод
    public static void main(String[] args) {
        // Создание объектов машин
        Car car1 = new Car("Toyota", "Corolla", 4);
        Car car2 = new Car("Honda", "Civic", 4);

        // Вывод информации о машинах
        car1.displayInfo();
        car2.displayInfo();

        // Запуск двигателя первой машины
        car1.startEngine();

        // Ускорение первой машины
        car1.accelerate(50);

        // Остановка двигателя второй машины
        car2.stopEngine();
    }
}
