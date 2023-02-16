package home_work_7;

class Car {

    public static final int NUMBER_OF_WHEElS = 4;
    private String brand;
    private String model;
    private int numberOfDoors;

    public Car(String brand, String model, int numberOfDoors) {
        this.brand = brand;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
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

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String toString() {
        return "car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", numberOfdoors=" + numberOfDoors +
                '}';
    }
}
