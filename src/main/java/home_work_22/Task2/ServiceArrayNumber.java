package home_work_22.Task2;

//В классе Application создайте несколько объектов этого generic-класса - чтобы они хранили Integer, Long, Double
public class ServiceArrayNumber {
    public static void main(String[] args) {

        // тут нужно было просто создать несколько объектов:
        Integer[] integers = new Integer[10];
        Long[] longs = new Long[10];
        Double[] doubles = new Double[10];

        NumberStorage<Integer> integerNumberStorage = new NumberStorage<>(integers);
        NumberStorage<Long> longNumberStorage = new NumberStorage<>(longs);
        NumberStorage<Double> doubleNumberStorage = new NumberStorage<>(doubles);
    }
}


