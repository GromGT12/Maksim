package home_work_5;

import java.util.Arrays;
import java.util.Scanner;

class Task1 {

    public static void main(String[] args) {

        int[] array = new int[]{10, 88, 120};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите наибольшое число массива:");
        int numberMax = scanner.nextInt();
        System.out.println("Введите наименьшее сисло массива:");
        int numberMin = scanner.nextInt();
        int[] number = new int[]{numberMax, numberMin};
        Arrays.sort(number);

        int sum = 0;
        for (int x : number) {
            sum += x;
        }
        System.out.println("Сумма: " + sum);

        int max = getMax(array);
        System.out.println("Maximum Value is: " + max);

        int min = getMin(array);
        System.out.println("Minimum Value is: " + min);
    }

    public static int getMax(int[] inputArray) {
        int maxValue = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] > maxValue) {
                maxValue = inputArray[i];
            }
        }
        return maxValue;
    }

    public static int getMin(int[] inputArray) {
        int minValue = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] < minValue) {
                minValue = inputArray[i];
            }
        }
        return minValue;

    }

}

