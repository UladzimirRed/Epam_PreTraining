package by.epam.pretraining.task3.string_as_object;

/**
 *  Подсчитать, сколько раз среди символов заданной строки встречается буква “а”
 */

public class Exercise5 {

    public static void run() {
        String text = "That's one small step for a man, one giant leap for mankind.";
        System.out.println("Number of characters 'a': " + countCharacter(text, 'a'));
    }

    private static int countCharacter(String line, char ch) {
        int counter = 0;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == ch) {
                counter++;
            }
        }
        return counter;
    }
}
