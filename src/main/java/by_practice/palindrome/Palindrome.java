package by_practice.palindrome;

public class Palindrome {
    public boolean isPalindrome(String string) {
        string = string.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return string.equals(new StringBuilder(string).reverse().toString());
    }

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();

        String testString1 = "A man, a plan, a canal, Panama";
        String testString2 = "racecar";
        String testString3 = "Madam, in Eden, I'm Adam";

        System.out.println("Is \"" + testString1 + "\" a palindrome? " + palindrome.isPalindrome(testString1));
        System.out.println("Is \"" + testString2 + "\" a palindrome? " + palindrome.isPalindrome(testString2));
        System.out.println("Is \"" + testString3 + "\" a palindrome? " + palindrome.isPalindrome(testString3));
    }
}
