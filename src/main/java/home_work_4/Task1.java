package home_work_4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        int choise;
        int amount;
        int euro,hryvnia;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Options:");
        System.out.println("Enter currency 1: euro");
        System.out.println("Enter currency 2: hryvnia");

        System.out.println("Choose you options\n");
        choise = scanner.nextInt();
        System.out.println("Your number is: " + choise);

        System.out.println("Enter the amount you want to convert:");
        amount = scanner.nextInt();
        System.out.println("Your amount is: " + amount);

        euro = amount * 4.70;

        System.out.println(amount + " euro = " + hryvnia + "euro");

        hryvnia = amount * 0.025;

        System.out.println(amount + " hryvnia = " + euro + "euro");

    }
}

