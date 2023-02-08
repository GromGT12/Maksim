package home_work_5;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        // Здесь нужно доработать решение. Ты вводишь размер таблицы через сканнер, а потом создаешь массив размеров 5 на 6
        // вне зависимости от того, что ввел
        // и если ввести 9 9 - программа упадет с ошибкой
        // и также не нужно выводить первую строчку и первый столбик нулей
        // как вариант - попробуй подход такой - сначала заполнить массив значениями, а потом вывести
        int[][] arr = new int[5][6];

        int i = 0, j = 0;
        for (int k = 0; k < n * m; ++k, ++j) {

            if (k != 0 && k % m == 0) {
                ++i;
                j = 0;
                System.out.println();
            }

            arr[i][j] = i * j;
            System.out.format("%4d", arr[i][j]);

        }

    }

}


