package home_work_16.package_2;

import java.io.OutputStream;
import java.io.InputStream;
import java.io.*;

public class ReaderWriter {
    public static void main(String[] args) throws IOException {

        String outputPath = "home_work_16/package_3/output.txt";
        String inputPath = "home_work_16/package_3/The Show Must Go On_queen.txt";

        try (InputStream inputStream = new FileInputStream(inputPath);
             OutputStream outputStream = new FileOutputStream(outputPath)) {
            int data;
            while ((data = inputStream.read()) != -1) {
                outputStream.write(data);
            }
            outputStream.flush();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
