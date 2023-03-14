package home_work_13.Task1;
public class Application {
    public static void main(String[] args) {

        int[] number = new int[]{3, 7, 9, 21, 14, 15};
        for (int i = 0; i < number.length; i++) {
            try {
                System.out.println(100/(number[i]-9));
           } catch (ArithmeticException exception) {
                System.out.println("При обработке элемента (2) возникла ошибка: " + exception.getMessage());
            }

        }
    }
}






