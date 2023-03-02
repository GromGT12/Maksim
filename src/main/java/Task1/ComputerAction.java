package Task1;

public class ComputerAction implements Computer{

    @Override
    public void on() {
        String getName1 = getName;
        System.out.println(getName +  " включил комьютер");
    }

    @Override
    public void off() {
        String getName1 = getName;
        System.out.println(getName + " выключил компьютер");


    }

    @Override
    public void resetO() {
        String getName1 = getName;
        System.out.println(getName + " хочет перезапустить компьютер");

    }
}
