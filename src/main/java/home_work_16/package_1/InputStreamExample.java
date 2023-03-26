package home_work_16.package_1;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamExample {
    public static void main(String[] args) {
        String path = "src/main/java/home_work_16/package_5/The Show Must Go On_queen.txt";
        File file = new File(path);

        try (InputStream inputStream = new FileInputStream(file)) {
            int data;
            while ((data = inputStream.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}









