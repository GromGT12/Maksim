package Task1;

public class ArrayNumber {
    public static void main(String[] args) {
        int[] Number = new int[]{3, 7, 9, 21, 14, 15};
        for (int i = 0; i <Number.length; i++) {
            {
                try {
                System.out.println(100/Number[i]-9);
                }catch (ArithmeticException exception) {
                    System.out.println("При обработке элемента №9 возникла ошибка: " + exception.getMessage());}

            }
        }
    }
}



