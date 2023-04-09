package home_work_21;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
task 1
Дополните приложение следующей функциональностью: если пользователь три раза ввел неправильный пароль,
система блокирует его.
Это значит, что при следующем вводе username система выведет предупреждение о том, что пользователь заблокирован.
Разблокировать пользователя невозможно))
 */
public class UserLogin {

    public static final String EXIT = "exit";
    public static final String SKIP = "skip";

    public static void main(String[] args) {

        Map<String, String> namesWithPasswords = new HashMap();
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
            if (namesWithPasswords.containsKey(username)) {
                System.out.println("Please enter your password..");
                String password = scanner.nextLine();
                String passwordFromDB = namesWithPasswords.get(username);

                if (password.equals(passwordFromDB)) {
                    System.out.println("Hello, " + username);
                } else {
                    System.out.println("Вы ввели неправильный пароль - у вас осталось 3 попытоки " + username);
                    String newPassword = scanner.nextLine();
                    newPassword.contains(username);
                    System.out.println("Осталось 2 попытки " + username);
                    String newPassword1 = scanner.nextLine();
                    newPassword1.contains(username);
                    System.out.println("Осталось 1 попытка");
                    String newPassword2 = scanner.nextLine();
                    newPassword2.contains(username);
                    System.out.println("Внимание Вы заблоктрованы");
                    String userName = scanner.nextLine();
                    userName.contains(userName);
                        System.out.println("Password incorrect! User blocked!");
                        if(username.contains(username)){
                        }
                    }
                } else{
                    System.out.println("Not found: " + username);
                    System.out.println("If you want to register, enter your name. If you want to skip - enter 'skip'");
                    String newName = scanner.nextLine();
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




