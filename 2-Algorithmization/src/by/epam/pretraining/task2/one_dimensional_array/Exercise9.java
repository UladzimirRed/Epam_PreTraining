package by.epam.pretraining.task2.one_dimensional_array;

/*
 * В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся
 * число. Если таких чисел несколько, то определить наименьшее из них.
 */

import java.util.*;

public class Exercise9 {

    public static void run() {
        int n = 30;
        int[] array = new int[n];

        initialize(array, 11);
        print(array);

        System.out.println("\nThe most common number: " + findMostCommonNumber(array));
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

    private static int findMostCommonNumber(int[] array) {
        int[] counts = makeCounts(array);
        int result = array[0];
        int maxCount = counts[0];

        for (int i = 0; i < counts.length; i++) {
            if (maxCount < counts[i]) {
                maxCount = counts[i];
                result = array[i];
            } else if (maxCount == counts[i] && result != array[i]) {
                if (result > array[i]) {
                    result = array[i];
                }
            }
        }
        return result;
    }

    private static int[] makeCounts(int arr[]) {
        int[] counts = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            counts[i] = count;
        }
        return counts;
    }
}
