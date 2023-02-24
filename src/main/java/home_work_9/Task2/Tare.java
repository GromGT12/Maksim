package home_work_9.Task2;

import java.util.Objects;

public class Tare {
    private String name;
    private String material;

    public Tare(String name, String material) {
        this.name = name;
        this.material = material;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tare tare = (Tare) o;
        return Objects.equals(name, tare.name) && Objects.equals(material, tare.material);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, material);
    }

    @Override
    public String toString() {
        return "Tare{" +
                "name='" + name + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
