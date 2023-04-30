package home_work_25.Task1;

import java.util.function.Function;

public class FunctionConverting {
    public static void main(String[] args) {
        Function<Integer, String> transformation = x -> String.valueOf(x) + " рублей";//я оставлю так, это более понятно
        System.out.println(transformation.apply(5));

    }
}
