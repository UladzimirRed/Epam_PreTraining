package by.epam.pretraining.task2.decomposition;

/**
 * Натуральное число, в записи которого n цифр, называется числом Армстронга,
 * если сумма его цифр, возведенная в степень n, равна самому числу. Найти все
 * числа Армстронга от 1 до k. Для решения задачи использовать декомпозицию.
 */

public class Exercise14 {

    private static int k = 100_000_000;

    public static void run(){
        printArmstrongNumbers(k);
    }

    private static void printArmstrongNumbers (int k) {
        for (int i = 1; i <= k; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }

    private static boolean isArmstrong(int number) {
        int sum = 0;
        int [] array = new int[lengthNumber(number)];
        int n = number;
        for (int i = array.length; i > 0; i--) {
            array[i - 1] = n - (n / 10) * 10;
            n /= 10;
        }
        for (int element : array) {
            int inDegree = element;
            for (int j = 1; j < array.length; j++) {
                inDegree *= element;
            }
            sum += inDegree;
        }

        return number == sum;
    }

    private static int lengthNumber (int n) {
        int length = 0;
        while (n >= 1) {
            length++;
            n /= 10;
        }
        return length;
    }
}
