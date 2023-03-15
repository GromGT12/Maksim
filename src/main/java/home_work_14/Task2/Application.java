package home_work_14.Task2;

public class Application {
    // здесь нужно поменять тип объекта на String и можно сразу проинициализировать его:
    // private static String document = "Очень важная справка"
    private static String document = "Очень важная справка";

    public static void main(String[] args) throws PrinterUncheckedException {
        Printer printer = new Printer();
        printer.turnOn();
        System.out.println("Принтер включен");
        try {
            //
            Printer.print((String) document);
        } finally {
            System.out.println("Выключить принтер");
        }
    }
}
