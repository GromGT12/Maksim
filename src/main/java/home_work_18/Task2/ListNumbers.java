package home_work_18.Task2;

import java.util.ArrayList;
import java.util.Iterator;

/*
Создайте целочисленный ArrayList. Заполните его 100 элементами,
добавляя каждый новый элемент в начало списка и выведите на экран.
Затем удалите из него все четные элементы. И снова выведите на экран
 */
public class ListNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int elements = 100;
        for (int i = 0; i <= elements; i++) {
            list.add(0, i);
        }
        System.out.println(list);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer nextInteger = iterator.next();
            if (nextInteger % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println(list);
    }
}


