package home_work_5;

import java.util.Arrays;

class EvenNumberArray {
    public static void main(String[] args) {

        int[] mas1 = new int[]{4, 5, 6, 3, 2, 7, 11, 8};
        int evenNumer = 0;

        for (int i = 0; i < mas1.length; i++) {
            if (mas1[i] % 2 == 0) {
                evenNumer++;
            }
        }
        int j = 0;
        int[] mas2 = new int[evenNumer];
        for (int i = 0; i <mas1.length; i++) {
            if (mas1[i] % 2 == 0) {
                mas2[j] = mas1[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(mas2));
    }
}

