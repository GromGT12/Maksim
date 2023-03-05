package Task4;

import org.apache.commons.lang3.StringUtils;

public class Application {
    public static void main(String[] args) {
        boolean notBlank = StringUtils.isNotBlank("");
        String reverse = StringUtils.reverse("tod dot");

        System.out.println(reverse);
    }
}
