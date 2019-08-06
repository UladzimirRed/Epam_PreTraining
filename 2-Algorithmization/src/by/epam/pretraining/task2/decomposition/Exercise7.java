package by.epam.pretraining.task2.decomposition;

/**
 * Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел
 * от 1 до 9.
 */

public class Exercise7 {

    private static int[] numbers = {1, 3, 5, 7, 9};
    private static int amountOfFactorial;

    public static void run() {
        printArray(numbers);
        amountOfFactorial = findAmountOfFactorial(numbers);
        System.out.println("\nAmount of factorials is: " + amountOfFactorial);
    }

    private static int findAmountOfFactorial(int[] numbers) {
        int amount = 0;
        for (int element : numbers) {
            amount += findFactorial(element);
        }
        return amount;
    }

    private static int findFactorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    private static void printArray(int[] array) {
        System.out.print("Numbers is: ");
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}
