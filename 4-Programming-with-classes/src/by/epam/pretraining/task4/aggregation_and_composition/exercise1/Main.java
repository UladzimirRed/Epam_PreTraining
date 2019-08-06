package by.epam.pretraining.task4.aggregation_and_composition.exercise1;

/**
 * Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на консоль
 * текст, заголовок текста.
 */

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Word word1 = new Word("\nFor");
        Word word2 = new Word("sale:");

        Sentence header = new Sentence();

        header.addWord(word1);
        header.addWord(word2);

        Text text = new Text(header);

        Word word3 = new Word("Baby");
        Word word4 = new Word("shoes.");
        Word word5 = new Word("Never");
        Word word6 = new Word("worn.");
        Word word7 = new Word("Hemingway");

        Sentence sentence2 = new Sentence();

        sentence2.addWord(word3);
        sentence2.addWord(word4);
        sentence2.addWord(word5);
        sentence2.addWord(word6);
        sentence2.addWord(word7);

        text.addSentence(sentence2);

        text.printText();

        sentence2.removeWord(word7);

        text.printText();

        text.removeSentence(sentence2);

        text.printText();

        text.getHeader().printSentence();
    }
}
