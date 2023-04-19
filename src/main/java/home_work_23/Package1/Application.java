package home_work_23.Package1;

public class Application {
    public static void main(String[] args) {
        MyAnnotationValidator validator = new MyAnnotationValidator();

        AccountInformation accountInformation = new AccountInformation("Dmitriy", "Pupkin", "Pupkin21@.com", 322987322);
        validator.validate(accountInformation);

        System.out.println(accountInformation);
    }
}
