package home_work_22.Task2;

// Здесь все правильно!
public class NumberStorage<T extends Number> {

    private final T[] numbers;

    public NumberStorage(T[] numbers) {
        this.numbers = numbers;
    }

    public T[] getNumbers() {
        return numbers;
    }

}

