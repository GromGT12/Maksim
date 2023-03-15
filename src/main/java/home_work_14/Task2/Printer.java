package home_work_14.Task2;

import org.apache.commons.lang3.RandomUtils;

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

    public void turnOff() {
        System.out.println("Выклчючаем принтер");
    }
}



