package home_work_7;

public class House {
    private String type;
    private int floors;
    private int residentsOfHouse;
    private boolean heatingOn;


    public House(String type, int floors, int residentsOfHouse) {
        this.type = type;
        this.floors = floors;
        this.residentsOfHouse = residentsOfHouse;
    }
    public House(int floors, int residentsOfHouse) {
        this.floors = floors;
        this.residentsOfHouse = residentsOfHouse;
    }
    public House(int floors, int residentsOfHouse, boolean heatingOn) {
        this.floors = floors;
        this.residentsOfHouse = residentsOfHouse;
        this.heatingOn = true;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getFloors() {
        return floors;
    }
    public void setFloors(int floors) {
        this.floors = floors;
    }
    public int getResidentsOfHouse() {
        return residentsOfHouse;
    }
    public void setResidentsOfHouse(int residentsOfHouse) {
        this.residentsOfHouse = residentsOfHouse;
    }
    public boolean isHeatingOn() {
        return heatingOn;
    }
    public void setHeatingOn(boolean heatingOn) {
        this.heatingOn = heatingOn;
    }

    @Override
    public String toString() {
        return "House{" +
                "type='" + type + '\'' +
                ", floors=" + floors +
                ", residentsOfHouse=" + residentsOfHouse +
                ", heatingOn=" + heatingOn +
                '}';
    }
}
