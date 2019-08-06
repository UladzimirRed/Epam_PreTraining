package by.epam.pretraining.task2.sorting_of_one_dimensional_array;

/**
 * Заданы два одномерных массива с различным количеством элементов и натуральное
 * число k. Объединить их в один массив, включив второй массив между k-м и (k+1)
 * элементами первого, при этом не используя дополнительный массив.
 */

public class Exercise1 {

    private static int[] firstArray = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
    private static int[] secondArray = {2, 4, 6, 8, 10};
    private static int[] newArray;
    private static int k = 6;

    public static void run() {
        System.out.print("First array:");
        printArray(firstArray);
        System.out.print("Second array:" );
        printArray(secondArray);
        newArray = combineArraysAfterTheNumber(firstArray, secondArray, k);
        System.out.print("New array:");
        printArray(newArray);
    }

    private static int[] combineArraysAfterTheNumber(int[] firstArray, int[] secondArray, int k) {
        newArray = new int[firstArray.length + secondArray.length];
        for (int i = 0; i < newArray.length; i++) {
            if (i < k) {
                newArray[i] = firstArray[i];
            } else if (i < k + secondArray.length) {
                newArray[i] = secondArray[i - k];
            } else {
                newArray[i] = firstArray[i - k + 1];
            }
        }
        return newArray;
    }

    private static void printArray(int[] array) {
        System.out.print("{ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("} ");
    }
}
