package home_work_10.Task1;

public class Laptop implements Computer {

    @Override
    public void on(User user) {

        System.out.println(user.getName() + " включил комьютер");
    }

    @Override
    public void off(User user) {

        System.out.println(user.getName() + " выключил компьютер");

    }

    @Override
    public void reset(User user) {
        System.out.println(user.getName() + " хочет перезапустить компьютер");
    }
}

