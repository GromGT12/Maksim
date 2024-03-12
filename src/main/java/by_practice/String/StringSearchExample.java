package by_practice.String;

public class StringSearchExample {

    // Пример использования метода indexOf
    public static void indexOfExample() {
        String str = "Hello, world!";
        int index = str.indexOf("world"); // Поиск подстроки "world" в строке
        if (index != -1) {
            System.out.println("Строка содержит подстроку 'world' на позиции: " + index);
        } else {
            System.out.println("Строка не содержит подстроку 'world'.");
        }
    }

    // Пример использования метода contains
    public static void containsExample() {
        String str = "Hello, world!";
        if (str.contains("world")) { // Проверка наличия подстроки "world" в строке
            System.out.println("Строка содержит подстроку 'world'.");
        } else {
            System.out.println("Строка не содержит подстроку 'world'.");
        }
    }

    // Пример использования метода lastIndexOf
    public static void lastIndexOfExample() {
        String str = "Hello, world!";
        int lastIndex = str.lastIndexOf("l"); // Поиск последнего вхождения символа 'l' в строке
        if (lastIndex != -1) {
            System.out.println("Последнее вхождение символа 'l' находится на позиции: " + lastIndex);
        } else {
            System.out.println("Символ 'l' не найден в строке.");
        }
    }

    // Главный метод
    public static void main(String[] args) {
        // Примеры использования каждого метода
        System.out.println("Пример использования метода indexOf:");
        indexOfExample();

        System.out.println("\nПример использования метода contains:");
        containsExample();

        System.out.println("\nПример использования метода lastIndexOf:");
        lastIndexOfExample();
    }
}
