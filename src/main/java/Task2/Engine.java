package Task2;

public class Engine {
    private boolean action;
    public void SilnikOn() {
        if (action) {
            System.out.println("Silnik uruchomić");
        } else {
        }
        this.action = true;
    }
    public void SilnikOff() {
        if (action) {
            this.action = false;
            System.out.println("Silnic zgasic");
        } else {
        }
    }
    public boolean isAction() {
        return action;
    }
}








