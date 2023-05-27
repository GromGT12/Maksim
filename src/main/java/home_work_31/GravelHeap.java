package home_work_31;

public class GravelHeap {

    private int weight;

    public GravelHeap(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void increase(int amount) {
        weight += amount;
    }

    @Override
    public String toString() {
        return "GravelHeap{" +
                "weight=" + weight +
                '}';
    }
}


