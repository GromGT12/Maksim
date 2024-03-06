package by_practice.thread;

import java.util.concurrent.*;

public class BankSystem {
    private ConcurrentHashMap<Integer, Integer> accounts;

    public BankSystem(int numAccounts, int initialBalance) {
        accounts = new ConcurrentHashMap<>();
        for (int i = 0; i < numAccounts; i++) {
            accounts.put(i, initialBalance);
        }
    }

    public void transfer(int from, int to, int amount) {
        accounts.compute(from, (key, value) -> value - amount);
        accounts.compute(to, (key, value) -> value + amount);
    }

    public int getTotalBalance() {
        return accounts.values().stream().mapToInt(Integer::intValue).sum();
    }

    public static void main(String[] args) throws InterruptedException {
        int numAccounts = 10;
        int initialBalance = 1000;
        BankSystem bank = new BankSystem(numAccounts, initialBalance);

        ExecutorService executor = Executors.newFixedThreadPool(numAccounts);
        for (int i = 0; i < numAccounts; i++) {
            int fromAccount = i;
            executor.submit(() -> {
                for (int j = 0; j < 100; j++) {
                    int toAccount = (int) (Math.random() * numAccounts);
                    int amount = (int) (Math.random() * 100);
                    bank.transfer(fromAccount, toAccount, amount);
                }
            });
        }

        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.MINUTES);

        System.out.println("Total balance: " + bank.getTotalBalance());
    }
}
