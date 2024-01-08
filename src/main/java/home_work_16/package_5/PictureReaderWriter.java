package home_work_16.package_5;

import java.io.*;

public class PictureReaderWriter {
    public static void main(String[] args) throws IOException {
        String inputPath = "src/main/java/home_work_16/package_5/tropical-jungles.png";
        String outputPath = "src/main/java/home_work_16/package_5/tropical-jungles-copy_shallow-stream.png";

        try (InputStream inputStream = new FileInputStream(inputPath);
             OutputStream outputStream = new FileOutputStream(outputPath)) {
            int data;
            while ((data = inputStream.read()) != -1) {
                System.out.println((char) data);
                outputStream.write(data);
            }
            outputStream.flush();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}

