package by_practice.palindrome;

public class NewVersionPalindrome {
    public static void main(String[] args) {

        String word = "Anna";

        String wordWithoutSpaces = word.replaceAll(" ", "");

        StringBuilder reverseWord = new StringBuilder(wordWithoutSpaces).reverse();

        System.out.println(word.equalsIgnoreCase(reverseWord.toString()));

    }
}
