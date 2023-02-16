package home_work_7;

import java.util.Arrays;

/*
Task 1
Создайте массив целых чисел.
Напишите программу, которая распечатает новый массив, в который поместите элементы первого массива без изменений, если они нечетные,
а если четные - умножьте их на 5. Пример: исходный массив [4, 6, 10, 7, 1, 0, 2, 2] , результат - [20, 30, 50, 7, 1, 0, 10, 10]
 */

class Array1 {

    public static void main(String[] args) {

        int[] mas1 = new int[]{4, 6, 10, 7, 1, 0, 2, 2};
        int[] resultArray = new int[mas1.length];

        for (int i = 0; i < mas1.length; i++) {
            if (mas1[i] % 2 != 0) {
                resultArray[i] = mas1[i];
            } else {
                resultArray[i] = mas1[i] * 5;
            }
        }
       /* for (int i = 0; i < mas1.length; i++) {
            if (mas1[i] % 2 == 0) {
                //int myInt = mas1[i];
                resultArray[i] = mas1[i] * 5;
            }
        }*/
        System.out.println(Arrays.toString(resultArray));
    }
}
