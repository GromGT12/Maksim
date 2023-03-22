package home_work_15.Arrays;

public class MultiplicationArrays {
    public static void main(String[] args) {
        int[] array = new int[]{66, 77, 90, 3, 15, 33, 45, -20};
        // если что угодно умножать на ноль, всегда получишь ноль. нужно использовать 1 в данном случае
        int mul = 1;
        for (int i = 0; i < array.length; i++) {
            mul *= array[i];
            int myInt = array[i];
            int result = myInt / 3;
            System.out.printf("Результат делания %d на 3: %d", myInt, result);
            System.out.println();
            // Я бы хотел видеть это сообщение лишь однажды, когда цикл пройдет.
        }
        System.out.println(" Результат произведение " + mul);
    }
}
