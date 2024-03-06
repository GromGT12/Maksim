package by_practice.thread;

import java.io.File;
import java.util.concurrent.*;

public class FileProcessor {
    private ExecutorService executor;

    public FileProcessor(int numThreads) {
        executor = Executors.newFixedThreadPool(numThreads);
    }

    public void processFiles(File directory) {
        if (directory.isDirectory()) {
            for (File file : directory.listFiles()) {
                if (file.isDirectory()) {
                    processFiles(file);
                } else {
                    executor.submit(() -> {
                        // Обработка файла
                        // Пример: processFile(file);
                    });
                }
            }
        }
    }

    public void shutdown() {
        executor.shutdown();
    }

    public static void main(String[] args) {
        FileProcessor processor = new FileProcessor(4);
        File directory = new File("directory_path");
        processor.processFiles(directory);
        processor.shutdown();
    }
}
