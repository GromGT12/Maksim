package home_work_14.Task2;

public class Application {
    private static Object document;

    public static void main(String[] args) throws PrinterUncheckedException {
        Printer.turnOn();
        System.out.println("Принтер включен");
        try {
            Printer.print((String) document);
        } finally {
            System.out.println("Выключить принтер");
        }
    }
}
