package by.epam.pretraining.task2.multidimensional_array;

/*
 *  Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 *      1   1   1  ... 1   1   1
 *      0   1   1  ... 1   1   0
 *      0   0   1  ... 1   0   0
 *      .   .   .  ... .   .   .
 *      0   1   1  ... 1   1   0
 *      1   1   1  ... 1   1   1
 */

import java.util.Scanner;

public class Exercise6 {

    private static int[][] matrix;

    public static void run() {
        matrix = initialize();
        printMatrix();
    }

    private static int[][] initialize() {
        int n;

        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter matrix size (one even int number)");
        while (!scanner.hasNextInt() || (n = scanner.nextInt()) % 2 != 0 || n <= 0) {
            scanner.nextLine();
            System.out.println("Please enter EVEN POSITIVE INTEGER number");
        }
        matrix = new int[n][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if ((j >= i && j + i < n) || (j <= i && j + i >= n - 1)) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = 0;
                }
            }
        }
        return matrix;
    }

    private static void printMatrix() {
        System.out.println("The result of the program: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("------------------------");
    }
}
