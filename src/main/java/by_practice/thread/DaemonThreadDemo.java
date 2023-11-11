package by_practice.thread;


public class DaemonThreadDemo {

    public static void main(String[] args) throws InterruptedException {
        String name = Thread.currentThread().getName();
        boolean isDaemon = Thread.currentThread().isDaemon();
        System.out.println("name: " + name + ", isDaemon: " + isDaemon);

        // Любой новый поток, созданный из главного потока, также не является демон-потоком (пользовательский поток)
        Runnable task = new Task();
        Thread t1 = new Thread(task, "T1");
        System.out.println("A thread is created from a new thread");
        System.out.println("name: " + name + ", isDaemon: " + isDaemon);

        // Делаю поток демоном, вызвав setDaemon(), перед его запуском, как показано ниже:
        t1.setDaemon(true);
        t1.start();

        // Подождем, пока T1 завершится
        t1.join();
    }

    private static class Task implements Runnable {
        @Override
        public void run() {
            Thread t = Thread.currentThread();
            System.out.println("The thread is made a daemon using a method setDaemon");
            System.out.println("name: " + t.getName() + ", isDaemon: " + t.isDaemon());

            // Любой новый поток, созданный из демон-потока, также будет демоном
            Thread t2 = new Thread("T2");
            System.out.println("A thread is created from a daemon thread");
            System.out.println("name: + " + t2.getName() + ", isDaemon: " + t2.isDaemon());


        }
    }

}
