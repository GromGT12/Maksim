package by_practice.thread;

public class ThreeThreads{
    public static void main(String[] args) {
        // Создаем и запускаем первый поток
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread 1: " + i);
                try {
                    Thread.sleep(1000); // Приостанавливаем поток на 1 секунду
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread1.start();

        // Создаем и запускаем второй поток
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread 2: " + i);
                try {
                    Thread.sleep(800); // Приостанавливаем поток на 800 миллисекунд
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread2.start();

        // Создаем и запускаем третий поток
        Thread thread3 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread 3: " + i);
                try {
                    Thread.sleep(1200); // Приостанавливаем поток на 1.2 секунды
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread3.start();
    }
}
