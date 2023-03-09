package home_work_12;

public class Application extends CalculationRecursive {

    /*
    Написать класс, который вычисляет сумму чисел от 0 до заданного числа.
В классе должно быть два метода: вычисление через цикл и рекурсивное вычисление.
В другом классе Application создать объект класса-калькулятора и вызвать оба метода.
Сравнить результат.
     */
    public static void main(String[] args) {
        CalculationRecursive calculationRecursive = new CalculationRecursive();
        sumLoop(10);
        System.out.println(sumLoop(10));

        CalculationRecursive calculationRecursive2 = new CalculationRecursive();
        sumRecursive(10);
        System.out.println(10);
    }
}
