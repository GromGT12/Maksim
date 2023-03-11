package Task2;

import org.apache.commons.lang3.RandomUtils;

import java.io.IOException;
import java.util.Random;

public class Router {
    public String generateReport(String name) throws IOException {
        System.out.println("MobilePhone Nokia подключенно к сети Orange");
        String result = "";
        connectWiFi();
       /* try {

            result = String.format("%s устройство подключенно к сети ", name);
            System.out.println("Получилось");
        }catch (IOException e) {
            System.out.println("Проблема подключения к WiFi");
        }*/
        return result;

    }

    private void connectWiFi() throws IOException {
        try {
            if (RandomUtils.nextBoolean()) {
                throw new IOException("Error connection to WiFi");
            }
        } catch (Exception e) {
        }
    }
}











