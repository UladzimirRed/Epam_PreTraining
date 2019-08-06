package by.epam.pretraining.task2.one_dimensional_array;

/*
 * Дана последовательность действительных чисел а1 ,а2 ,..., аn.
 * Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество замен.
 */

public class Exercise2 {

    public static void run() {
        int n = 10;
        int k = 55;

        findAndReplaceNumbers(n, k);
    }

    private static void findAndReplaceNumbers(int n, int k) {
        int[] sequence = new int[n];
        int count = 0;
        System.out.print("Sequence of numbers is: ");

        for (int i = 0; i < n; i++) {
            sequence[i] = (int) (Math.random() * 100);
            if (sequence[i] > k) {
                sequence[i] = k;
                count++;
            }
            System.out.print(sequence[i] + " ");
        }
        System.out.println("\n" + "Number of replacements: " + count);
    }
}
