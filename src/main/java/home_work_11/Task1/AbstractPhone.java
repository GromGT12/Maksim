package home_work_11.Task1;

import javax.naming.Name;

// здесь нужно сделать форматирование кода
public abstract class AbstractPhone implements Phone {
    private String name;
    AbstractPhone(String name) {
        this.name = name;
    }

    // в интерфейсе метод makeCall не принимает параметров, а здесь - принимает Name.
    // нужно убрать Name из параметров здесь и в наследниках
    public abstract void makeCall(Name name);

    // в интерфейсе метод recieveCall не принимает параметров, а здесь - принимает Name.
    // нужно убрать Name из параметров здесь и в наследниках
    public abstract void recieveCall(Name name);

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

