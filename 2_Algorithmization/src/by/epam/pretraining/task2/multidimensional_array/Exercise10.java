package by.epam.pretraining.task2.multidimensional_array;


/*
 * Найти положительные элементы главной диагонали квадратной матрицы.
 */


import java.util.Random;
import java.util.Scanner;

public class Exercise10 {

    private static int[][] matrix;


    public static void run() {

        matrix = initialize();
        printMatrix();
        findPositiveElementsOfMatrix();

    }

    private static int[][] initialize() {

        int n;

        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter matrix size (one int number)");

        while (!scanner.hasNextInt() || (n = scanner.nextInt()) <= 0) {
            scanner.nextLine();
            System.out.println("Please enter POSITIVE INTEGER number");
        }

        matrix = new int[n][n];

        Random random = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(100 + 100 + 1) - 100;
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

    private static void findPositiveElementsOfMatrix() {

        System.out.print("Positive elements of the matrix: ");

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][i] > 0) {
                System.out.print(matrix[i][i] + " ");
            }
        }

        System.out.println("\n------------------------");

    }

}