package home_work_29;

public class GreetingService {
    public String greet(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("имя не может быть пустой строкой");
        }
        if (name.chars().anyMatch(Character::isDigit)) {
            throw new IllegalArgumentException("имя не может содержать цифры");
        }
        return String.format("Приветсвую тебя, " + name);
    }
}
