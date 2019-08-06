package by.epam.pretraining.task2.one_dimensional_array;

/*
 * Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из
 * него каждый второй элемент (освободившиеся элементы заполнить нулями).
 * Примечание. Дополнительный массив не использовать.
 */

import java.util.Random;

public class Exercise10 {

    public static void run() {
        int n = 30;
        int[] array = new int[n];

        initialize(array, 10);
        System.out.print("Array is: ");
        print(array);
        compressArray(array);
        System.out.print("\nCompressed array is: ");
        print(array);
    }

    private static void initialize(int[] array, int range) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(range + 1);
        }
    }

    private static void print(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    private static void compressArray(int[] array) {
        for (int i = 1; i < array.length; i += 2) {
            array[i] = 0;
        }
    }
}
