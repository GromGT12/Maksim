package home_work_16.package_2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStream {
    public static void main(String[] args) {
        String path = "src/main/java/home_work_16/package_3/output.txt";
        File file = new File(path);

        try(java.io.OutputStream outputStream = new FileOutputStream(file)) {
            outputStream.write("Hello Maks".getBytes());
            outputStream.flush();

        }catch (IOException exception) {
            exception.printStackTrace();
        }


    }
}
