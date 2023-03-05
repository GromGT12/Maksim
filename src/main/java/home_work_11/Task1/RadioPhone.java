package home_work_11.Task1;

import javax.naming.Name;

public class RadioPhone extends AbstractPhone{

    public RadioPhone(String name) {
        super(name);
    }

    @Override
    public void makeCall(Name name) {
        System.out.println(getName());

    }

    @Override
    public void recieveCall(Name name) {
        System.out.println(getName());

    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void makeCall() {
        System.out.println("Наберу я совего друга...");
    }

    @Override
    public void recieveCall() {
        System.out.println("Максим звонит отвечу:");
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String getName(String name) {
        return null;
    }
}
