package home_work_25.Task3;

public class ServiceInterface {
    public static void main(String[] args) {
        UserName userName = User::new;
        User user = userName.create("Maks");
        System.out.println(user);
    }
}
interface UserName {
    User create(String name);
}