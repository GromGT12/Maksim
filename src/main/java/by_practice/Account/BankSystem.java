package by_practice.Account;

import java.util.HashMap;
import java.util.Map;

// Интерфейс для банковского счета
interface Account {
    void deposit(double amount);
    void withdraw(double amount) throws InsufficientFundsException;
    double getBalance();
}

// Исключение, выбрасываемое при попытке снять средства больше, чем есть на счете
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

// Реализация банковского счета
class BankAccount implements Account {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Недостаточно средств на счете");
        }
        balance -= amount;
    }

    @Override
    public double getBalance() {
        return balance;
    }
}

// Класс для управления счетами
class Bank {
    private Map<Integer, Account> accounts;

    public Bank() {
        accounts = new HashMap<>();
    }

    public void addAccount(int accountId, Account account) {
        accounts.put(accountId, account);
    }

    public void transfer(int fromAccountId, int toAccountId, double amount) throws InsufficientFundsException {
        Account fromAccount = accounts.get(fromAccountId);
        Account toAccount = accounts.get(toAccountId);

        synchronized (fromAccount) {
            synchronized (toAccount) {
                fromAccount.withdraw(amount);
                toAccount.deposit(amount);
            }
        }
    }
}

// Главный класс для тестирования
public class BankSystem {
    public static void main(String[] args) {
        Bank bank = new Bank();
        BankAccount account1 = new BankAccount(1000);
        BankAccount account2 = new BankAccount(2000);

        bank.addAccount(1, account1);
        bank.addAccount(2, account2);

        Runnable transferTask = () -> {
            try {
                bank.transfer(1, 2, 500);
                System.out.println("Перевод выполнен успешно");
            } catch (InsufficientFundsException e) {
                System.out.println("Ошибка при переводе: " + e.getMessage());
            }
        };

        Thread thread1 = new Thread(transferTask);
        Thread thread2 = new Thread(transferTask);

        thread1.start();
        thread2.start();
    }
}
