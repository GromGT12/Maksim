package home_work_4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        // Здесь идея немного глубже, программа должна быть динамичной. Как пример - InteractiveSportsman
        // представь онлайн конвертер - вводишь 10 евро - показывает 400 гривен, вводишь 2- - показывает 800.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the currency");
        String currency = scanner.nextLine();
        System.out.println("Enter the sum");
        int sum = scanner.nextInt();
        System.out.println("Get uah 800");

    }
}

