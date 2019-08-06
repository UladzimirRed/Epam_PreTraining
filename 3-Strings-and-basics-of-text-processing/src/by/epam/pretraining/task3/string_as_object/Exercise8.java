package by.epam.pretraining.task3.string_as_object;

/**
 * Вводится строка слов, разделенных пробелами. Найти самое длинное слово и
 * вывести его на экран. Случай, когда самых длинных слов может быть несколько,
 * не обрабатывать.
 */

public class Exercise8 {

    public static void run() {
        String sentence = "That's one small step for a man, one giant leap for mankind";
        System.out.println(findLongestWord(sentence));
    }

    private static String findLongestWord(String line) {
        String logestWord = "";
        int maxLength = 0;
        String[] words = line.split(" ");
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > maxLength) {
                maxLength = words[i].length();
                logestWord = words[i];
            }
        }
        return logestWord;
    }
}
