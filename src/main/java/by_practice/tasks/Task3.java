package by_practice.tasks;

public class Task3 {
    public static void main(String[] args) {
        int[] array = new int[]{66, 77, 90, 3, 15, 33, 45, 0, -20};
        for (int i = 0; i < array.length; i++) {
            int myInt = array[i];
            int result = myInt / 3;
            System.out.printf("Результат делания %d на 3: %d", myInt, result);
            System.out.println();
        }
    }
}
