package home_work_11.Task1;

public class MobilePhone extends AbstractPhone {


    MobilePhone(String name) {
        super(name);
    }

    @Override
    public String getName(String name) {
        return null;
    }

    @Override
    public void makeCall() {
        System.out.println("Набрать папу:");
    }

    @Override
    public void recieveCall() {
        System.out.println("Ответить Максим звонит:");
    }
}

