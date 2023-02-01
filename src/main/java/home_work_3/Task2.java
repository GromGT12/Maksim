package home_work_3;

public class Task2 {
    public static void main(String[] args) {
        int s = 1;

        // здесь предварительно подсчитать сколько раз амеба разделится, то есть сколько будет итераций у цикла.
        // 24/3 = 8. и далее цикл начинать с 0  и до 8

        for (int i = 2; i < 24; i += 3) {
            s *= 2;
            System.out.println(s);
        }
    }
}

