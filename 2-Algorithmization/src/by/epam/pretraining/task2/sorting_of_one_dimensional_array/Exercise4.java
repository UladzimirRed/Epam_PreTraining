package by.epam.pretraining.task2.sorting_of_one_dimensional_array;

/**
 *  Сортировка обменами. Дана последовательность чисел (неубывающая). Требуется
 *  переставить числа в порядке возрастания. Для этого сравниваются два соседних
 *  числа a(i) и a(i + 1). Если a(i) > a(i + 1), то делается перестановка. Так
 *  продолжается до тех пор, пока все элементы не станут расположены в порядке
 *  возрастания. Составить алгоритм сортировки, подсчитывая при этом количество
 *  перестановок.
 */

public class Exercise4 {

    private static int[] array = {1, 14, 41, 114, 441, 1414};
    private static int changeCounter = 0;

    public static void run() {
        System.out.print("Default array: ");
        printArray(array);
        sortArrayByExchange(array);
        System.out.print("Sorted array: ");
        printArray(array);
        System.out.println("Number of replacements: " + changeCounter);
    }

    private static void sortArrayByExchange(int[] array) {
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
                changeCounter++;
            }
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
