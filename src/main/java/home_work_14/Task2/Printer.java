package home_work_14.Task2;

import org.apache.commons.lang3.RandomUtils;

public class Printer {
    public static void turnOn() {
        System.out.println("Включи принтер");
    }

    public static void print(String document) throws PrinterUncheckedException {
        if (RandomUtils.nextBoolean()) {
            throw new PrinterUncheckedException("Попытка распечатать документ");
        }
        System.out.println("Распечатай документ");
    }

    public static void turnOff() {
        System.out.println("Выклчючаем принтер");
    }
}


