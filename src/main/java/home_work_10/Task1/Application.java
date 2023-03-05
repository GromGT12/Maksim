package home_work_10.Task1;

public class Application {
    public static void main(String[] args) {
        User user = new User("Maks");
        Computer computer = new Laptop();
        computer.on(user); ;
        computer.off(user);
        computer.reset(user);
    }
}
