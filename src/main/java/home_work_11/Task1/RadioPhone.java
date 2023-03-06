package home_work_11.Task1;

public class RadioPhone extends AbstractPhone {

    public RadioPhone(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getName(String name) {
        return null;
    }

    @Override
    public void makeCall() {
        System.out.println("Наберу я совего друга...");
    }

    @Override
    public void recieveCall() {
        System.out.println("Максим звонит отвечу:");
    }

}
