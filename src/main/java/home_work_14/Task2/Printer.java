package home_work_14.Task2;

import org.apache.commons.lang3.RandomUtils;

import java.awt.print.PrinterException;

public class Printer {
    // плиз, у всех методов убери модификатор static. когда сделаешь это, в классе Application тебе нужно будет создать объект
    // типа Printer
    public void turnOn() {
        System.out.println("Включили принтер");
    }

    // PrinterUncheckedException - непроверяемое исключение, поэтому добавлять его в сигнатуру метода не нужно
    public static void print(String document) {
        if (RandomUtils.nextBoolean()) {
            throw new PrinterUncheckedException("Попытка распечатать документ ПРОВАЛИЛАСЬ");
        }
        System.out.println(document);
        // в метод передается строка document, плиз, распечатай ее здесь
    }

    // метод нигде не используется, а я хотел бы, чтобы он использовался в блоке finally
    // типа, неважно, получилось ли у нас распечатать документ или нет, нужно выключить принтер в любом случае
    public static void turnOff() {
        if(RandomUtils.nextBoolean()) {
            throw new PrinterUncheckedException("Выключаем принтер");
        }try {
            Printer.turnOff();
        }catch (Exception exception) {
            System.out.println(exception.getMessage());
        }finally {
            System.out.println("Выклчючаем принтер");
        }
    }
}


