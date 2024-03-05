package by_practice.tasks;

public class SingletonExample {

    // Приватное статическое поле для хранения единственного экземпляра класса
    private static SingletonExample instance;

    // Приватный конструктор, чтобы предотвратить создание экземпляров класса извне
    private SingletonExample() {
        // Конструктор
    }

    // Метод для получения единственного экземпляра класса
    public static SingletonExample getInstance() {
        // Проверяем, создан ли уже экземпляр класса, и создаем его, если нет
        if (instance == null) {
            instance = new SingletonExample();
        }
        return instance;
    }

    // Дополнительные методы и поля могут быть добавлены здесь
    public void showMessage() {
        System.out.println("Hello, I am a singleton instance!");
    }

    public static void main(String[] args) {
        // Получение единственного экземпляра класса
        SingletonExample singleton = SingletonExample.getInstance();

        // Использование методов экземпляра
        singleton.showMessage();
    }
}
