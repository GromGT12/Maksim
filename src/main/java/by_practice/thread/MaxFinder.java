package by_practice.thread;
import java.util.concurrent.*;

public class MaxFinder {
    // Метод для поиска максимального элемента в массиве с использованием многопоточности
    public static int findMax(int[] arr) throws InterruptedException, ExecutionException {
        int threadsCount = Runtime.getRuntime().availableProcessors(); // Определяем количество доступных процессоров
        ExecutorService executor = Executors.newFixedThreadPool(threadsCount); // Создаем пул потоков
        Future<Integer>[] futures = new Future[threadsCount]; // Массив для хранения результатов выполнения потоков

        // Разбиваем массив на части для каждого потока
        int blockSize = arr.length / threadsCount;
        for (int i = 0; i < threadsCount; i++) {
            int startIndex = i * blockSize;
            int endIndex = (i == threadsCount - 1) ? arr.length : (i + 1) * blockSize;
            futures[i] = executor.submit(new MaxFinderTask(arr, startIndex, endIndex)); // Запускаем потоки на выполнение
        }

        int max = Integer.MIN_VALUE;

        // Получаем результаты выполнения потоков и находим максимальный элемент
        for (int i = 0; i < threadsCount; i++) {
            int threadMax = futures[i].get();
            if (threadMax > max) {
                max = threadMax;
            }
        }

        executor.shutdown(); // Завершаем работу пула потоков
        return max;
    }

    // Внутренний класс для выполнения задачи поиска максимального элемента в подмассиве
    private static class MaxFinderTask implements Callable<Integer> {
        private int[] arr;
        private int start, end;

        public MaxFinderTask(int[] arr, int start, int end) {
            this.arr = arr;
            this.start = start;
            this.end = end;
        }

        @Override
        public Integer call() {
            int max = Integer.MIN_VALUE;
            for (int i = start; i < end; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            return max;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7, 3, 8, 6, 4};
        try {
            int max = findMax(arr);
            System.out.println("Max element: " + max);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
