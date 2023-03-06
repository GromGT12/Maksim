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

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String getName(String name) {
        return null;
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
