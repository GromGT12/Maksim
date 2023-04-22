package home_work_23.Package1;

public class Application {
    public static void main(String[] args) {
        MyAnnotationValidator validator = new MyAnnotationValidator();

        AccountInformation accountInformation = new AccountInformation("Dmitriy", "Pupkin", "11Pupkin@ma.com", "322987322");

        try {
            validator.validate(accountInformation);
        } catch (PingwitValidationException e) {
            System.out.println(e.getMessage());
        }
        // попробуйте протестировать работу валидатора на нескольких кейсах: в данном случае я сделал валидный имэйл, и получил ClassCastException
        // поле с номером телефона нужно сделать не int, а String
        System.out.println(accountInformation);
    }
}
