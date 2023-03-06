package home_work_11.Task1;

// здесь нужно сделать форматирование кода
public abstract class AbstractPhone implements Phone {
    private String name;

    AbstractPhone(String name) {
        this.name = name;
    }

    public String getName() {

        return name;
    }

    @Override
    public String toString() {
        return "AbstractPhone{" +
                "name='" + name + '\'' +
                '}';
    }

    public abstract String getName(String name);
}

