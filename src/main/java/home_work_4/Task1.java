package home_work_4;

import java.util.Scanner;

class Task1 {
    public static void main(String[] args) {

        int choise;
        double amount;
        double euro, hryvnia;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Options:");
        System.out.println("Enter currency 1: euro");
        System.out.println("Enter currency 2: hryvnia");
        System.out.println("");
        System.out.println("Choose you options\n");
        choise = scanner.nextInt();
        System.out.println("Your number is: " + choise);

        System.out.println("Enter the amount you want to convert:");
        amount = scanner.nextInt();
        System.out.println("Your amount is: " + amount);

        euro = amount *1;
        System.out.println(amount + " euro = " + hryvnia + "euro");
        hryvnia = amount * 40.03;
        System.out.println(amount + " hryvnia = " + euro + "hryvnia");

    }
}

