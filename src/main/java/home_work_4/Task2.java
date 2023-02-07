package home_work_4;

import java.util.Scanner;

class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double discont = 0.8;
        double rate = 0.25;
        double violationsTrafficrules = 1.2;
        double insurancePrice;
        boolean accidentCase;
        boolean regularCustomer;

        System.out.println("Enter engine size in cm3");
        int enginecapacity = scanner.nextInt();   // переменные принято называть в camel-case, то есть engineCapacity
        insurancePrice = enginecapacity * rate;   // такое же действие ты делаешь в строке 21, оставь только одно

        System.out.println("Are we insured?? Enter 'true' or 'false':");
        regularCustomer = scanner.nextBoolean();
        insurancePrice = enginecapacity * rate;

        if (regularCustomer) {
            insurancePrice = insurancePrice * discont;
        }

        System.out.println("Were there traffic violations?? Enter 'true' or 'false':");
        accidentCase = scanner.nextBoolean();

        if (accidentCase) {
            insurancePrice = insurancePrice * violationsTrafficrules;
        }
        System.out.println("The cost of your policy is " + insurancePrice + " euros");
    }
}



