package home_work_16.package_5;

import java.io.*;
public class PictureBufferedReader {
    public static void main(String[] args) throws IOException {
        String outputPath = "src/main/java/home_work_16/package_5/tropical-jungles.png";
        String inputPath = "src/main/java/home_work_16/package_5/tropical-jungles-copy.png";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(inputPath));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputPath))) {
            {
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    System.out.println(line);
                    bufferedWriter.write(line);
                    bufferedWriter.write("\n");
                    bufferedWriter.flush();
                }
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
