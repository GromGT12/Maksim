package home_work_15.package_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ScannerClass {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "src/main/java/home_work_15/package_2/example.txt";
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        scanner.nextLine();
        System.out.println(scanner.nextLine());
    }
}
