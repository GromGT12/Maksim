package by_practice.Algorithmic_problems;

public class QuickSort {
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1); // сортируем левую часть
            quickSort(arr, pi + 1, high); // сортируем правую часть
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // выбираем последний элемент как опорный
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // Меняем местами элементы arr[i] и arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Меняем местами arr[i + 1] и опорный элемент
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        int[] array = {5, 3, 8, 4, 2};
        quickSort(array, 0, array.length - 1);
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
