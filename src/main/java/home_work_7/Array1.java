package home_work_7;

import java.util.Arrays;

class Array1 {

    public static void main(String[] args) {

        int[] mas1 = new int[]{4, 6, 10, 7, 1, 0, 2, 2};
        int[] resultArray = new int[mas1.length];

        for (int i = 0; i < mas1.length; i++) {
            if (mas1[i] % 2 != 0) {
                resultArray[i] = mas1.length;
            }
        }
        for (int i = 0; i < mas1.length; i++) {
            if (mas1[i] % 2 == 0) {
                resultArray[i] = mas1[i];
            }
        }
        System.out.println(Arrays.toString(resultArray));
    }
}
