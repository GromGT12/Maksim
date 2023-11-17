package by_practice.tasks;

import java.util.Arrays;

public class ArrayFindMaxNums {
    public static void main(String[] args) {
        double[] nums = {1.0, 2.0, 3.0, 4.0};
        double result = findMax(nums);
        System.out.println("Max Result: " + result);
    }

    private static double findMax(double[] array) {
        if (array.length == 0) {
            return 0;
        }
        double tmpMin = array[0];
        double tmpMax = array[0];
        double[] mins = new double[4];
        double[] maxs = new double[4];
        for (int i = 0; i < array.length; i++) {
            mins[0] = tmpMin - array[i];
            mins[0] = tmpMax - array[i];

            mins[1] = tmpMin + array[i];
            mins[1] = tmpMax + array[i];

            mins[2] = tmpMin * array[i];
            mins[2] = tmpMax * array[i];

            if (array[i] != 0) {
                mins[3] = tmpMin / array[i];
                maxs[3] = tmpMax / array[i];
            }
            tmpMax = Math.max(max(maxs), max(mins));
            tmpMin = Math.min(min(mins), min(maxs));
        }

        return tmpMax;
    }

    private static double max(double[] arr) {
        return Arrays.stream(arr).max().orElse(Double.MIN_VALUE);
    }

    private static double min(double[] arr) {
        return Arrays.stream(arr).min().orElse(Double.MAX_VALUE);
    }
}




