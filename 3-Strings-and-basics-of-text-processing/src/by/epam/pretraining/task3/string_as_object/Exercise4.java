package by.epam.pretraining.task3.string_as_object;

/**
 * С помощью функции копирования и операции конкатенации
 * составить из частей слова “информатика” слово “торт”.
 */

public class Exercise4 {

    public static void run() {
        String informatics = "информатика";
        System.out.println(makeWord(informatics));
    }

    private static String makeWord (String word) {
        String cake = String.valueOf(word.charAt(word.indexOf('т')));
        cake += String.valueOf(word.charAt(word.indexOf('о')));
        cake += String.valueOf(word.charAt(word.indexOf('р')));
        cake += String.valueOf(word.charAt(word.indexOf('т')));
        return cake;
    }
}
