package by_practice.Date;

import java.util.Date;

public class ExampleDate {
    public static void main(String[] args) throws InterruptedException {

        Date currentTime = new Date();
        Thread.sleep(3000);
        Date newTime = new Date();
        long msDelay = newTime.getTime() - currentTime.getTime();
        System.out.println("Time distance is - " + msDelay + " in ms");
    }

    public class DateVer2 {
        public static void main(String[] args) throws Exception {
            Date startTime = new Date();

            long endTime = startTime.getTime() + 5000;   //    +5 second
            Date endDate = new Date(endTime);

            Thread.sleep(3000);              // waiting 3 second

            Date currentTime = new Date();
            if (currentTime.after(endDate))//checking the time currentTime after endDate
            {
                System.out.println("End time!");
            }
        }
    }
}
