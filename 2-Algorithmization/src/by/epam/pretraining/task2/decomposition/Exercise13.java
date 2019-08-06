package by.epam.pretraining.task2.decomposition;

/**
 * Два простых числа называются «близнецами», если они отличаются друг от друга
 * на 2 (например, 41 и 43). Найти и напечатать все пары «близнецов» из отрезка
 * [n,2n], где n - заданное натуральное число больше 2. Для решения задачи
 * использовать декомпозицию.
 */

public class Exercise13 {

    private static int n = 10;
    private static int[][] twinNumbers;

    public static void run() {
        twinNumbers = findTwinNumbers(n);
        System.out.printf("\"Twin\" numbers on the segment from %d to %d:%n", n, n * 2);
        printMatrix(twinNumbers);
    }

    private static int[][] findTwinNumbers(int n) {
        twinNumbers = new int[n - 1][2];
        for (int i = 0; i < twinNumbers.length; i++) {
            twinNumbers[i][0] = n + i;
            twinNumbers[i][1] = twinNumbers[i][0] + 2;
        }
        return twinNumbers;
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.print("|| ");
        }
    }
}
