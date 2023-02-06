package home_work_4;

import java.util.Scanner;

class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int enginecapacity;
        double discont = 0.8;
        double rate = 0.25;
        double violationsTrafficrules = 1.2;
        double insurancePrice;
        boolean accidentСase;
        boolean regularCustomer;

        System.out.println("Enter engine size in cm3");
        int engineCapacity = scanner.nextInt();
        insurancePrice = engineCapacity * rate;

        System.out.println("Are we insured?? Enter 'true' or 'false':");
        regularCustomer = scanner.nextBoolean();
        insurancePrice = engineCapacity * rate;

        if (regularCustomer) {
            insurancePrice = insurancePrice * 0.8;
        }

        System.out.println("Were there traffic violations?? Enter 'true' or 'false':");
        accidentСase = scanner.nextBoolean();

        if (accidentСase) {
            insurancePrice = insurancePrice * 1.2 ;
        }
        System.out.println("The cost of your policy is " +  insurancePrice + " euros");
    }
}



