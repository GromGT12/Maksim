package home_work_11.Task4;

import org.apache.commons.lang3.StringUtils;

public class Application {
    public static void main(String[] args) {
        String reverse = StringUtils.reverse("tod dot");
        // тут можно было не использовать StrinBuilder
        // 1 шаг - объявляешь переменную String toChenck = "tod dot"
        // 2 шаг - создаешь вторую переменную String reversed = StringUtils.reverse(toCheck)
        // 3 шаг - сравниваешь строки
        System.out.println(reverse.equals(new StringBuilder(reverse).reverse().toString()));
    }
}
