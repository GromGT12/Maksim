package by_practice.task;

public class max_element {
    public static int findMax(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] array = {3, 7, 2, 10, 5};
        int max = findMax(array);
        System.out.println("Max element: " + max);
    }
}

