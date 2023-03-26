package home_work_16.package_2;

import java.io.*;

public class ReaderWriter {
    public static void main(String[] args) throws IOException {
        String inputPath = "src/main/java/home_work_16/package_5/The Show Must Go On_queen.txt";
        String outputPath = "src/main/java/home_work_16/package_5/output.txt";

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
