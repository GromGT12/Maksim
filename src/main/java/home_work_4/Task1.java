package home_work_4;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double rate = 40;

        System.out.println("В какую валюту хотите конвертировать? Доступные варианты: 1 - Euro, 2 - Uah,");
        int mode = scanner.nextInt();
        System.out.println("Введите сумму");
        double amount = scanner.nextDouble();
        if (mode == 1) {
            System.out.println("Если выбрали вариант 1: покупаем euro");
            double result = amount / rate;
            System.out.println(result + "Euro");
        } else if (mode == 2) {
            System.out.println("Если выбрали режим 2: покупаем uah");
            double result = amount * rate;
            System.out.println(result);

        } else {
            System.out.println("Неизвестная валюта");
        }
    }
}
