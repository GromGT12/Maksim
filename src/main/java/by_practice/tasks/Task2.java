package by_practice.tasks;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[]{4, 18, 9, 7, 15, 33, 32, 0, -20};
        int sum = 0;
        int element = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                element++;
                sum += array[i];
                System.out.print(array[i] + " ");
            }
        }
        System.out.println("Total odd elements = " + element);
        System.out.println("The sum of them is " + sum);
    }
}
