package by.epam.pretraining.task2.sorting_of_one_dimensional_array;

/**
 * Пусть даны две неубывающие последовательности действительных чисел
 * a1 <= a2 <= ... <= an и b1 <= b2 <= ... <= bm. Требуется указать те места, на
 * которые нужно вставлять элементы последовательности b1 <= b2 <= ... <= bm в
 * первую последовательность так, чтобы новая последовательность оставалась
 * возрастающей.
 */

public class Exercise7 {

    private static int[] firstArray = {2, 5, 12, 42, 51, 102, 186};
    private static int[] secondArray = {1, 15, 22, 31, 42};
    private static int[] newArray = firstArray;

    public static void run() {
        System.out.print("First array: ");
        printArray(firstArray);
        System.out.print("Second array: ");
        printArray(secondArray);
        sortArray(secondArray);
    }

    private static void sortArray(int[] secondArray){
        for (int element : secondArray) {
            int pointInsert = nextInsert(newArray, element);
            int [] arrayTemp = new int[newArray.length + 1];
            for (int i = 0; i < newArray.length; i++) {
                if (pointInsert > i) {
                    arrayTemp[i] = newArray[i];
                } else if (pointInsert == i){
                    arrayTemp[i] = element;
                    arrayTemp[i + 1] = newArray[i];
                } else {
                    arrayTemp[i + 1] = newArray[i];
                }
            }
            newArray = arrayTemp;
            System.out.printf("Position to insert a new item \"%d\": i = %d", element, pointInsert);
            System.out.print("\nNew array: ");
            printArray(newArray);
        }
    }

    private static int nextInsert (int [] array, int element) {
        int j = 0;
        int firstIndex = 0;
        int lastIndex = array.length - 1;

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
