package by.epam.pretraining.task3.string_as_object;

/**
 * Из заданной строки получить новую, повторив каждый символ дважды
 */

public class Exercise6 {

    public static void run() {
        String sentence = "That is one small step for a man, one giant leap for mankind.";
        System.out.println(repeatCaracter(sentence, 2));

    }

    private static String repeatCaracter(String line, int numberOfRepetitions) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < line.length(); i++) {
            for (int j = 0; j < numberOfRepetitions; j++) {
                stringBuilder.append(line.charAt(i));
            }
        }
        return stringBuilder.toString();
    }
}
