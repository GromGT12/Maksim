package home_work_11.Task4;

import org.apache.commons.lang3.StringUtils;

public class Application {
    public static void main(String[] args) {
        String toChenk = " tod dot";
        String reverse = StringUtils.reverse(toChenk);
        System.out.println(reverse.equals(toChenk));
    }
}
