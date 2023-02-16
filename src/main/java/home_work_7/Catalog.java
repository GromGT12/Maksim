package home_work_7;

import java.util.Arrays;

public class Catalog {

    private String NameOfCity;
    private String NameOfDistrict;
    private House[] houses;

    public Catalog(String nameOfCity, String nameOfDistrict, House[] houses) {
        NameOfCity = nameOfCity;
        NameOfDistrict = nameOfDistrict;
        this.houses = houses;
    }
    public String getNameOfCity() {
        return NameOfCity;
    }
    public void setNameOfCity(String nameOfCity) {
        NameOfCity = nameOfCity;
    }
    public String getNameOfDistrict() {
        return NameOfDistrict;
    }
    public void setNameOfDistrict(String nameOfDistrict) {
        NameOfDistrict = nameOfDistrict;
    }
    public House[] getHouses() {
        return houses;
    }
    public void setHouses(House[] houses) {
        this.houses = houses;
    }

    @Override
    public String toString() {
        return "Catalog{" +
                "NameOfCity='" + NameOfCity + '\'' +
                ", NameOfDistrict='" + NameOfDistrict + '\'' +
                ", houses=" + Arrays.toString(houses) +
                '}';
    }
}