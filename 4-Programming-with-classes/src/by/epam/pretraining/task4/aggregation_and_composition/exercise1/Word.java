package by.epam.pretraining.task4.aggregation_and_composition.exercise1;

public class Word {
    private String content;

    public Word(String content) {
        this.content = content;
    }
    public String getContent() {
        return content;
    }
    @Override
    public String toString() {
        return content;
    }
}
