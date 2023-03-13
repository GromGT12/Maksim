package Task4;

public class NumbersArray {
    /*
    Создаем массив из целых чисел: {4,1,-10, 15,25, 88, 90, 133, 20, 0}
В цикле: распечатываем i-й элемент массива через
System.out.printf -пример:  Элемент 0 массива: 4 ,
распечатываем результат деления элемента на 2. Пример: Результат деления 0 на 2: 0
Вычисляем сумму всех элементов
     */
    public static void main(String[] args) {
        int[] myArray = new int[]{4, 1, -10, 15, 25, 88, 90, 133, 20, 0};
        for (int i = 0; i < myArray.length; i++) {
            try {
                System.out.printf(String.valueOf(0/(myArray[i]-4)));
            }catch (ArithmeticException exception) {
                System.out.println("При обработки элемента (4) произошла ошибочка: " + exception.getMessage());
                int sum = 0;
                sum+=myArray[i];
                System.out.println(sum);
            }
        }
    }
}