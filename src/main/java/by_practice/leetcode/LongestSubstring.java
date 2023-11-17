package by_practice.leetcode;

public class LongestSubstring {
    public int lengthOfLongestSubstring(String string) {
        int count = 0;
        int[] symbols = new int[256];
        int i = 0;

        for (int j = 0; j < string.length(); j++) {
            i = Math.max(i, symbols[string.charAt(j)]);
            count = Math.max(count, j - i + 1);
            symbols[string.charAt(j)] = j + 1;
        }
        return count;
    }

    public static void main(String[] args) {
        LongestSubstring longestSubstring = new LongestSubstring();
        String input = "abcabcbb";
        int result = longestSubstring.lengthOfLongestSubstring(input);
        System.out.println("Длина наибольшей подстроки: " + result);
    }
}

