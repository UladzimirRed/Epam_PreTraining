package by.epam.pretraining.task3.string_as_array_of_characters;

/**
 * Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов
 * заменить на одиночные пробелы. Крайние пробелы в строке удалить.
 */

public class Exercise5 {

    public static void run() {
        String sentence = "  You can accurately predict when   Mars   will appear in the sky. \n" +
                "(even for a hundred    years) but  it’s  not  possible  to  predict \n" +
                "what    will  happen to you in  two minutes.    ";

        System.out.println(removeExtraSpaces(sentence));
    }

    private static String removeExtraSpaces(String line) {
        StringBuilder stringBuilder = new StringBuilder();
        String s = line.trim();
        boolean isSpace = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                if (!isSpace) {
                    stringBuilder.append(" ");
                }
                isSpace = true;
            } else {
                stringBuilder.append(s.charAt(i));
                isSpace = false;
            }
        }
        return stringBuilder.toString();
    }

}
