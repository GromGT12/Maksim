package by_practice.Algorithmic_problems;

public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int number = arr.length;
        for (int i = 1; i < number; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 3, 8, 4, 2};
        insertionSort(array);
        for (int number : array) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
