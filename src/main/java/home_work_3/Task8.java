package home_work_3;

class Task8 {
    public static void main(String[] args) {

        int sum = 0;

        for (int i = 2; i < 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("сумма четных чисел: " + sum);

    }
}









