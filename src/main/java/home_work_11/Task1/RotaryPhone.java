package home_work_11.Task1;

public class RotaryPhone extends AbstractPhone {

    public RotaryPhone(String name) {
        super(name);
    }

    @Override
    public void makeCall() {
        System.out.println("Крутим барабан чтобы позвонить...");
    }

    @Override
    public void recieveCall() {
        System.out.println("Нужно ответить кто-то звонит:");
    }
}
