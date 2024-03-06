package by_practice.thread;

import javax.xml.crypto.Data;
import java.util.concurrent.*;

public class RealTimeProcessor {
    private BlockingQueue<Data> queue;

    public RealTimeProcessor(int queueSize) {
        queue = new LinkedBlockingQueue<>(queueSize);
    }

    public void processData() {
        ExecutorService executor = Executors.newFixedThreadPool(4);
        while (true) {
            try {
                Data data = queue.take();
                executor.submit(() -> {
                    // Обработка данных в реальном времени
                    // Пример: processRealTimeData(data);
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void addData(Data data) throws InterruptedException {
        queue.put(data);
    }

    public static void main(String[] args) {
        RealTimeProcessor processor = new RealTimeProcessor(100);
        processor.processData();
    }
}
