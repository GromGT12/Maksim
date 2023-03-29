package home_work_18.Task5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RemovalMiddle {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();

        for (int i = 0; i < 100_000; i++) {
            list.add(new Integer(i));
        }

        long start = System.currentTimeMillis();

        for (int i = 0; i < 100_000; i++) {
            list.add(0, new Integer(Integer.MAX_VALUE));
            list.remove(i);
        }
        System.out.println("Время работы для LinkedList (в милисекундах) = " + (System.currentTimeMillis() - start));


        List<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < 100_000; i++) {
            list2.add(new Integer(i));
        }

        long start2 = System.currentTimeMillis();

        for (int i = 0; i < 100_000; i++) {
            list2.add(0, new Integer(Integer.MAX_VALUE));
            list2.remove(i);
        }
        System.out.println("Время работы для ArrayList (в миллисекундах) = " + (System.currentTimeMillis() - start2));
    }
}
