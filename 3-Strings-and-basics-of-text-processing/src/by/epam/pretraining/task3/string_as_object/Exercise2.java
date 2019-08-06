package by.epam.pretraining.task3.string_as_object;


/**
 *  В строке вставить после каждого символа 'a' символ 'b'
 */

public class Exercise2 {

    public static void run() {
        String sentence = "Solid sunny days hit the desert.";
        System.out.println(addSymbol(sentence));
    }

    private static String addSymbol(String line) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == 'a') {
                stringBuilder.append("ab");
            } else {
                stringBuilder.append(line.charAt(i));
            }
        }
        return stringBuilder.toString();
    }
}
