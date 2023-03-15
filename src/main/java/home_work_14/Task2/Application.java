package home_work_14.Task2;

public class Application {
    private static String document = "Очень важная справка";

    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.turnOn();

        System.out.println("Принтер включен");
        try {
            //
            Printer.print((String) document);
        } finally {
            System.out.println("Выключить принтер");
            printer.turnOff();
            // здесь еще вызови на принтере turnOff()

        }
    }
}
