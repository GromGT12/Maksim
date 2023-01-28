package Home_work;

// Не размещай несколько классов в одном файле. Лучше раздели на отдельные классы Task4, Task5, Task...
// Во всех классах сделай форматирование кода

class Task4 {
    public static void main(String[] args) {

        System.out.println("Hello, Maks!");
    }
}

class Task5 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        // Придумай для этой переменной более значимое имя
        int c = x + y;
        System.out.println("Sum of x+y =" + c);
    }
}

class Task6 {
    public static void main(String[] args) {

        double a = 10, b = 20;
        
        // Зачем вводил эту переменную? 
        double r = a + b;
        System.out.println("произведение: " + a * b);
    }

}
class Task7 {
    public static void main(String[] args) {

        int x = 33;
        // нужны пробелы между: 33 % 2, форматирование кода тебе поможет
        int y = 33%2;
        System.out.println(y);
    }
}
class Task8 {
    public static void main(String[] args) {
        // Переменные именуются с маленькой буквы, helloWorld. Переименуй плиз.
        String HelloWorld = "Мир приветсвует";
        String GoodbayWorld = "Мир попрощается";

        // Ты объявил переменные, но не использовал их. Используй их в выводе на экран
        System.out.println("Мир приветсвует " + "Мир попрощается");

    }
}
