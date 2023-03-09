package home_work_12.Task3;

class StringPalindrome {
    public static void main(String[] args) {
        String h = "anioina";
        System.out.println(isPalindrome(h) ? "Yes" : "No");

        String pavel = "Pavel";
        System.out.println(pavel.substring(1, 4));

    }

    private static boolean isPalindrome(String word) {
        if (word.length() == 1 || word.length() == 0) {
            return true;
        }
        if (word.charAt(0) == word.charAt(word.length() - 1)) {
            return isPalindrome(word.substring(1, word.length() - 1));
        }
        return false;
    }
}


