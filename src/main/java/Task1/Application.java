package Task1;

import java.sql.SQLOutput;

public class Application {
    public static void main(String[] args) {
        User user = new User("Maks");
        Computer computer = new ComputerAction();
        computer.on(); ;
        computer.off();
        computer.resetO();
    }
}
