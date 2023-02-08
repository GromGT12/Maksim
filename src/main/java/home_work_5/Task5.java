package home_work_5;

class Task5 {
    static class Invert {
        public static void main(String[] args) {

            double[] reverseArray2 = {1.2, 1.9, 11.4, 23.8};
            System.out.print("\n2. Массив в обратном порядке: ");
            for (int i = reverseArray2.length - 1; i >= 0; i--) {
                System.out.print(reverseArray2[i] + " ");
            }
        }
    }
}
