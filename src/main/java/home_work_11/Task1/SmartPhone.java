package home_work_11.Task1;

import javax.naming.Name;

public class SmartPhone extends AbstractPhone{

    public SmartPhone(String name)
    {

        super(name);
    }

    @Override
    public void makeCall(Name name) {

    }

    @Override
    public void recieveCall(Name name) {

    }


    @Override
    public String getName(String name) {

        return super.getName();
    }

    @Override
    public void makeCall() {
        System.out.println("Голосовой набор маме...");

    }
    @Override
    public void recieveCall() {
        System.out.println("Максим звонит ответить:");

    }
}
