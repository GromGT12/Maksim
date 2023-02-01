package home_work_3;

public class Task5 {
    public static void main(String[] args) {
        // а почему назвал большими буквами?
        final double INCH = 2.54;

        for (int i = 1; i <= 20; i++) {
            // решение красивое, на уроке попрошу объяснить как оно работает
            System.out.printf("%d inch = %3.2f centimeters\n", i, i * INCH);
        }
    }
}

