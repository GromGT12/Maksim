package by_practice.Algorithmic_problems;

public class KMP {
    public static int[] computeLPSArray(String pattern) {
        int M = pattern.length();
        int[] lps = new int[M];
        int length = 0; // длина предыдущего совпадающего префикса
        int i = 1;
        lps[0] = 0; // lps[0] всегда 0

        // Строим массив LPS
        while (i < M) {
            if (pattern.charAt(i) == pattern.charAt(length)) {
                length++;
                lps[i] = length;
                i++;
            } else {
                if (length != 0) {
                    // Используем предыдущий результат
                    length = lps[length - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }

    public static int KMPSearch(String text, String pattern) {
        int N = text.length();
        int M = pattern.length();
        int[] lps = computeLPSArray(pattern);
        int i = 0; // индекс в text
        int j = 0; // индекс в pattern

        while (i < N) {
            if (pattern.charAt(j) == text.charAt(i)) {
                i++;
                j++;
            }

            if (j == M) {
                return i - j; // нашли подстроку
            } else if (i < N && pattern.charAt(j) != text.charAt(i)) {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }
        return -1; // подстрока не найдена
    }

    public static void main(String[] args) {
        String text = "abxabcabcaby";
        String pattern = "abcaby";
        int index = KMPSearch(text, pattern);
        System.out.println("Подстрока найдена на позиции: " + index);
    }
}
