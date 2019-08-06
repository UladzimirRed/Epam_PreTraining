package by.epam.pretraining.task4.aggregation_and_composition.exercise1;

import java.util.ArrayList;
import java.util.List;

public class Sentence {

    private List<Word> words;

    public Sentence() {
        this.words = new ArrayList<>();
    }

    public List<Word> getWords() {
        return words;
    }

    public void setWords(List<Word> words) {
        this.words = words;
    }

    public boolean addWord(Word word) {
        return words.add(word);
    }

    public boolean removeWord(Word word) {
        return words.remove(word);
    }

    public void printSentence() {
        for (Word word : words) {
            System.out.print(word + " ");
        }
    }
}
