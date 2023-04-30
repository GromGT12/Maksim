package home_work_25.Task2;

import java.util.function.BinaryOperator;

public class Multiplication {
    public static void main(String[] args) {
        BinaryOperator<Integer> multiplication = (y, x) -> y * x;
        System.out.println(multiplication.apply(6, 7));
    }
}
