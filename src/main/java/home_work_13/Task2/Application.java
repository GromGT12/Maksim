package home_work_13.Task2;

public class Application {
    public static void main(String[] args) {
        Router router = new Router("Orange");
        GameConsole gameConsole = new GameConsole("Xbox", "One");
        for (int i = 0; i < 6; i++) {
            String result = router.connect(gameConsole.getModel() + gameConsole.getName());
            System.out.println(result);
        }
    }
}

