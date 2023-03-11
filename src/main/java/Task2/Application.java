package Task2;

import java.io.IOException;

public class Application {
    public static void main(String[] args) {
        Router router = new Router();
        String internet = null;
        try {
            internet = router.generateReport("D-Link");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(internet);
        GameConsole gameConsole = new GameConsole("Xbox");
        String model = gameConsole.model;



    }
}
