package home_work_21.Task1;

import java.util.*;

/*
Task 1
Создайте приложение следующей функциональностью: если пользователь три раза ввел неправильный пароль,
система блокирует его.
Это значит, что при следующем вводе username система выведет предупреждение о том, что пользователь заблокирован.
Разблокировать пользователя невозможно))
 */
public class UserLogin {

    public static final String EXIT = "exit";
    public static final String SKIP = "skip";

    public static void main(String[] args) {

        Map<String, String> namesWithPasswords = new HashMap();
        BlackListService blackListService = new BlackListService();
        Set<String> userSystem = new HashSet<>();

        namesWithPasswords.put("Pavel", "pass1");
        namesWithPasswords.put("Anna", "pass2");
        namesWithPasswords.put("Illia", "pass3");

        Scanner scanner = new Scanner(System.in);
        // exit
        while (true) {
            System.out.println("Enter your username: ");
            String username = scanner.nextLine();
            if (username.equalsIgnoreCase(EXIT)) {
                break;
            }
            if (blackListService.isBanned(username)) {
                System.out.println("Этот пользователь уже забанен" + username);
                continue;
            }
            if (namesWithPasswords.containsKey(username)) {
                System.out.println("Please enter your password..");
                String password = scanner.nextLine();
                String passwordFromDB = namesWithPasswords.get(username);

                if (password.equals(passwordFromDB)) {
                    System.out.println("Hello, " + username);
                    blackListService.resetFailedLoginCount(username);
                } else {

                    System.out.println("Password incorrect! Try again");
                    blackListService.increaseFailedCounter(username);
                    continue;
                }
            } else {
                System.out.println("Not found: " + username);
                System.out.println("If you want to register, enter your name. If you want to skip - enter 'skip'");
                String newName = scanner.nextLine();
                if (userSystem.equals(username)) {
                    userSystem.add(username);
                } else {
                    System.out.println("Такого юзреа нет");
                    continue;

                }
                if (!newName.equalsIgnoreCase(SKIP)) {
                    System.out.println("Enter your new password");
                    String newPassword = scanner.nextLine();
                    namesWithPasswords.put(newName, newPassword);
                    System.out.println("Hello, " + newName + " you are registered!");
                } else {

                }
            }
        }
    }
}




