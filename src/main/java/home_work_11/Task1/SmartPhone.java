package home_work_11.Task1;

// здесь нужно форматирование
public class SmartPhone extends AbstractPhone {

    public SmartPhone(String name) {

        super(name);
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