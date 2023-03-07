package home_work_11.Task1;

// здесь нужно сделать форматирование кода
public abstract class AbstractPhone implements Phone {
    private String name;

    protected AbstractPhone(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void makeCall() {
        System.out.println("Базовое поведение телефона");
    }

    @Override
    public void recieveCall() {
        System.out.println("Базовое поведение телефона");
    }

    @Override
    public String toString() {
        return "AbstractPhone{" +
                "name='" + name + '\'' +
                '}';
    }
}

