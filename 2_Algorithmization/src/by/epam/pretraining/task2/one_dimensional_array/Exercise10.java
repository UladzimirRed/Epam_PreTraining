package by.epam.pretraining.task2.one_dimensional_array;

import java.util.Random;

public class Exercise10 {

    public static void run() {

        int n = 30;
        int[] array = new int[n];

        initialize(array, 11);
        System.out.print("Array is: ");
        print(array);
        compressArray(array);
        System.out.print("\nCompressed array is: ");
        print(array);

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

    private static void compressArray(int[] array) {
        for (int i = 1; i < array.length; i += 2) {
            array[i] = 0;
        }
    }
}
