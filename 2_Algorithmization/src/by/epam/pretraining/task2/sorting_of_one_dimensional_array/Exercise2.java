package by.epam.pretraining.task2.sorting_of_one_dimensional_array;

/**
 * Даны две последовательности (неубывающие). Образовать из них новую
 * последовательность чисел так, чтобы она тоже была неубывающей.
 * Примечание. Дополнительный массив не использовать.
 */

public class Exercise2 {

    private static int[] firstArray = {7, 14, 25, 39, 40, 83, 96};
    private static int[] secondArray = {1, 2, 3, 4, 99};
    private static int[] newArray;

    public static void run(){
        System.out.print("First array: ");
        printArray(firstArray);
        System.out.print("Second array: " );
        printArray(secondArray);
        newArray = combineArrays(firstArray, secondArray);
        System.out.print("New array: ");
        printArray(newArray);
    }

    public static int[] combineArrays(int[] firstArray, int[] secondArray){
        newArray = new int [firstArray.length + secondArray.length];

        for (int i = 0; i < newArray.length; i++){
            if (i < firstArray.length){
                newArray[i] = firstArray[i];
            } else {
                newArray[i] = secondArray[i - firstArray.length];
            }
        }

        for (int i = newArray.length - 1; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (newArray[j] > newArray[j + 1]) {
                    int temp = newArray[j];
                    newArray[j] = newArray[j + 1];
                    newArray[j + 1] = temp;
                }
            }
        }
        return newArray;
    }

    private static void printArray(int[] array) {
        System.out.print("{");
        for (int x : array) {
            System.out.print(x + " ");
        }
        System.out.println("}");
    }
}
