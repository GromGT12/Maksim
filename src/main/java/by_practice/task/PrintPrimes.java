package by_practice.task;

public class PrintPrimes {
    public static void printPrimes(int n) {
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        int limit = 30;
        System.out.println("Простые числа до " + limit + ":");
        printPrimes(limit);
    }
}

