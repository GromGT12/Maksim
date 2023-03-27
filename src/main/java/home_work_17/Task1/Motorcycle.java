package home_work_17.Task1;

import java.io.Serializable;

public class Motorcycle implements Serializable {
    private String brand;
    private String model;
    private int engineVolume;
    private transient String condition;

    public Motorcycle() {
    }

    public Motorcycle(String brand, String model, int engineVolume, String condition) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.condition = condition;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(int engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", condition='" + condition + '\'' +
                '}';
    }
}

