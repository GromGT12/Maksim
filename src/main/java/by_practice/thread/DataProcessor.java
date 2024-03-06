package by_practice.thread;

import javax.xml.crypto.Data;
import java.util.concurrent.*;

public class DataProcessor {
    private ExecutorService executor;

    public DataProcessor(int numThreads) {
        executor = Executors.newFixedThreadPool(numThreads);
    }

    public void process(Data data) {
        executor.submit(() -> {
            // Обработка данных
            // Пример: data.process();
        });
    }

    public void shutdown() {
        executor.shutdown();
    }

    public static <ConcreteData> void main(String[] args) {
        DataProcessor processor = new DataProcessor(4);
        // Генерация и обработка данных
        for (int i = 0; i < 1000; i++) {
        }
        processor.shutdown();
    }
}
