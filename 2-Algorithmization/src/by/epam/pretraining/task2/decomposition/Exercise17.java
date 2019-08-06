package by.epam.pretraining.task2.decomposition;

/**
 * Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его
 * цифр и т.д. Сколько таких действий надо произвести, чтобы получился нуль?
 * Для решения задачи использовать декомпозицию
 */

public class Exercise17 {

    private static int givenNumber = 121;
    private static int numberOfAction;

    public static void run() {
        numberOfAction = countOfAction(givenNumber);
        System.out.println("Given Number is: " + givenNumber);
        System.out.println("Number of action is: " + numberOfAction);
    }

    private static int countOfAction(int givenNumber) {
        int count = 0;
        while (givenNumber > 0) {
            givenNumber -= countAmountOfDigits(givenNumber);
            count++;
        }
        return count;
    }

    private static int countAmountOfDigits(int givenNumber) {
        int amount = 0;
        while (givenNumber > 0) {
            amount += givenNumber % 10;
            givenNumber /= 10;
        }
        return amount;
    }
}
