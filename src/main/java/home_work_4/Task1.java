package home_work_4;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        double choise;
        double rateEuro = 0.25;
        double rateUah = 40;


        System.out.println("Options:");
        System.out.println("Enter currency 1: euro");
        System.out.println("Enter currency 2: hryvnia");
        System.out.println(" ");
        System.out.println("Choose you options\n");
        choise = scanner.nextDouble();
        System.out.println("Your number is: " + choise);

        System.out.println("Enter the amount you want to convert:");

        choise = scanner.nextDouble();
        System.out.println("Your amount is: " + choise);

        double cyrrency = scanner.nextDouble();
        double amount = scanner.nextDouble();
        System.out.println("Your amount is: " + amount);



        System.out.println("В какую валюту хотите конвертировать? Доступные варианты: 1 - Euro, 2 - Uah, 3 - результат об ошибке");
        int currency = scanner.nextInt();

        if (currency ==1) {
            System.out.println("Если выбрали вариант 1: покупаем euro, значит надо choise/rate и вывести результат");
        } else if (currency == 2) {
            System.out.println("Если выбрали режим 2: покупаем hryvnia, значит надо amount*rate и вывести результат");
        } else if (cyrrency == 3) {
            System.out.println("Если режим 1 и не 2 - выводим сообщение об ошибке");
        } else {
            System.out.println("Неизвестная валюта");
        }
    }
}
