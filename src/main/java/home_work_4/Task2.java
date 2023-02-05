package home_work_4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int engineCapacity = 1600;
        boolean crush = true;
        boolean clientsVip = true;
        double tariff = 0.25;


        System.out.println("Ввести объем двигателя");

        double capacity = scanner.nextDouble();
        System.out.println("Промежуточный результат");
        double result = engineCapacity * tariff;
        System.out.println(result);

        if (crush = true) {
            System.out.println("Если было дтп тогда: надбавка 20%");
            double result1 = result * 1.2;
            System.out.println(result1);
            System.out.println("Если дтп не было");
        } else if (crush = false) {
            System.out.println(result);
            System.out.println("Если клиент постоянный: скидка 20%");
            if(clientsVip = true) {
                double result2 = result * 1.2 * 0.8;
                System.out.println(result2);
                System.out.println("Цена без скидки");
            }else if (clientsVip = false) {







                }
            }
        }
    }