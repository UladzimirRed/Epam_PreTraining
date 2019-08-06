package by.epam.pretraining.task2.sorting_of_one_dimensional_array;

/**
 * Сортировка выбором. Дана последовательность чисел (неубывающая). Требуется
 * переставить элементы так, чтобы они были расположены по убыванию. Для этого
 * в массиве, начиная с первого, выбирается наибольший элемент и ставится на
 * первое место, а первый - на место наибольшего. Затем, начиная со второго,
 * эта процедура повторяется. Написать алгоритм сортировки выбором.
 */

public class Exercise3 {

    private static int[] array = {1, 13, 31, 113, 331, 1313};

    public static void run() {
        System.out.print("Default array: ");
        printArray(array);
        sortArrayBySelection(array);
        System.out.print("Sorted array: ");
        printArray(array);
    }

    private static void sortArrayBySelection(int[] array) {
        int maxElement;
        int temp;
        for (int i = 0; i < array.length; i++) {
            maxElement = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[maxElement]) {
                    maxElement = j;
                }
            }
            temp = array[i];
            array[i] = array[maxElement];
            array[maxElement] = temp;
        }
    }

    private static void printArray(int[] array) {
        System.out.print("{");
        for (int x : array) {
            System.out.print(x + " ");
        }
        System.out.println("}");
    }
}
