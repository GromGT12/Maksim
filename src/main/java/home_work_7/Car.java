package home_work_7;

class Car {

    public static final int NUMBEROFDOORS=4;
    private String brand;
    private String model;
    private int numberofDoors;

    public Car( String brand, String model, int numberOfdoors) {
        this.brand = brand;
        this.model = model;
        this.numberofDoors = numberOfdoors;
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

    public int getNumberofDoors() {
        int numberOfdoors = 0;
        return numberOfdoors;
    }

    public void setNumberofDoors(int numberofDoors) {
        this.numberofDoors = numberofDoors;
    }

    @Override
    public String toString() {
        return "car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", numberOfdoors=" + numberofDoors +
                '}';
    }
}
