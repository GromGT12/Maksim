package Task3;

class StringPalindrome {
    public static void main(String[] args) {
        String h = "anna";
        System.out.println(isPalindrome(h) ? "Yes" : "No");
    }

    private static boolean isPalindrome(String h) {
        if (h.length() == 1 || h.length() == 0)
            return true;

        if (h.charAt(0) == h.charAt(h.length() - 1))
            return isPalindrome(h.substring(1, h.length() - 1));
        return false;
    }
}


