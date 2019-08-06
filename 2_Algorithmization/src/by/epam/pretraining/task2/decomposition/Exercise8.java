package by.epam.pretraining.task2.decomposition;

/**
 * Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
 * Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
 * массива с номерами от k до m.
 */

public class Exercise8 {

    private static int[] array = {-6, 7, 2, 10, -1, 5, -3, -12, 30, 22, 9, 16, 25, 18, 8};

    public static void run (){
        printArray(array);
        System.out.println("\nThe sum of three consecutive elements from 1 to 3 is: " + calculateAmount(array, 1));
        System.out.println("The sum of three consecutive elements from 3 to 5 is: " + calculateAmount(array, 3));
        System.out.println("The sum of three consecutive elements from 5 to 7 is: " + calculateAmount(array, 4));
    }

    private static int calculateAmount(int[] array, int k){
        int amount = 0;
        for (int i = k -1; i < k +2; i++){
            amount += array[i];
        }
        return amount;
    }

    private static void printArray(int[] array) {
        System.out.print("Array is: ");
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}
