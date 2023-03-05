package home_work_10.Task2;

import org.w3c.dom.ls.LSOutput;

public class Engine {
    private boolean started;
    public void silnikOn() {
        if (started) {
            System.out.println("Мотор уже работает"); //тут я использовал польский легче понимается. Двигатель запустить
        } else {
            System.out.println("Заводим мотор");
            this.started = true;
        }

    }
    public void silnikOff() {
        if (started) {
            this.started = false;
            System.out.println("Заглушить мотор"); // тут двигатель заглушить
        } else {
            System.out.println("Мотор уже заглушен");
        }
    }
    public boolean isStarted() {
        return started;
    }
}








