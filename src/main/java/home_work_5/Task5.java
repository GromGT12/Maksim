package home_work_5;

import java.util.Arrays;

class Task5 {
    public static void main(String[] args) {

        int[] myArray = {2, 3, 7, 23, 33, 55, 66, 88, 99, 45};
        int size = myArray.length;

        for (int i = 0; i < size / 2; i++) {
            int temp = myArray[i];
            myArray[i] = myArray[size - 1 - i];
            myArray[size - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(myArray));
    }
}

