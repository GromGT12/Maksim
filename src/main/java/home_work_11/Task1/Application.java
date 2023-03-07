package home_work_11.Task1;

public class Application {
    public static void main(String[] args) {
        RotaryPhone rotaryPhone = new RotaryPhone("Retro:");
        rotaryPhone.makeCall();
        rotaryPhone.recieveCall();
        System.out.println();

        MobilePhone mobilePhone = new MobilePhone("Nokia 3310:");
        mobilePhone.makeCall();
        mobilePhone.recieveCall();
        System.out.println();

        RadioPhone radioPhone = new RadioPhone("Philips SE 150:");
        radioPhone.makeCall();
        radioPhone.recieveCall();
        System.out.println();

        SmartPhone smartPhone = new SmartPhone("iphone SE 2020:");
        smartPhone.makeCall();
        smartPhone.recieveCall();
        int screen = smartPhone.getScreen();

        Phone[] phones = new Phone[]{rotaryPhone, mobilePhone, radioPhone, smartPhone};

        System.out.println("----------------------------------------------------------");
        for (Phone phone : phones) {
            phone.makeCall();
            phone.recieveCall();
        }

    }
}





