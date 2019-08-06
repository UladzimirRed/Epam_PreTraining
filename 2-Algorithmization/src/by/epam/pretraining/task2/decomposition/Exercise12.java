package by.epam.pretraining.task2.decomposition;

/**
 * Даны натуральные числа К и N. Написать метод(методы) формирования массива А,
 * элементами которого являются числа, сумма цифр которых равна К и которые не большее N.
 */

public class Exercise12 {

    private static int[] array;

    public static void run(){
        array = createArray(50,10);
        printArray(array);
    }

    private static int [] createArray (int k, int n) {
        int [] array = new int[k];
        int i;
        for (i = 0; i < array.length && k > n; i++) {
            array[i] = (int) (Math.random() * n) + 1;
            k -= array[i];
        }
        array[i] = k;
        int [] arrayA = new int[i + 1];
        for (int j = 0; j <= i; j++) {
            arrayA[j] = array[j];
        }
        return arrayA;
    }

    private static void printArray(int[] array) {
        System.out.print("Array is: ");
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}
