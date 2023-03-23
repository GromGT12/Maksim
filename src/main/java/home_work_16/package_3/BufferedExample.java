package home_work_16.package_3;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class BufferedExample {
    public static void main(String[] args) throws IOException {

        String inputPath = "src/main/java/home_work_16/package_3/The Show Must Go On_queen.txt";

        try (InputStream inputStream = new FileInputStream(inputPath);
             BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream)) {
            byte[] bytes = new byte[271];
            while ((bufferedInputStream.read(bytes)) != -1) {
                for (byte aByte : bytes) {
                    System.out.print((char) aByte);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
