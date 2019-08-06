package by.epam.pretraining.task3.string_as_object;

/**
 *  Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise1 {

    public static void run() {
        String text = "Physics reveals the unknown in nature, and music in the human soul.    Albert  Einstein";
        System.out.println("Maximum number of spaces per line: " + findMoreSpaces(text));
    }

    private static int findMoreSpaces(String line) {
        int counter = 0;
        StringBuilder stringBuilder = new StringBuilder(new String(line));
        Pattern pattern = Pattern.compile("\\s+");
        Matcher matcher = pattern.matcher(stringBuilder);
        while (matcher.find()) {
            String s = matcher.group();
            int length = s.length();
            if (length > counter) {
                counter = length;
            }
        }
        return counter;
    }


}
