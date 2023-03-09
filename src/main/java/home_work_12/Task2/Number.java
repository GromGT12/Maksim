package home_work_12.Task2;

public class Number {
    public static String recursion(int a, int b) {
        if (a <= b) {
            return String.valueOf(b);
        }
        return a + " " + recursion(a - 2, b);
    }

    public static void main(String[] args) {
        System.out.println(recursion(15, 1));
        System.out.println(recursion(18, 3));
        System.out.println(recursion(18, 5));
    }
}
