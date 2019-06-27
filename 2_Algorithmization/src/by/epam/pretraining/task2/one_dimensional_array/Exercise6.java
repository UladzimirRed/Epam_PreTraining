package by.epam.pretraining.task2.one_dimensional_array;

/*
 * Задана последовательность N вещественных чисел.
 * Вычислить сумму чисел, порядковые номера которых являются простыми числами.
 */

import java.util.Random;

public class Exercise6 {

    public static void run() {
        int arraySize = 10;
        int[] array = new int[arraySize];

        initialize(array, 10);
        print(array);

        System.out.println("\n" + "Sum of numbers whose index is prime: " + findSumOfPrimeNumbers(array));
    }

    private static void initialize(int[] array, int range) {
        Random random = new Random(range);
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(range);
        }
    }

    private static void print(int[] array) {
        System.out.print("Array is: ");
        for (int x : array) {
            System.out.print(x + " ");
        }
    }

    private static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return number != 1;
    }

    private static int findSumOfPrimeNumbers(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {

            if (isPrime(i)) {
                sum += array[i];
            }
        }
        return sum;
    }
}
