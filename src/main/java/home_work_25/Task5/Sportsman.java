
package home_work_25.Task5;

import java.util.Objects;

public class Sportsman {
    private String name;
    private int speed;

    public Sportsman() {
    }

    public Sportsman(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sportsman sportsman = (Sportsman) o;
        return speed == sportsman.speed && Objects.equals(name, sportsman.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, speed);
    }

    @Override
    public String toString() {
        return "Sportsman{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                '}';
    }
}
