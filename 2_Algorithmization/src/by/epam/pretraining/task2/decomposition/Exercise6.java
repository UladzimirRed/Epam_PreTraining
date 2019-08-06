package by.epam.pretraining.task2.decomposition;

/**
 * Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
 */

public class Exercise6 {

    private static int[] array = {12, 21, 19};
//    private static int[] array = {5, 10, 25};

    public static void run() {
        printArray(array);
        System.out.println("\nAre these three numbers mutually simple? " + isMutually(array));
    }

    private static int findGreatestCommonDivisor(int[] array) {
        int firstNumber = Math.abs(array[0]);
        for (int element : array) {
            int secondNumber = Math.abs(element);
            while (firstNumber != 0 && secondNumber != 0) {
                if (firstNumber > secondNumber) {
                    firstNumber %= secondNumber;
                } else {
                    secondNumber %= firstNumber;
                }
            }
            firstNumber += secondNumber;
        }
        return firstNumber;
    }

    private static boolean isMutually(int[] array) {
        return findGreatestCommonDivisor(array) == 1;
    }

    private static void printArray(int[] array) {
        System.out.print("Numbers is: ");
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}
