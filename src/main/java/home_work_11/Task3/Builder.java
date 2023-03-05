package home_work_11.Task3;

// все хорошо тут
public class Builder {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder("0");
        for (int i = 0; i < 100; i++) {
            builder.append("max");
        }
        System.out.println(builder);
    }
}
