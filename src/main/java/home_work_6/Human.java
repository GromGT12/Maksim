package home_work_6;

class Human {
    static String text = "Hello from static";
    String name;
    int age;

    {
        System.out.println("Создали новый экземпляр класса!");
    }

    public Human() {
        this.name = "Maks";
        this.age = 30;
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}