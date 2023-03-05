package home_work_8.Task3;

import java.util.Objects;

public class Car {

    // не могу найти класс CarType в проекте, точнее он есть, но пустой, надо закоммитить
    private CarType type;
    private String GovernmentNumber;
    private int quantityPassanger;
    private int weight;

    public Car(String type, String governmentNumber, int quantityPassanger, int weight) {
        this.type = CarType.valueOf(type);
        GovernmentNumber = governmentNumber;
        this.quantityPassanger = quantityPassanger;
        this.weight = weight;
    }

    public CarType getType() {
        return type;
    }

    public void setType(CarType type) {
        this.type = type;
    }

    public String getGovernmentNumber() {
        return GovernmentNumber;
    }

    public void setGovernmentNumber(String governmentNumber) {
        GovernmentNumber = governmentNumber;
    }

    public int getQuantityPassanger() {
        return quantityPassanger;
    }

    public void setQuantityPassanger(int quantityPassanger) {
        this.quantityPassanger = quantityPassanger;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return quantityPassanger == car.quantityPassanger && weight == car.weight && type == car.type && Objects.equals(GovernmentNumber, car.GovernmentNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, GovernmentNumber, quantityPassanger, weight);
    }

    @Override
    public String toString() {
        return "Car{" +
                "type=" + type +
                ", GovernmentNumber='" + GovernmentNumber + '\'' +
                ", quantityPassanger=" + quantityPassanger +
                ", weight=" + weight +
                '}';
    }
}
