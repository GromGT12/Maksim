package home_work_25.Task3;

public class ServiceInterface {
    public static void main(String[] args) {
        UserName userFactory = User::new;
        User user = userFactory.create("Maks");
        System.out.println(user);
    }
}
interface UserName {
    User create(String name);
}