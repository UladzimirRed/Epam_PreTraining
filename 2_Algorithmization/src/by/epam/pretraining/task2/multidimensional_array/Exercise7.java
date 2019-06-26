package by.epam.pretraining.task2.multidimensional_array;


/*
 *  Сформировать квадратную матрицу порядка N по правилу:
 *  A[I,J] = sin((I^2 - J^2) / N)
 *  и подсчитать количество положительных элементов в ней.
 */


import java.util.Scanner;

public class Exercise7 {

    private static double[][] matrix;


    public static void run() {

        matrix = initialize();
        printMatrix();
        computePositiveNumberOfElements();

    }

    private static double[][] initialize() {

        int n;

        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter matrix size (one int number)");

        while (!scanner.hasNextInt() || (n = scanner.nextInt()) <= 0) {
            scanner.nextLine();
            System.out.println("Please enter POSITIVE INTEGER number");
        }

        matrix = new double[n][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Math.sin((i * i - j * j) / n);
            }
        }

        return matrix;

    }

    private static void printMatrix() {

        System.out.println("Our matrix is: ");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

    }

    private static void computePositiveNumberOfElements() {

        int count = 0;

        for (double[] array : matrix) {
            for (double element : array) {
                if (element > 0) {
                    count++;
                }
            }
        }

        System.out.println("Number of positive elements: " + count);
        System.out.println("------------------------");

    }

}
