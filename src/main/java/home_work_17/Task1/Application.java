package home_work_17.Task1;

import java.io.*;

public class Application {
    public static void main(String[] args) {
        Motorcycle motorcycle = new Motorcycle();

        motorcycle.setBrand("Honda");
        motorcycle.setModel("CBR1000");
        motorcycle.setEngineVolume(1000);
        motorcycle.setCondition("Purchased of the Salon");

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("src/main/java/home_work_17/Task2/Honda"))) {
            objectOutputStream.writeObject(motorcycle);
        } catch (IOException e) {
            e.printStackTrace();

        }
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("src/main/java/home_work_17/Task2/Honda"))) {
            Motorcycle honda = (Motorcycle) objectInputStream.readObject();
            System.out.println(honda);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
