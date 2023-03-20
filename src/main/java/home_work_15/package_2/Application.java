package home_work_15.package_2;

import java.io.File;

public class Application {
    public static void main(String[] args) {
        String path = "src/main/java/home_work_15/package_1/example.txt";

        File file = new File(path);

        String path3 = "src/main/java/home_work_15/package_1";
        String path2 = "src/main/java/home_work_15/package_2/";

        File file1 = new File(path3);
        File file2 = new File(path2);

        System.out.println(file1.isDirectory());
        System.out.println(file2.isDirectory());
    }
}
