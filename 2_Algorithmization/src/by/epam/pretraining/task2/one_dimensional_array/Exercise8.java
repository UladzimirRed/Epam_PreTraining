package by.epam.pretraining.task2.one_dimensional_array;

import java.util.Arrays;
import java.util.Random;

public class Exercise8 {

    public static void run() {

        int n = 10;
        int[] array = new int[n];

        initialize(array, 99);
        System.out.print("Array is: ");
        print(array);
        int minValue = findMin(array);
        System.out.print("\nNew array without minimum values: ");
        print(createNewArrayWithoutMinValues(array));
        System.out.println();
    }

    private static void initialize(int[] array, int range) {

        Random random = new Random(range);

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(range);
        }
    }

    private static void print(int[] array) {

        for (int x : array) {
            System.out.print(x + " ");
        }
    }

    private static int findMin(int[] array) {
        int minValue = array[0];
        for (int i : array) {
            if (i < minValue) {
                minValue = i;
            }
        }
        return minValue;
    }

    private static int[] createNewArrayWithoutMinValues(int[] array) {

        int min = findMin(array);
        int[] arrayWithoutMinValues = new int[0];
        for (int i : array) {
            if (i != min) {
                arrayWithoutMinValues = addToArray(arrayWithoutMinValues, i);
            }
        }
        return arrayWithoutMinValues;
    }

    private static int[] addToArray(int[] arr, int num) {
        arr = Arrays.copyOf(arr, arr.length + 1);
        arr[arr.length - 1] = num;
        return arr;
    }
}