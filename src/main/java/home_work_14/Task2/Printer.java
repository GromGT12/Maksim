package home_work_14.Task2;

import org.apache.commons.lang3.RandomUtils;

import java.awt.print.PrinterException;

public class Printer {
    public void turnOn() {
        System.out.println("Включили принтер");
    }

    public static void print(String document) {
        if (RandomUtils.nextBoolean()) {
            throw new PrinterUncheckedException("Попытка распечатать документ ПРОВАЛИЛАСЬ");
        }
        System.out.println(document);
    }

    // метод нигде не используется, а я хотел бы, чтобы он использовался в блоке finally
    // типа, неважно, получилось ли у нас распечатать документ или нет, нужно выключить принтер в любом случае
    public void turnOff() {
        // здесь оставь только строчку System.out.println("Выклчючаем принтер") больше ничего не нужно
        System.out.println("Выклчючаем принтер");
        }
    }



