package home_work_9;

import home_work_9.Task2.Tare;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        Tare tare = new Tare("Cola cola", Material.PLASTIC);
        Tare tare1 = new Tare("Energy drink", Material.ALUMINIUM);
        Tare tare2 = new Tare("Vodka", Material.GLASS);
        Tare tare3 = new Tare("Coca cola", Material.PLASTIC);
        Tare tare4 = new Tare("Energy drink", Material.ALUMINIUM);
        Tare tare5 = new Tare("Vodka", Material.GLASS);

        Tare[] tares = new Tare[] {tare, tare1, tare2, tare3, tare4,tare5};
        TaroMat taroMat = new TaroMat();
        taroMat.printCheck(tares);


    }
}
