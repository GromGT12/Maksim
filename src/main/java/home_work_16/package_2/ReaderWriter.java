package home_work_16.package_2;

import java.io.*;

public class ReaderWriter {
    public static void main(String[] args) throws IOException {

        String outputPath = "src/main/java/home_work_16/package_3/output.txt";
        String inputPath = "src/main/java/home_work_16/package_3/The Show Must Go On_queen.txt";

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
