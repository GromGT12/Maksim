package home_work_18.Task6;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

class RemovingBeginning {
    public static void main(String[] args) {
        getTimeMsOfInsert(new ArrayList());
        getTimeMsOfInsert(new LinkedList());
    }
    public static void getTimeMsOfInsert(List list) {
        Date currentTime = new Date();
        insert100_000(list);
        Date newTime = new Date();
        long msDelay = newTime.getTime() - currentTime.getTime();
        System.out.println("Результат в миллисекундах: " + msDelay);

    }
    public static void insert100_000(List list) {
        for (int i = 0; i < 100_000; i++) {
            list.add(0, new Object());
        }
    }

}