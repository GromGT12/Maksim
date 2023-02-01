package home_work_3;


public class Task1 {

    public static void main(String[] args) {
        float today, total;
        int day;
        total = today = 10;
        for (day = 2; day <= 7; day++) {
            today *= 1.1;
            total += today;
        }
        System.out.println(total);

    }
}



