package by.epam.pretraining.task3.string_as_object;

/**
 * Строка Х состоит из нескольких предложений, каждое из которых
 * кончается точкой,восклицательным или вопросительным знаком.
 * Определить количество предложений в строке Х.
 */

public class Exercise10 {

    public static void run() {
        String text = "Lisa! said Kyle. I need help moving this box of toys for the garage sale. Will you help me? ";
        System.out.println("Number of sentences in the text: " + countSentences(text));
    }

    private static int countSentences(String line){
        int counter = 0;
        char[] marks = {'.', '!', '?'};
        for (int i = 0; i < line.length() - 1; i++){
            char ch = line.charAt(i);
            for (char mark : marks){
                if (ch == mark && (line.charAt(i + 1) == ' ')){
                    counter++;
                }
            }
        }
        return counter;
    }
}
