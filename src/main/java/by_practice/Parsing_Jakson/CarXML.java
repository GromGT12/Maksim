package by_practice.Parsing_Jakson;

public class CarXML {
    private String model;
    private String brand;
    private Integer year;
    private String fuelType;
    private String bodyType;

    public CarXML(String brand, String model, String fuelType, String bodyType, int year) {;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public String toString() {
        return "CarXML{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", year=" + year +
                ", fuelType='" + fuelType + '\'' +
                ", bodyType='" + bodyType + '\'' +
                '}';
    }
}
