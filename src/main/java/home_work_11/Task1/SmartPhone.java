package home_work_11.Task1;

// здесь нужно форматирование
public class SmartPhone extends AbstractPhone {

    private int screen;

    public SmartPhone(String name) {
        super(name);
    }

    public int getScreen() {
        return screen;
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
