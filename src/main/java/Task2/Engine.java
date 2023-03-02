package Task2;

public class Engine {
    private boolean action;
    public void SilnikOn() {
        if (action) {
            System.out.println("Silnik uruchomić"); //тут я использовал польский легче понимается. Двигатель запустить
        } else {
        }
        this.action = true;
    }
    public void SilnikOff() {
        if (action) {
            this.action = false;
            System.out.println("Silnik zgasic"); // тут двигатель заглушить
        } else {
        }
    }
    public boolean isAction() {
        return action;
    }
}








