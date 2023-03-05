package home_work_11.Task4;

import org.apache.commons.lang3.StringUtils;

public class Application {
    public static void main(String[] args) {
        String reverse = StringUtils.reverse("tod dot");
        System.out.println(reverse.equals(new StringBuilder(reverse).reverse().toString()));
    }
}