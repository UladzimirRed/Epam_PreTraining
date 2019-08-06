package by.epam.pretraining.task2.sorting_of_one_dimensional_array;

/**
 *  Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить
 *  его по возрастанию. Делается это следующим образом: сравниваются два сосед-
 *  них элемента ai и a(i + 1). Если ai <= a(i + 1), то продвигаются на один
 *  элемент вперед. Если ai > a(i + 1), то производится перестановка и сдвигаю-
 *  тся на один элемент назад. Составить алгоритм этой сортировки.
 */

public class Exercise6 {

    private static int[] array = {6, 6661, 61, 16, 161, 1616, 616, 1};

    public static void run() {
        System.out.print("Default array: ");
        printArray(array);
        sortArrayByShell(array);
        System.out.print("Sorted array: ");
        printArray(array);
    }

    private static void sortArrayByShell(int[] array) {
        int temp;
        int i = 1;
        while (i < array.length) {
            if (array[i - 1] > array[i]) {
                temp = array[i - 1];
                array[i - 1] = array[i];
                array[i] = temp;
                if (i - 1 > 0) {
                    i--;
                }
            } else {
                i++;
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
