package by.epam.pretraining.task2.multidimensional_array;

/*
 *  Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 *      1   1   1  ... 1   1   1
 *      2   2   2  ... 2   2   0
 *      3   3   3  ... 3   0   0
 *      .   .   .  ... .   .   .
 *     n-1 n-1  0  ... 0   0   0
 *      n   0   0  ... 0   0   0
 */


import java.util.Scanner;

public class Exercise5 {

    public static void run() {

        int[][] matrix;
        matrix = initialize();
        printMatrix(matrix);

    }

    private static int[][] initialize() {

        int n;

        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter matrix size (one even int number)");

        while (!scanner.hasNextInt() || (n = scanner.nextInt()) % 2 != 0) {
            scanner.nextLine();
            System.out.println("Please enter EVEN INTEGER number");
        }

        int[][] matrix = new int[n][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (n - (i + j) <= 0) {
                    matrix[i][j] = 0;
                } else {
                    matrix[i][j] = i + 1;
                }

            }
        }

        return matrix;

    }

    private static void printMatrix(int[][] matrix) {

        System.out.println("The result of the program: ");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("------------------------");

    }

}
