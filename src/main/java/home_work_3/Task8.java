package home_work_3;

class Task8 {
    public static void main(String[] args) {
        int Number = 100;
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }
        }
        int totalNumber = evenSum + oddSum;

        System.out.println(evenSum);
        System.out.println(oddSum);
        System.out.println(totalNumber);
    }
}









