package home_work_8;


public class Task2 {

    // решение хорошее, но класс Palimdrome не нужно было создавать внутри другого класса
    class Palindrome {
        static boolean isPalindrome(String word) {
            int length = word.length();
            for (int i = 0; i < (length / 2); i++) {
                if (word.charAt(i) != word.charAt(length - i - 1)) {
                    return false;
                }
            }
            return true;
        }
    }
}


