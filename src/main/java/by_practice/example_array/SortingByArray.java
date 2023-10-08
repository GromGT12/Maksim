package by_practice.example_array;

import java.util.Arrays;

public class SortingByArray {

    public static void main(String[] args) {

        int[] sortedArray = {0, 5, 10, 50, 78};
        int target = 10;
        int result = Arrays.binarySearch(sortedArray, target);

        if (result >= 0) {
            System.out.println("Number " + target + " found in the array at position " + result);
        } else {
            System.out.println("Number " + target + " number not found ");
        }
    }
}