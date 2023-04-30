
package home_work_25.Task4;

import java.util.ArrayList;
import java.util.List;

public class ServiceRemovingUserFromList {
    public static void main(String[] args) {
        User user1 = new User("Артем", "Павлов", 'm', 32);
        User user2 = new User("Рома", "Иванов", 'm', 25);
        User user3 = new User("Елена", "Дамбровская", 'f', 20);
        User user4 = new User("Света", "Чижикова", 'f', 19);
        User user5 = new User("Дмитрий", "Сергеев", 'm', 18);
        User user6 = new User("Инокентий", "Мактуновский", 'm', 20);


        List<String> userList = new ArrayList<>();
        userList.add("Артем");
        userList.add("Рома");
        userList.add("Елена");
        userList.add("Света");
        userList.add("Дмитрий");
        userList.add("Инакентий");
        userList.removeIf(s -> s.startsWith("А"));
        userList.removeIf(s -> s.startsWith("Р"));
        userList.removeIf(s -> s.startsWith("Е"));
        System.out.println(userList);

    }
}












