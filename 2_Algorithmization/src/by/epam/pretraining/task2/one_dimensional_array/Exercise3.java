package by.epam.pretraining.task2.one_dimensional_array;

/*
 *  Дан массив действительных чисел, размерность которого N.
 *  Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.
 */

import java.util.Random;

public class Exercise3 {

    public static void run() {
        int n = 10;

        countNumberOfMembers(n);
    }

    private static void countNumberOfMembers(int n) {
        int[] array = new int[n];
        int countOfPositiveNumbers = 0;
        int countOfNegativeNumbers = 0;
        int countOfZeroNumbers = 0;

        Random number = new Random();
        for (int i = 0; i < n; i++) {
            array[i] = number.nextInt();
            System.out.print(array[i] + " ");
            if (array[i] > 0) {
                countOfPositiveNumbers++;
            } else if (array[i] == 0) {
                countOfZeroNumbers++;
            } else {
                countOfNegativeNumbers++;
            }
        }
        System.out.println("\n" + "Number of positive members is: " + countOfPositiveNumbers);
        System.out.println("Number of negative members is: " + countOfNegativeNumbers);
        System.out.println("Number of zero members is: " + countOfZeroNumbers);
    }
}
