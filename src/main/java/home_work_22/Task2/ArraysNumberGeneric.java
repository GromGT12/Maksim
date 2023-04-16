package home_work_22.Task2;

// Этот класс не нужен
public class ArraysNumberGeneric<T> {

    ArraysNumberGeneric(T value) {

    }

    public static ArraysNumberGeneric<Long> newInstance(Long value) {
        return new ArraysNumberGeneric<>(value);
    }

    public static ArraysNumberGeneric<Integer> newInstance(Integer value) {
        return new ArraysNumberGeneric<>(value);
    }

    public static ArraysNumberGeneric<Double> newInstance(Double value) {
        return new ArraysNumberGeneric<>(value);
    }
}
