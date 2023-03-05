package home_work_11.Task1;

import javax.naming.Name;

public class MobilePhone extends AbstractPhone {


    public MobilePhone(String name) {
        super(name);
    }

    @Override
    public void makeCall(Name name) {
        System.out.println(name);

    }
    @Override
    public void recieveCall(Name name) {
        System.out.println(name);

    }
    @Override
    public String getName() {
        return super.getName();
    }
    @Override
    public void makeCall() {

        System.out.println("Наберу я папу...");
    }
    @Override
    public void recieveCall() {
        System.out.println("Максим пыается дозвониться, нужно ответить:");
    }
    @Override
    public String toString() {
        return super.toString();
    }

    // вот это переопределение я не совсем понимаю, расскажи плиз, для чего так сделал.
    // Этот метод можно и не переопределять, в классе AbstractPhone он норм расписан
    @Override
    public String getName(String name) {
        return null;
    }
}

