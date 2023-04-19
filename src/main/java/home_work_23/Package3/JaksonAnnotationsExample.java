package home_work_23.Package3;

import com.fasterxml.jackson.databind.ObjectMapper;
import home_work_23.Package1.AccountInformation;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class JaksonAnnotationsExample {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();

        AccountInformation accountInformation = new AccountInformation("Andrey", "Petrov", "Petrov@.com", 567876233);

        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src/main/java/home_work_23/Package3/AccountInformation.json"))) {
            byte[] bytes = mapper.writeValueAsBytes(accountInformation);
            bos.write(bytes);
            bos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

