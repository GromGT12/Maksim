package home_work_5;

import java.util.Arrays;
import java.util.Scanner;

class Task1 {

    public static void main(String[] args) {

        int[] array = new int[]{10, 88, 120};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите наибольшое число массива:");
        int numbermax = scanner.nextInt();
        System.out.println("Введите наименьшее сисло массива:");
        int numbermin = scanner.nextInt();
        int[] number = new int[]{numbermax, numbermin};

        // здесь ты сортируешь массив number, в котором есть только два элемента, которые ввел пользователь. Нужно
        // чтобы пользователь ввел три числа и работать с этими числами
        Arrays.sort(number);

        int sum = 0;
        for (int x : number) {
            sum += x;
        }
        System.out.println("Сумма: " + sum);

        // а здесь ты ищешь максимальное значение в массиве, который создан в строке 10. его не нужно создавать заранее,
        // его нужно собрать из чисел, которые ввел пользователь
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

