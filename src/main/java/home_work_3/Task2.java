package home_work_3;

public class Task2 {

            public static void main(String[] args) {
                int res = 2;
                int x = 3;
            for (int i = 0; i < x / 3; i++) {
                res *= 2;
            }
            System.out.printf("За %d часа получится %d клетки.", x, res);
        }
    }