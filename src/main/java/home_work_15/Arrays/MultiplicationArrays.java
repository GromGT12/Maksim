package home_work_15.Arrays;

public class MultiplicationArrays {
    public static void main(String[] args) {
        int[] array = new int[]{66, 77, 90, 3, 15, 33, 45, 0, -20};
        int mul = 0;
        for (int i = 0; i < array.length; i++) {
            mul*=array[i];
            int myInt = array[i];
            int result = myInt / 3;
            System.out.printf("Результат делания %d на 3: %d", myInt, result);
            System.out.println();
            System.out.println(" Результат произведение " + mul);
        }
    }
}
