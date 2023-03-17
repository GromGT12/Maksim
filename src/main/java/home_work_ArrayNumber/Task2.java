package home_work_ArrayNumber;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[]{4, 18, 9, 7, 15, 33, 32, 0, -20};
        int sum = 0;
        int element = 0;
        for (int i = 0; i < array.length; i++) {//Оставлю свой вариант, хотя Idea предлагает улучшенный for
            if (array[i] % 2 != 0) {
                element++;
                sum += array[i];
                System.out.print(array[i] + " ");
            }
        }
        System.out.println("Всего нечетных элементов = " + element);
        System.out.println("Их сумма равна " + sum);
    }
}
