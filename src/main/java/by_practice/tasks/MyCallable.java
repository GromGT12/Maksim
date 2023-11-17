package by_practice.tasks;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class MyCallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {

        return 42;
    }

    public static class Main {
        public static void main(String[] args) throws InterruptedException, ExecutionException {
            Callable<Integer> callable = new MyCallable();
            FutureTask<Integer> futureTask = new FutureTask<>(callable);

            Thread thread = new Thread(futureTask);
            thread.start();

            Integer result = futureTask.get();
            System.out.println("Результат: " + result);
        }
    }
}

