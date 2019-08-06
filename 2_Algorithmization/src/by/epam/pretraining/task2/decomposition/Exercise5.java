package by.epam.pretraining.task2.decomposition;

/**
 * Составить программу, которая в массиве A[N] находит второе по величине число
 * (вывести на печать число, которое меньше максимального элемента массива, но
 * больше всех других элементов).
 */

public class Exercise5 {

    private static int[] array = {-16, 53, 12, 7, 11, 21, -8, -37, 53, 52, 3, 16, 52, 18, 3};
    private static int secondLargestNumber;

    public static void run() {
        secondLargestNumber = findSecondLargestNumber(array);
        printArray(array);
        System.out.println("\nThe second largest number of array is: " + secondLargestNumber);
    }

    private static int findSecondLargestNumber(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < findLargestNumber(array)) {
                if (array[i] > secondLargestNumber) {
                    secondLargestNumber = array[i];
                }
            }
        }
        return secondLargestNumber;
    }

    private static int findLargestNumber(int[] array) {
        int largestNumber = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > largestNumber) {
                largestNumber = array[i];
            }

        }
        return largestNumber;
    }

    private static void printArray(int[] array) {
        System.out.print("Array is: ");
        for (int x : array) {
            System.out.print(x + " ");
        }
    }

}
