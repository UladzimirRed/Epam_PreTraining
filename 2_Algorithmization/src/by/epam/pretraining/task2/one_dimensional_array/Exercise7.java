package by.epam.pretraining.task2.one_dimensional_array;

/*
 * Даны действительные числа a1, a2, ..., a(n), ..., a(2n).
 * Найти max(a1 + a(2n), a2 + a(2n-1), ..., a(n) + a(n+1))
 */

import java.util.Random;

public class Exercise7 {

    public static void run(){
        int n = 10;
        int[] array = new int[n];

        initialize(array, 100);
        print(array);

        System.out.println("\n" + "Sum of numbers: " + findMax(createSecondArray(array)));
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

    private static int findMax(int[] array){
        int max = array[0];
        for (int i : array) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    private static int[] createSecondArray (int[] array){
        int k = array.length;
        int m = k / 2;
        int[] secondArray = new int[m];

        for (int i = 0; i < m; i++){
            secondArray[i] = array[i] + array[k - 1 - i];
        }
        return secondArray;
    }
}
