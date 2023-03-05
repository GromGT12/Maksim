package home_work_11.Task1;

public class Application {
    public static void main(String[] args) {
        AbstractPhone abstractPhone = new RotaryPhone("Retro:");
        abstractPhone.makeCall();
        abstractPhone.recieveCall();
        System.out.println();
        AbstractPhone abstractPhone2 = new MobilePhone("Nokia 3310:");
        abstractPhone2.makeCall();
        abstractPhone2.recieveCall();
        System.out.println();
        AbstractPhone abstractPhone3 = new RadioPhone("Philips SE 150:");
        abstractPhone3.makeCall();
        abstractPhone3.recieveCall();
        System.out.println();
        AbstractPhone abstractPhone4 = new SmartPhone("iphone SE 2020:");
        abstractPhone4.makeCall();
        abstractPhone4.recieveCall();
    }
}





