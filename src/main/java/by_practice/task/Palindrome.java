package by_practice.task;

public class Palindrome {
    public static boolean isPalindrome(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase();
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String testStr = "А роза упала на лапу Азора";
        boolean result = isPalindrome(testStr);
        System.out.println("Палиндром: " + result);
    }
}