package home_work_13.Task2;

import org.apache.commons.lang3.RandomUtils;

import java.io.IOException;

public class Router {
    private final String networkName;

    public Router(String networkName) {
        this.networkName = networkName;
    }

    public String getNetworkName() {
        return networkName;
    }

    public String connect(String deviceName) {
        System.out.printf("Пробуем подключится к сети..%s", networkName);
        System.out.println();
        String result = "";

        try {
            connectWiFi();
            result = String.format("%s устройство подключенно к сети ", deviceName);
            System.out.println("Получилось");
        } catch (IOException e) {
            System.out.println(e.getMessage());
            result = "Произошла ошибка";
        }
        return result;

    }

    private void connectWiFi() throws IOException {
        if (RandomUtils.nextBoolean()) {
            throw new IOException("Error connection to WiFi");
        }
    }
}












