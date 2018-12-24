package lesson16;

import java.util.Arrays;

public class Exercise2Test {
    public static void main(String[] args) {String[] m = "abc abcde abcdef a a a a a a  words abc a abc g".split(" ");
        Arrays.sort(m);

        String maxWord = "", word = "";
        int maxCount = 0, count = 1;

        for (String s : m) {
            if (s.equals(word)) {
                count++;
            } else {
                if (count > maxCount) {
                    maxCount = count;
                    maxWord = word;
                }
                word = s;
                count = 1;
            }
        }

        if (count > maxCount) {
            maxCount = count;
            maxWord = word;
        }

        System.out.println("Самое повторяющееся слово: " + maxWord + " (встречается " + maxCount + " раз)");
}
}



