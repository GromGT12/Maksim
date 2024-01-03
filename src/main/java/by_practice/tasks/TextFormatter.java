package by_practice.tasks;

import java.util.ArrayList;
import java.util.List;

public class TextFormatter {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        int left = 0;

        while (left < words.length) {
            int right = left;
            int lineLength = 0;


            while (right < words.length && lineLength + words[right].length() + right - left <= maxWidth) {
                lineLength += words[right].length();
                right++;
            }

            int numberOfWords = right - left;
            int numberOfSpaces = maxWidth - lineLength;
            StringBuilder line = new StringBuilder();

            if (right == words.length || numberOfWords == 1) {
                line.append(leftJustify(words, left, right, maxWidth));
            } else {
                line.append(justify(words, left, right, numberOfWords, numberOfSpaces));
            }

            result.add(line.toString());
            left = right;
        }

        return result;
    }

    private String leftJustify(String[] words, int left, int right, int maxWidth) {
        StringBuilder line = new StringBuilder();
        for (int i = left; i < right; i++) {
            line.append(words[i]);
            if (i < right - 1) {
                line.append(" ");
            }
        }
        while (line.length() < maxWidth) {
            line.append(" ");
        }
        return line.toString();
    }

    private String justify(String[] words, int left, int right, int numberOfWords, int numberOfSpaces) {
        int spacesBetweenWords = numberOfSpaces / (numberOfWords - 1);
        int extraSpaces = numberOfSpaces % (numberOfWords - 1);
        StringBuilder line = new StringBuilder();

        for (int i = left; i < right; i++) {
            line.append(words[i]);

            if (i < right - 1) {
                line.append(" ".repeat(Math.max(0, spacesBetweenWords)));

                if (extraSpaces > 0) {
                    line.append(" ");
                    extraSpaces--;
                }
            }
        }

        return line.toString();
    }

    public void main(String[] args) {
        TextFormatter formatter = new TextFormatter();
        String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
        int maxWidth = 16;
        List<String> formattedText = formatter.fullJustify(words, maxWidth);
        for (String line : formattedText) {
            System.out.println(line);
        }
    }
}
