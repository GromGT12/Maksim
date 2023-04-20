package home_work_23.Package1;

public class Application {
    public static void main(String[] args) {
        MyAnnotationValidator validator = new MyAnnotationValidator();

        AccountInformation accountInformation = new AccountInformation("Dmitriy", "Pupkin", "Pupkin21@.com", 322987322);
        try {
            validator.validate(accountInformation);
        } catch (PingwitValidationException e) {
            System.out.println(e.getMessage());
        }

        // попробуйте протестировать работу валидатора на нескольких кейсах: в данном случае я сделал валидный имэйл, и получил ClassCastException
        // поле с номером телефона нужно сделать не int, а String
        AccountInformation accountInformation2 = new AccountInformation("Dmitriy", "Pupkin", "pupkin21@popo.com", 322987322);
        validator.validate(accountInformation2);


        System.out.println(accountInformation);
    }
}
