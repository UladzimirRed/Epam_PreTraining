package by.epam.pretraining.task3.regular_expression;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * Создать приложение, разбирающее текст (текст хранится в строке) и позволяющее
 * выполнять с текстом три различных операции: отсортировать абзацы по количеству
 * предложений; в каждом предложении отсортировать слова по длине; отсортировать
 * лексемы в предложении по убыванию количества вхождений заданного символа,
 * а в случае равенства – по алфавиту.
 */

public class Exercise1 {

    public static void run() throws IOException {
        String text = "Стоишь на берегу. И чувствуешь соленый запах ветра, что веет с моря! И веришь, что свободен ты и жизнь лишь началась.\n" +
                "И губы жжёт подруги поцелуй пропитанный слезой...\n" +
                "На небесах только и говорят, что о море. Как оно бесконечно прекрасно.\n" +
                "О закате который они видели.\n" +
                "О том как солнце погружаясь в волны стало алым как кровь. И почуствовали что море впитало энергию светила в себя. И солнце было укрощено. И огонь уже догорал в глубине...\n";

        performOperationsOnText(text);
    }

    private static void performOperationsOnText(String text) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String start = "- введите \"1\" для сортировки абзацев по возрастаню количества предложений; \n" +
                "- введите \"2\" для сортировки в каждом предложении слов по длине;\n" +
                "- введите \"3\" для сортировки лексем в предложениях по убыванию количества \n" +
                "  вхождений заданного символа, а в случае равенства - по алфавиту.\n" +
                "Для завершения работы приложения введите \"выход\"\n";
        String choice = "";
        System.out.println(start);
        while (!choice.equalsIgnoreCase("выход")) {
            System.out.println("Сделайте Ваш выбор: ");
            choice = reader.readLine();
            switch (choice) {
                case "1":
                    sortParagraphs(text);
                    break;
                case "2":
                    sortWords(text);
                    break;
                case "3":
                    sortLexemes(text);
                    break;
                case "выход":
                    System.out.println("\nЗавершение работы.");
                    break;
                default:
                    System.out.println("Неверная команда. Повторите попытку.\n");
            }

        }
    }

    private static void sortParagraphs(String text) {
        String[] paragraphs = text.split("\n");
        int[] counterSentences = new int[paragraphs.length];
        int maxLengthParagraph = 0;
        for (int i = 0; i < paragraphs.length; i++) {
            String[] sentences = splitSentences(paragraphs[i]);
            counterSentences[i] = sentences.length;
            if (maxLengthParagraph < sentences.length) {
                maxLengthParagraph = sentences.length;
            }
        }

        for (int i = 1; i < maxLengthParagraph; i++) {
            for (int j = 0; j < counterSentences.length; j++) {
                if (i == counterSentences[j]) {
                    System.out.println(paragraphs[j]);
                }
            }
        }
        System.out.println();
    }

    private static String[] splitSentences(String text) {
        Pattern pattern = Pattern.compile("\\.*[.!?]\\s*");
        return pattern.split(text);
    }

    private static void sortWords(String text) {
        String[] paragraphs = text.split("\n");
        for (String paragraph : paragraphs) {
            String[] setences = splitSentences(paragraph);
            for (String sentence : setences) {
                String[] words = splitWords(sentence);

                for (int i = words.length - 1; i >= 0; i--) {
                    for (int j = 0; j < i; j++) {
                        if (words[j].length() > words[j + 1].length()) {
                            String temp = words[j];
                            words[j] = words[j + 1];
                            words[j + 1] = temp;
                        }
                    }
                }

                for (String word : words) {
                    System.out.print(word + " ");
                }
                System.out.print("\b. ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static String[] splitWords(String sentence) {
        Pattern pattern = Pattern.compile("\\s*(\\s|,|;|:)\\s*");
        return pattern.split(sentence);
    }

    private static void sortLexemes(String text) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите символ для сортировки лексем по убыванию: ");
        String letter = bufferedReader.readLine();
        String[] paragraphs = text.split("\n");
        for (String paragraph : paragraphs) {
            String[] sentences = splitSentences(paragraph);
            for (String sentence : sentences) {
                String[] words = splitWords(sentence);

                for (int i = words.length - 1; i >= 0; i--) {
                    for (int j = 0; j < i; j++) {
                        int countRight = 0;
                        int countLeft = 0;
                        for (int k = 0; k < words[j].length(); k++) {
                            if (String.valueOf(words[j].charAt(k)).compareToIgnoreCase(letter) == 0) {
                                countLeft++;
                            }
                        }
                        for (int m = 0; m < words[j + 1].length(); m++) {
                            if (String.valueOf(words[j + 1].charAt(m)).compareToIgnoreCase(letter) == 0) {
                                countRight++;
                            }
                        }
                        if (countLeft > countRight) {
                            String temp = words[j];
                            words[j] = words[j + 1];
                            words[j + 1] = temp;
                        } else if (countLeft == countRight) {
                            String[] forCompare = {words[j], words[j + 1]};
                            Arrays.sort(forCompare);
                            words[j] = forCompare[0];
                            words[j + 1] = forCompare[1];
                        }
                    }
                }

                for (String word : words) {
                    System.out.print(word + " ");
                }
                System.out.print("\b. ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
