package home_work_4;

import java.util.Scanner;

class Task1 {
    public static void main(String[] args) {

        int choise;
        double euro, hryvnia = 0;
        double rate = 40;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Options:");
        System.out.println("Enter currency 1: euro");
        System.out.println("Enter currency 2: hryvnia");
        System.out.println("");
        System.out.println("Choose you options\n");
        choise = scanner.nextInt();
        System.out.println("Your number is: " + choise);

        System.out.println("Enter the amount you want to convert:");
        double amount = scanner.nextDouble();
        System.out.println("Your amount is: " + amount);

        // если выбрали режим 1: покупаем евро, значит надо amount/rate и вывести результат
        // иначе если выбрали режим 2: покупаем гривну, значит надо amount*rate b и выводим
        // если режим не 1 и не 2 - выводим сообщение об неверном режиме

        euro = amount * 1;
        System.out.println(amount + " euro = " + hryvnia + "euro");
        hryvnia = amount * 40.03;
        System.out.println(amount + " hryvnia = " + euro + "hryvnia");

    }
}

