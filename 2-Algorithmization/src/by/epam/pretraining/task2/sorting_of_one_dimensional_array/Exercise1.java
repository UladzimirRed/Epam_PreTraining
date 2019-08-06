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
        System.out.println("K = " + k);
        System.out.print("First array:");
        printArray(firstArray);
        System.out.print("Second array:");
        printArray(secondArray);
        System.out.print("New array:");
        printArray(firstArray,secondArray);
    }

    private static void printArray(int[] firstArray, int[] secondArray) {
        System.out.print("{ ");
        for (int i = 0; i < k; i++) {
            System.out.print(firstArray[i] + " ");
        }
        for (int i = 0; i < secondArray.length; i++) {
            System.out.print(secondArray[i] + " ");
        }
        for (int i = k; i < firstArray.length; i++) {
            System.out.print(firstArray[i] + " ");
        }
        System.out.println("} ");
    }

    private static void printArray(int[] array) {
        System.out.print("{ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("} ");
    }
}
