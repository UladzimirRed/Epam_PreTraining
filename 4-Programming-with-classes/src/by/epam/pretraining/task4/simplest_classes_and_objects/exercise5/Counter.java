package by.epam.pretraining.task4.simplest_classes_and_objects.exercise5;

/**
 * Опишите класс, реализующий десятичный счетчик, который может увеличивать или
 * уменьшать свое значение на единицу в заданном диапазоне. Предусмотрите инициа-
 * лизацию счетчика значениями по умолчанию и произвольными значениями. Счетчик
 * имеет методы увеличения и уменьшения состояния, и метод позволяющее получить
 * его текущее состояние. Написать код, демонстрирующий все возможности класса.
 */

public class Counter {

    private int currentValue;
    private int minValue;
    private int maxValue;

    Counter() {
        this.currentValue = 0;
        this.minValue = 0;
        this.maxValue = 100;
    }

    Counter(int currentValue, int minValue, int maxValue) {
        this.currentValue = currentValue;
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    int getCurrentValue() {
        return this.currentValue;
    }

    void increase() {
        currentValue++;
        if (currentValue == maxValue) {
            System.out.println("Upper bound of range");
        } else if (currentValue > maxValue) {
            System.out.println("Invalid exit for the upper limit of the range");
            currentValue--;
        }
    }

    void reduce() {
        currentValue--;
        if (currentValue == maxValue) {
            System.out.println("Lower bound of range");
        } else if (currentValue < minValue) {
            System.out.println("Invalid exit for the lower limit of the range");
            currentValue++;
        }
    }

    public static void main(String[] args) {
        System.out.println("Default test:");
        Counter firstCounter = new Counter();
        System.out.println("The current value of the counter - " + firstCounter.getCurrentValue());
        System.out.print("Reduce counter: ");
        firstCounter.reduce();
        System.out.print("Increase counter by 50: ");
        for (int i = 1; i <= 50; i++) {
            firstCounter.increase();
        }
        System.out.println("The current value of the counter - " + firstCounter.getCurrentValue());
        System.out.print("Increase counter by 1: ");
        firstCounter.increase();
        System.out.println("The current value of the counter - " + firstCounter.getCurrentValue());
        System.out.print("Increase counter by 1: ");
        firstCounter.increase();
        System.out.println("The current value of the counter - " + firstCounter.getCurrentValue());
        System.out.print("\n");

        System.out.println("Test with arbitrary values: ");
        Counter secondCounter = new Counter(10, 5, 15);
        System.out.println("The current value of the counter - " + secondCounter.getCurrentValue());
        System.out.print("Reduce counter: ");
        secondCounter.reduce();
        System.out.println("The current value of the counter - " + secondCounter.getCurrentValue());
        System.out.print("Increase counter by 5: ");
        for (int i = 1; i <= 5; i++) {
            secondCounter.increase();
        }
        System.out.println("The current value of the counter - " + secondCounter.getCurrentValue());
    }
}

