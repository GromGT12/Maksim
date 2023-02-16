package home_work_7;

public class ArraysForDoors {

    public static void main(String[] args) {
        Car[] audis = new Car[5];
        audis[0] = new Car("Audi", "A6", 4);
        audis[1] = new Car("Audi", "A8", 6);
        audis[2] = new Car("Audi", "R8", 3);
        audis[3] = new Car("Audi", "Q5", 4);
        audis[4] = new Car("Audi", "Q7", 4);
        for (int i = 0; i < audis.length; i++) {
            Car audi = audis[i];
            System.out.println(audi);
            for (int j = 1; j <= audi.getNumberOfDoors(); j++) {
                System.out.println("Дверь " + j + " открыта" );
            }
        }
    }
}


