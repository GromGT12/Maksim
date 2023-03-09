package Task2;

public class Number {
    public static String recursion(int a, int b) {
        if (a > b) {
            if (a == b) {
                return Integer.toString(a);
            }
            return a + " " + recursion(a - 2, b);
        }
        return "1";//
        /*
        for (int i = 0; i < ; i++) {
          */
        }
            public static void main(String[] args) {
            System.out.println(recursion(15, 1));
        }
}
