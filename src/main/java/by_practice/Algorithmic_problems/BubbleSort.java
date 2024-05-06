package by_practice.Algorithmic_problems;

public class BubbleSort {
    public static void bubbleSort(int[] array) {
        int number = array.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < number; i++) {
                if (array[i - 1] > array[i]) {
                    int temp = array[i - 1];
                    array[i] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }

    public static void main(String[] args) {
        int[] array = {5, 3, 8, 4, 2};
        bubbleSort(array);
        for (int number : array) {
            System.out.println(number + " ");
        }
    }
}
