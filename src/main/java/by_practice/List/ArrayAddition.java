package by_practice.List;

import java.util.Arrays;

public class ArrayAddition {
    public static void main(String[] args) {
        int[] evenNumbers = {1, 2, 3};
        int[] oddNumbers = {5, 6, 7};

        int[] result = add(evenNumbers, oddNumbers);
        System.out.println("First Array: " + Arrays.toString(evenNumbers));
        System.out.println("Second Array: " + Arrays.toString(oddNumbers));
        System.out.println("sum of array: " + Arrays.toString(result));

        int[] prime = {1, 2, 3};
        result = add(evenNumbers, prime);
        System.out.println("first array: " + Arrays.toString(evenNumbers));
        System.out.println("second array: " + Arrays.toString(prime));
        System.out.println("sum of array: " + Arrays.toString(result));
    }

    private static int[] add(int[] first, int[] second) {
        int length = first.length < second.length ? first.length :
                second.length;
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = first[i] + second[i];
        }
        return result;
    }
}
