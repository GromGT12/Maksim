package home_work_7;

import java.util.Arrays;

public class ArraysForCar {

    public static void main(String[] args) {
        Car[] Audi = new Car[2];

        Audi[0] = new Car("Audi", "A6", 4);
        Audi[1] = new Car("Audi", "A8", 4);

        for (int i = 0; i < 2; i++) {
                System.out.println(Audi[i]);

                System.out.println(Arrays.toString(Audi));
            }
        }
    }

