package home_work_12;

public class CalculationRecursive {
    public static void main(String[] args) {
        int sum = sumLoop(10);
        System.out.println("Loop: " + sum);
        int recursiveSum2 = sumRecursive(10);
        System.out.println("Recursive: " + recursiveSum2);
    }

    public static int sumRecursive(int to) {
        if (to > 0) {
            return to + sumRecursive(to - 1);
        } else {
            return 0;
        }
    }

    public static int sumLoop(int to) {
        int sum = 0;
        for (int i = 0; i <= to; i++) {
            sum += i;
        }
        return sum;
    }
}



