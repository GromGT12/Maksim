package home_work_3;

public class Task5 {
    public static void main(String[] args) {
        final double INCH = 2.54;

        for (int i = 1; i <= 20; i++) {
            System.out.printf("%d inch = %3.2f centimeters\n", i, i * INCH);
        }
    }
}

