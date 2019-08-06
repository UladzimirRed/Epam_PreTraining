package by.epam.pretraining.task2.decomposition;

/**
 * Дано натуральное число N. Написать метод(методы) для формирования массива,
 * элементами которого являются цифры числа N
 */

public class Exercise10 {

    private static int[] array;
    private static int arraySize = 5;
    private static int n = 8;

    public static void run() {
        array = formArray(n, arraySize);
        printArray(array);
    }

    private static int[] formArray(int n, int arraySize) {
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i] = n;
        }
        return array;
    }

    private static void printArray(int[] array) {
        System.out.print("Array is: ");
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}
