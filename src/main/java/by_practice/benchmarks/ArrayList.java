package by_practice.benchmarks;

import java.util.ArrayList;

class ArrayListExample {
    private ArrayList<Node> list = new ArrayList<>();

    public void insertInMiddle(String key, int value) {
        Node newNode = new Node(key, value);
        int middle = Math.min(list.size() / 2, 50000);
        ArrayList<Node> tempList = new ArrayList<>();

        for (int i = 0; i < middle; i++) {
            tempList.add(list.get(i));
        }

        tempList.add(newNode);

        for (int i = middle; i < list.size(); i++) {
            tempList.add(list.get(i));
        }

        list = tempList;
    }

    public void deleteFromMiddle(String key) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).key.equals(key)) {
                list.remove(i);
                break;
            }
        }
    }

    public void runBenchmark() {
        long startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            insertInMiddle("key" + i, i);
        }
        long endTime = System.nanoTime();
        System.out.println("ArrayList Insert Time: " + (endTime - startTime) / 1e6 + " ms");

        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            deleteFromMiddle("key" + i);
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList Delete Time: " + (endTime - startTime) / 1e6 + " ms");
    }

    public static void main(String[] args) {
        ArrayListExample arrayListExample = new ArrayListExample();
        arrayListExample.runBenchmark();
    }
}
