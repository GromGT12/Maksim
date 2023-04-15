package home_work_22.Task2;

//В классе Application создайте несколько объектов этого generic-класса - чтобы они хранили Integer, Long, Double
public class ServiceArrayNumber {
    public static void main(String[] args) {

        ArraysNumberGeneric<Integer> integerArraysNumberGeneric = ArraysNumberGeneric.newInstance(123);
        ArraysNumberGeneric<Double> doubleArraysNumberGeneric = ArraysNumberGeneric.newInstance(90.4);
        ArraysNumberGeneric<Long> longArraysNumberGeneric = ArraysNumberGeneric.newInstance(10000000L);

    }
}



