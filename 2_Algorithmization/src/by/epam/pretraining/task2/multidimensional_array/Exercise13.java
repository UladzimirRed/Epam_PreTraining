package by.epam.pretraining.task2.multidimensional_array;


/*
 *   Отсотрировать стобцы матрицы по возрастанию и убыванию значений элементов
 */


import java.util.Random;
import java.util.Scanner;

public class Exercise13 {

    private static int[][] matrix;
    private static int temp;
    private static boolean isSorted;
    private static int range = 100;

    public static void run() {

        int[][] sortedUpMatrix;
        int[][] sortedDownMatrix;

        matrix = initialize();
        System.out.println("Source matrix is: ");
        printMatrix(matrix);
        sortedUpMatrix = sortColumnAscending(matrix);
        System.out.println("Matrix with sorted columns ascending: ");
        printMatrix(sortedUpMatrix);
        sortedDownMatrix = sortColumnDescending(matrix);
        System.out.println("Matrix with sorted columns descending: ");
        printMatrix(sortedDownMatrix);
        System.out.println("------------------------");

    }

    private static int[][] initialize() {

        int m;
        int n;

        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter matrix size (first int number)");

        while (!scanner.hasNextInt() || (m = scanner.nextInt()) <= 0) {
            scanner.nextLine();
            System.out.println("Please enter positive INTEGER number");
        }

        System.out.println("Enter matrix size (second int number)");

        while (!scanner.hasNextInt() || (n = scanner.nextInt()) <= 0) {
            scanner.nextLine();
            System.out.println("Please enter positive INTEGER number");
        }

        matrix = new int[m][n];

        Random random = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(range) + 1;
            }
        }

        return matrix;

    }

    private static void printMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

    }

    private static int[][] sortColumnAscending(int[][] matrix) {

        for (int j = 0; j < matrix[0].length; j++) {
            isSorted = false;
            while (!isSorted) {
                isSorted = true;
                for (int i = 0; i < matrix.length - 1; i++) {
                    if (matrix[i][j] > matrix[i + 1][j]) {
                        isSorted = false;
                        temp = matrix[i][j];
                        matrix[i][j] = matrix[i + 1][j];
                        matrix[i + 1][j] = temp;
                    }
                }
            }
        }

        return matrix;
    }

    private static int[][] sortColumnDescending(int[][] matrix) {

        for (int j = 0; j < matrix[0].length; j++) {
            isSorted = false;
            while (!isSorted) {
                isSorted = true;
                for (int i = 0; i < matrix.length - 1; i++) {
                    if (matrix[i][j] < matrix[i + 1][j]) {
                        isSorted = false;
                        temp = matrix[i][j];
                        matrix[i][j] = matrix[i + 1][j];
                        matrix[i + 1][j] = temp;
                    }
                }
            }
        }

        return matrix;
    }

}
