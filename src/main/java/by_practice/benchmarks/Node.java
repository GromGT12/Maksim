package by_practice.benchmarks;

class Node {
    String key;
    int value;
    Node next;

    public Node(String key, int value) {
        this.key = key;
        this.value = value;
    }
}

class LinkedList {
    private Node head;

    public void insertInMiddle(String key, int value) {
        Node newNode = new Node(key, value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            int count = 0;
            while (current.next != null && count < 50000) {
                current = current.next;
                count++;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public void deleteFromMiddle(String key) {
        if (head == null) {
            return;
        }

        if (head.key.equals(key)) {
            head = head.next;
            return;
        }

        Node current = head;
        Node previous = null;
        while (current != null && !current.key.equals(key)) {
            previous = current;
            current = current.next;
        }

        if (current != null) {
            previous.next = current.next;
        }
    }

    public void runBenchmark() {
        long startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            insertInMiddle("key" + i, i);
        }
        long endTime = System.nanoTime();
        System.out.println("Linked List Insert Time: " + (endTime - startTime) / 1e6 + " ms");

        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            deleteFromMiddle("key" + i);
        }
        endTime = System.nanoTime();
        System.out.println("Linked List Delete Time: " + (endTime - startTime) / 1e6 + " ms");
    }
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.runBenchmark();
    }
}
