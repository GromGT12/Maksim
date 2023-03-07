package home_work_11.Task1;

public class MobilePhone extends AbstractPhone {

    public MobilePhone(String name) {
        super(name);
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

