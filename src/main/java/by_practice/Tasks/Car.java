package by_practice.Tasks;

import java.util.Objects;

public class Car {
    private String brand;
    private String model;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    @Override
    public int hashCode() {
        // Простейший способ создать хэш-код: сложим хэши полей
        return Objects.hash(brand, model);
    }

    @Override
    public boolean equals(Object obj) {
        // Два объекта Car равны, если у них совпадают brand и model
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Car otherCar = (Car) obj;
        return Objects.equals(brand, otherCar.brand) && Objects.equals(model, otherCar.model);
    }

    @Override
    public String toString() {
        return brand + " " + model;
    }
}
