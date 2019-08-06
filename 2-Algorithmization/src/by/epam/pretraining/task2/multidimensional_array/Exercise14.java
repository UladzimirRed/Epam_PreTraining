package by.epam.pretraining.task2.multidimensional_array;

/*
 *  Сформировать случайную матрицу m x n, состоящую из нулей и единиц,
 *  причем в каждом столбце число единиц равно номеру столбца.
 */

import java.util.Random;

public class Exercise14 {

    private static int[][] matrix;

    public static void run() {
        matrix = createRandomMatrix();
        initialize(matrix);
        printMatrix(matrix);
    }

    private static int[][] createRandomMatrix() {
        int m;
        int n;

        Random random = new Random();
        m = random.nextInt(10) + 1;
        n = random.nextInt(10) + 1;
        matrix = new int[m][n];

        return matrix;
    }

    private static void initialize(int[][] matrix) {
        int count;

        for (int j = 0; j < matrix[0].length; j++) {
            count = j + 1;
            for (int i = 0; i < matrix.length; i++) {
                if (count > 0) {
                    matrix[i][j] = 1;
                    count--;
                } else {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    private static void printMatrix(int[][] matrix) {
        System.out.println("The result of the program: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
