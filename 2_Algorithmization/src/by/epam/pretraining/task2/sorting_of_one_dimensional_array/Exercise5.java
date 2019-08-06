package by.epam.pretraining.task2.sorting_of_one_dimensional_array;

/**
 *  Сортировка вставками. Дана последовательность чисел a1, a2, a3, ... an.
 *  Требуется переставить числа в порядке возрастания. Делается это следующим
 *  образом. Пусть a1, a2,..., ai - упорядоченная последовательность, т. е.
 *  a1 <= a2 <= ... <= ai. Берется следующее число a(i+1) и вставляется в после-
 *  довательность так, чтобы новая последовательность была тоже возрастающей.
 *  Процесс производится до тех пор, пока все элементы от i + 1 до n не будут
 *  перебраны. Примечание. Место помещения очередного элемента в отсортированную
 *  часть производить с помощью двоичного поиска. Двоичный поиск оформить в виде
 *  отдельной функции.
 */

public class Exercise5 {

    private static int[] array = {5, 5551, 51, 15, 151, 1515, 515, 1};

    public static void run() {
        System.out.print("Default array: ");
        printArray(array);
        sortArrayByInsert(array);
        System.out.print("Sorted array: ");
        printArray(array);
    }

    private static void sortArrayByInsert(int[] array) {
        int temp;
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                temp = array[i + 1];
                int j = bynarySearch(array, i, array[i + 1]);
                for (int k = i + 1; k > j; k--) {
                    array[k] = array[k - 1];
                }
                array[j] = temp;
            }
        }
    }

    private static int bynarySearch(int[] array, int lastIndex, int element) {
        int j = lastIndex;
        int firstIndex = 0;
        while (firstIndex <= lastIndex) {
            j = (firstIndex + lastIndex) / 2;
            if (array[j] == element) {
                return j;
            } else if (array[j] < element) {
                firstIndex = j + 1;
            } else if (array[j] > element && j != 0 && !(array[j - 1] < element)) {
                lastIndex = j - 1;
            } else {
                break;
            }
        }
        return j;
    }

    private static void printArray(int[] array) {
        System.out.print("{");
        for (int x : array) {
            System.out.print(x + " ");
        }
        System.out.println("}");
    }
}
