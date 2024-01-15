package by_practice.List;

import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        List arrayList = new java.util.ArrayList();

        arrayList.add("Apple");
        arrayList.add("Банан");
        arrayList.add("Оранжевый");
        arrayList.add("Apple");

        System.out.println("Элементы ArrayList:");
        for (Object fruit : arrayList) {
            System.out.println(fruit);
        }
    }
}

