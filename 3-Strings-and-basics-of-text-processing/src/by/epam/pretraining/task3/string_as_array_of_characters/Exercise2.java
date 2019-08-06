package by.epam.pretraining.task3.string_as_array_of_characters;

/**
 * Замените в строке все вхождения 'word' на 'letter'
 */

public class Exercise2 {

    private static String defaultLine = "Good word and homeless rich";
    private static String modifiedLine;

    public static void run() {
        modifiedLine = changeWordToLetter(defaultLine);
        System.out.println("Default string is: " + defaultLine);
        System.out.println("Modified string is: " + modifiedLine);
    }

    private static String changeWordToLetter(String defaultLine) {
        StringBuilder stringBuilder = new StringBuilder();
        String letter;
        for (int i = 0; i < defaultLine.length(); i++) {
            if (i + 3 < defaultLine.length() && defaultLine.charAt(i) == 'w'
                                       && defaultLine.charAt(i + 1) == 'o'
                                       && defaultLine.charAt(i + 2) == 'r'
                                       && defaultLine.charAt(i + 3) == 'd') {
                stringBuilder.append("letter");
                i += 3;
            } else {
                stringBuilder.append(defaultLine.charAt(i));
            }
        }
        letter = stringBuilder.toString();
        return letter;
    }
}
