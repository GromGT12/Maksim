package home_work_13.Task2;


public class GameConsole {
    private String name;
    private String model;

    public GameConsole(String name, String model) {
        this.name = name;
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "GameConsole{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}



