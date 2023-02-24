package home_work_4;

import java.util.Scanner;

class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double discount = 0.8;
        double rate = 0.25;
        double violationsTraffickers = 1.2;
        double insurancePrice;
        boolean accidentCase;
        boolean regularCustomer;

        System.out.println("Enter engine size in cm3");
        int engineCapacity = scanner.nextInt();

        System.out.println("Are we insured?? Enter 'true' or 'false':");
        regularCustomer = scanner.nextBoolean();
        insurancePrice = engineCapacity * rate;

        if (regularCustomer) {
            insurancePrice = insurancePrice * discount;
        }

        System.out.println("Were there traffic violations?? Enter 'true' or 'false':");
        accidentCase = scanner.nextBoolean();

        if (accidentCase) {
            insurancePrice = insurancePrice * violationsTraffickers;
        }
        System.out.println("The cost of your policy is " + insurancePrice + " euros");
    }
}



