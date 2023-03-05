package home_work_11.Task1;

import javax.naming.Name;

public abstract class AbstractPhone implements Phone {
    private String name;
    AbstractPhone(String name) {
        this.name = name;
    }

    public abstract void makeCall(Name name);

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

